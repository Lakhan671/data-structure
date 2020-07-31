package interviewquestion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;


public class CashRegister{

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line="";
       while ((line = in.readLine()) != null) {
            if(!line.isEmpty()){
                String elements[] = line.split(";");
                double change = Float.valueOf(elements[1]) - Float.valueOf(elements[0]);
                System.out.println(change < 0?"ERROR":(change == 0?"ZERO":calculateChange(change)));
            }
        }

    }

    /**
     Cash Register
     Programming challenge description:
     The goal of this challenge is to design a cash register program.
     You will be given two decimal numbers. The first is the purchase price (PP) of the item.
     The second is the cash (CH) given by the customer. Your register currently has the following
     bills/coins within it:
     'PENNY': .01,
     'NICKEL': .05,
     'DIME': .10,
     'QUARTER': .25,
     'HALF DOLLAR': .50,
     'ONE': 1.00,
     'TWO': 2.00,
     'FIVE': 5.00,
     'TEN': 10.00,
     'TWENTY': 20.00,
     'FIFTY': 50.00,
     'ONE HUNDRED': 100.00
     The aim of the program is to calculate the change that has to be returned to the customer.
     Input:
     Your program should read lines of text from standard input. Each line contains two numbers which are separated by a semicolon. The first is the Purchase price (PP) and the second is the cash(CH) given by the customer.
     Output:
     For each line of input print a single line to standard output which is the change to be returned to the customer. In case the CH < PP, print out ERROR. If CH == PP, print out ZERO. For all other cases print the amount that needs to be returned, in terms of the currency values provided. The output should be alphabetically sorted.
     Test 1
     Test Input
     Download Test 1 Input
     15.94;16.00
     Expected Output
     Download Test 1 Input
     NICKEL,PENNY
     Test 2
     Test Input
     Download Test 2 Input
     17;16
     Expected Output
     Download Test 2 Input
     ERROR
     Test 3
     Test Input
     Download Test 3 Input
     35;35
     Expected Output
     Download Test 3 Input
     ZERO
     Test 4
     Test Input
     Download Test 4 Input
     45;50
     Expected Output
     Download Test 4 Input
     FIVE
     */
    private static String calculateChange(double change){

        String result = "";
        DecimalFormat decimalFormat = new DecimalFormat("########.##");
        int intChange = (int)(Double.valueOf(decimalFormat.format(change)) * 100);
        while(intChange >= 0.01){
            if(intChange >= 10000){
                result += "ONE HUNDRED,";
                intChange -= 10000;
            } else if(intChange >= 5000){
                result += "FIFTY,";
                intChange -= 5000;
            } else if(intChange >= 2000){
                result += "TWENTY,";
                intChange -= 2000;
            } else if(intChange >= 1000){
                result += "TEN,";
                intChange -= 1000;
            } else if(intChange >= 500){
                result += "FIVE,";
                intChange -= 500;
            } else if(intChange >= 200){
                result += "TWO,";
                intChange -= 200;
            } else if(intChange >= 100){
                result += "ONE,";
                intChange -= 100;
            } else if(intChange >= 50){
                result += "HALF DOLLAR,";
                intChange -= 50;
            } else if(intChange >= 25){
                result += "QUARTER,";
                intChange -= 25;
            } else if(intChange >= 10){
                result += "DIME,";
                intChange -= 10;
            } else if(intChange >= 5){
                result += "NICKEL,";
                intChange -= 5;
            } else if(intChange >= 1){
                result += "PENNY,";
                intChange -= 1;
            }
        }
        return result.substring(0, result.length() - 1);
    }
}