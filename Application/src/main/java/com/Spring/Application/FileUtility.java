package com.Spring.Application;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

public class FileUtility {
    private FileUtility() {}
    
    public static void main(String[] args) throws URISyntaxException, IOException {                
        Path infile = Paths.get("C:\\Users\\redgo03\\Desktop\\sri_data\\GBR Data\\ChineseData\\data\\ChinesePostCodes.txt");
        Path outfile = Paths.get(new File("C:\\Users\\redgo03\\Desktop\\sri_data\\GBR Data\\ChineseData\\data\\ChinesePostCodes_output.txt").toURI());
        removeDuplicateLines(infile, outfile);
    }
    
    /* modify this code to remove duplicate lines */
    public static void removeDuplicateLines(final Path infile, final Path outfile) 
            throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(outfile, StandardCharsets.UTF_8)) {
            try (BufferedReader reader = Files.newBufferedReader(infile, StandardCharsets.UTF_8)) {
                // read/write the first line here so we can prepend newlines in the for loop            
                Set<String> duplicates = new HashSet<>();
            	String line = reader.readLine();
                writer.write(line);
                duplicates.add(line);             
                while ((line = reader.readLine()) != null) {
                    if (duplicates.add(line)) {
	                	writer.newLine();
	                    writer.write(line);
                    }  
                }
            }
        }
    }

}