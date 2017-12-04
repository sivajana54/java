package in.vamsoft.training.general;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathTest {
  private Math math = new Math();

  @BeforeClass
  public static void initClass() {
    System.out.println("MathTest.initClass()");
  }

  @AfterClass
  public static void finalClass() {
    System.out.println("MathTest.finalClass");
  }

  @Before
  public void initObject() {
    System.out.println("MathTest.initObject()");
    math = new Math();
  }

  @After
  public void destroyObject() {
    System.out.println("MathTest.destroyObject()");
    math = null;
  }

  @Test
  public void testCase1() {
    System.out.println("MathTest.testCase1()");
    double result = math.sum(100.98, 12.0);
    double expected = 112.98;
    Assert.assertEquals(expected, result, 0);
  }

  @Test
  public void testCase2() {
    System.out.println("MathTest.testCase2()");
    double result = math.sum(0, 0);
    double expected = 0;
    Assert.assertEquals(expected, result, 0);
  }

  @Test
  public void testCase3() {
    System.out.println("MathTest.testCase3()");
    double result = math.sum(-100.98, 100.98);
    double expected = 0;
    Assert.assertEquals(expected, result, 0);
  }

  @Test
  public void testCase4() {
    System.out.println("MathTest.testCase3()");
    double result = math.sum(-100.98, -100.98);
    double expected = -201.96;
    Assert.assertEquals(expected, result, 0);
  }
  
  @Test
  public void testCase5() {
    System.out.println("MathTest.testCase5()");
    int actual = math.sum(10, 20);
    int expected = 30;
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testCase6() {
    System.out.println("MathTest.testCase5()");
    int actual = math.sum(0, 0);
    int expected = 0;
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testCase7() {
    System.out.println("MathTest.testCase5()");
    int actual = math.sum(-10, 20);
    int expected = 10;
    Assert.assertEquals(expected, actual);
  }

  @Test
  public void testCase8() {
    System.out.println("MathTest.testCase5()");
    int actual = math.sum(-10, -20);
    int expected = -30;
    Assert.assertEquals(expected, actual);
  }
}
