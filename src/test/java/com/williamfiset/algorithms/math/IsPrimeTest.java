package com.williamfiset.algorithms.math;

import static com.google.common.truth.Truth.assertThat;

import com.williamfiset.algorithms.utils.graphutils.GraphGenerator;
import com.williamfiset.algorithms.utils.graphutils.Utils;
import java.util.*;
import org.junit.*;


public class IsPrimeTest {

    @Test
    public void test1() {
        assertThat(true).isTrue();
    }
    

    @After
    public void after() {
        int trues = 0;

        for(boolean elem : IsPrime.array) {
            System.out.println(elem);
            if(elem == true) trues++;
        }

        System.out.println((float) ((float)trues / IsPrime.array.length));
    }

}
