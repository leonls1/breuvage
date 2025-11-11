package LLS.Breuvage.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/backups&Contingence")
public class BackupsContingenceController {

    @PostMapping("/import")
    public ResponseEntity<?> importBackup(){
        return ResponseEntity.ok("");
    }

}
