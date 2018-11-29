package com.example.dota.util;

import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;

public class MessageConsumer implements ChannelAwareMessageListener {

    private Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @Override
    public void onMessage(Message message, com.rabbitmq.client.Channel channel) throws Exception {
        byte[] body = message.getBody();
        System.out.println("收到消息1 : " + new String(body));
        boolean autoAck = false;
        Consumer consumer  =null;
        channel.basicConsume("queue_two", autoAck,consumer);
//        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false); //确认消息成功消费

    }
}
