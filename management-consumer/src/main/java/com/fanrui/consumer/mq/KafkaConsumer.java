package com.fanrui.consumer.mq;



import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;


@EnableBinding(Sink.class)
public class KafkaConsumer {

    @StreamListener(Sink.INPUT)
    public void onReceive(byte[] msg) {
        System.out.println("get Kafka message:" + new String(msg));

    }

}
