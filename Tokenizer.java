package com.plagarism;


	import java.util.*;

	public class Tokenizer {
	    private static final Set<String> stopwords = Set.of("the", "is", "in", "at", "of", "a", "an", "and", "to");

	    public List<String> tokenize(String text) {
	        text = text.toLowerCase().replaceAll("[^a-z0-9 ]", " ");
	        String[] words = text.split("\\s+");
	        List<String> tokens = new ArrayList<>();
	        for (String word : words) {
	            if (!stopwords.contains(word) && !word.isBlank()) {
	                tokens.add(word);
	            }
	        }
	        return tokens;
	    }
	}


