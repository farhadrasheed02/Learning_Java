package xml_parsing;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import org.w3c.dom.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Node;

public class ParsingXml extends UtilityClass {

	public static void main(String[] args) {
		//Path filepath = Path.of("C:\\Users\\Farhad Rashid Reshi\\eclipse-workspace\\Learning_Java\\src\\xml_parsing\\XFile.xml");
		
		try
		{String filepath = "C:\\Users\\Farhad Rashid Reshi\\eclipse-workspace\\Learning_Java\\src\\xml_parsing\\XFile.xml";
		File inputFile = new File(filepath);

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbf.newDocumentBuilder();
		Document document = (Document) dBuilder.parse(inputFile);
		((Path) document.getDefaultRootElement()).normalize();
		System.out.println("Root element :" + document.getDefaultRootElement().getName());
		}
		catch(Exception e)
		{
			e.toString();
		}

	}}