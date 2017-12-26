package com.service.cbcclient.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-26T06:45:37.867Z")

@RestSchema(schemaId = "cbcclient")
@RequestMapping(path = "/cbcclient", produces = MediaType.APPLICATION_JSON)
public class CbcclientImpl {

    @Autowired
    private CbcclientDelegate userCbcclientDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userCbcclientDelegate.helloworld(name);
    }

}
