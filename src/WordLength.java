public class WordLength {
    public void SearchWordLength(String a) {
        String b = a.trim();
        String[] c = b.split(" ");
        for (String f : c ) {
            if (f.length()<=5 && f.length()>=3){
                System.out.println("Слово, длина которого от 3 до 5 символов: " + f);
            }
        }
    }
}
