package ru.mail.ilya6697089.repository.impl;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import ru.mail.ilya6697089.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class GenericRepositoryImpl<T> implements GenericRepository<T> {

    @Autowired
    private DataSource dataSource;

    @Override
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

}
