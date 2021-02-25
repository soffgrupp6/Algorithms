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

  @After
  public void after() {
    int trues = 0;

    for(boolean elem : LineSegmentLineSegmentIntersection.array) {
      if(elem == true) trues++;
    }

    System.out.println(((float) trues / LineSegmentLineSegmentIntersection.array.length));
  }
}
