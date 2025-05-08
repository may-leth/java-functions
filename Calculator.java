public class Calculator {
    
    public static void main(String[] args) {

        //Ejecuta aquí todos los métodos creados e imprime en la terminal.
        double number1 = 10.0;
        double number2 = 5.0;

        double add = add(number1, number2);
        System.out.println("El resultado de la suma es: " + add);

        double subtract = subtract(number1, number2);
        System.out.println("El resultado de la resta es: " + subtract);

        double multiply = multiply(number1, number2);
        System.out.println("El resultado de la resta es: " + multiply);

        double divide = divide(number1, number2);
        System.out.println("El resultado de la resta es: " + divide);
        
    }

    //Define los métodos basándote en su doc comment.

    /**
     * Function name: add
     * 
     * @param number1 (double) 
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. sum 2 numbers
     */

    public static double add(double number1, double number2) {
        return number1 + number2;
    }
    

    /**
     * Function name: subtract
     *
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. subtract 2 numbers
     */

    public static double subtract(double number1, double number2){
        return number1 - number2;
    }

    /**
     * Function name: multiply
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. multiply 2 numbers
     */

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    /**
     * Function name: divide
     * 
     * @param number1 (double)
     * @param number2 (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. divide 2 numbers
     */

    public static double divide(double number1, double number2) {
        return number1 / number2;
    }

}
