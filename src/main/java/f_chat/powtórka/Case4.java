package f_chat.powtórka;

public class Case4 {
    public static void main(String[] args) {
        String text = "xalfabet";
        char highest = 0;
        for (int i = 0; i < text.length(); i++ ) {
            if (text.charAt(i) > highest) {
                highest = text.charAt(i);
            }
        }
        System.out.println(highest);

    }
}
