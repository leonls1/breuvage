package LLS.Breuvage.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Sommelier&IA")
public class SommelierStaffChatController {

    @GetMapping("/realtime/chat")
    public ResponseEntity<?> websocketChat(){
        return ResponseEntity.ok("");
    }

    @PostMapping("/messages")
    public ResponseEntity<?> messages(){
        return ResponseEntity.ok("");
    }
}
