package com.smlf.i18n.controller;

import com.smlf.i18n.service.AppService;
import com.smlf.i18n.vo.AppVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/app")
public class AppController {

    @Autowired
    private AppService appService;

    @PostMapping("/new")
    @ApiOperation(value = "新增应用", httpMethod = "POST")
    public Boolean add(@RequestBody AppVo appVo){
        return appService.save(appVo);
    }

}
