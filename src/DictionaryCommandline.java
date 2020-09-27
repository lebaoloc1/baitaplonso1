public class DictionaryCommandline {
    public static void showAllWords(Dictionary dictionary) {
        System.out.println("No\t\t|English\t\t\t\t\t|Vietnamese");
        for (int i = 0;i < dictionary.sizeOfArray();++i)
            System.out.printf("%-8d| %-26s| %s \n", i + 1, dictionary.getWordTargetOfElement(i), dictionary.getWordExplainOfElement(i));
    }

    public static void dictionaryBasic(Dictionary dictionary) {
        DictionaryManagement.insertFromCommandline(dictionary);
        showAllWords(dictionary);
    }

    public static void dictionaryAdvanced(Dictionary dictionary) {
        DictionaryManagement.insertFromFile(dictionary);
        showAllWords(dictionary);
        DictionaryManagement.dictionaryLookup(dictionary);
    }
}
