package com.belajarfirebase.springbootfirebasesecret.service;

import com.belajarfirebase.springbootfirebasesecret.dto.notifications.DirectNotifications;
import com.belajarfirebase.springbootfirebasesecret.dto.notifications.TopicNotification;
import com.belajarfirebase.springbootfirebasesecret.dto.request.SubscriptionRequest;
import com.google.firebase.messaging.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FCMService {
    public void sendNotificationToTarget(DirectNotifications directNotifications){
        Message message = Message.builder().setWebpushConfig(
                WebpushConfig.builder().setNotification(
                        WebpushNotification.builder().setTitle(directNotifications.getTitle())
                                .setBody(directNotifications.getMessage())
                                .setIcon("https://assets.mapquestapi.com/icon/v2/circle@2x.png")
                                .build()
                ).build()
        ).setToken(directNotifications.getTarget()).build();

        FirebaseMessaging.getInstance().sendAsync(message);
    }

    public void sendNotificationToTopic(TopicNotification notification){
        Message message = Message.builder().setWebpushConfig(
                WebpushConfig.builder().setNotification(
                        WebpushNotification.builder().setTitle(notification.getTitle())
                                .setBody(notification.getMessage())
//                                .setIcon("https://assets.mapquestapi.com/icon/v2/circle@2x.png")
                                .build()
                ).build()
        ).setTopic(notification.getTopic()).build();

        FirebaseMessaging.getInstance().sendAsync(message);
    }

    public void subscribeToTopic(SubscriptionRequest  subscriptionRequest){
        try {
            FirebaseMessaging.getInstance().subscribeToTopic(List.of(subscriptionRequest.getSubscriber()), subscriptionRequest.getTopic());
        }catch (FirebaseMessagingException e){
            log.error(e.getMessage());
        }
    }
}
