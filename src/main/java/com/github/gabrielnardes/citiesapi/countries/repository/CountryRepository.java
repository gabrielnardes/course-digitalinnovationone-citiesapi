package com.github.gabrielnardes.citiesapi.countries.repository;

import com.github.gabrielnardes.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
