package com.smlf.i18n.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tab_translated_word")
public class TranslatedWord {

    private int id;

    private int wordId;

    private String language;

    private String translation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWordId() {
        return wordId;
    }

    public void setWordId(int wordId) {
        this.wordId = wordId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
}
