package com.smlf.i18n.repository;

import com.smlf.i18n.dto.App;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppRepository extends CrudRepository<App, Long> {

    List<App> findByUserId(Long userid);
}
