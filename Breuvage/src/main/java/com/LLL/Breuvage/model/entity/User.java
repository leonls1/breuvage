/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LLL.Breuvage.model.entity;

import com.LLL.Breuvage.model.enums.UserRole;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author leon
 */
@Getter
@Setter
@Entity
public class User extends BasicEntity {
    
    @OneToMany(mappedBy = "user")
    private List<Message> messages;
    
    private boolean isActive = true;
    
    private String name;
    
    private String email;
    
    @Enumerated(value = EnumType.STRING)
    private UserRole role;
    
}
