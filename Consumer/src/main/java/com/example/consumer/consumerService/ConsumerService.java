package com.example.consumer.consumerService;

import com.example.consumer.dto.User;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@EnableKafka
@Service
public class ConsumerService {

    @KafkaListener(topics = "userReg")
    public void consume(ConsumerRecord<Long, User> record){
        System.out.println("Consuming the message: " + record.key() + " " + record.value());
    }
}
