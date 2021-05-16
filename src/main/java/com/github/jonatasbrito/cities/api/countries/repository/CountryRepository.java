package com.github.jonatasbrito.cities.api.countries.repository;

import com.github.jonatasbrito.cities.api.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
