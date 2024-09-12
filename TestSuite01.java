package Tests;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import jxl.Sheet;
import jxl.Workbook;

public class TestSuite01 {

	@Test
	public void test() throws Exception, IOException
	{
		String path="E:\\SeleniumClass\\ReadingData\\src\\test\\java\\Tests\\TestDataxls.xlsx";
		File f= new File(path);
		Workbook w=Workbook.getWorkbook(f);
		Sheet s= w.getSheet(0);
		
		String result= s.getCell(1, 1).getContents();
		System.out.println(result);
		
		
	}

}
