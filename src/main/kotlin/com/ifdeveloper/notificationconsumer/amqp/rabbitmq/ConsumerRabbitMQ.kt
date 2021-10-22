package com.ifdeveloper.notificationconsumer.amqp.rabbitmq

import com.ifdeveloper.notificationconsumer.amqp.AmqpConsumer
import com.ifdeveloper.notificationconsumer.domain.Notification
import com.ifdeveloper.notificationconsumer.service.ConsumerServiceRabbitMQ
import org.slf4j.LoggerFactory
import org.springframework.amqp.AmqpRejectAndDontRequeueException
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ConsumerRabbitMQ: AmqpConsumer<Notification> {

    private val logger = LoggerFactory.getLogger(javaClass)

    @Autowired
    private val consumerService = ConsumerServiceRabbitMQ()

    @RabbitListener(queues = ["key-producer-notification"])
    override fun consumer(notification: Notification) {
        try {
            logger.info("notificacao recebida $notification")
            consumerService.publicar(notification)
        } catch (ex: Exception) {
            throw AmqpRejectAndDontRequeueException(ex)
        }
    }
}