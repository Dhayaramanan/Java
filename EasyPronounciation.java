import java.util.Scanner;

public class EasyPronounciation {
    public static boolean easyPronounce(String s, int length) {
        // code not finished
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test_cases = in.nextInt();
        int string_length;
        String s;

        for (int i = 0; i < test_cases; ++i) {
            string_length = in.nextInt();
            s = in.nextLine();

            if (easyPronounce(s, string_length)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}