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

	@Test
	public void test03() throws Throwable {
		TimeTable ttable = new TimeTable();
		LinkedList<Appt> ApptList = new LinkedList<Appt>();
		LinkedList<CalDay> calday = new LinkedList<CalDay>();
		GregorianCalendar today = new GregorianCalendar(2016, 8, 15);
		GregorianCalendar tomo = new GregorianCalendar(2018, 2, 1);


		Appt appt = new Appt(8, 30, 15, 8, 2016, "Visit family", "dinner party");
		ApptList.add(appt);

		Appt appt2 = new Appt(18, 45, 4, 10, 2017, "Visit doctor", "Regular checkup");
		ApptList.add(appt2);

		Appt appt3 = new Appt(22, 15, 8, 1, 2018, "Do the things", "go to sleep");
		ApptList.add(appt3);

		Appt fakeappt = new Appt(0, 0, 0, 0, 0, null, null);

		assertEquals(3, ApptList.size());

		assertEquals(ApptList.get(0), appt);
		assertEquals(ApptList.get(1), appt2);
		assertEquals(ApptList.get(2), appt3);

		assertNull(ttable.deleteAppt(null, appt2));
		assertNull(ttable.deleteAppt(ApptList, fakeappt));

		calday = ttable.getApptRange(ApptList, today, tomo);
		assertNotNull(calday.getFirst());
		assertEquals("\t --- 8/15/2016 --- \n" +
						" --- -------- Appointments ------------ --- \n" + appt.toString() + " \n", calday.getFirst().toString());
	}

}
