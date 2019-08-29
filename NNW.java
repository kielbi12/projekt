package zadanka;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NNW {

    public static int NWD_1(int pierwsza, int druga) {
        while (pierwsza != druga) // dopóki dwie liczby nie są sobie równe
        {
            if (pierwsza > druga)  // sprawdzamy, która z nich jest większa
            {
                pierwsza = pierwsza - druga; // odejmujemy mniejszą liczbę
            }                               // od większej
            else {
                druga = druga - pierwsza;
            }
        }
        return pierwsza;
    }
    public static int najmniejszaWspolnaWielokrotnosc(int a, int b) {
        return (a * b) / najwiekszyWspolnyDzielnik(a, b);
    }
    public static int najwiekszyWspolnyDzielnik(int a, int b) {
        List<Integer> list = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                list.add(i);
            }
        }
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                list2.add(i);
            }
        }
        int number = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list.get(i).equals(list2.get(j))) {
                    number = list.get(i);
                }
            }
        }
        return number;
    }
    public static void show(int a, int b){
        System.out.println("Największy wspólny dzielnik to: "+najwiekszyWspolnyDzielnik(a,b));
        System.out.println("Największa wspólna wielokrotność to: "+najmniejszaWspolnaWielokrotnosc(a,b));
    }

    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        show(odczyt.nextInt(),odczyt.nextInt());
    }

}
