package io.knadageri.tracker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by knadageri on 7/17/17.
 */

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

    public BadRequestException(String msg, Throwable thro){
        super(msg,thro);
    }

    public BadRequestException(String msg){
        super(msg);
    }

}
