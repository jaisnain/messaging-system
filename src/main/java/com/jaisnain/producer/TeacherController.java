package com.jaisnain.producer;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author jaisnain
 */
@Controller
public class TeacherController {

    TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping(value = "/publish-on-teacher-notice-board")
    @ResponseStatus(HttpStatus.OK)
    public void publishMessageOnTeacherNoticeBoard(@RequestParam String message) {
        teacherService.publishMessageOnTeacherNoticeBoard(message);
    }
}
