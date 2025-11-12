package LLS.Breuvage.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reports")
public class ReportsController {

    @PreAuthorize("hasAnyRole('ADMIN', 'SALES_PERSON')")
    @GetMapping
    public ResponseEntity<?> getFilteredReports(){
        return ResponseEntity.ok("");
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/exports")
    public ResponseEntity<?> exportReports(){
        return ResponseEntity.ok("");
    }
}

