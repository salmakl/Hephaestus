package com.youcode.hephaestus.services;

import com.youcode.hephaestus.dto.models.OrderDto;
import com.youcode.hephaestus.dto.services.IMapDto;
import com.youcode.hephaestus.entities.Orders;
import com.youcode.hephaestus.repositories.OrderRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrderService {

    private OrderRepository orderRepository;

    private IMapDto<Orders, OrderDto> orderMapping;

    public List<OrderDto> getAll(){
        List<Orders> orders= orderRepository.findAll();
        return orderMapping.convertListToListDto(orders, OrderDto.class);
    }


    public Orders getOrderById(String id){
        return orderRepository.findById(id).get();
    }

    public Orders addOrder(Orders order){
        return orderRepository.save(order);
    }

    public Orders changeStatus(String id, String status){
        Orders order = orderRepository.findById(id).get();
        order.setStatus(status);
        return orderRepository.save(order);
    }


    public int getPendingOrdersCount(){
        return orderRepository.countByStatus("pending");
    }

}
