package com.example.service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "狂神说java";
    }
}
