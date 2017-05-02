package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {

		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		 GregorianCalendar today = new GregorianCalendar(startYear,startMonth,startDay);
		 CalDay calday = new CalDay(today);

		calday.addAppt(appt);

		assertTrue(calday.isValid());
	 }

	 @Test
		public void test02() throws Throwable {

		 int startHour=15;
		 int startMinute=25;
		 int startDay=30;
		 int startMonth=12;
		 int startYear=2017;
		 String title="Study session";
		 String description="Meet group to work on project";

		 Appt appt = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description);

		 GregorianCalendar today = new GregorianCalendar(startYear,startMonth,startDay);
		 CalDay calday = new CalDay(today);

		 calday.addAppt(appt);

		 assertEquals("\t --- 0/30/2018 --- \n" +
				 " --- -------- Appointments ------------ --- \n" +
				 "\t12/30/2017 at 3:25pm ,Study session, Meet group to work on project\n" +
				 " \n", calday.toString());
	 }

	 @Test
		public void test03() throws Throwable {

		 int startHour=15;
		 int startMinute=25;
		 int startDay=30;
		 int startMonth=12;
		 int startYear=2017;
		 String title="Study session";
		 String description="Meet group to work on project";

		 Appt appt = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description);

		 CalDay newday = new CalDay();
		 assertFalse(newday.isValid());

	 }

}
