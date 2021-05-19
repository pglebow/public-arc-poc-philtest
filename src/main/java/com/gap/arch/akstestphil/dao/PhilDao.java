package com.gap.arch.akstestphil.dao;

import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.util.Date;

@Repository
public class PhilDao {

    private DateFormat dateFormat;

    /**
     * Constructor
     * @param dateFormat
     */
    public PhilDao(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    /**
     * Default constructor
     */
    public PhilDao() {
        this(DateFormat.getDateTimeInstance());
    }

    public String getGreeting() { return "Hello"; }

    public String getFormattedDateTime() { return dateFormat.format(new Date()); }
}
