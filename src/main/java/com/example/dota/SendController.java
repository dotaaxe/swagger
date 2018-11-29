package com.example.dota;
import com.example.dota.util.ConnectionFactoryConfigure;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

/**
 * <dl>
 * <dt>SendController</dt>
 * <dd>Description:</dd>
 * <dd>CreateDate: 2017/9/1</dd>
 * </dl>
 *
 * @author Administrator
 */

@RestController
//@ComponentScan(basePackages= {"com.example.dota.sendCtroller"})
public class SendController {


    @Autowired
    private RabbitTemplate rabbitTemplate;
    @RequestMapping("/send")
    public String send3() throws UnsupportedEncodingException {
        String uuid = UUID.randomUUID().toString();
        CorrelationData correlationId = new CorrelationData(uuid);
        rabbitTemplate.convertAndSend("exchangeTest", "queue_one_key2", "erxxasa",correlationId);
//        rabbitTemplate.convertAndSend(ConnectionFactoryConfigure.EXCHANGE, ConnectionFactoryConfigure.ROUTINGKEY2, "哈哈");
        return uuid;
    }

}

