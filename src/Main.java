public class Main {
    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom();
        palindrom.searchPalindrom("I like javaj aa !!!");
        WordLength wordLength = new WordLength();
        wordLength.SearchWordLength("I like javaj aa !!!");
        ShortestWord shortestWord = new ShortestWord();
        shortestWord.SearchShortestWord("I like javaj aa H !!!");
        Expressions expressions = new Expressions();
        expressions.makeExpressions();
        Rebus rebus = new Rebus();
        rebus.solvingTheRebus();
        CombinationOfWords combinationOfWords = new CombinationOfWords();
        combinationOfWords.combineWords("Символ", "жаба");
    }
}
