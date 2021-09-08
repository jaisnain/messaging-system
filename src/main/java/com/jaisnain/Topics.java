package com.jaisnain;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author jaisnain
 */
public interface Topics {
    String STUDENT_NOTICE_BOARD = "student-notice-board";
    String TEACHER_NOTICE_BOARD = "teacher-notice-board";

    @Input(STUDENT_NOTICE_BOARD)
    SubscribableChannel printOnStudentNoticeBoard();

    @Output(TEACHER_NOTICE_BOARD)
    MessageChannel publishMessageOnTeacherNoticeBoard();
}
