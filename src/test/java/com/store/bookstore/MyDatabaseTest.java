package com.store.bookstore;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyDatabaseTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testInsertData() {
        String sql = "INSERT INTO book (name, author , price) VALUES (ldskfkmnf, meya , 23)";
        jdbcTemplate.update(sql, "name", "author" , "price");
        int count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM book", Integer.class);
        assertEquals(1, count);
    }
}