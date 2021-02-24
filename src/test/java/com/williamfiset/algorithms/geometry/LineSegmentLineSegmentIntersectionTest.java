package com.williamfiset.algorithms.geometry;

import static com.google.common.truth.Truth.assertThat;

import com.google.common.collect.ImmutableList;
import java.awt.geom.*;
import org.junit.*;

public class LineSegmentLineSegmentIntersectionTest {

  @Test
  public void main_test() {
    LineSegmentLineSegmentIntersection.main(new String[]{""});
  }

  @Test
  public void testSegment2enclosedInSegment1() {
    LineSegmentLineSegmentIntersection.Pt p1 = new LineSegmentLineSegmentIntersection.Pt(0,2);
    LineSegmentLineSegmentIntersection.Pt p2 = new LineSegmentLineSegmentIntersection.Pt(0,6);
    LineSegmentLineSegmentIntersection.Pt p3 = new LineSegmentLineSegmentIntersection.Pt(0,0);
    LineSegmentLineSegmentIntersection.Pt p4 = new LineSegmentLineSegmentIntersection.Pt(0,9);

    LineSegmentLineSegmentIntersection.lineSegmentLineSegmentIntersection(p1, p2, p3, p4);
  }
  @Test
  public void testNoIntersection() {
    LineSegmentLineSegmentIntersection.Pt p1 = new LineSegmentLineSegmentIntersection.Pt(0,0);
    LineSegmentLineSegmentIntersection.Pt p2 = new LineSegmentLineSegmentIntersection.Pt(0,6);
    LineSegmentLineSegmentIntersection.Pt p3 = new LineSegmentLineSegmentIntersection.Pt(1,0);
    LineSegmentLineSegmentIntersection.Pt p4 = new LineSegmentLineSegmentIntersection.Pt(2,9);

    LineSegmentLineSegmentIntersection.lineSegmentLineSegmentIntersection(p1, p2, p3, p4);
  }

  @Test
  public void testAllEqual() {
    LineSegmentLineSegmentIntersection.Pt p1 = new LineSegmentLineSegmentIntersection.Pt(0,0);
    LineSegmentLineSegmentIntersection.Pt p2 = new LineSegmentLineSegmentIntersection.Pt(0,0);
    LineSegmentLineSegmentIntersection.Pt p3 = new LineSegmentLineSegmentIntersection.Pt(0,0);
    LineSegmentLineSegmentIntersection.Pt p4 = new LineSegmentLineSegmentIntersection.Pt(0,0);

    LineSegmentLineSegmentIntersection.lineSegmentLineSegmentIntersection(p1, p2, p3, p4);
  }

  @Test
  public void testContinuousLineConnectedInOnePoint() {
    LineSegmentLineSegmentIntersection.Pt p1 = new LineSegmentLineSegmentIntersection.Pt(0,0);
    LineSegmentLineSegmentIntersection.Pt p2 = new LineSegmentLineSegmentIntersection.Pt(0,10);
    LineSegmentLineSegmentIntersection.Pt p3 = new LineSegmentLineSegmentIntersection.Pt(0,10);
    LineSegmentLineSegmentIntersection.Pt p4 = new LineSegmentLineSegmentIntersection.Pt(0,20);

    LineSegmentLineSegmentIntersection.lineSegmentLineSegmentIntersection(p1, p2, p3, p4);
  }

  @After
  public void after() {
    int trues = 0;

    for(boolean elem : LineSegmentLineSegmentIntersection.array) {
      if(elem == true) trues++;
    }

    System.out.println(((float) trues / LineSegmentLineSegmentIntersection.array.length));
  }
}
