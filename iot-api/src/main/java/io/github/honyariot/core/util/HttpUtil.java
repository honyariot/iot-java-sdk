package io.github.honyariot.core.util;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import okhttp3.*;
import java.io.IOException;

/**
 * @description okhttp请求基础工具
 * @author auto create
 * @date 2022/7/12 18:02
 */

@Slf4j
public class HttpUtil {

    /**
     * url 平台接口url
     */
    private final String url;
    /**
     * accessKey 由鸿雁物联平台分发
     */
    private final String accessKey;
    /**
     * accessSecret 由鸿雁物联平台分发
     */
    private final String accessSecret;

    private static final MediaType JSON_SET = MediaType.parse("application/json;charset=utf-8");

    public HttpUtil(String accessKey,String accessSecret,String url){
        this.accessKey = accessKey;
        this.accessSecret = accessSecret;
        this.url = url;
    }

    /**
     * post请求封装
     *
     * @param object
     * @return
     */
    public  Response post(Object object,String action){
        try{
            JSONObject jsonObject = (JSONObject) JSONObject.toJSON(object);
            RequestBody requestBody = RequestBody.create(String.valueOf(jsonObject),JSON_SET);
            OkHttpClient client = new OkHttpClient();
            Request request = new Request.Builder()
                    .header("accessKey",accessKey)
                    .header("accessSecret",accessSecret)
                    .url(url + action)
                    .post(requestBody)
                    .build();
            return client.newCall(request).execute();
        }catch (IOException e){
            log.error("post请求异常,{}",e);
        }
       return null;
    }
}
