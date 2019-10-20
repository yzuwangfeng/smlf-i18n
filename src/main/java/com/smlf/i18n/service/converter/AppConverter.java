package com.smlf.i18n.service.converter;

import com.google.common.collect.Lists;
import com.smlf.i18n.dto.App;
import com.smlf.i18n.vo.AppVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Component
public class AppConverter {

    public List<AppVo> converDtoToVo(List<App> dtoList) {
        if(CollectionUtils.isEmpty(dtoList)){
            return Lists.newArrayList();
        }
        List<AppVo> result = Lists.newArrayList();
        dtoList.forEach(app -> {
            AppVo vo = new AppVo();
            BeanUtils.copyProperties(app, vo);
            result.add(vo);
        });
        return result;
    }

    public App convertVoToDto(AppVo appVo) {
        if (appVo == null) {
            return null;
        }
        App app = new App();
        BeanUtils.copyProperties(appVo, app);
        return app;
    }

}
