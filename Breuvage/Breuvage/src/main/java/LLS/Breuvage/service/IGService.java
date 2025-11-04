package LLS.Breuvage.service;

import LLS.Breuvage.model.entity.BasicEntity;
import lombok.NonNull;

import java.util.List;

public interface IGService<E extends BasicEntity,ID, Rq, Rs > {
    void create(@NonNull Rq dto);

    E findEntityById(ID id);

    Rs findResponseDtoById(ID id);

    List<E> findAll();

    List<Rs> findAllResponse();

    List<E> findAllNotDeleted();

    List<Rs> findAllResponseNotDeleted();

    void update(@NonNull Rq dto, @NonNull ID id);

    void deletedById(@NonNull ID id);

    void sofDeleteById(ID id);

    boolean existsById(ID id);


}
