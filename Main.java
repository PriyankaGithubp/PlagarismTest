package com.plagarism;


import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String text1 = Files.readString(Paths.get("input1.txt"));
        String text2 = Files.readString(Paths.get("input2.txt"));

        Tokenizer tokenizer = new Tokenizer();
        List<String> tokens1 = tokenizer.tokenize(text1);
        List<String> tokens2 = tokenizer.tokenize(text2);

        SimilarityCalculator calculator = new SimilarityCalculator();
        double similarity = calculator.cosineSimilarity(tokens1, tokens2);

        System.out.printf("Similarity Score: %.2f%%\n", similarity * 100);

        Files.writeString(Paths.get("result.txt"), "Similarity Score: " + (similarity * 100) + "%\n");
    }
}


