package com.ifdeveloper.notificationconsumer.domain

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

data class Notification (
    @JsonProperty("subject")
    val subject: String,
    @JsonProperty("message")
    val message: String,
    @JsonProperty("from")
    val from: String,
    @JsonProperty("to")
    val to: String,
    @JsonProperty("createdAt")
    val createdAt: LocalDateTime
)