package com.dhiraj.kafka.consumer;

import com.dhiraj.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "boys", groupId = "mygroup")
    public void consumeMsg(String msg) {
        log.info(format("Consuming the message from boys Topic:: %s", msg));
    }

    @KafkaListener(topics = "boys", groupId = "mygroup")
    public void consumeJsonMsg(Student student) {
        log.info(format("Consuming the message from boys Topic:: %s", student.toString()));
    }
}
