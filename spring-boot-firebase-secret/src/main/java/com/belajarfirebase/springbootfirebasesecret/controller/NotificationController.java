package com.belajarfirebase.springbootfirebasesecret.controller;

import com.belajarfirebase.springbootfirebasesecret.dto.notifications.DirectNotifications;
import com.belajarfirebase.springbootfirebasesecret.dto.notifications.TopicNotification;
import com.belajarfirebase.springbootfirebasesecret.dto.request.SubscriptionRequest;
import com.belajarfirebase.springbootfirebasesecret.service.FCMService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class NotificationController {
    private FCMService fcmService;


    public NotificationController(FCMService fcmService) {
        this.fcmService = fcmService;
    }
    @PostMapping("/notification")
    public void sendTargetNotification(@RequestBody DirectNotifications notifications){
        log.info(notifications.toString());
        this.fcmService.sendNotificationToTarget(notifications);
    }

    @PostMapping("/topic/notification")
    public void sendNotificationtoTopic(@RequestBody TopicNotification topicNotification){
        log.info(topicNotification.toString());
        this.fcmService.sendNotificationToTopic(topicNotification);
    }
    @PostMapping("/topic/subscription")
    public void subscribeToTopic(@RequestBody SubscriptionRequest subscriptionRequest){
        log.info(subscriptionRequest.toString());
        this.fcmService.subscribeToTopic(subscriptionRequest);
    }
}
