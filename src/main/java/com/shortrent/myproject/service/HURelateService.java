package com.shortrent.myproject.service;

import com.shortrent.myproject.generator.model.HURelate;


import java.util.List;

public interface HURelateService {
    void saveHURelate(HURelate huRelate);

    void deleteHURelate(Integer rId);

    HURelate getHURelate(Integer rId);

    void updateHURelate(HURelate huRelate);



    List<HURelate> getAll();
}
