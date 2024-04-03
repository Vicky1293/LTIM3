import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
public class Readexceldata {

    public static HashMap<String, String> getmapTestdata() throws IOException {
        HashMap<String, String> testData= new HashMap<String, String>();
        FileInputStream fileinputstream = new FileInputStream("./Files/StockPrices1.xlsx");
        Workbook workbook = new XSSFWorkbook(fileinputstream);
        Sheet sheet = workbook.getSheetAt(0);
        int lastRowNumber= sheet.getLastRowNum();

        for(int i = 0; i<=lastRowNumber; i++) {
            Row row = sheet.getRow(i);
            Cell keyCell = row.getCell(0);
            String key = keyCell.getStringCellValue().trim();
            Cell valueCell = row.getCell(1);
            String value = valueCell.getStringCellValue().trim();
            testData.put(key, value);
        }

            return testData;
        }

}
