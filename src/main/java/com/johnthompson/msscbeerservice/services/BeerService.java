package com.johnthompson.msscbeerservice.services;

import com.johnthompson.msscbeerservice.web.model.BeerDto;
import com.johnthompson.msscbeerservice.web.model.BeerPagedList;
import com.johnthompson.msscbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);
    BeerDto getBeerById(UUID beerId, Boolean showInventoryOnHand);
    BeerDto saveNewBeer(BeerDto beerDto);
    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
    BeerDto getBeerByUpc(String upc);
}
