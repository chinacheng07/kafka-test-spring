package com.achek.producer.producerService;

import com.achek.producer.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private final KafkaTemplate<Long, User> kafkaTemplate;

    public ProducerService(KafkaTemplate<Long, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void produce(User user) {
        System.out.println("Producing the message: " + user);
        kafkaTemplate.send("userReg", user);
    }
}
