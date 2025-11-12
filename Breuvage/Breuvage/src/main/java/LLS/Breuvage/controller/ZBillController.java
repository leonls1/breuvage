package LLS.Breuvage.controller;
import LLS.Breuvage.service.IBillService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/bill")
@PreAuthorize("hasAnyRole('ADMIN', 'SALES_PERSON')")
public class ZBillController {
    private final IBillService service;

    @GetMapping("/z-bill/{date}")
    public ResponseEntity<?> getZBillByDate(@PathVariable LocalDate date){
        return ResponseEntity.ok("");
    }



}
