package com.smlf.i18n.service.impl;

import com.smlf.i18n.dto.App;
import com.smlf.i18n.repository.AppRepository;
import com.smlf.i18n.service.AppService;
import com.smlf.i18n.service.converter.AppConverter;
import com.smlf.i18n.vo.AppVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppServiceImpl implements AppService {

    @Autowired
    private AppRepository appRepository;

    @Autowired
    private AppConverter appConverter;

    @Override
    public List<AppVo> listByUserid(Long userid) {
        List<App> appList = appRepository.findByUserId(userid);
        return appConverter.converDtoToVo(appList);
    }
}
