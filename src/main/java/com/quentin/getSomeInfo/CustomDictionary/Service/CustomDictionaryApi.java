package com.quentin.getSomeInfo.CustomDictionary.Service;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;

import com.quentin.getSomeInfo.CustomDictionary.Controller.CustomDictionary;

public interface CustomDictionaryApi {
    
    @GetMapping("/customDictionary/info")
    public ArrayList<CustomDictionary> getCustomDictionary();
}
