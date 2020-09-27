import java.util.ArrayList;

public class Dictionary {
    private final ArrayList<Word> words;
    public Dictionary() {
        words = new ArrayList<>();
    }
    public void addWord(Word new_word) {
        words.add(new_word);
    }
    public int sizeOfArray() {
        return words.size();
    }
    public String getWordTargetOfElement(int i) {
        return words.get(i).getWord_target();
    }
    public String getWordExplainOfElement(int i) {
        return words.get(i).getWord_explain();
    }
}
