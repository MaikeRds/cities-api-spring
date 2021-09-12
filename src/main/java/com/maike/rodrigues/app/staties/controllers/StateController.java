package com.maike.rodrigues.app.staties.controllers;

import com.maike.rodrigues.app.staties.entities.State;
import com.maike.rodrigues.app.staties.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/states")
public class StateController {

    @Autowired
    private StateService stateService;

    @RequestMapping(value = "/list", method= RequestMethod.GET)
    public List<State> findAll(){
        return stateService.findAll();
    }
}
