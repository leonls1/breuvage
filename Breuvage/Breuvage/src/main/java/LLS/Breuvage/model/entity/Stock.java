/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLS.Breuvage.model.entity;

import LLS.Breuvage.model.enums.MoventType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Stock extends BasicEntity{
    private Long actualStock;
    private Long minStock;
    @OneToOne
    private Product product;

}
