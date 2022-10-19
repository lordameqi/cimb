package com.belajarfirebase.springbootfirebasesecret.service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class FirebaseInitializer {
    @Value("${app.firebase-config-file}")
    private String firebaseConfigPath;

    @PostConstruct
    private void postConstruct(){
        try {
            GoogleCredentials googleCredentials = GoogleCredentials.fromStream(new ClassPathResource(firebaseConfigPath).getInputStream());

            FirebaseOptions firebaseOptions = FirebaseOptions.builder().setCredentials(googleCredentials).build();

            if (FirebaseApp.getApps().isEmpty()) {
                FirebaseApp.initializeApp(firebaseOptions);
                log.info("firebase app sudah diinisilasikan");
            }else {
                log.error("Firebase app empty");
            }
        }catch (Exception e){
            log.error(e.getMessage());
        }
    }
}
