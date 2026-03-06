package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

    public static Object[][] getTestData(String filePath, String Sheet1) {

        List<Object[]> dataList = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(Sheet1);
            Iterator<Row> rows = sheet.iterator();

            rows.next(); // Skip header row

            while (rows.hasNext()) {
                Row row = rows.next();

                String username = getCellValue(row.getCell(0));
                String password = getCellValue(row.getCell(1));
                String expected = getCellValue(row.getCell(2));

                dataList.add(new Object[]{username, password, expected});
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return dataList.toArray(new Object[0][0]);
    }

    private static String getCellValue(Cell cell) {
        if (cell == null) return "";
        return cell.toString();
    }
}