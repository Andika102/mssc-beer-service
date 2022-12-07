package com.johnthompson.msscbeerservice.services.inventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class BeerInventoryServiceRestTemplateImplTest {

    @Autowired
    BeerInventoryService beerInventoryService;

    @BeforeEach
    void setUp() {

    }

    @Test
    void getOnHandInventory() {

        //todo evolve to use UPC
        //Integer qoh = beerInventoryService.getOnHandInventory(BeerLoader.BEER_1_UUID);

        //System.out.println(qoh);

    }
}