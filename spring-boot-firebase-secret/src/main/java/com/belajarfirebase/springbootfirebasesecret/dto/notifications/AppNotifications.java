package com.belajarfirebase.springbootfirebasesecret.dto.notifications;

import com.google.firebase.database.annotations.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Data
public abstract class AppNotifications {
    @NotNull
    @Getter
    private final String title;

    @NotNull
    @Getter
    private final  String message;




    public AppNotifications(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }


}
