package io.github.honyariot.module.device.model.result;

import lombok.Data;

import java.util.List;

/**
 * 设备列表响应
 * @author  auto create
 */
@Data
public class QueryDeviceResponse {

    private Boolean success;
    private Integer code;
    private String message;
    private String localizedMsg;
    private List<DeviceInfo> data;

    @Data
    public static class DeviceInfo {
        /**
         * 主键
         */
        private Long id;

        /**
         * 家庭id
         */
        private Long homeId;

        /**
         * 原始三方平台家庭id
         */
        private String originHomeId;

        /**
         * 三方平台id,platform表id
         */
        private Long platformId;

        /**
         * 房间Id
         */
        private Long roomId;

        /**
         * 父级设备id
         */
        private Long parentId;

        /**
         * 设备pk
         */
        private String productKey;

        /**
         * 设备dn
         */
        private String deviceName;

        /**
         * 设备密钥
         */
        private String deviceSecret;

        /**
         * 型号id
         */
        private String modelId;

        /**
         * 设备名称
         */
        private String nickname;

        /**
         * 固件版本号
         */
        private String firmwareVersion;

        /**
         * 字典：DEVICE-设备，VIRTUAL-虚拟设
         */
        private String type;

        /**
         * 排序
         */
        private Integer sort;

        /**
         * 私有数据
         */
        private String privateData;

        /**
         * 上下线状态（字典 ONLINE-在线 OFFLINE-离线 UNACTIVE-未激活）
         */
        private String status;

        /**
         * ip
         */
        private String ip;

        /**
         * mac
         */
        private String mac;

        /**
         * 红外码[红外虚拟设备用]
         */
        private String infraredCode;

        /**
         * 物模型属性标识
         */
        private String identifier;

        /**
         * 第几路[多路虚拟设备用]
         */
        private Integer circuit;

        /**
         * 是否显示 1是 0否
         */
        private Integer presplitStatus;

        /**
         * 是否绑定 0=否 1=是
         */
        private Integer bindingStatus;

        /**
         * 是否删除 0=否 1=是
         */
        private Integer deletedStatus;

        /**
         * 是否显示 1是 0否
         */
        private Integer showStatus;

        /**
         * 是否有子级 1是 0否
         */
        private Integer hasChild;

        /**
         * 品类图标
         */
        private String categoryImage;

        /**
         * 是否是房间默认传感器 0=否 1=是
         */
        private Integer defaultSensor;

        /**
         * 设备按键名称
         */
        private String swicchName;
    }
}
