import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Parse parseObj = new Parse();
        ArrayList<Deposit> depositArray = parseObj.parseFunction();
        Collections.sort(depositArray , Collections.reverseOrder());
    }

    public void print(ArrayList<Deposit> deposits) {
        RandomAccessFile out = null;
        try {
            File file = new File("out.txt");
            out = new RandomAccessFile(file, "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}