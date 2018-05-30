package palindromo;

import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine().toLowerCase();
        char a = palabra.charAt(0);
        char[] caracteres = palabra.toCharArray();
        int hasta = palabra.length() / 2;
        boolean esPalindromo = true;
        for (int i = 0, j = palabra.length() - 1; i < hasta; i++, j--) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                esPalindromo = false;
                break;
            }

        }
        System.out.println("La palabra " + palabra + (esPalindromo ? " es " : " no es ") + "palindromo");
    }

}
