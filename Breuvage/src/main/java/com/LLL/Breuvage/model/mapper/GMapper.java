/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LLL.Breuvage.model.mapper;

import com.LLL.Breuvage.model.entity.BasicEntity;
import org.mapstruct.MappingTarget;

/**
 *
 * @author leon
 */
public interface GMapper<E extends BasicEntity, Rq, Rs> {
    E toEntity(Rq request);
    
    Rs toDto(E entity);
    
    void updateExistingEntity(Rq request, @MappingTarget E entity);
    
}
