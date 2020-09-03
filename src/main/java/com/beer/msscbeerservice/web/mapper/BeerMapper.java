package com.beer.msscbeerservice.web.mapper;

import com.beer.msscbeerservice.domain.Beer;
import com.beer.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDTO(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDTO);


}
