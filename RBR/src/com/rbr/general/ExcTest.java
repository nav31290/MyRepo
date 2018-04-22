package com.rbr.general;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExcTest {
	
	public static void main(String[] args) throws Exception {
	
		String date = "12 Sep 2017";
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
		Date dte = sdf.parse(date);
		String dteNew = new SimpleDateFormat("dd/MM/yyyy").format(dte);
		System.out.println("new date in string  : "+dteNew);
		Date dteNew1 = new SimpleDateFormat("dd/MM/yyyy").parse(dteNew);
		System.out.println("date :: "+dte);
		System.out.println("neew date : "+dteNew1);
	
	}

}
