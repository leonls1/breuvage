package LLS.Breuvage.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationsController {

    @GetMapping
    public ResponseEntity<?> getNotifications(){
        return ResponseEntity.ok("");
    }

    @PostMapping("/test")
    public ResponseEntity<?> testNotification(){
        return ResponseEntity.ok("");
    }
}
