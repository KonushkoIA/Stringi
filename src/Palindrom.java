public class Palindrom {
    public void searchPalindrom(String a) {
        String b = a.trim();
        String[] c = b.split(" ");
        for (int i = 0; i < c.length - 1; i++){
            int y = 0;
            boolean flag = true;
            for (int j = c[i].length() - 1; j >= 0; j--) {
                if (c[i].charAt(y) != c[i].charAt(j)) {
                    flag = false;
                }
                y++;
            }
            if(flag){
                System.out.println("Палиндром: " + c[i]);
            }
        }
    }
}
