package com.smlf.i18n.service;

import com.smlf.i18n.vo.WordVo;

import java.util.List;

public interface WordService {

    Boolean save(WordVo wordVo);

    List<WordVo> listByAppId(Long appId);
}
