package com.devjoliveira.springsecurityreference.controller.exeptions;

import java.time.Instant;

public record StandartError(

    Instant timestamp,
    Integer status,
    String error,
    String message,
    String path

) {

}