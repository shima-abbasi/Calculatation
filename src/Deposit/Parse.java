package Deposit; /**
 * Created by Shima Abbasi on 6/28/2016.
 */

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigDecimal;
import java.util.ArrayList;

import static java.lang.System.out;

public class Parse {


    public Parse() {

    }

    public ArrayList<Deposit> parseFunction() {
        ArrayList<Deposit> depositArray = new ArrayList<Deposit>();
        try {
            //----loading file-------------------
            File fXmlFile = new File("src/input.XML");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            //-----------------------------------
            doc.getDocumentElement().normalize();
            //-----------------------------------
            NodeList nList = doc.getElementsByTagName("deposit");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    String customerNumber = eElement.getElementsByTagName("customerNumber").item(0).getTextContent();
                    String depositType = eElement.getElementsByTagName("depositType").item(0).getTextContent();
                    BigDecimal depositBalance = new BigDecimal(eElement.getElementsByTagName("depositBalance").item(0).getTextContent());
                    BigDecimal durationInDays = new BigDecimal(eElement.getElementsByTagName("durationInDays").item(0).getTextContent());
                    depositArray.add(new Deposit(customerNumber, depositType, depositBalance, durationInDays));

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return depositArray;
    }

    public void print(ArrayList<Deposit> depositArray, String filePath) throws IOException {
        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        for (Deposit deposit : depositArray) {
            file.writeChars(deposit.getCustomerNumber() + "#" + deposit.getPaidInterest());
            out.println("");
        }
        file.close();
    }
}