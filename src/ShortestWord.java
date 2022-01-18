import java.util.ArrayList;

public class ShortestWord {
    public void SearchShortestWord(String a) {
        StringBuilder ShortestWord = new StringBuilder("very-very long word");
        String b = a.trim();
        String[] c = b.split(" ");
        ArrayList<StringBuilder> words = new ArrayList<>();
        for (String f : c ) {
            if (f.length() < ShortestWord.length()){
                ShortestWord = new StringBuilder(f);
                words.add(ShortestWord);
            }
            else if (f.length() == ShortestWord.length()) {
                StringBuilder t = new StringBuilder(f);
                words.add(t);
            }
        }
        System.out.println("Самое короткое слово(а): " + words);
    }
}
