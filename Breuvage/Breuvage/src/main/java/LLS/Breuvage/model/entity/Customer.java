/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLS.Breuvage.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *
 * @author leon
 */
@Getter
@Setter
@Entity
public class Customer extends BasicEntity {

    private String name;
    private String phoneNumber;
    @Email
    private String email;
    private boolean overEighteen;

    @OneToMany(mappedBy = "customer")
    private List<PurchaseOrder> purchaseOrders;
}

