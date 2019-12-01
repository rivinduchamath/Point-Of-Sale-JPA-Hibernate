package lk.ijse.dep.pos.dao;

import lk.ijse.dep.pos.entity.SuperEntity;

import java.util.List;

public interface CrudDAO<T extends SuperEntity,ID> extends SuperDAO {

    public abstract List<T> findAll() throws Exception;

    T find(ID id)throws Exception;

    void save(T entity)throws Exception;

    void update(T entity)throws Exception;

    void delete(ID id)throws Exception;
}
