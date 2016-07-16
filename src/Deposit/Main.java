package Deposit;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        Parse parseObj = new Parse();
        ArrayList<Deposit> depositArray = parseObj.parseFunction();
        Collections.sort(depositArray, Collections.reverseOrder());
        print(depositArray, "out.txt");

    }

    public static void print(ArrayList<Deposit> depositArray, String filePath) throws IOException {
        PrintStream printStream = new PrintStream(new FileOutputStream("out.txt"));
        for (Deposit deposit : depositArray) {
            printStream.println(deposit.getCustomerNumber() + "#" + deposit.getPaidInterest());
        }
        printStream.close();
    }
}