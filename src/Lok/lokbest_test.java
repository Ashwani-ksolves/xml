package Lok;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lokbest_test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://lokbest.kappso.com/customer/account/login/");
		FileInputStream file=new FileInputStream("/home/ashwaniksi147/Downloads/poi-src-5.2.4-20230921-5.2.4/test-data/xmldsign/login.xlsx");
		XSSFWorkbook xf=new XSSFWorkbook(file);
		XSSFSheet sheet=xf.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(1);
		XSSFCell email=row.getCell(0);
		String em=email.getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(em);
		XSSFCell pass=row.getCell(1);
		String password=pass.getStringCellValue();
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/div/div[2]/form/fieldset/div[4]/div[1]/button")).click();
		
		

	}

}
