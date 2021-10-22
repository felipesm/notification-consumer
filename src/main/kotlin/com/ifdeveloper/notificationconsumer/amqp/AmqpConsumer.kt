package com.ifdeveloper.notificationconsumer.amqp

interface AmqpConsumer<T> {
    fun consumer(t: T)
}