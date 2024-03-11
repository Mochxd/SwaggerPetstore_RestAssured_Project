package Utilities;

import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviders {
    @DataProvider(name="Data")
    public Object[][] RegisterData() throws IOException {
        // Extend the pass for the file
        String excelPath = "C:\\Users\\zas\\RestAssuredProject\\src\\test\\TestData\\userData.xlsx";
        ExcelFileUtilities xl = new ExcelFileUtilities(excelPath);
        int rowNum = xl.getRowCount("sheet1");
        int colCount = xl.getCellCount("sheet1",1);
        String data[][] = new String[rowNum][colCount];
        for (int i = 1; i<=rowNum; i++){
            for (int j = 0; j<colCount; j++){
                data[i-1][j] = xl.getCellData("sheet1", i, j);
            }
        }
        return data;
    }
    @DataProvider(name="UserNames")
    public String[] getUserNames() throws IOException
    {
        String excelPath = "C:\\Users\\zas\\RestAssuredProject\\src\\test\\TestData\\userData.xlsx";
        ExcelFileUtilities xl = new ExcelFileUtilities(excelPath);
        int rowNum = xl.getRowCount ("Sheet1");
        String data[] = new String[rowNum];
        for(int i=1; i<=rowNum; i++) {
            data[i-1]= xl.getCellData("Sheet1",i, 1);
        }
        return data;
    }
}
