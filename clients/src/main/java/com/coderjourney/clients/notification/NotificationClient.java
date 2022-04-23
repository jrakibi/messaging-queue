package com.coderjourney.clients.notification;


import com.coderjourney.clients.notification.NotificationRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        value = "notification"
)
public interface NotificationClient {
    @PostMapping("api/v1/notification")
    public void sendNotification(@RequestBody NotificationRequest notificationRequest);
}
