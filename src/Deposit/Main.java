package Deposit;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        Parse parseObj = new Parse();
        ArrayList<Deposit> depositArray = parseObj.parseFunction();
        Collections.sort(depositArray , Collections.reverseOrder());
        print(depositArray, "out.txt");

    }
    public static void print(ArrayList<Deposit> depositArray, String filePath) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        for (Deposit deposit : depositArray) {
            file.writeBytes(deposit.getCustomerNumber() + "#" + deposit.getPaidInterest() + "\n");
        }
        file.seek(0);
        file.close();
    }
}