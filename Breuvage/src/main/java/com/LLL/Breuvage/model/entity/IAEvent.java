/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LLL.Breuvage.model.entity;

import com.LLL.Breuvage.model.enums.IAEventType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author leon
 */
@Getter
@Setter
@Entity
public class IAEvent extends BasicEntity{
    @ManyToOne
    private Message message;
    
    @Enumerated(value = EnumType.STRING) 
    private IAEventType type;
    
    private LocalDateTime dateTime;   
    
    
}
