package com.smlf.i18n.service.converter;

import com.google.common.collect.Lists;
import com.smlf.i18n.dto.Word;
import com.smlf.i18n.vo.WordVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

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

    public List<WordVo> convertDtoToVo(List<Word> wordList){
        if(CollectionUtils.isEmpty(wordList)){
            return  Collections.emptyList();
        }
        List<WordVo> wordVoList = Lists.newArrayList();
        wordList.forEach(word -> {
            WordVo wordVo = new WordVo();
            BeanUtils.copyProperties(word, wordVo);
            wordVoList.add(wordVo);
        });
        return wordVoList;
    }
}
