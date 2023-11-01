package com.quentin.getSomeInfo.CustomDictionary.Service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.quentin.getSomeInfo.CustomDictionary.Controller.CustomDictionary;

@RestController
@CrossOrigin
public class CustomDictionaryService implements CustomDictionaryApi{
    
    @Override
    public ArrayList<CustomDictionary> getCustomDictionary() {
        ArrayList<CustomDictionary> dict = new ArrayList<>();
        dict.add(new CustomDictionary(1, "hallo", new HashMap<String, String>() {{put("de", "hallo"); put("en", "hello");}}));
        dict.add(new CustomDictionary(2, "morgen", new HashMap<String, String>() {{put("de", "morgen"); put("en", "tomorrow");}}));
        dict.add(new CustomDictionary(3, "zeit", new HashMap<String, String>() {{put("de", "zeit"); put("en", "time");}}));
        dict.add(new CustomDictionary(4, "maybe", new HashMap<String, String>() {{put("de", "vielleicht"); put("en", "maybe");}}));
        return dict;
    }
}
