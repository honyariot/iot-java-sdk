package io.github.honyariot.module.device.model.param;

import lombok.Data;

/**
 * description: 查询设备列表入参
 * author: auto create
 */

@Data
public class QueryDeviceRequest {

    private String iotInstanceId;

    private Integer pageSize;

    private Integer currentPage;

    private String productKey;
}
