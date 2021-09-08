package com.jaisnain.producer;

import com.jaisnain.Topics;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeTypeUtils;

/**
 * @author jaisnain
 */
@Slf4j
@RequiredArgsConstructor
@Component
public class TeacherMessageProducer {
    private final Topics topics;

    public void publishMessageOnTeacherNoticeBoard(String data) {
        topics.publishMessageOnTeacherNoticeBoard()
                .send(MessageBuilder
                        .withPayload(data)
                        .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                        .build());
        log.info("Published message on Teacher's Notice Board");
    }
}
