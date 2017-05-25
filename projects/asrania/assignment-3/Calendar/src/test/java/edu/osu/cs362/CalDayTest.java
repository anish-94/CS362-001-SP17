package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
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

		startHour=15;
		startMinute=25;
		startDay=30;
		startMonth=12;
		startYear=2017;
		title="Study session";
		description="Meet group to work on project";

		Appt appt2 = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

//		GregorianCalendar tomorrow = new GregorianCalendar(startYear,startMonth,startDay);
//		calday = new CalDay(tomorrow);

		calday.addAppt(appt2);

		assertEquals(2, calday.getSizeAppts());
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
		int startMonth=19;
		int startYear=2017;
		String title="Study session";
		String description="Meet group to work on project";

		GregorianCalendar today = new GregorianCalendar(startYear,startMonth,startDay);
		CalDay newday = new CalDay(today);
		assertTrue(newday.isValid());

	}

	@Test
	public void test04() throws Throwable {
		int startHour=15;
		int startMinute=25;
		int startDay=30;
		int startMonth=12;
		int startYear=2017;
		String title="Finish homework";
		String description="Turn in the assignment";

		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar today = new GregorianCalendar(startYear,startMonth,startDay);
		CalDay newday = new CalDay(today);
		newday.addAppt(appt);
		assertNotNull(newday.iterator());
		assertTrue(newday.isValid());
	}

	@Test
	public void test05() throws Throwable {
		GregorianCalendar today = new GregorianCalendar();
		CalDay newday = new CalDay(today);
		assertEquals(newday.getMonth(), today.get(today.MONTH));
	}

	@Test
	public void test06() throws Throwable {
		CalDay today = new CalDay();
		assertEquals(null, today.iterator());
	}

	@Test
	public void test07() throws Throwable {
		GregorianCalendar cal = new GregorianCalendar();
		CalDay newday = new CalDay(cal);

		Appt appt = new Appt(8, 30, 15, 8, 2016, "Visit family", "dinner party");
		newday.addAppt(appt);

		Appt appt2 = new Appt(18, 45, 4, 10, 2017, "Visit doctor", "Regular checkup");
		newday.addAppt(appt2);

		Iterator<?> ApptList = newday.iterator();
		assertEquals(appt, ApptList.next());

		assertNotEquals(newday.getAppts().getFirst().getStartHour(), newday.getAppts().getLast().getStartHour());
	}

}