/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLS.Breuvage.model.entity;


import LLS.Breuvage.model.enums.IAEventType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

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
