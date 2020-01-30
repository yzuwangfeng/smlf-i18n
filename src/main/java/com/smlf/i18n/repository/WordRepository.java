package com.smlf.i18n.repository;

import com.smlf.i18n.dto.Word;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordRepository extends CrudRepository<Word, Long> {

    List<Word> findByAppId(Long appId);
}
