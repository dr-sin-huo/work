package com.shortrent.myproject.service;

import com.shortrent.myproject.generator.dao.OrderDao;
import com.shortrent.myproject.generator.model.Order;

import javax.annotation.Resource;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    @Override
    public void saveOrder(Order order) {
        orderDao.insert(order);
    }

    @Override
    public void deleteOrder(Integer oId) {
        orderDao.deleteByPrimaryKey(oId);
    }

    @Override
    public Order getOrder(Integer oId) {
        return orderDao.selectByPrimaryKey(oId);
    }

    @Override
    public void updateOrder(Order order) {
        orderDao.updateByPrimaryKeySelective(order);
    }

    @Override
    public List<Order> getAll() {
        List<Order> orders=orderDao.selectByExample(null);
        return orders;
    }
}

