package com.coderjourney.notification;

import com.coderjourney.clients.notification.NotificationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NotificationService {
    @Autowired
    NotificationRepository notificationRepository;

    public void storeNotification(NotificationRequest request) {
        Notification notification = Notification.builder()
                .message(request.getMessage())
                .toCustomerEmail(request.getToCustomerName())
                .toCustomerId(request.getToCustomerId())
                .sender("Jamal")
                .sentAt(LocalDateTime.now())
                .build();

        this.notificationRepository.save(notification);
    }
}
