# PlagarismTest

#  Text Similarity Checker (Plagiarism Detector)

##  Objective
This project is designed to **compare two text documents** and return a **similarity score** based on the content. It can help detect potential plagiarism by analyzing word patterns and content similarity using cosine similarity.

---

##  Tools & Technologies
-  Java 17
-  Maven
-  Custom Tokenizer (No external libraries)
-  Input/Output text files
- (Optional)  PDF export via iText or Apache PDFBox (future extension)

---

##  Project Structure
TextSimilarityChecker/
├── pom.xml
├── README.md
├── input1.txt
├── input2.txt
├── result.txt # Output similarity percentage
└── src/
└── main/
└── java/
└── com/
└── plagiarism/
├── Main.java
├── Tokenizer.java
└── SimilarityCalculator.java

##  How to Run the Project

### Step 1: Clone or Download
Download or clone this repository and open it in **Eclipse** or any Java IDE.

### Step 2: Build the Project
Ensure Maven is configured and the `pom.xml` is in the root directory.

### Step 3: Provide Inputs
Update `input1.txt` and `input2.txt` with your own text content.

### Step 4: Run
Run `Main.java` → Check the console and `result.txt` for output.

1. Reads two input files (`input1.txt` and `input2.txt`)
2. Tokenizes and normalizes the text (lowercase, removes punctuation and stopwords)
3. Builds frequency vectors of tokens
4. Calculates **cosine similarity** between the two token vectors
5. Displays similarity percentage
6. Exports the result to `result.txt`
