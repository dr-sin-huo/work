package com.shortrent.myproject.service;


import com.shortrent.myproject.generator.model.Order;

import java.util.List;

public interface OrderService {
    void saveOrder(Order order);

    void deleteOrder(Integer oId);

    Order getOrder(Integer oId);

    void updateOrder(Order order);

    List<Order> getAll();

}
