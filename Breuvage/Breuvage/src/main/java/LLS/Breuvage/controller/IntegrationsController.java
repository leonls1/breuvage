package LLS.Breuvage.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/integrations")
public class IntegrationsController {

    @PostMapping
    public ResponseEntity<?> integrationHook(){
        return ResponseEntity.ok("");
    }
}
