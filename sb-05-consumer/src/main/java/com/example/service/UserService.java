package com.example.service;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class UserService {

    @DubboReference
    TicketService ticketService;

    public void getTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("从服务端拿到ticket" + ticket);
    }
}
