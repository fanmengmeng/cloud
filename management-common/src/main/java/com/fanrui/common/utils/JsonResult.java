package com.fanrui.common.utils;

import com.alibaba.fastjson.JSONObject;

public class JsonResult {
    public static JSONObject success(Object obj) {
        JSONObject json = new JSONObject();
        json.put("state", true);
        json.put("msg", "成功");
        if (null != obj) {
            json.put("obj", obj);
        }
        return json;
    }

    public static JSONObject fail(Object obj) {
        JSONObject json = new JSONObject();
        json.put("state", false);
        json.put("msg", "失败");
        if (null != obj) {
            json.put("obj", obj);
        }
        return json;
    }

    public static JSONObject toJSONObject(boolean state, String msg, Object obj) {
        JSONObject json = new JSONObject();
        json.put("state", state);
        json.put("msg", msg);
        if (null != obj) {
            json.put("obj", obj);
        }
        return json;
    }

}
