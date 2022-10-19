package com.belajarfirebase.springbootfirebasesecret.dto.notifications;

import com.google.firebase.database.annotations.NotNull;
import lombok.Getter;
import lombok.Setter;

public final class TopicNotification  extends AppNotifications{
    @NotNull
     @Getter
    private final String topic;
    @NotNull
    @Getter
    private final String title;
    @NotNull
    @Getter
    private final String message;

    public TopicNotification(@NotNull String title, @NotNull String message, @NotNull String topic ) {
        super(title, message);
        this.topic = topic;
        this.title = title;
        this.message = message;
    }

    @Override
    public String toString() {
        return "TopicNotification{" +
                "topic='" + topic + '\'' +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
