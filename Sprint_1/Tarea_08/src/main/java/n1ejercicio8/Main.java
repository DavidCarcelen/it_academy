package n1ejercicio8;

public class Main {
    public static void main(String[] args) {

        InterReverse interReverse = (s) -> {
            String r = "";
            for (int i = 0; i < s.length(); i++) {
                r = s.charAt(i) + r;
            }
            return r;
        };
        String result = interReverse.reverse("lockdown");

        System.out.println(result);



    }
}
