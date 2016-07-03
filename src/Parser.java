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
    Vector<Vector> list = new Vector<Vector>();
    static Vector inner = new Vector();

    public Parser() {

    }

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
                    Object loadClassType = Class.forName(eElement.getElementsByTagName("depositType").item(0).getTextContent()).newInstance();
                    Object load = Class.forName("Deposit").newInstance();
                    inner.add(eElement.getElementsByTagName("customerNumber").item(0).getTextContent());
                    inner.add(eElement.getElementsByTagName("depositType").item(0).getTextContent());
                    inner.add(eElement.getElementsByTagName("depositBalance").item(0).getTextContent());
                    inner.add(eElement.getElementsByTagName("durationInDays").item(0).getTextContent());
                }
                list.add(temp, inner);
                inner = new Vector();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


//        for (int i = 0; i <= list.size(); i++) {
//            for (int j = 0; j <= inner.size(); j++) {
//                // Object loadClassType = Class.forName();
//            }
//        }

    }
}