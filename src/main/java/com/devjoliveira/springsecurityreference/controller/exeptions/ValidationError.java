package com.devjoliveira.springsecurityreference.controller.exeptions;

import java.time.Instant;
import java.util.List;

public record ValidationError(
                Instant timestamp,
                Integer status,
                String error,
                String message,
                String path,
                List<FieldMessage> errors) {

}