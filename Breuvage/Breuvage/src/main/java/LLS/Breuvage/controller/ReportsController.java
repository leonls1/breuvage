package LLS.Breuvage.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reports")
public class ReportsController {

    @GetMapping
    public ResponseEntity<?> getFilteredReports(){
        return ResponseEntity.ok("");
    }

    @GetMapping("/exports")
    public ResponseEntity<?> exportReports(){
        return ResponseEntity.ok("");
    }
}

