package com.Apptest;

import com.excel.Xls_Reader;

public class Excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Xls_Reader reader =  new Xls_Reader(System.getProperty("user.dir")+"\\DataPool\\address.xlsx");
		int rowcout = reader.getRowCount("DishRegressionCheckout");
		for(int row=2; row<= rowcout; row++ ){
		String excelvalue = reader.getCellData("DishRegressionCheckout", "Address", row);	
		String excelvalue1 = reader.getCellData("DishRegressionCheckout", "ProductName", row);
		String excelvalue2 = reader.getCellData("DishRegressionCheckout", "DISHProceedSellingDisclosure", row);
		System.out.println("++++++++++++++++++  "+row+"  ++++++++++++++++++++  ");
		System.out.println(excelvalue);
		System.out.println(excelvalue1);
		System.out.println(excelvalue2);
		System.out.println("======================");
		reader.addColumn("DishRegressionCheckout", "status");
		
		}

		
		
	}

}
