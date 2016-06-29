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


public class Parser {

    public static void main(String arg[]) {

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

                    Class loadClass =  Class.forName(eElement.getElementsByTagName("depositType").item(0).getTextContent());
                    Object loadObj = loadClass.newInstance();
               //   loadClass.getDeclaredMethods()


                   // Vector list = new Vector();
                    //typeDep.   = Integer.parseInt( eElement.getElementsByTagName("customerNumber").item(0).getTextContent());
                    System.out.println("depositType : " + eElement.getElementsByTagName("depositType").item(0).getTextContent());
                    System.out.println("depositBalance : " + eElement.getElementsByTagName("depositBalance").item(0).getTextContent());
                    System.out.println("durationInDays : " + eElement.getElementsByTagName("durationInDays").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}