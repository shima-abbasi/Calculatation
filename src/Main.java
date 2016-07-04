import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.File;

public class Main {
    Parser parserObj = new Parser();

    public static void main(String[] args) {


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