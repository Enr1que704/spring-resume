package dev.ericdjohnson.Resume.job;

import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepositoryMemDB {

    private final JdbcClient jdbcClient;

    public JobRepositoryMemDB(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Job> findAll() {
        return jdbcClient.sql("SELECT * FROM jobs")
                .query(Job.class)
                .list();
    }
}
