import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        DictionaryManagement.insertFromFile(dictionary);
        Scanner input = new Scanner(System.in);
        ArrayList<String> a = DictionaryCommandline.dictionarySearcher(dictionary, input.nextLine());
        for (String s : a) System.out.println(s);
        DictionaryManagement.dictionaryExportToFile(dictionary);
    }
}
