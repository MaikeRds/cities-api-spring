package com.maike.rodrigues.app.cities.controllers;


import com.maike.rodrigues.app.cities.services.DistanceService;
import com.maike.rodrigues.app.cities.services.EarthRadius;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/distances")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class DistanceController {

    private final DistanceService service;

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/by-points", method= RequestMethod.GET)
    public Double byPoints(@RequestParam(name = "from") final Long city1,
                           @RequestParam(name = "to") final Long city2) {
        log.info("byPoints");
        return service.distanceByPointsInMiles(city1, city2);
    }

    @RequestMapping(value = "/by-cube", method= RequestMethod.GET)
    public Double byCube(@RequestParam(name = "from") final Long city1,
                         @RequestParam(name = "to") final Long city2) {
        log.info("byCube");
        return service.distanceByCubeInMeters(city1, city2);
    }

    @RequestMapping(value = "/by-math", method= RequestMethod.GET)
    public Double byMath(@RequestParam(name = "from") final Long city1,
                         @RequestParam(name = "to") final Long city2,
                         @RequestParam final EarthRadius unit) {
        log.info("byMath");
        return service.distanceUsingMath(city1, city2, unit);
    }

}
