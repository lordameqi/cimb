package com.belajarfirebase.springbootfirebasesecret.dto.notifications;

import com.google.firebase.database.annotations.NotNull;
import lombok.Getter;


public final class DirectNotifications extends AppNotifications{


    @NotNull
    @Getter
    private final String title;

    @NotNull
    @Getter
    private final  String message;

    @NotNull
    @Getter
    private final String target;


    public DirectNotifications(String target,String title, String message) {
        super(title, message);
        this.title = title;
        this.message = message;
        this.target = target;
    }

    @Override
    public String toString() {
        return "DirectNotifications{" +
                "title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", target='" + target + '\'' +
                '}';
    }
}
