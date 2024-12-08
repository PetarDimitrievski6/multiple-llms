package mk.ukim.finki.multiplellms.web;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OllamaChatController {
    private final ChatClient chatClient;

    public OllamaChatController(@Qualifier("ollamaChatClient") ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/ollama")
    public String ollama(){
        return chatClient.prompt()
                .user("Tell me a dad joke about computers and dogs")
                .call()
                .content();
    }
}
