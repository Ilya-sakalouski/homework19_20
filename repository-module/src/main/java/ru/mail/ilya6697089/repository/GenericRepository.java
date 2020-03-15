package ru.mail.ilya6697089.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import ru.mail.ilya6697089.repository.model.Item;

public interface GenericRepository<T> {

    Connection getConnection() throws SQLException;

    List<T> findAll(Connection connection) throws SQLException;

    void add(Connection connection, T object) throws SQLException;

    Item findById(Connection connection, Long id) throws SQLException;

}
