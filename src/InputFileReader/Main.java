package InputFileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        StringBuilder word2 = new StringBuilder();
        ;
        FileWriter fileWriter = new FileWriter("tilek.txt");

        char a;
        for (int i = 97; i <= 122; i++) {
            a = (char) i;
            word2.append(Character.toString(a).toUpperCase() + " ");
            word2.append(a + "\n");
        }
        for (int i = 0; i < 10; i++) {
            word2.append(i + "\n");
        }
        fileWriter.write(String.valueOf(word2));
        fileWriter.close();


    FileReader fileReader = new FileReader("tilek.txt");

    Scanner scanner = new Scanner(fileReader);
        while(scanner.hasNextLine())
    {
        System.out.println(scanner.nextLine());
    }

}}


