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
import java.util.Vector;

public class Parser {


    public static void main(String arg[]) throws ClassNotFoundException {

        Vector list = new Vector();
        try {
            //----loading file-------------------
            File fXmlFile = new File("src/input.XML");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            //-----------------------------------
            doc.getDocumentElement().normalize();
            //-----------------------------------
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("deposit");

            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;
                    list.add(eElement.getElementsByTagName("customerNumber").item(0).getTextContent());
                    list.add(eElement.getElementsByTagName("depositType").item(0).getTextContent());
                    list.add(eElement.getElementsByTagName("depositBalance").item(0).getTextContent());
                    list.add(eElement.getElementsByTagName("durationInDays").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int i = 1 ; i<= list.size()-3; i+= 4) {
            Object loadClassType = Class.forName(String.valueOf(list.get(i)));
        }
        }
    }

}