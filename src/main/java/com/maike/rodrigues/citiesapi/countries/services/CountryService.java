package com.maike.rodrigues.citiesapi.countries.services;

import com.maike.rodrigues.citiesapi.countries.entities.Country;
import com.maike.rodrigues.citiesapi.countries.exceptions.CountryNotFoundException;
import com.maike.rodrigues.citiesapi.countries.repositories.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryService {

    private CountryRepository countryRepository;

    public Page<Country> listAll(Pageable page) {
        return countryRepository.findAll(page);
    }

    public Country findById(Long id) throws CountryNotFoundException {
        Country country = verifyExists(id);
        return country;
    }

    private Country verifyExists(Long id) throws CountryNotFoundException {
        return countryRepository.findById(id).orElseThrow(() -> new CountryNotFoundException(id));
    }
}
