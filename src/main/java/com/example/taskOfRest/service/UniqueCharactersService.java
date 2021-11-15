package com.example.taskOfRest.service;

public class UniqueCharactersService {
    public Boolean checkUniqueCharacters(String s) {

        for (int i = 0; i < s.length(); i++)
            for (int j = i + 1; j < s.length(); j++)
                if (s.charAt(i) == s.charAt(j))
                    return false;
        return true;
    }
}
