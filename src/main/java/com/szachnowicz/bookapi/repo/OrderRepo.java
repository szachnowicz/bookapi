package com.szachnowicz.bookapi.repo;

import com.szachnowicz.bookapi.model.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.sql.Date;
import java.util.List;

@Mapper
public interface OrderRepo {
    List<Orders> getOrderBetween(Date begin, Date end);

    @Select("SELECT * FROM ORDER")
    List<Orders> getLatest();



}
