public class Rebus {
    public void solvingTheRebus() {
        StringBuilder rebus = new StringBuilder();
        String owl = "Сова";
        owl = owl.substring(0, owl.length() - 1);
        rebus.append(owl);
        String number = "семь";
        number = number.substring(0, number.length() - 1);
        rebus.append(number);
        rebus.append(" ");
        String ear = "ухо";
        String reversedString = new StringBuffer(ear).reverse().toString();
        rebus.append(reversedString);
        String spruces = "ели";
        rebus.append(spruces);
        System.out.println(rebus);
    }
}
