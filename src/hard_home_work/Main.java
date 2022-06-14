package hard_home_work;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        int i=0;
        double result = 0;
        while (true) {

            calculator.start(i);
            String simbol = scanner.nextLine();

            if (simbol.equals("exit")) {
                break;
            }

            try {
                String symbols[] = simbol.split(" ");
                if (symbols.length != 3) {calculator.start(888); main(args);}
                calculator.setFirs(symbols[0]);
                if (calculator.condition(calculator.getFirs())==1){
                    calculator.start(999);
                    main(args);
                }
                calculator.setTwo(symbols[2]);
                if (calculator.condition(calculator.getTwo())==1){
                    calculator.start(999);
                    main(args);
                }
                String operation = symbols[1];
                calculator.calculate(calculator.getFirs(), operation, calculator.getTwo());
         } catch (Exception e) {
                e.printStackTrace();
            }
            calculator.printResult();

        i++;
        }
        scanner.close();
    }
}
