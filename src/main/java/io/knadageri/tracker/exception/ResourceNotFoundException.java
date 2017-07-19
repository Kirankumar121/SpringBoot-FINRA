package io.knadageri.tracker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by knadageri on 7/17/17.
 */

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException  extends RuntimeException {
    public ResourceNotFoundException(String msg, Throwable thro){
        super(msg,thro);

    }

    public ResourceNotFoundException(String msg){
        super(msg);
    }

}
