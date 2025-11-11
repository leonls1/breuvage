package LLS.Breuvage.controller;
import LLS.Breuvage.service.IBillService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/bill")
public class ZBillController {
    private final IBillService service;

    @GetMapping("/zbill/{date}")
    public ResponseEntity<?> getZBillByDate(@PathVariable LocalDate date){
        return ResponseEntity.ok("");
    }



}
