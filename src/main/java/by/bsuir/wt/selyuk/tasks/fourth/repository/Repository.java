package by.bsuir.wt.selyuk.tasks.fourth.repository;

import by.bsuir.wt.selyuk.tasks.fourth.exception.RepositoryException;
import by.bsuir.wt.selyuk.tasks.fourth.specification.Specification;

import java.util.List;
import java.util.Map;
import java.util.Optional;


public interface Repository<T> {


    Optional<T> query(Specification specification) throws RepositoryException;


    List<T> queryAll(Specification specification) throws RepositoryException;


    void save(T item) throws RepositoryException;

    String getTableName();


    Map<String, Object> getFields(T item);
}
