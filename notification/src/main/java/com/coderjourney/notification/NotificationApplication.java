package com.coderjourney.notification;

import com.coderjourney.amqp.RabbitMQMessageProducer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.io.Serializable;

@SpringBootApplication(
        scanBasePackages = {
                "com.coderjourney.notification",
                "com.coderjourney.amqp",
        }
)
@EnableEurekaClient
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(
//            RabbitMQMessageProducer producer,
//            NotificationConfig notificationConfig
//    ) {
//        return args -> {
//            producer.publish(
//                    new Person("Jamal", "ERRAKIBI", 25),
//                    notificationConfig.getInternalExchange(),
//                    notificationConfig.getInternalNotificationRoutingKey()
//            );
//        };
//    }
//
//    @AllArgsConstructor
//    @Getter
//    @Setter
//    class Person {
//        private String firstname;
//        private String lastname;
//        private Integer age;
//    }
}
