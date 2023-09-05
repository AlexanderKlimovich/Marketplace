package com.klymovych.orderservice.service;

import com.klymovych.orderservice.dto.OrderLineItemsDto;
import com.klymovych.orderservice.dto.OrderRequest;

import com.klymovych.orderservice.model.Order;
import com.klymovych.orderservice.model.OrderLineItems;
import com.klymovych.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

    private final OrderRepository repository;

    public void placeOrder(OrderRequest request) {
         Order order = new Order();
         order.setOrderNumber(UUID.randomUUID().toString());

         List<OrderLineItems> orderLineItemsList= request.getOrderLineItemsDtoList().stream()
                 .map(this::mapToDto)
                 .toList();
         order.setOrderLinesList(orderLineItemsList);

         repository.save(order);
    }

    private OrderLineItems mapToDto(OrderLineItemsDto orderLineItemsDto) {
        return OrderLineItems.builder()
                .price(orderLineItemsDto.getPrice())
                .quantity(orderLineItemsDto.getQuantity())
                .skuCode(orderLineItemsDto.getSkuCode())
                .build();
    }
}
