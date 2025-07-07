package org.anagrams;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;


public class AnagramsChecker {
    public Map<String, List<String>> groupAnagrams(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .map(String::trim)
                .filter(word -> !word.isEmpty())
                .collect(Collectors.groupingBy(this::sorted));
    }

    private String sorted(String word) {
               char[] words=word.toCharArray();
               Arrays.sort(words);
               return new String(words);
    }
}
