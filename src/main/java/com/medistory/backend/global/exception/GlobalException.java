package com.medistory.backend.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GlobalException extends RuntimeException {
    private ResponseStatus status;
}