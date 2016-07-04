/**
 * Created by Shima Abbasi on 6/28/2016.
 */

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;

public class Parser {
    static ArrayList<Deposit> depositArray = new ArrayList<Deposit>();

    public static void main(String arg[]) throws ClassNotFoundException {


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
                    Class loadClassType = Class.forName(eElement.getElementsByTagName("depositType").item(0).getTextContent());
                    loadClassType.newInstance();
                    Object load = Class.forName("Deposit").newInstance();
                    int cn = Integer.parseInt(eElement.getElementsByTagName("customerNumber").item(0).getTextContent());
                    // int eElement.getElementsByTagName("depositType").item(0).getTextContent());
                    double db = Double.parseDouble(eElement.getElementsByTagName("depositBalance").item(0).getTextContent());
                    int dd = Integer.parseInt(eElement.getElementsByTagName("durationInDays").item(0).getTextContent());
                 //   depositArray.add(load);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}