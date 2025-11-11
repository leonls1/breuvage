package LLS.Breuvage.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/audits&incidences")
public class AuditsIncidencesController {

    @GetMapping("/audits")
    public ResponseEntity<?> auditEntity(@RequestBody String entityId){
        return ResponseEntity.ok("");
    }

    @PostMapping("/incidences")
    public ResponseEntity<?> incidence(){
        return ResponseEntity.ok("");
    }
}
