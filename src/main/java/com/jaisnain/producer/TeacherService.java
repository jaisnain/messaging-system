package com.jaisnain.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author jaisnain
 */
@Service
@RequiredArgsConstructor
public class TeacherService {

    private final TeacherMessageProducer teacherMessageProducer;

    public void publishMessageOnTeacherNoticeBoard(String data){
        teacherMessageProducer.publishMessageOnTeacherNoticeBoard(data);
    }

}
