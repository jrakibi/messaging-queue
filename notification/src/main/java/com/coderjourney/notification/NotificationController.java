package com.coderjourney.notification;

import com.coderjourney.clients.fraud.NotificationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/notification")
public class NotificationController {
    @Autowired
    NotificationService notificationService;

    @PostMapping()
    public void addNotification(@RequestBody NotificationRequest notificationRequest){
        log.info("Adding new notification {}", notificationRequest);
        notificationService.storeNotification(notificationRequest);
    }
}
