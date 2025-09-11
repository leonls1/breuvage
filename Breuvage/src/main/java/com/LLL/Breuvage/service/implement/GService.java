/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LLL.Breuvage.service.implement;

import com.LLL.Breuvage.model.entity.BasicEntity;
import com.LLL.Breuvage.model.mapper.GMapper;
import com.LLL.Breuvage.repository.GRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.Getter;
import lombok.NonNull;
import org.springframework.stereotype.Service;

/**
 *
 * @author leon
 */
@Service
@Getter
public abstract class GService<E extends BasicEntity,ID, Rq, Rs > {
    private final GRepository<E, ID> repository;
    private final GMapper<E, Rq, Rs> mapper;
    private final RuntimeException notFoundException;

    public GService(GRepository<E, ID> repository, GMapper<E, Rq, Rs> mapper, RuntimeException notFoundException) {
        this.repository = repository;
        this.mapper = mapper;
        this.notFoundException = notFoundException;
    }
    
    public void create(@NonNull Rq dto){
        repository.save(mapper.toEntity(dto));
    }
    
    public E findEntityById(ID id){
        return repository.findById(id)
                .orElseThrow(() -> notFoundException);
    }
    
    public Rs findResponseDtoById(ID id){
        return mapper.toDto(findEntityById(id));
    }
    
    public List<E> findAll(){
        return repository.findAll();
    }
    
    public List<Rs> FindAllResponse(){
        return toResponseList(findAll());
    }
    
    public List<E> findAllNotDeleted(){
        return repository.findAllByDeletedIsFalse();
    }
    
    public List<Rs> findAllResponseNotDeleted(){
        return toResponseList(findAllNotDeleted());
    }
    
    public void update(@NonNull Rq dto, @NonNull ID id){
        E entity = findById(id);
    }
    
    
    
    
    protected List<Rs> toResponseList(List<E> list){
        return list.stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }
}
