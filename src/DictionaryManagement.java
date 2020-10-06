import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DictionaryManagement {
    public static void insertFromCommandline(Dictionary dictionary) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String s = input.nextLine();
        for(int i = 0;i < num;++i) {
            String word_target = input.nextLine();
            String word_explain = input.nextLine();
            Word new_word = new Word(word_target, word_explain);
            dictionary.addWord(new_word);
        }
    }

    public static void insertFromFile(Dictionary dictionary) {
        Scanner input;
        try {
            File myfile = new File("dictionaries.txt");
            input = new Scanner(myfile);
            String line;
            String[] line_split;
            while (input.hasNextLine()) {
                line = input.nextLine();
                line_split = line.split("\t");
                Word new_word = new Word(line_split[0], line_split[1]);
                dictionary.addWord(new_word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void dictionaryLookup(Dictionary dictionary) {
        System.out.print("\nEnter your word_target: ");
        Scanner input = new Scanner(System.in);
        String your_word_target = input.nextLine();
        System.out.print("Your word_explain: ");
        for (int i = 0;i < dictionary.sizeOfArray();++i) {
            if (your_word_target.equals(dictionary.getWordTargetOfElement(i))) {
                System.out.println(dictionary.getWordExplainOfElement(i));
            }
        }
    }

    public static void dictionaryExportToFile(Dictionary dictionary) {
        try {
            FileWriter my_writer = new FileWriter("outputFile.txt");
            for (int i = 0;i < dictionary.sizeOfArray();++i)
                my_writer.write(dictionary.getWordTargetOfElement(i) + "\t" + dictionary.getWordExplainOfElement(i) + "\n");
            my_writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
