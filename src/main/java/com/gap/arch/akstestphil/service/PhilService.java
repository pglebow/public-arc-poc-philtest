package com.gap.arch.akstestphil.service;

import com.gap.arch.akstestphil.dao.PhilDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhilService {

    @Autowired
    private PhilDao dao;

    public String getGreeting() { return dao.getGreeting(); }

    public String getDateTime() { return dao.getFormattedDateTime(); }

}
