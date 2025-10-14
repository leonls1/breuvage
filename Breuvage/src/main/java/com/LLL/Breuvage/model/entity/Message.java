/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LLL.Breuvage.model.entity;

import com.LLL.Breuvage.model.enums.MessageState;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author leon
 */
@Entity
@Getter
@Setter
public class Message extends BasicEntity{
    @ManyToOne
    private Order order;
    
    private String content;
    
    private LocalDateTime dateTime;
    
    @ManyToOne
    private User user;
    
    @Enumerated(value = EnumType.STRING)
    private MessageState state;
    
    @OneToMany(mappedBy = "message")
    private List<IAEvent> events;
    
}
