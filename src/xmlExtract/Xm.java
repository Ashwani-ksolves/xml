package xmlExtract;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Xm 
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fs=new FileInputStream("/home/ashwaniksi147/Downloads/poi-src-5.2.4-20230921-5.2.4/test-data/xmldsign/seltest.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowCount=sheet.getLastRowNum();   //returns the row count
		int colcount=sheet.getRow(0).getLastCellNum();
		System.out.println("Row= "+rowCount+" ColumnCount="+colcount);
		for(int i=0;i<rowCount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString();
				System.out.print(" " +value);			
			}
			System.out.println();
		}
	}
}
