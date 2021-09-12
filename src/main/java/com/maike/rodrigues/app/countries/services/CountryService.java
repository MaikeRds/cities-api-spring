package com.maike.rodrigues.app.countries.services;

import com.maike.rodrigues.app.countries.repositories.CountryRepository;
import com.maike.rodrigues.app.countries.entities.Country;
import com.maike.rodrigues.app.countries.exceptions.CountryNotFoundException;
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
