package com.prueba.peli_play;

import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PeliPlayAiService {

    @UserMessage("""
            Genera un saludo de bienvenida para Peli-Play.\s
            Incluye el nombre de una película famosa de terror y\s
            dime qué hora es en este momento (inventa la hora).
            """)
    String generateGreeting();
}
