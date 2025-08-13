package com.LLL.Breuvage.model.entity;

@Getter
@Setter
@MappedSuperClass
public abstract class BasicEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private boolean deleted;

}
