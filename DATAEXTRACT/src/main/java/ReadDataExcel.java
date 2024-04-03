import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadDataExcel {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("./Files/StockPrices1.xlsx");
        XSSFWorkbook workbook= new XSSFWorkbook(fis);
        XSSFSheet sheet=workbook.getSheet("Stocks1");
        int row = sheet.getLastRowNum();
        HashMap<String, String> map= new HashMap<String, String>();

        for(int i=0; i<=row;i++) {

            String key=sheet.getRow(i).getCell(0).getStringCellValue();
            String value= sheet.getRow(i).getCell(1).getStringCellValue();
            map.put(key, value);

        }
        for(Map.Entry entry:map.entrySet()) {

            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        workbook.close();
        fis.close();
    }


}
