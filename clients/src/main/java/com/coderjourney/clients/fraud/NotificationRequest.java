package com.coderjourney.clients.fraud;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NotificationRequest {
    Integer toCustomerId;
    String toCustomerName;
    String message;
}
