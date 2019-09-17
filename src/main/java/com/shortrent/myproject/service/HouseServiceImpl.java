package com.shortrent.myproject.service;

import com.shortrent.myproject.generator.dao.HouseDao;
import com.shortrent.myproject.generator.model.House;
import com.shortrent.myproject.generator.model.HouseExample;
import com.shortrent.myproject.generator.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class HouseServiceImpl implements HouseService {

    @Resource
    private HouseDao houseDao;

    @Override
    public void saveHouse(House house) {
        houseDao.insert(house);
    }

    @Override
    public void deleteHouse(Integer hId) {
        houseDao.deleteByPrimaryKey(hId);
    }

    @Override
    public House getHouse(Integer hId) {
        return houseDao.selectByPrimaryKey(hId);
    }

    @Override
    public void updateHouse(House house) {
        houseDao.updateByPrimaryKeySelective(house);
    }

    @Override
    public List<House> getAll() {
        List<House> houses=houseDao.selectByExample(null);
        return null;
    }

    @Override
    public List<House> getHouseBylocation(House house) {
        HouseExample houseExample=new HouseExample();
        HouseExample.Criteria criteria=houseExample.createCriteria();
        criteria.andHDelocationEqualTo(house.gethDelocation());
        List<House> houses=houseDao.selectByExample(houseExample);
        return houses;
    }
}
