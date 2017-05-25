package edu.osu.cs362;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.LinkedList;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {


	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void TTrandomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 System.out.println("Start testing...");

		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			 long randomseed = System.currentTimeMillis();//System.currentTimeMillis();
			 //			System.out.println(" Seed:"+randomseed );
			 Random random = new Random(randomseed);

			 LinkedList<Appt> listAppts = new LinkedList<Appt>();
			 LinkedList<Appt> fakeAppts = new LinkedList<Appt>();
			 fakeAppts = null;


			 int startHour = 13;
			 int startMinute = 30;
			 int startDay = 10;
			 int startMonth = 4;
			 int startYear = 2017;
			 String title = "Birthday Party";
			 String description = "This is my birthday party.";
			 //Construct a new Appointment object with the initial data

			 GregorianCalendar today = new GregorianCalendar(startYear,startMonth,startDay);
			 CalDay calday = new CalDay(today);

			 Appt appt = new Appt(startHour,
					 startMinute,
					 startDay,
					 startMonth,
					 startYear,
					 title,
					 description);

			 Appt appt2 = new Appt(startHour,
					 startMinute,
					 startDay,
					 startMonth,
					 startYear,
					 title,
					 description);

			 Appt fakeAppt = new Appt(startHour,
					 startMinute,
					 startDay,
					 startMonth,
					 startYear,
					 title,
					 description);

			 fakeAppt = null;

			 for (int i = 0; i < NUM_TESTS; i++) {

				 int randHour = ValuesGenerator.getRandomIntBetween(random, 0, 12);
				 int randMin = ValuesGenerator.getRandomIntBetween(random, 0, 60);
				 int randDay = ValuesGenerator.getRandomIntBetween(random, 1, 31);
				 int randMon = ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 int randYear = ValuesGenerator.getRandomIntBetween(random, 1800, 2017);
				 String randTitle = ValuesGenerator.getString(random);
				 String randDesc = ValuesGenerator.getString(random);

				 appt.setStartHour(randHour);
				 appt.setStartMinute(randMin);
				 appt.setStartDay(randDay);
				 appt.setStartMonth(randMon);
				 appt.setStartYear(randYear);
				 appt.setTitle(randTitle);
				 appt.setDescription(randDesc);

				 listAppts.add(appt);

				 randHour = ValuesGenerator.getRandomIntBetween(random, 0, 12);
				 randMin = ValuesGenerator.getRandomIntBetween(random, 0, 60);
				 randDay = ValuesGenerator.getRandomIntBetween(random, 1, 31);
				 randMon = ValuesGenerator.getRandomIntBetween(random, 1, 12);
				 randYear = ValuesGenerator.getRandomIntBetween(random, 1800, 2017);
				 randTitle = ValuesGenerator.getString(random);
				 randDesc = ValuesGenerator.getString(random);

				 appt2.setStartHour(randHour);
				 appt2.setStartMinute(randMin);
				 appt2.setStartDay(randDay);
				 appt2.setStartMonth(randMon);
				 appt2.setStartYear(randYear);
				 appt2.setTitle(randTitle);
				 appt2.setDescription(randDesc);

				 listAppts.add(appt2);

				 TimeTable ttable = new TimeTable();
				 int randnum = ValuesGenerator.getRandomIntBetween(random, 1, 2);

				 if(randnum == 1)
				 	ttable.deleteAppt(listAppts, appt);
				 else
				 	ttable.deleteAppt(listAppts, appt2);

				 ttable.deleteAppt(listAppts, appt);
				 ttable.deleteAppt(listAppts, appt2);
				 ttable.deleteAppt(listAppts, fakeAppt);

			 }

			 TimeTable faketable = new TimeTable();
			 faketable.deleteAppt(fakeAppts, appt);

			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			 if ((iteration % 10000) == 0 && iteration != 0)
				 System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);
		 }
	 }



	
}
