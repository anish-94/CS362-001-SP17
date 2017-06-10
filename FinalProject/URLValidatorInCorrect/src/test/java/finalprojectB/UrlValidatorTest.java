/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;





/**
 * Performs Validation Test for url validations.
 *
 * @version $Revision: 1128446 $ $Date: 2011-05-27 13:29:27 -0700 (Fri, 27 May 2011) $
 */
public class UrlValidatorTest extends TestCase {

   private boolean printStatus = false;
   private boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.
    String[] prefix = {"http://", "://", "htt://", "hp://", "", "apple://"};
    String[] middle = {"www.facebook", "www.reddit", "www.youtube", "banana", "1.2.3.4", "60.98.34.26"};
    String[] suffix = {".com", ".cat", ".aaa", ".hello", ".uk", ".net", "", "."};
    String[] path = {"/fnueia/fdnu", "/1/3213//", "/", "/gfds./gsgfs()", "/()()()()()()", "/(1)/index", "", "."};


    public UrlValidatorTest(String testName) {
      super(testName);
   }

   
   
   public void testManualTest()
   {
	   UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
	   System.out.println("Expected: True   Actual: " + urlVal.isValid("http://www.amazon.com"));
       System.out.println("Expected: False  Actual: " + urlVal.isValid("htp://www.adadaxa.com"));             //BUGGGGG
       System.out.println("Expected: True  Actual: " + urlVal.isValid("localhost:3000"));
       System.out.println("Expected: True  Actual: " + urlVal.isValid("http://localhost:4567"));

   }
   
   
   public void testYourFirstPartition()
   {
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       System.out.println("Expected: False  Actual: " + urlVal.isValid("akx://amazon.com"));                  //BUG
       System.out.println("Expected: False  Actual: " + urlVal.isValid("oop://amazon.com"));                  //BUG
       System.out.println("Expected: False  Actual: " + urlVal.isValid("http:/amazon.com"));
       System.out.println("Expected: True   Actual: " + urlVal.isValid("h3t://amazon.com"));
       System.out.println("Expected: False  Actual: " + urlVal.isValid("amazon.com"));
       System.out.println("Expected: False  Actual: " + urlVal.isValid("://amazon.com"));
       System.out.println("Expected: True   Actual: " + urlVal.isValid("ftp://amazon.com"));

   }
   
   public void testYourSecondPartition(){
       UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
       System.out.println("Expected: True  Actual: " + urlVal.isValid("http://somewhere.com/pathxyz/file(1).html"));
       System.out.println("Expected: True  Actual: " + urlVal.isValid("http://somewhere.uk"));
       System.out.println("Expected: True  Actual: " + urlVal.isValid("http://amazon.cat"));
       System.out.println("Expected: True  Actual: " + urlVal.isValid("http://amazon.it"));

       System.out.println("Expected: False  Actual: " + urlVal.isValid("http://amazon"));
       System.out.println("Expected: False  Actual: " + urlVal.isValid("http://amazon."));
       System.out.println("Expected: False  Actual: " + urlVal.isValid("http://amazon.pot"));

       System.out.println("Expected: False  Actual: " + urlVal.isValid("https://com.amazon"));

   }
   
   
   public void testIsValid()
   {
	   for(int i = 0;i<10000;i++)
	   {
           UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
           int n1 = (int)(Math.random()*prefix.length);
           int n2 = (int)(Math.random()*middle.length);
           int n3 = (int)(Math.random()*suffix.length);
           int n4 = (int)(Math.random()*path.length);
           String testURL = prefix[n1] + middle[n2] + suffix[n3] + path[n4];
           System.out.println("[" + testURL + "]  [" + urlVal.isValid(testURL) + "]");
       }
   }
   
   public void testAnyOtherUnitTest()
   {
	   
   }
   /**
    * Create set of tests by taking the testUrlXXX arrays and
    * running through all possible permutations of their combinations.
    *
    * @param testObjects Used to create a url.
    */
   

}
