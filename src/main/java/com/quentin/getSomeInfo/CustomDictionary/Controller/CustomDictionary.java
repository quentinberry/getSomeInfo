package com.quentin.getSomeInfo.CustomDictionary.Controller;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CustomDictionary {
    public Integer id;
    public String originalWord;
    public Map<String, String> translation;
}
