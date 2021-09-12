package com.maike.rodrigues.citiesapi.countries.controller;

import com.maike.rodrigues.citiesapi.countries.entities.Country;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/countries")
public class CountryController {

    @RequestMapping(value = "/list", method= RequestMethod.GET)
    public List<Country> countries (){
        List<Country> countries = new ArrayList<>();
        return countries;
    }
}
