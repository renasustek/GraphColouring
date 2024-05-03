package org.task2;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


class ColourClashTest {

    @Test
    void no_clashes_return_0() {
        int[][] matrix = {
                {0,1,1,1},
                {1,0,0,1},
                {1,0,0,0},
                {1,1,0,0}
        };


        ArrayList<Integer> solution = new ArrayList<>(List.of(1,2,3,4));
        ColourClash colourClash = new ColourClash(matrix, solution);
        assertEquals(0,colourClash.clashes());
    }

    @Test
    void four_clashes_return_4(){
        int[][] matrix = {
                {0,1,1,1},
                {1,0,0,1},
                {1,0,0,0},
                {1,1,0,0}
        };


        ArrayList<Integer> solution = new ArrayList<>(List.of(1,1,2,1));
        ColourClash colourClash = new ColourClash(matrix, solution);
        assertEquals(3,colourClash.clashes());
    }
}