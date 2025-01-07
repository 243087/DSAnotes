package com.rahul.kumar.Module8_Day58_Heap2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
public static void main(String[] args) {
	String paymentDate = "20231222125623";
	SimpleDateFormat originalFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	Date date = null;
	try {
		date = originalFormat.parse(paymentDate);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	SimpleDateFormat newFormat = new SimpleDateFormat("dd/MM/yyyy");
	String formattedDate = newFormat.format(date);
	System.out.println(formattedDate);
}
}
