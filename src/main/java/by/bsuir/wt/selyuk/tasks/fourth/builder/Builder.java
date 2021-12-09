package by.bsuir.wt.selyuk.tasks.fourth.builder;

import by.bsuir.wt.selyuk.tasks.fourth.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
