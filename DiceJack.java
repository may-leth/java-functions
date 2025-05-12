import java.awt.*;
import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {

        /* 
        Reglas del juego:
        - El usuario debe escoger 3 números entre 1 y 6 (incluidos).
        - El usuario debe lanzar los dados una vez, el resultado serán 3 números aleatorios.

        ¿Cuándo gana el usuario?:
        - Cuando la suma de los números escogidos es mayor a la suma de los dados lanzados
        - Y cuando la diferencia entre los dos números anteriores es menor de 5

        ej. 
        - Usuario escoge los números: 1 3 5 (la suma es 9)
        - Usuario lanza dados y salen los números: 3 1 3 (la suma es 7)
        - 9 es mayor a 7 y la diferencia entre los dos números es menor a 5. El usuario gana.

        Requisitos no funcionales (atributos de calidad):
        - Definir las 4 funciones descritas abajo.
        - En el método main escribir el programa (usar condicionales, reusar las funciones creadas, pedir al usuario que ingrese datos y recogerlos).
      
        Pasos:
        - Pedir al usuario que escoja 3 números.
        - Si el usuario escoge un número fuera del rango, salir del programa (mira en los recursos system exit).
        - Si los números son correctos, pedir al usuario si desea lanzar dados.
        - Si el usuario dice que no, salir del programa.
        - Si el usuario dice que si, lanzar dados, hacer los cálculos que indiquen si el usuario ganó o perdió.
        - Imprimir la suma de los números escogidos por el usuario y la suma de los números que salieron en los dados.
        - Imprimir si el usuario ganó o perdió.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Hola! Ingresa tres números");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        scanner.nextLine();

        if (isLessThanOne(num1, num2, num3) || isHigherThanSix(num1, num2, num3)) {
            System.out.println("Los números deben estar entre 1 y 6. El juego ha terminado");
            System.exit(0);
        }

        System.out.println("¿Quieres lanzar los dados? (si/no)");
        System.out.println();
        String answer = scanner.nextLine();

        if (!answer.equalsIgnoreCase("si")) {
            System.out.println("Has decidido no jugar. El juego ha terminado");
            System.exit(0);
        }

        int dice1 = rollDice();
        int dice2 = rollDice();
        int dice3 = rollDice();

        int addUser = num1 + num2 + num3;
        int addDice = dice1 + dice2 + dice3;

        boolean isWin = userWon(addUser, addDice);

        System.out.println("Suma de tus números: " + addUser);
        System.out.println("Suma de los dados: " + addDice);

        if (isWin) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Has perdido. Intenta de nuevo");
        }

        scanner.close();
    }


    /**
     * 
     * Function name: isLessThanOne
     * 
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return (boolean)
     * 
     * Inside the function:
     * 1. check if numbers are less than 1
     */
    
    // Escribe tu código aquí
    public static boolean isLessThanOne(int num1, int num2, int num3){
        return num1 < 1 || num2 < 1 || num3 < 1;
    }

    /**
     * 
     * Function name: isHigherThanSix
     * 
     * @param num1 (int)
     * @param num2 (int)
     * @param num3 (int)
     * @return (boolean)
     * 
     * Inside the function:
     * 1. Check if numbers are greater than 6
     */

    // Escribe tu código aquí
    public static boolean isHigherThanSix(int num1, int num2, int num3) {
        return num1 > 6 || num2 > 6 || num3 > 6;
    }

    /**
     * 
     * Function name: userWon
     * 
     * @param sumNumbers (int)
     * @param sumDiceRolls (int)
     * @return (boolean)
     * 
     * Inside the function:
     * 1. check if user numbers are greater than computer numbers and the difference between user numbers and computer numbers are less than 5. 
     */

    // Escribe tu código aquí
    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) < 5;
    }

    /**
     * Function name: rollDice
     * 
     * @return (int)
     * 
     * Inside the function:
     * 1. get random number between 1 and 6
     */

    // Escribe tu código aquí
    public static int rollDice(){
        return (int)(Math.random() * 6) + 1;
    }

}
