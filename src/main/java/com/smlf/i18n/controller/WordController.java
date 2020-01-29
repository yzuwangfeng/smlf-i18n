package com.smlf.i18n.controller;

import com.smlf.i18n.vo.WordVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/word")
public class WordController {

    @PostMapping("/new")
    @ApiOperation(value = "新增词条", httpMethod = "POST")
    public Boolean add(@RequestBody WordVo wordVo) {

        return true;
    }

}
