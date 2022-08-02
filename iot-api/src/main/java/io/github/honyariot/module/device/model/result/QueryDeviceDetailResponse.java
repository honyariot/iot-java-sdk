package io.github.honyariot.module.device.model.result;

import lombok.Data;

/**
 * @description: 设备详情返回值
 * @author: auto create
 * @date: 2022/8/1 16:17
 */

@Data
public class QueryDeviceDetailResponse {

    private String requestId;

    private Boolean success;

    private String code;

    private String errorMessage;

    private Data data;

    public static class Data {

        private String iotId;

        private String productKey;

        private String productName;

        private String deviceName;

        private String deviceSecret;

        private String firmwareVersion;

        private String gmtCreate;

        private String utcCreate;

        private String gmtActive;

        private String utcActive;

        private String gmtOnline;

        private String utcOnline;

        private String status;

        private String ipAddress;

        private Integer nodeType;

        private String region;

        private Boolean owner;

        private String nickname;
    }
}
