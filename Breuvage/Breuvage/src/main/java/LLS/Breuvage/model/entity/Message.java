/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLS.Breuvage.model.entity;


import LLS.Breuvage.model.enums.MessageState;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author leon
 */
@Entity
@Getter
@Setter
public class Message extends BasicEntity{
    @ManyToOne
    private PurchaseOrder purchaseOrder;
    
    private String content;
    
    private LocalDateTime dateTime;
    
    @ManyToOne
    private User user;
    
    @Enumerated(value = EnumType.STRING)
    private MessageState state;
    
    @OneToMany(mappedBy = "message")
    private List<IAEvent> events;
    
}
