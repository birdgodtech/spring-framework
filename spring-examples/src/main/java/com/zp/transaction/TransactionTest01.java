package com.zp.transaction;

import org.springframework.jdbc.core.JdbcTemplate;

public class TransactionTest01 {

    private JdbcTemplate jdbcTemplate;


    public int insertTestTbale(){

        return jdbcTemplate.update("insert  into test (name) values ('zhang01')");

    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
