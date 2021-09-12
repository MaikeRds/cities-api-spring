package com.maike.rodrigues.citiesapi.countries.service;

import com.maike.rodrigues.citiesapi.countries.entities.Country;
import com.maike.rodrigues.citiesapi.countries.repositories.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CountryService {

    private CountryRepository countryRepository;

    public Page<Country> listAll(Pageable page) {
        return countryRepository.findAll(page);
    }

    public Optional<Country> findById(Long id) {
        return countryRepository.findById(id);
    }
}
