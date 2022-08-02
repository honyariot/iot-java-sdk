package io.github.honyariot.demo.device.service;

import com.alibaba.fastjson.JSONObject;
import io.github.honyariot.core.util.HttpUtil;
import io.github.honyariot.module.device.model.param.QueryDeviceRequest;
import io.github.honyariot.module.device.model.result.QueryDeviceDetailResponse;
import io.github.honyariot.module.device.model.result.QueryDeviceResponse;
import io.github.honyariot.module.device.transform.DeviceAction;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Response;

import java.io.IOException;
/**
 * description 设备服务
 * author auto create
 */

@Slf4j
public class DeviceApiService{

    private HttpUtil httpUtil = null;

    public DeviceApiService(){
        this.httpUtil = new HttpUtil("xxx","xxx","xxx");
    }

    /**
     * 设备列表 demo
     * @return null
     */
    public QueryDeviceResponse queryDevice(){
        QueryDeviceRequest queryDeviceRequest = new QueryDeviceRequest();
        queryDeviceRequest.setProductKey("xxx");

        try{
            Response response = this.httpUtil.post(queryDeviceRequest, DeviceAction.QUERY_DEVICE);
            return JSONObject.parseObject(response.body().string(),QueryDeviceResponse.class);
        }catch (IOException e){
            log.error("post请求异常,{}",e);
        }

        return null;
    }

    /**
     * 设备详情demo
     * @return null
     */
    public QueryDeviceDetailResponse queryDeviceDetail(){
        QueryDeviceRequest queryDeviceRequest = new QueryDeviceRequest();
        queryDeviceRequest.setProductKey("xxx");

        try{
            Response response = this.httpUtil.post(queryDeviceRequest, DeviceAction.QUERY_DEVICE_INFO);
            return JSONObject.parseObject(response.body().string(),QueryDeviceDetailResponse.class);
        }catch (IOException e){
            log.error("post请求异常,{}",e);
        }

        return null;
    }
}
