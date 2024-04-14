package de.wisskirchenj.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestRealTimeChatApplication {

    public static void main(String[] args) {
        SpringApplication.from(RealTimeChatApplication::main).with(TestRealTimeChatApplication.class).run(args);
    }

}
