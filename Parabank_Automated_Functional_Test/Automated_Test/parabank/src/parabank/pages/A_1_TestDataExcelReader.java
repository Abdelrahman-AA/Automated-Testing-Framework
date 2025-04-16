package pages;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

abstract class A_1_TestDataExcelReader {
    private static final String FILE_PATH = "test_data.xlsx";

    protected String getTestData(String data) throws IOException {
        FileInputStream fis = new FileInputStream(new File(FILE_PATH));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);

        String result = null;

        for (Row row : sheet) {
            Cell firstColumnCell = row.getCell(0);
            if (firstColumnCell != null && firstColumnCell.getStringCellValue().equals(data)) {
                Cell secondColumnCell = row.getCell(1);
                if (secondColumnCell != null) {
                    switch (secondColumnCell.getCellType()) {
                        case STRING:
                            result = secondColumnCell.getStringCellValue();
                            break;
                        case NUMERIC:
                            result = String.valueOf(secondColumnCell.getNumericCellValue());
                            break;
                        case BOOLEAN:
                            result = String.valueOf(secondColumnCell.getBooleanCellValue());
                            break;
                        case FORMULA:
                            result = secondColumnCell.getCellFormula();
                            break;
                        default:
                            result = "";
                            break;
                    }
                    break;
                }
            }
        }

        workbook.close();
        return result;
    }
}
