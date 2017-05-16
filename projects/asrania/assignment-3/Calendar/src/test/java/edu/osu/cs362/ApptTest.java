package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {

	@Test
	public void test01()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertTrue(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
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

		assertEquals("\t12/30/2017 at 3:25pm ,Study session, Meet group to work on project\n", appt.toString());
	}

	@Test
	public void test03() throws Throwable {
		int startHour=25;
		int startMinute=90;
		int startDay=50;
		int startMonth=14;
		int startYear=1;
		String title="";
		String description="";

		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		assertEquals(false, appt.getValid());
		assertEquals(null, appt.toString());

	}

	@Test
	public void test04() throws Throwable {

		int startHour = 0, startMinute = 0, startDay = 0, startMonth = 0, startYear = 0;
		String title = null, description = null;

		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		appt.setStartHour(0);
		appt.setStartMinute(0);
		appt.setStartDay(15);
		appt.setStartMonth(12);
		appt.setStartYear(1994);
		appt.setTitle("Birthday");
		appt.setDescription("HAPPY BIRTHDAY");

		assertEquals(true, appt.getValid());
	}

	@Test
	public void test05() throws Throwable {

		int startHour = 0, startMinute = 0, startDay = 0, startMonth = 0, startYear = 0;
		String title = null, description = null;

		Appt appt = new Appt(11,
				59,
				31,
				12,
				2017,
				"Potato day",
				"Eat many potatoes");

		assertTrue(appt.getValid());

		assertEquals("\t12/31/2017 at 11:59am ,Potato day, Eat many potatoes\n", appt.toString());
	}

	@Test
	public void test06() throws Throwable {

		int startHour = 0, startMinute = 0, startDay = 0, startMonth = 0, startYear = 0;
		String title = null, description = null;

		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		appt.setStartHour(-1);
		appt.setStartMinute(-1);
		appt.setStartDay(0);
		appt.setStartMonth(0);
		appt.setStartYear(0);
		appt.setTitle("Zombie day");
		appt.setDescription("Fight Zombies");

		assertFalse(appt.getValid());
	}

	@Test
	public void test07() throws Throwable {
		Appt appt = new Appt(0,0,0,0,0, null, null);

		appt.setStartHour(28);

		assertFalse(appt.getValid());
	}

	@Test
	public void test08() throws Throwable {
		Appt appt = new Appt(0,0,0,0,0, null, null);

		appt.setStartHour(22);
		appt.setStartMinute(59);
		appt.setStartDay(31);
		appt.setStartMonth(1);
		appt.setStartYear(2019);
		appt.setTitle("potato");
		appt.setDescription("none");

		assertTrue(appt.getValid());
	}


}