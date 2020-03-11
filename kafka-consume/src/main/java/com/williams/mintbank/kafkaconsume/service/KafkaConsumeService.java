package com.williams.mintbank.kafkaconsume.service;

import com.williams.mintbank.kafkaconsume.model.KaftaResponse;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumeService {



//    @KafkaListener(topics = "com.ng.vela.even.card_verified", groupId = "group_id")
//    public KaftaResponse consumeCard(String message){
//        System.out.println("Consume message: " + message);
//        return null;
//    }

    @KafkaListener(topics = "com.ng.vela.even.card_verified", groupId = "group_json",
            containerFactory = "kafkaResponseListenerFactory")
    public void consumeCardMessage(KaftaResponse kaftaResponse){
        System.out.println("Consume Card Message" + kaftaResponse);
    }

}
