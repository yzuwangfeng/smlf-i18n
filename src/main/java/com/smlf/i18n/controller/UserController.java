package com.smlf.i18n.controller;

import com.smlf.i18n.service.AppService;
import com.smlf.i18n.vo.AppVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private AppService appService;

    @GetMapping("/{userid}/app")
    @ApiOperation(value = "用户所有应用列表", httpMethod = "GET")
    public List<AppVo> listAppByUserid(@PathVariable("userid") Long userid){
        return appService.listByUserid(userid);
    }

}
