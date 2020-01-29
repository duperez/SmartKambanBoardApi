package br.kanbanboard.kanbanboard.handlers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Slf4j
@ControllerAdvice
public class ErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> generic(Exception ex) {
        log.error("Unhandled error: " + ex.getMessage(), ex);
        return new ResponseEntity<>(Collections.singletonList(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
