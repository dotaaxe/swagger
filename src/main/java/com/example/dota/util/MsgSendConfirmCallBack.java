package com.example.dota.util;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;

/**
 * <dl>
 * <dt>MsgSendConfirmCallBack</dt>
 * <dd>Description:</dd>
 * <dd>CreateDate: 2017/7/4</dd>
 * </dl>
 * 添加消息发送到交换机确认机制
 *
 * @author Administrator
 */
public class MsgSendConfirmCallBack implements RabbitTemplate.ConfirmCallback{
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        System.out.println(" 回调id:" + correlationData);
        if (ack) {
            System.out.println("消息成功消费");
        } else {
            System.out.println("消息消费失败:" + cause+"\n重新发送");

        }
    }
}

