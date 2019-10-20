package com.smlf.i18n.service;

import com.smlf.i18n.vo.AppVo;

import java.util.List;

public interface AppService {

    /**
     * 根据用户标识获取所有应用
     * @param userid
     * @return
     */
    List<AppVo> listByUserid(Long userid);

    Boolean save(AppVo appVo);
}
