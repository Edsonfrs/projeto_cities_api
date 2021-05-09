package com.fullstackvox.citiesapi.repository;

import com.fullstackvox.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
