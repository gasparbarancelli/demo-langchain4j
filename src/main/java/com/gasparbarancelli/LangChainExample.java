package com.gasparbarancelli;

import dev.langchain4j.model.openai.OpenAiChatModel;
import dev.langchain4j.model.openai.OpenAiChatModelName;

public class LangChainExample {

    public static void main(String[] args) {
        String apiKey = System.getenv("API_KEY");

        OpenAiChatModel model = OpenAiChatModel.builder()
                .apiKey(apiKey)
                .modelName(OpenAiChatModelName.GPT_4_O_MINI)
                .build();

        String prompt = "Explique o conceito de threads em Java.";
        String response = model.generate(prompt);

        System.out.println("Resposta do modelo: " + response);
    }

}