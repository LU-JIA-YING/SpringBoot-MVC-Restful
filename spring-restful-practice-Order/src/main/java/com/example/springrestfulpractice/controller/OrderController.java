package com.example.springrestfulpractice.controller;

import com.example.springrestfulpractice.model.Order;
import com.example.springrestfulpractice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping() //取得所有訂單
    public List<Order> getAllOrders() {
        List<Order> orderList = this.orderService.getAllOrders();
        return orderList;
    }

    @GetMapping("/{seq}") //根據ID 取得某筆訂單
    public Order getOrderBySeq(@PathVariable int seq) {
        Order order = this.orderService.getOrderBySeq(seq);
        return order;
    }

    @PostMapping() //新增訂單
    public Order createOrder(@RequestBody Order order) {
        Order createdOrder = this.orderService.createOrder(order);
        return createdOrder;
    }

    @PutMapping("/{seq}") //修改已存在訂單
    public Order updateOrder(@PathVariable int seq, @RequestBody Order order) {
        Order updatedOrder = this.orderService.updateOrder(seq, order);
        return updatedOrder;
    }

    @DeleteMapping("/{seq}") //刪除訂單
    public Order deleteOrder(@PathVariable int seq) {
        Order deletedOrder = this.orderService.deleteOrder(seq);
        return deletedOrder;
    }
}
