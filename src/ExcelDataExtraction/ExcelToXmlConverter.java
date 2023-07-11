package ExcelDataExtraction;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToXmlConverter {
	
    public static void main(String[] args) {
        String excelFilePath = "path/to/excel.xlsx";
        String xmlFilePath = "path/to/output.xml";
        int columnNumber = 2; // Assuming the data is in the third column (index 2)

        try {
            FileInputStream excelFile = new FileInputStream(new File(excelFilePath));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet sheet = workbook.getSheetAt(0); // Assuming the data is in the first sheet

            List<String> values = new ArrayList<>();
            for (Row row : sheet) {
                Cell cell = row.getCell(columnNumber);
                if (cell != null) {
                    String value = cell.getStringCellValue();
                    values.add(value);
                }
            }

            // Generate XML using JAXB
            DataList dataList = new DataList();
            dataList.setValues(values);

            JAXBContext context = JAXBContext.newInstance(DataList.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(dataList, new FileOutputStream(xmlFilePath));

            System.out.println("XML generated successfully!");

            workbook.close();
            excelFile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
