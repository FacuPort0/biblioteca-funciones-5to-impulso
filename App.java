import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {

    }

    // Suma de dos números
    public static int suma(int a, int b) {
        return a+b;
    }

    // Resta de dos números
    public static int resta(int a, int b) {
        return a-b;
    }

    public class Operaciones {

    // Multiplicación de dos números
    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    // División de dos números
    public static double division(int a, int b) {
        return (double) a / b;
    }

    // Máximo de dos números
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Mínimo de dos números
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    // Factorial de un número
    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    // Número par
    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    // Número impar
    public static boolean esImpar(int n) {
        return n % 2 != 0;
    }

    // Potencia de un número
    public static double potencia(double base, int exponente) {
        return Math.pow(base, exponente);
    }

    // Raíz cuadrada de un número
    public static double raizCuadrada(double n) {
        return Math.sqrt(n);
    }

    // Longitud de una cadena
    public static int longitudCadena(String cadena) {
        return cadena.length();
    }

    // Concatenar dos cadenas
    public static String concatenarCadenas(String cadena1, String cadena2) {
        return cadena1 + cadena2;
    }

    // Convertir a mayúsculas
    public static String convertirMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // Convertir a minúsculas
    public static String convertirMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    // Revertir una cadena
    public static String revertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // Contar vocales en una cadena
    public static int contarVocales(String cadena) {
        int contador = 0;
        for (char c : cadena.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    // Contar palabras en una cadena
    public static int contarPalabras(String cadena) {
        return cadena.trim().isEmpty() ? 0 : cadena.trim().split("\\s+").length;
    }

    // Sumar elementos de un array
    public static int sumarArray(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma;
    }

    // Encontrar el máximo en un array
    public static int maxArray(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Encontrar el mínimo en un array
    public static int minArray(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Ordenar un array
    public static void ordenarArray(int[] array) {
        Arrays.sort(array);
    }

    // Buscar un elemento en un array
    public static boolean buscarElemento(int[] array, int elemento) {
        for (int num : array) {
            if (num == elemento) {
                return true;
            }
        }
        return false;
    }

    // Invertir un array
    public class Operaciones {

        // Multiplicación de dos números
        public static int multiplicacion(int a, int b) {
            return a * b;
        }
    
        // División de dos números
        public static double division(int a, int b) {
            return (double) a / b;
        }
    
        // Máximo de dos números
        public static int max(int a, int b) {
            return (a > b) ? a : b;
        }
    
        // Mínimo de dos números
        public static int min(int a, int b) {
            return (a < b) ? a : b;
        }
    
        // Factorial de un número
        public static int factorial(int n) {
            return (n == 0) ? 1 : n * factorial(n - 1);
        }
    
        // Número par
        public static boolean esPar(int n) {
            return n % 2 == 0;
        }
    
        // Número impar
        public static boolean esImpar(int n) {
            return n % 2 != 0;
        }
    
        // Potencia de un número
        public static double potencia(double base, int exponente) {
            return Math.pow(base, exponente);
        }
    
        // Raíz cuadrada de un número
        public static double raizCuadrada(double n) {
            return Math.sqrt(n);
        }
    
        // Longitud de una cadena
        public static int longitudCadena(String cadena) {
            return cadena.length();
        }
    
        // Concatenar dos cadenas
        public static String concatenarCadenas(String cadena1, String cadena2) {
            return cadena1 + cadena2;
        }
    
        // Convertir a mayúsculas
        public static String convertirMayusculas(String cadena) {
            return cadena.toUpperCase();
        }
    
        // Convertir a minúsculas
        public static String convertirMinusculas(String cadena) {
            return cadena.toLowerCase();
        }
    
        // Revertir una cadena
        public static String revertirCadena(String cadena) {
            return new StringBuilder(cadena).reverse().toString();
        }
    
        // Contar vocales en una cadena
        public static int contarVocales(String cadena) {
            int contador = 0;
            for (char c : cadena.toLowerCase().toCharArray()) {
                if ("aeiou".indexOf(c) != -1) {
                    contador++;
                }
            }
            return contador;
        }
    
        // Contar palabras en una cadena
        public static int contarPalabras(String cadena) {
            return cadena.trim().isEmpty() ? 0 : cadena.trim().split("\\s+").length;
        }
    
        // Sumar elementos de un array
        public static int sumarArray(int[] array) {
            int suma = 0;
            for (int num : array) {
                suma += num;
            }
            return suma;
        }
    
        // Encontrar el máximo en un array
        public static int maxArray(int[] array) {
            int max = array[0];
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
    
        // Encontrar el mínimo en un array
        public static int minArray(int[] array) {
            int min = array[0];
            for (int num : array) {
                if (num < min) {
                    min = num;
                }
            }
            return min;
        }
    
        // Ordenar un array
        public static void ordenarArray(int[] array) {
            Arrays.sort(array);
        }
    
        // Buscar un elemento en un array
        public static boolean buscarElemento(int[] array, int elemento) {
            for (int num : array) {
                if (num == elemento) {
                    return true;
                }
            }
            return false;
        }
    
        // Invertir un array
    