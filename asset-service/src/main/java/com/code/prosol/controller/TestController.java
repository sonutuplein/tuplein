package com.code.prosol.controller;

import com.code.prosol.service.MetaDataService;
import com.code.prosol.service.impl.MetaDataServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String say(){
        MetaDataService m = new MetaDataServiceImpl();
        return m.getMessage();
    }
}
