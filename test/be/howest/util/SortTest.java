package be.howest.util;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Hayk
 */
public class SortTest {

    private int[] numbers;
    private int[] hardSortedNumbers;

    @Before
    public void before() {
        numbers = new int[]{7, 5, 0, -44, 8, 240, 3, 1, 0, 5, -55, -79};
        hardSortedNumbers = new int[]{-79, -55, -44, 0, 0, 1, 3, 5, 5, 7, 8, 240};
    }

    // <editor-fold desc="Insertion Sort" defaultstate="collapsed">
    @Test
    public void insertionSort_array_remains_null_if_it_was_null() {
        int[][] nullArrays = new int[1][1];
        nullArrays[0] = null;
        Sort.insertionSort(nullArrays[0]);
        assertNull(nullArrays[0]);
    }

    @Test
    public void insertionSort_array_remains_same_if_it_contains_1_number() {
        int[] singleElementArray = {0};
        Sort.insertionSort(singleElementArray);
        assertArrayEquals(new int[]{0}, singleElementArray);
    }

    @Test
    public void insertionSort_sorts_2_numbers_correctly() {
        int[] twoNumbers = {2, -5};
        int[] hardSortedTwoNumbers = {-5, 2};
        Sort.insertionSort(twoNumbers);
        assertArrayEquals(hardSortedTwoNumbers, twoNumbers);
        Sort.insertionSort(twoNumbers);
        assertArrayEquals(hardSortedTwoNumbers, twoNumbers);
    }

    @Test
    public void insertionSort_sorts_12_numbers_correctly() {
        Sort.insertionSort(numbers);
        assertArrayEquals(hardSortedNumbers, numbers);
        Sort.insertionSort(numbers);
        assertArrayEquals(hardSortedNumbers, numbers);
    }
    // </editor-fold>

    // <editor-fold desc="Selection Sort" defaultstate="collapsed">
    @Test
    public void selectionSort_array_remains_null_if_it_was_null() {
        int[][] nullArrays = new int[1][1];
        nullArrays[0] = null;
        Sort.selectionSort(nullArrays[0]);
        assertNull(nullArrays[0]);
    }

    @Test
    public void selectionSort_array_remains_same_if_it_contains_1_number() {
        int[] singleElementArray = {0};
        Sort.selectionSort(singleElementArray);
        assertArrayEquals(new int[]{0}, singleElementArray);
    }

    @Test
    public void selectionSort_sorts_2_numbers_correctly() {
        int[] twoNumbers = {2, -5};
        int[] hardSortedTwoNumbers = {-5, 2};
        Sort.selectionSort(twoNumbers);
        assertArrayEquals(hardSortedTwoNumbers, twoNumbers);
        Sort.selectionSort(twoNumbers);
        assertArrayEquals(hardSortedTwoNumbers, twoNumbers);
    }

    @Test
    public void selectionSort_sorts_12_numbers_correctly() {
        Sort.selectionSort(numbers);
        assertArrayEquals(hardSortedNumbers, numbers);
        Sort.selectionSort(numbers);
        assertArrayEquals(hardSortedNumbers, numbers);
    }
    // </editor-fold>

    // <editor-fold desc="Exchange Sort" defaultstate="collapsed">
    @Test
    public void exchangeSort_array_remains_null_if_it_was_null() {
        int[][] nullArrays = new int[1][1];
        nullArrays[0] = null;
        Sort.exchangeSort(nullArrays[0]);
        assertNull(nullArrays[0]);
    }

    @Test
    public void exchangeSort_array_remains_same_if_it_contains_1_number() {
        int[] singleElementArray = {0};
        Sort.exchangeSort(singleElementArray);
        assertArrayEquals(new int[]{0}, singleElementArray);
    }

