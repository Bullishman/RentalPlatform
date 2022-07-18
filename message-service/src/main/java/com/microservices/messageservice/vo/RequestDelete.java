package com.microservices.messageservice.vo;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class RequestDelete {
    @NotNull(message="Sender cannot be null")
    private String sender;

    @NotNull(message="Receiver cannot be null")
    private String receiver;
}
