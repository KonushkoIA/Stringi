public class CombinationOfWords {
    public void combineWords(String a, String b) {
        StringBuilder CombinedWord = new StringBuilder();
        String leftPart = a.substring(0, a.length() / 2);
        String rightPart = b.substring(b.length() / 2, b.length());
        CombinedWord.append(leftPart);
        CombinedWord.append(rightPart);
        System.out.println(CombinedWord);
    }
}
