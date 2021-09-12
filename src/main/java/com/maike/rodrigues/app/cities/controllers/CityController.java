package com.maike.rodrigues.app.cities.controllers;

import com.maike.rodrigues.app.cities.entities.City;
import com.maike.rodrigues.app.cities.services.CityService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cities")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CityController {

    private CityService cityService;

    @RequestMapping(value = "/list", method= RequestMethod.GET)
    public List<City> findAll() {
      return cityService.findAll();
    }


    @RequestMapping(value = "/list/pagination", method= RequestMethod.GET)
    public Page<City> findAllByPage(final Pageable page) {
        return cityService.findAllByPage(page);
    }
}
