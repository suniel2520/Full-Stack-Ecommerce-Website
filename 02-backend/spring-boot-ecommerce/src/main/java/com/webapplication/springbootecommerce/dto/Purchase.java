package com.webapplication.springbootecommerce.dto;

import com.webapplication.springbootecommerce.entity.Address;
import com.webapplication.springbootecommerce.entity.Customer;
import com.webapplication.springbootecommerce.entity.Order;
import com.webapplication.springbootecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
