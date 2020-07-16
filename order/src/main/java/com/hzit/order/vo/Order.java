package com.hzit.order.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int code;
    private String msg;

    private int userId;
    private long orderId;
    private OrderDetail orderDetail;
}
