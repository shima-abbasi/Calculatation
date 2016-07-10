import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Parse parseObj = new Parse();
        parseObj.parseFunction();

    }

    public void print() {
        RandomAccessFile out = null;
        try {
            File file = new File("out.txt");
            out = new RandomAccessFile(file, "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}