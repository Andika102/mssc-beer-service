package com.johnthompson.msscbeerservice.web.mappers;

import com.johnthompson.msscbeerservice.domain.Beer;
import com.johnthompson.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
