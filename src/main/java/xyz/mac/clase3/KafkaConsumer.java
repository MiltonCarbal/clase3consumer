package xyz.mac.clase3;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class KafkaConsumer {

    private final List<Usuario> messages = new CopyOnWriteArrayList<>();

    @KafkaListener(topics = "topicUsuarios")
    public void processMessage(Usuario message) {
        this.messages.add(message);
        System.out.println("Received sample message [" + message + "]");
    }

    List<Usuario> getMessages() {
        return this.messages;
    }
}
