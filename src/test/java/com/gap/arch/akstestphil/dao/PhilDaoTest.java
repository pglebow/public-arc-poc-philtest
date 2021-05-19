package com.gap.arch.akstestphil.dao;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class PhilDaoTest {

    private static final Logger logger = LogManager.getLogger();

    @Autowired
    private PhilDao dao;

    @Test
    public void testDate() {
        String formattedDateTime = dao.getFormattedDateTime();
        logger.log(Level.INFO, formattedDateTime);
        Assert.notNull(formattedDateTime, "null date");
    }
}
