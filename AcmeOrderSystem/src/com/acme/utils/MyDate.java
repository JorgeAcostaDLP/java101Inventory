package com.acme.utils;

public class MyDate {
	private byte day;
	private byte month;
	private short year;
	public static byte numDates;
	private static MyDate[] holidays;
	{
		day = 1;
		month = 1;
		year = 2020;
	}
	
	static {
		holidays = new MyDate[6];
		holidays[0] = new MyDate(1,1,2016);
		holidays[1] = new MyDate(5,30,2016);
		holidays[2] = new MyDate(7,4,2016);
		holidays[3] = new MyDate(9,5,2016);
		holidays[4] = new MyDate(11,24,2016);
		holidays[5] = new MyDate(12,25,2016);
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(valid(day, month, year)) this.day = (byte) day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(valid(day, month, year)) this.month = (byte) month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(valid(day, month, year)) this.year = (short) year;
	}
	
	public void setDate(int m, int d, int y) {
		if(valid(d,m,y)) {
			month = (byte) m;
			day = (byte) d;
			year = (short) y;
		}
	}
	
	public static void delCount() {
		numDates=0;
	}
	
	public boolean equals(Object o) {
		if(o instanceof MyDate) {
			MyDate d = (MyDate) o;
			if ((d.day == day) && (d.month == month) && (d.year == year)) {
			      return true;
			 }
		}
	  return false;	
	}
	
	public static void leapYears() {
		
		for (int year = 1752; year <=2020; year++) {
			if(year % 4 == 0 && year % 100 != 0 || year % 4 == 0 && year % 400 == 0) {
				System.out.println("The year " + year + " is a leap year");
			} 
		}
	}

	public static void listHolidays() { 
		System.out.println("the holidays are:"); 
		for (MyDate holiday:holidays){
		System.out.println(holiday); }
	}
	
	public String toString() {
		String stringDate = new String();
		stringDate = this.month + "/" + this.day + "/" + this.year;
		return stringDate;
	}
	
	private boolean valid(int day, int month, int year) {
	
		if (day > 31 || day < 1 || month > 12 || month < 1 ){
			System.out.println("NOT VALID");
		    return false;
		}
		
		switch (month){
		case 4:
		case 6:
		case 9:
		case 11: return (day <=30);
		case 2: return day <= 28 || (day ==29 && year % 4 ==0);
		}
		
		return true;
	}

	public static MyDate[] getHolidays(){
		  
		return holidays;	
	}
	 
	public MyDate() {
		numDates++;		
	}
		
	public MyDate(int m, int d, int y) {
		this();
		if(valid(d,m,y)) setDate(m,d,y);
	}	
}
