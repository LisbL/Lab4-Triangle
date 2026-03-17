package ee.ut.cs.swt.triangle;

import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleGT {

	@Test(timeout = 4000)
	public void testGetSideLengthsReturningNonEmptyString() throws Throwable {
	    Triangle triangle0 = new Triangle(2286, 2286, 2286);
	    String string0 = triangle0.getSideLengths();
	    assertEquals("2286,2286,2286", string0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningPositive0() throws Throwable {
	    Triangle triangle0 = new Triangle(3314, 3314, 3314);
	    int int0 = triangle0.getPerimeter();
	    assertEquals(9942, int0);
	}

	@Test(timeout = 4000)
	public void testGetPerimeterReturningPositive1() throws Throwable {
	    Triangle triangle0 = new Triangle(3314, 3314, 3314);
	    double double0 = triangle0.getArea();
	    assertEquals(Double.NaN, double0, 0.01);
	    int int0 = triangle0.getPerimeter();
	    assertEquals(9942, int0);
	}

	@Test(timeout = 4000)
	public void testGetArea() throws Throwable {
	    Triangle triangle0 = new Triangle(40, 3631, 1331);
	    triangle0.setSideLengths((-462), 3631, (-738));
	    Triangle triangle1 = triangle0.setSideLengths(0, 0, 1331);
	    Triangle triangle2 = triangle0.setSideLengths((-1), (-897), 0);
	    triangle0.classify();
	    triangle2.getSideLengths();
	    Triangle triangle3 = triangle2.setSideLengths((-1), 0, 0);
	    triangle3.setSideLengths(1331, 40, 0);
	    triangle0.isScalene();
	    triangle0.isEquilateral();
	    triangle2.isRightAngled();
	    triangle2.getArea();
	    triangle1.classify();
	    assertEquals(1371, triangle1.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsImpossibleAndIsIsosceles() throws Throwable {
	    Triangle triangle0 = new Triangle(0, (-308), (-308));
	    Triangle triangle1 = triangle0.setSideLengths((-308), 2585, (-308));
	    Triangle triangle2 = triangle0.setSideLengths(2585, (-308), 1);
	    Triangle triangle3 = triangle2.setSideLengths((-1031), 0, 2585);
	    triangle3.setSideLengths((-308), 2585, 1150);
	    triangle0.isImpossible();
	    triangle0.getSideLengths();
	    triangle0.getArea();
	    triangle0.classify();
	    Triangle triangle4 = triangle3.setSideLengths(0, (-1), (-1));
	    triangle0.setSideLengths((-1), (-308), 0);
	    triangle0.isImpossible();
	    Triangle triangle5 = triangle3.setSideLengths((-173), 1, (-308));
	    triangle4.setSideLengths((-432), 78, (-1031));
	    triangle5.isIsosceles();
	    int int0 = triangle1.getPerimeter();
	    assertTrue(triangle0.isScalene());
	    assertEquals((-1385), int0);
	}

	@Test(timeout = 4000)
	public void testIsScaleneAndIsRightAngledReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(3847, 3847, 3847);
	    Triangle triangle1 = triangle0.setSideLengths((-1636), (-1636), 3847);
	    Triangle triangle2 = triangle0.setSideLengths(3847, 3847, 1);
	    Triangle triangle3 = triangle0.setSideLengths(3847, 3847, (-1016));
	    triangle3.isIsosceles();
	    Triangle triangle4 = triangle0.setSideLengths(1, 3699, 0);
	    triangle0.getArea();
	    triangle0.isRightAngled();
	    triangle1.isRightAngled();
	    triangle4.getArea();
	    triangle2.getArea();
	    triangle1.isEquilateral();
	    triangle3.setSideLengths((-1803), 1299, 922);
	    triangle4.classify();
	    triangle2.isEquilateral();
	    triangle2.getSideLengths();
	    triangle1.isEquilateral();
	    triangle0.isRightAngled();
	    triangle3.setSideLengths(3830, 3830, 0);
	    triangle0.getSideLengths();
	    triangle2.isScalene();
	    triangle4.isIsosceles();
	    triangle1.isImpossible();
	    triangle4.isIsosceles();
	    triangle1.isRightAngled();
	    triangle0.setSideLengths(3847, (-1636), 3699);
	    assertTrue(triangle0.isImpossible());
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningPositive() throws Throwable {
	    Triangle triangle0 = new Triangle(3947, 726, 0);
	    Triangle triangle1 = triangle0.setSideLengths(0, 3947, 978);
	    triangle1.setSideLengths((-2369), 0, 0);
	    Triangle triangle2 = triangle0.setSideLengths(1, 1, 726);
	    triangle0.setSideLengths((-1), 726, (-1));
	    Triangle triangle3 = triangle0.setSideLengths(978, 0, (-291));
	    Triangle triangle4 = triangle3.setSideLengths(1127, 1127, 1);
	    Triangle triangle5 = triangle4.setSideLengths(1, (-2574), (-1));
	    triangle5.setSideLengths((-1), 1, 0);
	    Triangle triangle6 = triangle2.setSideLengths(3947, (-291), 978);
	    Triangle triangle7 = triangle6.setSideLengths(1294, 3947, (-291));
	    triangle3.isImpossible();
	    triangle6.setSideLengths(726, 978, 726);
	    triangle2.isScalene();
	    triangle3.isIsosceles();
	    triangle7.getArea();
	    triangle0.getSideLengths();
	    triangle6.getArea();
	    triangle0.getArea();
	    triangle0.isIsosceles();
	    triangle3.getSideLengths();
	    triangle6.classify();
	    triangle3.isIsosceles();
	    triangle0.getSideLengths();
	    assertTrue(triangle0.isIsosceles());
	}

	@Test(timeout = 4000)
	public void testIsScaleneReturningFalse2() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3, 3);
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals(9, triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsEquilateral() throws Throwable {
	    Triangle triangle0 = new Triangle(1432, 1432, 0);
	    triangle0.getArea();
	    triangle0.getArea();
	    Triangle triangle1 = triangle0.setSideLengths(0, 0, 0);
	    Triangle triangle2 = triangle0.setSideLengths(1432, 1432, 0);
	    triangle0.isRightAngled();
	    triangle0.isIsosceles();
	    Triangle triangle3 = triangle0.setSideLengths(1432, 0, 0);
	    triangle2.setSideLengths((-96), (-96), (-96));
	    triangle0.getArea();
	    triangle3.getArea();
	    triangle0.isEquilateral();
	    triangle2.getSideLengths();
	    triangle1.isEquilateral();
	    triangle2.setSideLengths(0, 193, 0);
	    assertEquals(193, triangle2.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testGetPerimeter() throws Throwable {
	    Triangle triangle0 = new Triangle((-2699), (-2699), (-2699));
	    Triangle triangle1 = triangle0.setSideLengths((-754), (-754), (-2699));
	    triangle1.setSideLengths((-2699), (-2699), 0);
	    triangle1.setSideLengths((-754), 0, (-1689));
	    triangle1.isEquilateral();
	    int int0 = triangle1.getPerimeter();
	    assertFalse(triangle0.isIsosceles());
	    assertEquals((-2443), int0);
	}

	@Test(timeout = 4000)
	public void testIsScaleneReturningFalse1() throws Throwable {
	    Triangle triangle0 = new Triangle(3, (-5), 3);
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals("3,-5,3", triangle0.getSideLengths());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsScaleneReturningFalse0() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 0, 0);
	    boolean boolean0 = triangle0.isScalene();
	    assertEquals(3, triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsEquilateralReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(3, 3, (-621));
	    boolean boolean0 = triangle0.isEquilateral();
	    assertFalse(boolean0);
	    assertEquals((-615), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testClassify0() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 1);
	    String string0 = triangle0.classify();
	    assertEquals("equilateral", string0);
	    boolean boolean0 = triangle0.isImpossible();
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testClassifyReturningNonEmptyString0() throws Throwable {
	    Triangle triangle0 = new Triangle((-765), (-765), (-765));
	    String string0 = triangle0.classify();
	    assertEquals("impossible", string0);
	    assertEquals((-2295), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testClassify1() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 3);
	    triangle0.classify();
	    String string0 = triangle0.classify();
	    assertEquals("isossceles", string0);
	    boolean boolean0 = triangle0.isImpossible();
	    assertEquals(5, triangle0.getPerimeter());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testClassifyReturningNonEmptyString1() throws Throwable {
	    Triangle triangle0 = new Triangle(5, 5, (-15));
	    String string0 = triangle0.classify();
	    assertEquals("impossible", string0);
	    assertEquals((-5), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesReturningTrue2() throws Throwable {
	    Triangle triangle0 = new Triangle(2274, 2274, 2274);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertTrue(boolean0);
	    assertEquals(6822, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testClassifyReturningNonEmptyString2() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 2274, 2274);
	    String string0 = triangle0.classify();
	    assertEquals("scalene", string0);
	    assertEquals("1,2274,2274", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testClassifyReturningNonEmptyString3() throws Throwable {
	    Triangle triangle0 = new Triangle(1, (-3542), 1);
	    String string0 = triangle0.classify();
	    assertEquals("impossible", string0);
	    assertEquals("1,-3542,1", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testClassifyReturningNonEmptyString4() throws Throwable {
	    Triangle triangle0 = new Triangle(2278, 2278, 1);
	    String string0 = triangle0.classify();
	    assertEquals("isossceles", string0);
	    assertEquals("2278,2278,1", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsRightAngledReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(2237, 2237, 2237);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertFalse(boolean0);
	    assertEquals("equilateral", triangle0.classify());
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesReturningTrue1() throws Throwable {
	    Triangle triangle0 = new Triangle(2274, 2622, 2274);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertEquals(Double.NaN, triangle0.getArea(), 0.01);
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesReturningTrue0() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 2274, 2274);
	    boolean boolean0 = triangle0.isIsosceles();
	    assertTrue(boolean0);
	    assertEquals("1,2274,2274", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsEquilateralReturningFalseAndIsIsoscelesReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(3847, 3847, 3847);
	    Triangle triangle1 = triangle0.setSideLengths((-1636), (-1636), 3847);
	    Triangle triangle2 = triangle0.setSideLengths(3847, 3847, 1);
	    Triangle triangle3 = triangle0.setSideLengths(3847, 3847, (-1016));
	    triangle3.isIsosceles();
	    Triangle triangle4 = triangle0.setSideLengths(1, 3699, 0);
	    triangle0.getArea();
	    triangle0.isRightAngled();
	    triangle1.isRightAngled();
	    triangle4.getArea();
	    triangle2.getArea();
	    triangle1.isEquilateral();
	    Triangle triangle5 = triangle3.setSideLengths((-1803), 1299, 922);
	    triangle4.classify();
	    triangle2.isEquilateral();
	    triangle2.getSideLengths();
	    triangle1.isEquilateral();
	    triangle0.isRightAngled();
	    Triangle triangle6 = triangle1.setSideLengths(2, 0, (-1016));
	    triangle6.classify();
	    triangle5.isIsosceles();
	    triangle0.getPerimeter();
	    triangle3.isImpossible();
	    triangle0.isIsosceles();
	    triangle5.isEquilateral();
	    boolean boolean0 = triangle0.isEquilateral();
	    assertTrue(triangle0.isScalene());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsRightAngled() throws Throwable {
	    Triangle triangle0 = new Triangle(0, 994, 0);
	    Triangle triangle1 = triangle0.setSideLengths(0, 994, (-1969));
	    Triangle triangle2 = triangle0.setSideLengths(994, 0, (-1255));
	    triangle0.setSideLengths(0, 3184, 0);
	    triangle1.setSideLengths(0, 0, 0);
	    triangle1.getArea();
	    triangle1.isRightAngled();
	    triangle0.getSideLengths();
	    triangle2.setSideLengths((-1607), (-286), 1087);
	    assertFalse(triangle0.isEquilateral());
	    assertEquals((-806), triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsIsoscelesReturningFalse() throws Throwable {
	    Triangle triangle0 = new Triangle((-1093), (-1093), (-1093));
	    Triangle triangle1 = triangle0.setSideLengths((-1093), 0, 9);
	    boolean boolean0 = triangle1.isIsosceles();
	    assertTrue(triangle0.isScalene());
	    assertFalse(boolean0);
	}

	@Test(timeout = 4000)
	public void testIsEquilateralReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(2252, 2252, 2252);
	    boolean boolean0 = triangle0.isEquilateral();
	    assertTrue(boolean0);
	    assertEquals(6756, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsRightAngledReturningTrueAndSetSideLengthsReturningTriangleWhereIsRightAngledIsTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(1, 1, 1);
	    String string0 = triangle0.getSideLengths();
	    assertEquals("1,1,1", string0);
	    triangle0.setSideLengths(0, 1, 1);
	    boolean boolean0 = triangle0.isRightAngled();
	    assertEquals("0,1,1", triangle0.getSideLengths());
	    assertTrue(boolean0);
	}

	@Test(timeout = 4000)
	public void testSetSideLengthsReturningTriangleWhereIsScaleneIsFalse() throws Throwable {
	    Triangle triangle0 = new Triangle(2274, 2274, 2274);
	    assertEquals("equilateral", triangle0.classify());
	    triangle0.setSideLengths(2274, 2274, 2274);
	    assertEquals("2274,2274,2274", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testIsIsosceles() throws Throwable {
	    Triangle triangle0 = new Triangle((-1226), (-1226), (-1226));
	    triangle0.setSideLengths(0, 1586, 420);
	    triangle0.setSideLengths((-2300), 3, 3);
	    triangle0.getPerimeter();
	    triangle0.getPerimeter();
	    triangle0.isIsosceles();
	    int int0 = triangle0.getPerimeter();
	    assertEquals("-2300,3,3", triangle0.getSideLengths());
	    assertEquals((-2294), int0);
	}

	@Test(timeout = 4000)
	public void testIsScaleneReturningTrue() throws Throwable {
	    Triangle triangle0 = new Triangle(2279, 460, 436);
	    boolean boolean0 = triangle0.isScalene();
	    assertTrue(boolean0);
	    assertEquals(3175, triangle0.getPerimeter());
	}

	@Test(timeout = 4000)
	public void testIsScaleneAndClassifyAndIsImpossible() throws Throwable {
	    Triangle triangle0 = new Triangle((-211), 766, 766);
	    Triangle triangle1 = triangle0.setSideLengths((-211), 0, (-211));
	    Triangle triangle2 = triangle1.setSideLengths((-211), (-211), 939);
	    Triangle triangle3 = triangle0.setSideLengths(1106, 766, 1106);
	    Triangle triangle4 = triangle3.setSideLengths(1, 1, 1106);
	    Triangle triangle5 = triangle2.setSideLengths(1106, 939, 2706);
	    triangle2.setSideLengths(2, 0, (-211));
	    triangle5.setSideLengths(2, 0, 2706);
	    Triangle triangle6 = triangle1.setSideLengths(766, 766, 1);
	    triangle0.getPerimeter();
	    Triangle triangle7 = triangle1.setSideLengths((-4332), 110, (-831));
	    Triangle triangle8 = triangle7.setSideLengths(766, 1087, 1087);
	    triangle2.classify();
	    triangle2.getPerimeter();
	    triangle6.isImpossible();
	    triangle3.isScalene();
	    triangle8.getSideLengths();
	    triangle4.setSideLengths(0, (-831), (-1206));
	    assertFalse(triangle3.isIsosceles());
	    assertEquals("0,-831,-1206", triangle0.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testGetSideLengths() throws Throwable {
	    Triangle triangle0 = new Triangle((-1915), (-1915), 1);
	    Triangle triangle1 = triangle0.setSideLengths((-889), (-1915), 2583);
	    triangle1.setSideLengths((-889), 0, (-1915));
	    triangle1.getSideLengths();
	    assertEquals("-889,0,-1915", triangle1.getSideLengths());
	}

	@Test(timeout = 4000)
	public void testGetAreaReturningNegative() throws Throwable {
	    Triangle triangle0 = new Triangle((-1447), (-1447), (-1447));
	    double double0 = triangle0.getArea();
	    assertEquals((-1.0), double0, 0.01);
	    assertEquals((-4341), triangle0.getPerimeter());
	}

}