package com.plagarism;



	import java.util.*;

	public class SimilarityCalculator {
	    public double cosineSimilarity(List<String> doc1, List<String> doc2) {
	        Set<String> allWords = new HashSet<>(doc1);
	        allWords.addAll(doc2);

	        Map<String, Integer> freq1 = getFrequencyMap(doc1);
	        Map<String, Integer> freq2 = getFrequencyMap(doc2);

	        double dotProduct = 0.0;
	        double norm1 = 0.0;
	        double norm2 = 0.0;

	        for (String word : allWords) {
	            int f1 = freq1.getOrDefault(word, 0);
	            int f2 = freq2.getOrDefault(word, 0);

	            dotProduct += f1 * f2;
	            norm1 += f1 * f1;
	            norm2 += f2 * f2;
	        }

	        return dotProduct / (Math.sqrt(norm1) * Math.sqrt(norm2));
	    }

	    private Map<String, Integer> getFrequencyMap(List<String> tokens) {
	        Map<String, Integer> map = new HashMap<>();
	        for (String token : tokens) {
	            map.put(token, map.getOrDefault(token, 0) + 1);
	        }
	        return map;
	    }
	}


