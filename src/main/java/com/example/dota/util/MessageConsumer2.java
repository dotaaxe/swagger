package com.example.dota.util;
import com.rabbitmq.client.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;

public class MessageConsumer2 implements ChannelAwareMessageListener {
    private Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @Override
    public void onMessage(Message message, com.rabbitmq.client.Channel channel) throws Exception {
        byte[] body = message.getBody();
        System.out.println("收到消息2 : " + new String(body));
//        channel.basicAck(message.getMessageProperties().getDeliveryTag(), false); //确认消息成功消费，删除消息

    }
}
