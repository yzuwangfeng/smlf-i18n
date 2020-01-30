package com.smlf.i18n.controller;

import com.smlf.i18n.service.WordService;
import com.smlf.i18n.vo.WordVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/word")
public class WordController {

    @Autowired
    private WordService wordService;

    @PostMapping("/new")
    @ApiOperation(value = "新增词条", httpMethod = "POST")
    public Boolean add(@RequestBody WordVo wordVo) {
        return wordService.save(wordVo);
    }

    @GetMapping("/list")
    @ApiOperation(value = "查询词条", httpMethod = "GET")
    public List<WordVo> listByAppId(@RequestParam Long appId) {
        return wordService.listByAppId(appId);
    }
}
