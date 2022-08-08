package com.example.springrestfulpractice.service;

import com.example.springrestfulpractice.model.Meal;
import com.example.springrestfulpractice.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private List<Order> orderList = new ArrayList<>();

    public OrderService() {
        List<Meal> mealList1 = new ArrayList<>();
        mealList1.add(new Meal("hamburger", 120, "This is delicious"));
        mealList1.add(new Meal("ice cream", 50, "YM~YM~"));
        this.orderList.add(new Order(1, "Joey", mealList1));

        List<Meal> mealList2 = new ArrayList<>();
        mealList2.add(new Meal("salads", 100, "QQ"));
        mealList2.add(new Meal("ice cream", 50, "YM~YM~"));
        mealList2.add(new Meal("rice", 50, "Really good!"));
        mealList2.add(new Meal("sandwiches", 120, "Tastes great!"));
        this.orderList.add(new Order(2, "Maggie", mealList2));
    }



    public List<Order> getAllOrders() {
        return this.orderList;
    }

    public Order getOrderBySeq(int seq) {
        for (Order orderSeq : this.orderList) {
            if (seq == orderSeq.getSeq()) {
                return orderSeq;
            }
        }
        return null;
    }

    public Order createOrder(Order order) {
        this.orderList.add(order);
        return order;
    }

    public Order updateOrder(int seq, Order order) {
        for (Order updatedOrder : this.orderList) {
            if (seq == updatedOrder.getSeq()) {
                updatedOrder.setWaiter(order.getWaiter());
                updatedOrder.setMealList(order.getMealList());
                return updatedOrder;
            }
        }
        return null;
    }

    public Order deleteOrder(int seq) {
        for (Order order : this.orderList) {
            if (seq == order.getSeq()) {
                this.orderList.remove(order);
                return order;
            }
        }
        return null;
    }

}
