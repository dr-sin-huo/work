package com.shortrent.myproject.service;


import com.shortrent.myproject.generator.model.House;
import com.shortrent.myproject.generator.model.User;

import java.util.List;

public interface HouseService {
    void saveHouse(House house);

    void deleteHouse(Integer hId);

    House getHouse(Integer hId);

    void updateHouse(House house);

    List<House> getAll();

    List<House> getHouseBylocation(House house);
}
