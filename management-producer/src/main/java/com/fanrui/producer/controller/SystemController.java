package com.fanrui.producer.controller;

import com.alibaba.fastjson.JSONObject;
import com.fanrui.common.utils.JsonResult;
import com.fanrui.common.utils.JwtUtils;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SystemController {

    @PostMapping("/login")
    public Object login(@RequestBody JSONObject jsonObject) throws Exception {
        String userName = jsonObject.getString("userName");
        String password = jsonObject.getString("password");
        String jwtToken = Jwts.builder().setSubject(userName)
                .claim("roles", "member").setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "secretKey").compact();
        return JsonResult.success(jwtToken);
    }
}
