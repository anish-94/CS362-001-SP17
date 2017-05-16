/*
 * This file was automatically generated by EvoSuite
 * Mon May 15 05:54:06 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Appt_ESTest extends Appt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, "", "");
      String string0 = appt0.toString();
      assertEquals("\t11/11/11 at 11:11am ,, \n", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(23, 23, 23, 23, 23, "2", "2");
      assertEquals(23, appt0.getStartHour());
      assertEquals(23, appt0.getStartMinute());
      assertEquals("2", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals(23, appt0.getStartDay());
      assertEquals("2", appt0.getTitle());
      assertEquals(23, appt0.getStartMonth());
      assertEquals(23, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt(1623, 1623, 1623, 1623, 1623, "", "");
      boolean boolean0 = appt0.getValid();
      assertEquals(1623, appt0.getStartYear());
      assertEquals(1623, appt0.getStartMonth());
      assertEquals(1623, appt0.getStartMinute());
      assertEquals(1623, appt0.getStartDay());
      assertFalse(boolean0);
      assertEquals(1623, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 43, 3552, "", "%s)+_(x?HAQ");
      String string0 = appt0.getTitle();
      assertEquals(11, appt0.getStartHour());
      assertEquals("%s)+_(x?HAQ", appt0.getDescription());
      assertEquals(11, appt0.getStartMinute());
      assertEquals(11, appt0.getStartDay());
      assertEquals(3552, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals("", string0);
      assertEquals(43, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt(940, (-101), (-901), (-708), 940, ">xQ;Dy6QZlp", ">xQ;Dy6QZlp");
      int int0 = appt0.getStartYear();
      assertEquals(-708, appt0.getStartMonth());
      assertEquals(-101, appt0.getStartMinute());
      assertEquals(-901, appt0.getStartDay());
      assertEquals(940, appt0.getStartHour());
      assertEquals(940, int0);
      assertEquals(">xQ;Dy6QZlp", appt0.getTitle());
      assertEquals(">xQ;Dy6QZlp", appt0.getDescription());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt(4533, 1, 1, 4533, 1, "H$Ul&/n^?f^6s\"/", "H$Ul&/n^?f^6s\"/");
      appt0.setStartYear((-1839));
      int int0 = appt0.getStartYear();
      assertEquals((-1839), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt(4830, 4830, 4830, (-3001), 4830, ")OX(?hwa[lB", ")OX(?hwa[lB");
      appt0.setStartMonth(0);
      int int0 = appt0.getStartMonth();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt(4533, 1, 1, 4533, 1, "H$Ul&/n^?f^6s\"/", "H$Ul&/n^?f^6s\"/");
      int int0 = appt0.getStartMonth();
      assertEquals("H$Ul&/n^?f^6s\"/", appt0.getTitle());
      assertEquals(1, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(4533, int0);
      assertEquals(1, appt0.getStartYear());
      assertEquals(4533, appt0.getStartHour());
      assertEquals(1, appt0.getStartDay());
      assertEquals("H$Ul&/n^?f^6s\"/", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "", "");
      int int0 = appt0.getStartMinute();
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt((-5026), (-5026), (-5026), (-934), (-5026), "I[\"'o~FH", "I[\"'o~FH");
      int int0 = appt0.getStartMinute();
      assertEquals(-934, appt0.getStartMonth());
      assertEquals(-5026, appt0.getStartYear());
      assertEquals("I[\"'o~FH", appt0.getDescription());
      assertEquals(-5026, appt0.getStartHour());
      assertEquals("I[\"'o~FH", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals((-5026), int0);
      assertEquals(-5026, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(1957, 1957, 1, 1957, 4816, "[HE9", "[HE9");
      int int0 = appt0.getStartHour();
      assertEquals(4816, appt0.getStartYear());
      assertEquals("[HE9", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals(1, appt0.getStartDay());
      assertEquals("[HE9", appt0.getTitle());
      assertEquals(1957, appt0.getStartMonth());
      assertEquals(1957, appt0.getStartMinute());
      assertEquals(1957, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt(3210, 0, 0, 3210, 3210, "Month", (String) null);
      int int0 = appt0.getStartDay();
      assertEquals("", appt0.getDescription());
      assertEquals(3210, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, int0);
      assertFalse(appt0.getValid());
      assertEquals(3210, appt0.getStartHour());
      assertEquals("Month", appt0.getTitle());
      assertEquals(3210, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 31, 31, 0, "", "");
      int int0 = appt0.getStartDay();
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertEquals(31, int0);
      assertFalse(appt0.getValid());
      assertEquals(31, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 4420, "", " ,");
      String string0 = appt0.getDescription();
      assertTrue(appt0.getValid());
      assertEquals(11, appt0.getStartMonth());
      assertEquals(11, appt0.getStartMinute());
      assertEquals(" ,", string0);
      assertEquals(11, appt0.getStartHour());
      assertEquals(11, appt0.getStartDay());
      assertEquals("", appt0.getTitle());
      assertEquals(4420, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt(1957, 1957, 1, 1957, 4816, "[HE9", "[HE9");
      appt0.setDescription("[HE9");
      assertFalse(appt0.getValid());
      assertEquals(1957, appt0.getStartHour());
      assertEquals("[HE9", appt0.getDescription());
      assertEquals(1957, appt0.getStartMinute());
      assertEquals(1957, appt0.getStartMonth());
      assertEquals("[HE9", appt0.getTitle());
      assertEquals(1, appt0.getStartDay());
      assertEquals(4816, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt(48, 48, 0, 48, 0, (String) null, "/mIV6}_aG");
      assertEquals("/mIV6}_aG", appt0.getDescription());
      
      appt0.setDescription((String) null);
      assertEquals(0, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "", "");
      appt0.setTitle("");
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt((-1), (-1), (-1), (-1), (-1), "2", "2");
      String string0 = appt0.getTitle();
      assertEquals(-1, appt0.getStartDay());
      assertEquals(-1, appt0.getStartMinute());
      assertEquals(-1, appt0.getStartHour());
      assertEquals("2", appt0.getDescription());
      assertEquals(-1, appt0.getStartYear());
      assertEquals("2", string0);
      assertFalse(appt0.getValid());
      assertEquals(-1, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt((-1349), (-1), (-1), (-1349), (-1), "x]z'f*dd", "x]z'f*dd");
      int int0 = appt0.getStartDay();
      assertEquals(-1349, appt0.getStartHour());
      assertEquals("x]z'f*dd", appt0.getDescription());
      assertEquals(-1, appt0.getStartMinute());
      assertEquals("x]z'f*dd", appt0.getTitle());
      assertEquals(-1349, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(-1, appt0.getStartYear());
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 4420, "", " ,");
      boolean boolean0 = appt0.getValid();
      assertEquals(11, appt0.getStartMinute());
      assertEquals(11, appt0.getStartDay());
      assertEquals(" ,", appt0.getDescription());
      assertEquals(11, appt0.getStartMonth());
      assertEquals(11, appt0.getStartHour());
      assertEquals(4420, appt0.getStartYear());
      assertEquals("", appt0.getTitle());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt((-777), (-777), 0, 0, (-777), "", "?");
      int int0 = appt0.getStartHour();
      assertEquals(-777, appt0.getStartYear());
      assertEquals((-777), int0);
      assertEquals(0, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(-777, appt0.getStartMinute());
      assertEquals("?", appt0.getDescription());
      assertEquals("", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt((-188), (-166), 4, (-166), 0, "\"Qs\"|opDILW>\"Fpr", "%Y-%M-%D%z");
      int int0 = appt0.getStartYear();
      assertEquals(4, appt0.getStartDay());
      assertEquals("%Y-%M-%D%z", appt0.getDescription());
      assertEquals(-166, appt0.getStartMonth());
      assertEquals(0, int0);
      assertEquals(-166, appt0.getStartMinute());
      assertEquals("\"Qs\"|opDILW>\"Fpr", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(-188, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt(7, 7, 7, 7, 1288, "bC", "");
      int int0 = appt0.getStartMinute();
      assertEquals("bC", appt0.getTitle());
      assertEquals(7, int0);
      assertEquals(7, appt0.getStartHour());
      assertEquals(7, appt0.getStartDay());
      assertEquals(1288, appt0.getStartYear());
      assertEquals("", appt0.getDescription());
      assertTrue(appt0.getValid());
      assertEquals(7, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt((-1237), (-1237), (-1237), (-1237), (-1237), "", "");
      appt0.getDescription();
      assertEquals(-1237, appt0.getStartHour());
      assertEquals(-1237, appt0.getStartYear());
      assertEquals(-1237, appt0.getStartMinute());
      assertEquals(-1237, appt0.getStartMonth());
      assertEquals(-1237, appt0.getStartDay());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt(4830, 4830, 4830, (-3001), 4830, ")OX(?hwa[lB", ")OX(?hwa[lB");
      int int0 = appt0.getStartMonth();
      assertEquals(")OX(?hwa[lB", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals((-3001), int0);
      assertEquals(4830, appt0.getStartDay());
      assertEquals(4830, appt0.getStartHour());
      assertEquals(4830, appt0.getStartMinute());
      assertEquals(")OX(?hwa[lB", appt0.getDescription());
      assertEquals(4830, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt(12, 12, 12, 12, 12, "o", "o");
      String string0 = appt0.toString();
      assertNotNull(string0);
      assertEquals("\t12/12/12 at 12:12pm ,o, o\n", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 2452, 0, 2452, (String) null, (String) null);
      assertEquals(0, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(2452, appt0.getStartYear());
      assertEquals(2452, appt0.getStartDay());
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt(7, 7, 7, 7, 1288, "bC", "");
      assertEquals("bC", appt0.getTitle());
      
      appt0.setTitle((String) null);
      assertEquals(7, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt((-1040), 59, 59, 59, (-717), "t r$({{&JOlGN::v", "t r$({{&JOlGN::v");
      appt0.setStartHour(0);
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt(0, (-1574), 0, (-1044), (-1574), "5~AiLOQ,Jn%i", "5~AiLOQ,Jn%i");
      int int0 = appt0.getStartHour();
      assertEquals(-1044, appt0.getStartMonth());
      assertEquals("5~AiLOQ,Jn%i", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals("5~AiLOQ,Jn%i", appt0.getDescription());
      assertEquals(0, appt0.getStartDay());
      assertEquals(-1574, appt0.getStartYear());
      assertEquals(0, int0);
      assertEquals(-1574, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(7, 7, 7, 7, 1288, "bC", "");
      appt0.setStartMinute(5309);
      assertEquals(5309, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "", "");
      appt0.setStartDay(0);
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartMonth());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Appt appt0 = new Appt(7, 7, 7, 7, 1288, "bC", "");
      assertEquals(7, appt0.getStartHour());
      
      appt0.setStartHour(1288);
      appt0.toString();
      assertEquals(7, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 31, 31, 0, "", "");
      assertEquals(31, appt0.getStartMonth());
      
      appt0.setStartMonth(0);
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Appt appt0 = new Appt(7, 7, 7, 7, 1288, "bC", "");
      String string0 = appt0.toString();
      assertNotNull(string0);
      assertEquals("\t7/7/1288 at 7:7am ,bC, \n", string0);
  }
}
