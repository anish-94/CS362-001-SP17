package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {

		 LinkedList<Appt> listAppts = new LinkedList<Appt>();
		 boolean diagnose = true;
		 int startHour=15;
		 int startMinute=25;
		 int startDay=1;
		 int startMonth=5;
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

		 listAppts.add(appt);

		 startHour=18;
		 startMinute=45;
		 startDay=2;
		 startMonth=5;
		 startYear=2017;
		 title="Birthday party";
		 description="Buy a present and cake";

		 appt = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description);
		 listAppts.add(appt);
		 GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		 tomorrow.add(Calendar.DAY_OF_MONTH,1);
		 if(diagnose){
			 System.out.println("today is:" + today.get(Calendar.MONTH)+ "/"+ today.get(Calendar.DAY_OF_MONTH)+"/"+today.get(Calendar.YEAR));
			 System.out.println("tomorrow is:" + tomorrow.get(Calendar.MONTH)+ "/"+ tomorrow.get(Calendar.DAY_OF_MONTH)+"/"+tomorrow.get(Calendar.YEAR));
		 }

		 TimeTable timeTable = new TimeTable();
		 LinkedList<CalDay> calDays = new LinkedList<CalDay>();
		 calDays=timeTable.getApptRange(listAppts,today,tomorrow);
		 for(int i=0; i<calDays.size();i++)
			 System.out.println(calDays.get(i).toString());

		 assertNotEquals(null, calDays);
	 }


	 @Test
		public void test02() throws Throwable {
		 LinkedList<Appt> listAppts = new LinkedList<Appt>();
		 int startHour=15;
		 int startMinute=25;
		 int startDay=1;
		 int startMonth=5;
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

		 listAppts.add(appt);

		 TimeTable ttable = new TimeTable();
		 ttable.deleteAppt(listAppts, appt);

		 assertTrue(listAppts.isEmpty());
	 }
}
