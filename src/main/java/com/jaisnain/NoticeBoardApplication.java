package com.jaisnain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @author jaisnain
 */
@SpringBootApplication
@EnableBinding(value = {Topics.class})
public class NoticeBoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(NoticeBoardApplication.class,args);
    }
}
