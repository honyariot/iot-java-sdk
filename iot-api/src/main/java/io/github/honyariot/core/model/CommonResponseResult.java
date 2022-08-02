package io.github.honyariot.core.model;


import lombok.Data;

/**
 * @author lidesheng
 */
@Data
public class CommonResponseResult {

    private Boolean success;
    private Integer code;
    private String message;
    private String localizedMsg;
    private Object data;
}
