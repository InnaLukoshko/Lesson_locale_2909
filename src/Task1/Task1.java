package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public  static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println("Введите номер телефона");
        StringBuffer numberStrBuf = new StringBuffer(reader.readLine());
        String newNumber;
        for (int i = 0; i < numberStrBuf.length(); i++) {
            if (numberStrBuf.charAt(i) == ' ' || numberStrBuf.charAt(i) == '-' ||
                numberStrBuf.charAt(i) == '(' || numberStrBuf.charAt(i) == ')') {
                numberStrBuf = numberStrBuf.deleteCharAt(i);
                i--;
            }
        }
        String numberStr = new String(numberStrBuf);
        String numberStr0;
        String numberStr1;
        String numberStr2;
        String numberStr3;
        String numberStr4;

        if (numberStr.startsWith("80") && numberStr.length() == 11) {
            numberStr = numberStr.replaceAll("80","+375(");
            numberStr1 = numberStr.substring(0,7).concat(")");
            numberStr2 = numberStr.substring(7,10).concat("-");
            numberStr3 = numberStr.substring(10,12).concat("-");
            numberStr4 = numberStr.substring(12,14);
            newNumber = numberStr1.concat(numberStr2).concat(numberStr3).concat(numberStr4);
            System.out.println(newNumber);
        } else if (numberStr.startsWith("+375") && numberStr.length() == 13) {
            numberStr0 = numberStr.substring(0,4).concat("(");
            numberStr1 = numberStr.substring(4,6).concat(")");
            numberStr2 = numberStr.substring(6,9).concat("-");
            numberStr3 = numberStr.substring(9,11).concat("-");
            numberStr4 = numberStr.substring(11,13);
            newNumber = numberStr0.concat(numberStr1).concat(numberStr2).concat(numberStr3).concat(numberStr4);
            System.out.println(newNumber);
        }

    }
}
