package com.fullstackvox.citiesapi.countries.repository;

import com.fullstackvox.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
