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
}
