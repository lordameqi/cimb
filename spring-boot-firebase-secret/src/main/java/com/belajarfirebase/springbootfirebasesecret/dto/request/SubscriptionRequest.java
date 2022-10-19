package com.belajarfirebase.springbootfirebasesecret.dto.request;

import com.google.firebase.database.annotations.NotNull;
import lombok.Getter;

public final class SubscriptionRequest {
    @NotNull
    @Getter
    private final String subscriber;
    @NotNull
    @Getter
    private final String topic;

    public SubscriptionRequest(String subscriber, String topic) {

        this.subscriber = subscriber;
        this.topic = topic;
    }
}
