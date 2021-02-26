package com.williamfiset.algorithms.geometry;

import static com.google.common.truth.Truth.assertThat;

import com.google.common.collect.ImmutableList;
import java.awt.geom.*;
import org.junit.*;
import com.williamfiset.algorithms.geometry.LineSegmentLineSegmentIntersection.Pt;

public class LineSegmentLineSegmentIntersectionTest {

  @Test
  public void main_test() {
    LineSegmentLineSegmentIntersection.main(new String[]{""});
  }

  @Test
  public void testSegment2enclosedInSegment1() {
    Pt p1 = new Pt(0,2);
    Pt p2 = new Pt(0,6);
    Pt p3 = new Pt(0,0);
    Pt p4 = new Pt(0,9);

    Pt[] pts = LineSegmentLineSegmentIntersection.lineSegmentLineSegmentIntersection(p1, p2, p3, p4);
    assertThat(pts[0].equals(p1)).isTrue();
    assertThat(pts[1].equals(p2)).isTrue();
  }
  @Test
  public void testNoIntersection() {
    Pt p1 = new Pt(0,0);
    Pt p2 = new Pt(0,6);
    Pt p3 = new Pt(1,0);
    Pt p4 = new Pt(2,9);

    Pt[] pts = LineSegmentLineSegmentIntersection.lineSegmentLineSegmentIntersection(p1, p2, p3, p4);
    assertThat(pts).isEmpty();
  }

  @Test
  public void testAllEqual() {
    Pt p1 = new Pt(0,0);
    Pt p2 = new Pt(0,0);
    Pt p3 = new Pt(0,0);
    Pt p4 = new Pt(0,0);

    Pt[] pts = LineSegmentLineSegmentIntersection.lineSegmentLineSegmentIntersection(p1, p2, p3, p4);
    assertThat(pts[0].equals(p1)).isTrue();
  }

  @Test
  public void testContinuousLineConnectedInOnePoint() {
    Pt p1 = new Pt(0,0);
    Pt p2 = new Pt(0,10);
    Pt p3 = new Pt(0,10);
    Pt p4 = new Pt(0,20);

    Pt[] pts = LineSegmentLineSegmentIntersection.lineSegmentLineSegmentIntersection(p1, p2, p3, p4);
    assertThat(pts[0].equals(p2)).isTrue();
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
