package com.klymovych.orderservice.controller;

import com.klymovych.orderservice.service.OrderService;
import com.klymovych.orderservice.dto.OrderRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/order")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderRequest request) {
        orderService.placeOrder(request);
        return "Order Placed Successfully";
    }
}
