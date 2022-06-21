package com.youcode.hephaestus.controllers;

import com.youcode.hephaestus.dto.models.OrderDto;
import com.youcode.hephaestus.entities.Orders;
import com.youcode.hephaestus.services.OrderService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/order")
public class OrderController {

    OrderService orderService;

    @GetMapping
    public List<OrderDto> getAll(){
        return orderService.getAll();
    }

    @GetMapping("/{id}")
    public Orders getOrderById(String id){
        return orderService.getOrderById(id);
    }

    @PostMapping("/add")
    public Orders addOrder(@RequestBody Orders order){
        System.out.println(order.getAddress());
        return orderService.addOrder(order);
    }

    @PostMapping("/changeStatus")
    public Orders changeStatus(String id, String status){
        return orderService.changeStatus(id, status);
    }
}
