package com.smlf.i18n.service.impl;

import com.smlf.i18n.dto.Word;
import com.smlf.i18n.repository.WordRepository;
import com.smlf.i18n.service.WordService;
import com.smlf.i18n.service.converter.WordConverter;
import com.smlf.i18n.vo.WordVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordServiceImpl implements WordService {
    @Autowired
    private WordConverter wordConverter;
    @Autowired
    private WordRepository wordRepository;
    @Override
    public Boolean save(WordVo wordVo) {
        if(wordVo == null){
            return false;
        }
        Word word = wordConverter.convertVoToDto(wordVo);
        wordRepository.save(word);
        return true;
    }

    @Override
    public List<WordVo> listByAppId(Long appId) {
        List<Word> wordList = wordRepository.findByAppId(appId);
        return wordConverter.convertDtoToVo(wordList);
    }
}
