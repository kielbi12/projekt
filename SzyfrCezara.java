package zadanka;

import java.util.Scanner;

public class SzyfrCezara {

    public static String encryption(String word, int key) {
        char[] tab = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
                'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'w', 'v', 'x', 'y', 'z'};
        char[] tab2 = word.toCharArray();
        for (int i = 0; i < tab2.length; i++) {
            for (int j = 0; j < tab.length; j++) {
                if (tab2[i] == tab[j]) {
                    if (j + key > 26) {
                        j = j + (key - 26);
                        tab2[i] = tab[j];
                    } else if (j + key < 0) {
                        j = j + (key + 26);
                        tab2[i] = tab[j];
                    } else {
                        j = j + key;
                        tab2[i] = tab[j];
                    }
                }
            }
        }
        String wordAfter = new String(tab2);
        return wordAfter;
    }
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        String encryption = encryption(reading.nextLine(), reading.nextInt());
        System.out.println(encryption);
    }
}
