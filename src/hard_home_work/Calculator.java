package hard_home_work;

public class Calculator {
    private double firs;
    private double two;
    private double result;
    public void start(int a) {
        if (a==0) {
            System.out.println("Калкуляторга санды бериg жатканда бир сан бергенден кийин пробел калтыруу кереги зарыл:   Пример  '1 + 1' же 'X + 5'");
            System.out.println("Калкулятордон чыгуу учун exit созун жазыныз");
        }else if (a ==999){
            System.out.println("Берилген сан 0 жогору же 10 ылдый болуу зарыл");
        }else if (a ==888){
            System.out.println("Туура эмес маанилер берилди , сиз пробел коп же сандарды коп берип салдыныз ");
        }
        else  {
            System.out.println("Калкулятор Программасы очуро элек, колдоонуну улантыныз");
            System.out.println("Калкулятордон чыгуу учун exit созун жазыныз");
        }
    }

    public double getFirs() {
        return firs;
    }

    public void setFirs(String firs) throws Exception {
        try {
            this.firs = Double.parseDouble(firs);
        } catch (Exception e) {
            switch (firs) {
                case "I":
                    this.firs = 1;
                    break;
                case "II":
                    this.firs = 2;
                    break;
                case "III":
                    this.firs = 3;
                    break;
                case "IV":
                    this.firs = 4;
                    break;
                case "V":
                    this.firs = 5;
                    break;
                case "VI":
                    this.firs = 6;
                    break;
                case "VII":
                    this.firs = 7;
                    break;
                case "VIII":
                    this.firs = 8;
                    break;
                case "IX":
                    this.firs = 9;
                    break;
                case "X":
                    this.firs = 10;
                    break;
            }
        }


    }

    public double getTwo() {
        return two;
    }
     double condition(double a  ){
         int res=0;
         if (a<0||a>10) {
           res= 1;
         }
         else
         {
             res=0;
         }
         return res;
      }
    public void setTwo(String two) throws Exception {
        try {
            this.two = Double.parseDouble(two);
        } catch (Exception e) {
            switch (two) {
                case "I":
                    this.two = 1;
                    break;
                case "II":
                    this.two = 2;
                    break;
                case "III":
                    this.two = 3;
                    break;
                case "IV":
                    this.two = 4;
                    break;
                case "V":
                    this.two = 5;
                    break;
                case "VI":
                    this.two = 6;
                    break;
                case "VII":
                    this.two = 7;
                    break;
                case "VIII":
                    this.two = 8;
                    break;
                case "IX":
                    this.two = 9;
                    break;

                case "X":
                    this.two = 10;
                    break;
            }
        }


       }

    public void calculate(double a, String b, double c) {

        switch (b) {
            case "+":
                this.result = a + c;
             break;
            case "-":
                this.result = a - c;
            break;
            case "*":
                this.result = a * c;
                break;
            case "/":
                this.result = a / c;
                break;
        }

}
  public  void printResult(){
      System.out.println(" =" + this.result);
  }
}

