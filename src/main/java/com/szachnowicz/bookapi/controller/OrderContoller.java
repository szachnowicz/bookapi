package com.szachnowicz.bookapi.controller;


import com.szachnowicz.bookapi.model.Orders;
import com.szachnowicz.bookapi.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class OrderContoller {

    @Autowired
    OrderRepo orderRepo;

    @GetMapping("order/")
    public ResponseEntity<List<Orders>> getOrdersByDate(@RequestBody Date begin, @RequestBody Date end) {
        List<Orders> result = orderRepo.getOrderBetween(begin, end);
        if (result.isEmpty()) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(result, HttpStatus.OK);

    }


    @GetMapping("/latest/")
    public ResponseEntity<List<Orders>> getLatestOrders() {
        List<Orders> result = orderRepo.getLatest();
        if (result.isEmpty()) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(result, HttpStatus.OK);

    }


}
