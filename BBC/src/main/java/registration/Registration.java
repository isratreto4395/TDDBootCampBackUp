package registration;

import common.WebAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import bbc_geico_verizon_excelReadAndWrite.WriteBBCRegistrationExcel;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static bbchomepageheader.BBCWebElements.*;

public class Registration extends WebAPI {
    public static String filePath = "../BBC/BBCExcelData/BBCRegister.xlsx";
    public static File file = new File(filePath);
    public static FileInputStream inputStream;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;

    public static void readFile() {

        try {
            inputStream = new FileInputStream(file);
            workbook = new XSSFWorkbook(inputStream);
            sheet = workbook.getSheet("BBCRegistrationAccountInfo");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void signInPageVerify() {
        clickByXpath(registrationIcon);
    }

    public void registration() throws InterruptedException {
        WriteBBCRegistrationExcel.writeExcel(filePath);
        readFile();
        signInPageVerify();
        clickByXpath(registerNowLink);
        Thread.sleep(5000);
        clickByXpath(age);
        typeOnElementWithInteger(dayInput, (int) sheet.getRow(1).getCell(0).getNumericCellValue());
        typeOnElementWithInteger(monthInput, (int) sheet.getRow(1).getCell(1).getNumericCellValue());
        typeOnElementWithInteger(yearInput, (int) sheet.getRow(1).getCell(2).getNumericCellValue());
        clickById(continueButton);
        typeOnElementNew(emailAddress, sheet.getRow(1).getCell(3).getStringCellValue());
        typeOnElementNew(passwordField, sheet.getRow(1).getCell(4).getStringCellValue());
        clickById(showPassword);
        sleepFor(3);
        clickById(continueButton);
    }
}
