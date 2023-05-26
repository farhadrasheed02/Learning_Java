package xml_parsing;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParsingXml extends UtilityClass {

	public static void main(String[] args) {
		//Path filepath = Path.of("C:\\Users\\Farhad Rashid Reshi\\eclipse-workspace\\Learning_Java\\src\\xml_parsing\\XFile.xml");
		
		try
		{
			String filepath = ("\\Learning_Java\\src/xml_parsing\\laptop.xml");
			//String filepath = "C:\\Users\\Farhad Rashid Reshi\\eclipse-workspace\\Learning_Java\\src\\xml_parsing\\XFile.xml";
			File inputFile = new File(filepath);

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbf.newDocumentBuilder();
		Document document = dBuilder.parse(inputFile);
		document.getDocumentElement().normalize();
		NodeList ndlist = document.getElementsByTagName("laptop");
	 for(int i=0;i<ndlist.getLength();i++)
	 {
		Node nd =ndlist.item(i);
		 if(nd.getNodeType()==Node.ELEMENT_NODE)
		 {
			Element nditem = (Element) nd;
			System.out.println(nditem.getAttribute("name"));
			NodeList studentdet = nditem.getChildNodes();
			for(int j=0;j<studentdet.getLength();j++)
			{
				Node nda = studentdet.item(j);
				System.out.println(nda);
				if(nda.getNodeType()==Node.ELEMENT_NODE)
				{
					Element ndaitem = (Element) nda;
					System.out.println("     " + ndaitem.getTagName() + ": " + ndaitem.getAttribute("value"));
				}
			}
		 }
		 System.out.println(i);
	 }
		}
		catch(Exception e)
		{
			e.toString();
		}

	}}