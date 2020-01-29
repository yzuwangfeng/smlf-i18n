package com.smlf.i18n.service.converter;

import com.smlf.i18n.dto.Word;
import com.smlf.i18n.vo.WordVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class WordConverter {

    public Word convertVoToDto(WordVo wordVo){
        if (wordVo == null) {
            return null;
        }
        Word word  = new Word();
        BeanUtils.copyProperties(wordVo, word);
        return word;
    }
}
