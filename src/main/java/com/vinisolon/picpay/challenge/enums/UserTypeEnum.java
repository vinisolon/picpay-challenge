package com.vinisolon.picpay.challenge.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum UserTypeEnum {

    COMMON("common"),
    MERCHANT("merchant");

    private final String type;

}
