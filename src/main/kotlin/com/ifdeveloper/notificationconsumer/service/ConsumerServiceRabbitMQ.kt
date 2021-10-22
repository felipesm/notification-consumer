package com.ifdeveloper.notificationconsumer.service

import com.ifdeveloper.notificationconsumer.domain.Notification
import org.springframework.stereotype.Service

@Service
class ConsumerServiceRabbitMQ {

    fun publicar(notification: Notification) {
        var builder = montarMensagem(notification)
        println(builder.toString())
    }

    fun montarMensagem(notification: Notification) : StringBuilder {
        var builder = StringBuilder()

        builder.append("Assunto: ${notification.subject}\n")
        builder.append("Data: ${notification.createdAt}\n")
        builder.append("De: ${notification.from}\n")
        builder.append("Para: ${notification.to}\n")
        builder.append("Mensagem: ${notification.message}\n")

        return builder
    }
}