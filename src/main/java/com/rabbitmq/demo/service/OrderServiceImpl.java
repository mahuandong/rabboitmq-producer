package com.rabbitmq.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rabbitmq.demo.mapper.OrderMapper;
import com.rabbitmq.demo.domain.Order;
import com.rabbitmq.demo.service.OrderService;
/**
 * Created by Enzo Cotter on 2019/11/15.
 */

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService{

}
