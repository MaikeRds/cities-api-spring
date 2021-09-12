package com.maike.rodrigues.citiesapi.countries.controller;

import com.maike.rodrigues.citiesapi.countries.entities.Country;
import com.maike.rodrigues.citiesapi.countries.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/countries")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryController {

    private CountryService countryService;

    @RequestMapping(value = "/list", method= RequestMethod.GET)
    public Page<Country> listAll(Pageable page){
        return countryService.listAll(page);
    }

    @RequestMapping(value = "/show/{id}", method= RequestMethod.GET)
    public Optional<Country> findById(@PathVariable Long id){
        return countryService.findById(id);
    }
}
