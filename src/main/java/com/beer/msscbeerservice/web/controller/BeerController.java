package com.beer.msscbeerservice.web.controller;

import com.beer.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        return new ResponseEntity<>(BeerDto.builder().build() , HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveBeer(@RequestBody @Validated BeerDto beerDto){
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("{beerId}")
    public ResponseEntity updateBeerById(@RequestBody @Validated BeerDto beerDto , @PathVariable("beerId") UUID beerId) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

}
