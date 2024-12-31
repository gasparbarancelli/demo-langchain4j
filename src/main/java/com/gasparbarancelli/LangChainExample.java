package com.gasparbarancelli;

import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;

public class LangChainExample {

    public static void main(String[] args) {
        // Obtém a chave da API do OpenAI a partir de uma variável de ambiente para maior segurança
        String apiKey = System.getenv("API_KEY");

        // Configura o modelo GPT-4 utilizando a classe OpenAiChatModel
        OpenAiChatModel model = OpenAiChatModel.builder()
                .apiKey(apiKey) // Define a chave da API para autenticação com o OpenAI
                .modelName(OpenAiChatModelName.GPT_4_O_MINI) // Define o modelo específico a ser usado
                .build(); // Cria a instância do modelo configurado

        // Define um prompt que será enviado para o modelo gerar uma resposta
        String prompt = "Explique o conceito de threads em Java.";

        // Gera uma resposta com base no prompt fornecido
        String response = model.generate(prompt);

        // Imprime a resposta gerada no console
        System.out.println("Resposta do modelo: " + response);
    }

}