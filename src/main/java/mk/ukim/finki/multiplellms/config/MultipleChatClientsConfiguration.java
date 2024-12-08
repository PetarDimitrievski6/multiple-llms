package mk.ukim.finki.multiplellms.config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultipleChatClientsConfiguration {

    @Bean
    public ChatClient openAiChatClient(OpenAiChatModel chatModel){
        return ChatClient.create(chatModel);
    }

    @Bean
    public ChatClient ollamaChatClient(OllamaChatModel chatModel){
        return ChatClient.create(chatModel);
    }
}