    @Test
    public void exchangeSort_sorts_2_numbers_correctly() {
        int[] twoNumbers = {2, -5};
        int[] hardSortedTwoNumbers = {-5, 2};
        Sort.exchangeSort(twoNumbers);
        assertArrayEquals(hardSortedTwoNumbers, twoNumbers);
        Sort.exchangeSort(twoNumbers);
        assertArrayEquals(hardSortedTwoNumbers, twoNumbers);
    }

    @Test
    public void exchangeSort_sorts_12_numbers_correctly() {
        Sort.exchangeSort(numbers);
        assertArrayEquals(hardSortedNumbers, numbers);
        Sort.exchangeSort(numbers);
        assertArrayEquals(hardSortedNumbers, numbers);
    }
    // </editor-fold>

    // <editor-fold desc="Bubble Sort" defaultstate="collapsed">
    @Test
    public void bubbleSort_array_remains_null_if_it_was_null() {
        int[][] nullArrays = new int[1][1];
        nullArrays[0] = null;
        Sort.bubbleSort(nullArrays[0]);
        assertNull(nullArrays[0]);
    }

    @Test
    public void bubbleSort_array_remains_same_if_it_contains_1_number() {
        int[] singleElementArray = {0};
        Sort.bubbleSort(singleElementArray);
        assertArrayEquals(new int[]{0}, singleElementArray);
    }

    @Test
    public void bubbleSort_sorts_2_numbers_correctly() {
        int[] twoNumbers = {2, -5};
        int[] hardSortedTwoNumbers = {-5, 2};
        Sort.bubbleSort(twoNumbers);
        assertArrayEquals(hardSortedTwoNumbers, twoNumbers);
        Sort.bubbleSort(twoNumbers);
        assertArrayEquals(hardSortedTwoNumbers, twoNumbers);
    }

    @Test
    public void bubbleSort_sorts_12_numbers_correctly() {
        Sort.bubbleSort(numbers);
        assertArrayEquals(hardSortedNumbers, numbers);
        Sort.bubbleSort(numbers);
        assertArrayEquals(hardSortedNumbers, numbers);
    }
    // </editor-fold>

    // <editor-fold desc="Quick Sort" defaultstate="collapsed">
    @Test
    public void quickSort_array_remains_null_if_it_was_null() {
        int[][] nullArrays = new int[1][1];
        nullArrays[0] = null;
        Sort.quickSort(nullArrays[0]);
        assertNull(nullArrays[0]);
    }

    @Test
    public void quickSort_array_remains_same_if_it_contains_1_number() {
        int[] singleElementArray = {0};
        Sort.quickSort(singleElementArray);
        assertArrayEquals(new int[]{0}, singleElementArray);
    }

    @Test
    public void quickSort_sorts_2_numbers_correctly() {
        int[] twoNumbers = {2, -5};
        int[] hardSortedTwoNumbers = {-5, 2};
        Sort.quickSort(twoNumbers);
        assertArrayEquals(hardSortedTwoNumbers, twoNumbers);
        Sort.quickSort(twoNumbers);
        assertArrayEquals(hardSortedTwoNumbers, twoNumbers);
    }

    @Test
    public void quickSort_sorts_12_numbers_correctly() {
        Sort.quickSort(numbers);
        assertArrayEquals(hardSortedNumbers, numbers);
        Sort.quickSort(numbers);
        assertArrayEquals(hardSortedNumbers, numbers);
    }

    @Test
    public void quickSort_sorts_13_numbers_correctly() {
        int[] thirteenNumbers = {7, 5, 0, -44, 301, 8, 240, 3, 1, 0, 5, -55, -79};
        int[] hardSortedThirteenNumbers = {-79, -55, -44, 0, 0, 1, 3, 5, 5, 7, 8, 240, 301};
        Sort.quickSort(thirteenNumbers);
        assertArrayEquals(hardSortedThirteenNumbers, thirteenNumbers);
        Sort.quickSort(thirteenNumbers);
        assertArrayEquals(hardSortedThirteenNumbers, thirteenNumbers);
    }
    // </editor-fold>
}
