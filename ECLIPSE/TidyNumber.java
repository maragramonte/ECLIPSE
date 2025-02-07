public class TidyNumber {
    public static boolean tidyNumber(int number) {
        char[] digits = String.valueOf(number).toCharArray();  // Convertimos el número a un array de caracteres
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] < digits[i - 2]) {  // Comprobamos si el dígito actual es menor que el anterior
                return false;  // Si encontramos una secuencia descendente, devolvemos false
            }
        }
        return true;  // Si no encontramos ninguna secuencia descendente, el número es "tidy"
    }

    public static void main(String[] args) {
        System.out.println(tidyNumber(12));    // true
        System.out.println(tidyNumber(32));    // false
        System.out.println(tidyNumber(39));    // true
        System.out.println(tidyNumber(1024));  // false
        System.out.println(tidyNumber(12576)); // false
        System.out.println(tidyNumber(13579)); // true
        System.out.println(tidyNumber(2335));  // true
        System.out.println(tidyNumber(12));    // true
        System.out.println(tidyNumber(32));    // false
        System.out.println(tidyNumber(12576)); // false
        System.out.println(tidyNumber(13579)); // true
    }
}
