package Deposit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        Parse parseObj = new Parse();
        ArrayList<Deposit> depositArray = parseObj.parseFunction();
        Collections.sort(depositArray , Collections.reverseOrder());
        parseObj.print(depositArray, "out.txt");

    }
}