package liga.consumer.queue.consumer.module.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RabbitMessageListener {

    @RabbitListener(queues = "daily_queue")
    public void getMessagesFromQueueDaily(String message) {
        log.info("Сообщение из очереди daily_queue : " + message);
    }

    @RabbitListener(queues = "alert_queue")
    public void getMessagesFromQueueAlert(String message) {
        log.info("Сообщение из очереди alert_queue : " + message);
    }

    @RabbitListener(queues = "error_queue")
    public void getMessagesFromQueueError(String message) {
        log.info("Сообщение из очереди error_queue : " + message);
    }
}
