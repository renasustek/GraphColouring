package org.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class   ValidateMatrixTest {

    int[][] matrix = {
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5}
    };


    @Test
    void when_given_valid_matrix_then_return_1() {
    }

    @Test
    void square_return_true() {
        ValidateMatrix validateMatrix = new ValidateMatrix(matrix);
        assertTrue(validateMatrix.checkSquare());
    }

    @Test
    void notSquare_missing_row_return_false() {
        int[][] matrix = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2}
        };
        ValidateMatrix validateMatrix = new ValidateMatrix(matrix);
        assertFalse(validateMatrix.checkSquare());
    }

    @Test
    void notSquare_additional_col_return_false() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5, 6, 7}
        };
        ValidateMatrix validateMatrix = new ValidateMatrix(matrix);
        assertFalse(validateMatrix.checkSquare());
    }

    @Test
    void notSquare_additional_row_return_false() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };
        ValidateMatrix validateMatrix = new ValidateMatrix(matrix);
        assertFalse(validateMatrix.checkSquare());
    }

    @Test
    void notSquare_additional_col_row_return_false() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3}
        };
        ValidateMatrix validateMatrix = new ValidateMatrix(matrix);
        assertFalse(validateMatrix.checkSquare());
    }

    @Test
    void notSquare_return_false() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {1, 2},
                {1, 2, 3, 4},


        };
        ValidateMatrix validateMatrix = new ValidateMatrix(matrix);
        assertFalse(validateMatrix.checkSquare());
    }

    @Test
    void binary_return_true(){
        int[][] adjacencyMatrix = {
                {0, 1, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 0, 1, 0}
        };
        ValidateMatrix validateMatrix = new ValidateMatrix(adjacencyMatrix);
        assertTrue(validateMatrix.checkBinary());
    }

    @Test
    void not_binary_return_false(){
        int[][] adjacencyMatrix = {
                {0, 1, 0, 0, 1},
                {1, 0, 2, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 0, 1, 0}
        };
        ValidateMatrix validateMatrix = new ValidateMatrix(adjacencyMatrix);
        assertFalse(validateMatrix.checkBinary());
    }
    @Test
    void symmetrical_return_true() {
        int[][] adjacencyMatrix = {
                {0, 1, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 0, 1, 0}
        };

        ValidateMatrix validateMatrix = new ValidateMatrix(adjacencyMatrix);
        assertTrue(validateMatrix.checkSymmetry());
    }

    @Test
    void diagonal_contains_1_return_true() {
        int[][] adjacencyMatrix = {
                {1, 1, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 0, 1, 0}
        };

        ValidateMatrix validateMatrix = new ValidateMatrix(adjacencyMatrix);
        assertFalse(validateMatrix.checkSymmetry());
    }
    @Test
    void non_symmetrical_return_false() {
        int[][] adjacencyMatrix = {
                {0, 1, 0, 0, 1},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {0, 0, 0, 1, 0}
        };

        ValidateMatrix validateMatrix = new ValidateMatrix(adjacencyMatrix);
        assertFalse(validateMatrix.checkSymmetry());
    }

    @Test
    void prefect_matrix_return_0(){
        int[][] adjacencyMatrix = {
                {0, 1, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 0, 1, 0}
        };

        ValidateMatrix validateMatrix = new ValidateMatrix(adjacencyMatrix);
        assertEquals(0, validateMatrix.validate());
    }

    @Test
    void non_square_return_1(){
        int[][] adjacencyMatrix = {{1, 0, 0, 1, 0}};

        ValidateMatrix validateMatrix = new ValidateMatrix(adjacencyMatrix);
        assertEquals(1, validateMatrix.validate());
    }

    @Test
    void non_binary_return_2(){
        int[][] adjacencyMatrix = {
                {1, 2, 3, 4, 5},
                {1, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {1, 0, 0, 1, 0}
        };

        ValidateMatrix validateMatrix = new ValidateMatrix(adjacencyMatrix);
        assertEquals(2, validateMatrix.validate());
    }

    @Test
    void not_symmetrical_return3(){
        int[][] adjacencyMatrix = {
                {0, 1, 0, 0, 1},
                {0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 0, 1},
                {0, 0, 0, 1, 0}
        };

        ValidateMatrix validateMatrix = new ValidateMatrix(adjacencyMatrix);
        assertEquals(3, validateMatrix.validate());
    }
    @Test
    void diagonal_not_0_return3(){//todo change so diagonal and not symetrical return suttin different
        int[][] adjacencyMatrix = {
                {0, 1, 0, 0, 1},
                {1, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 0, 1, 1, 1},
                {1, 0, 0, 1, 1}
        };

        ValidateMatrix validateMatrix = new ValidateMatrix(adjacencyMatrix);
        assertEquals(3, validateMatrix.validate());
    }
}
