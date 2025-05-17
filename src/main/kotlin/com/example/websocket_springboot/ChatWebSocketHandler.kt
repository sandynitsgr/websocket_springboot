package com.example.websocket_springboot

import com.example.websocket_springboot.model.ChatMessage
import org.springframework.web.socket.*
import org.springframework.web.socket.handler.TextWebSocketHandler

class ChatWebSocketHandler : TextWebSocketHandler() {

    private val sessions = mutableSetOf<WebSocketSession>()

    override fun afterConnectionEstablished(session: WebSocketSession) {
        sessions.add(session)
        println("New client connected: ${session.id}")
    }

    override fun handleTextMessage(session: WebSocketSession, message: TextMessage) {
        println("Message from ${session.id}: ${message.payload}")

        val chatMessage = ChatMessage("User", message.payload)
        val response = TextMessage(chatMessage.content)
        sessions.forEach { it.sendMessage(response) }
    }

    override fun afterConnectionClosed(session: WebSocketSession, status: CloseStatus) {
        sessions.remove(session)
        println("Client disconnected: ${session.id}")
    }
}
