package com.vinisolon.picpay.challenge.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TransactionStatusEnum {

    COMPLETED("completed"),
    CANCELED("canceled");

    private final String status;

}
