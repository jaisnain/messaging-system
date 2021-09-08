package com.jaisnain.consumer;

import com.jaisnain.Topics;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/**
 * @author jaisnain
 */
@Slf4j
@Component
public class StudentNoticeBoard {
    @StreamListener(Topics.STUDENT_NOTICE_BOARD)
    public void consumePublishedMessage(@Payload String message) {
        log.info("Published message on Students Notice Board : "+ message);
    }
}
