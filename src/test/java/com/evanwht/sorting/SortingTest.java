package com.evanwht.sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortingTest {

	@Test
	public void selectionSort() {
		final int[] array = new int[] {4, 1, 8, 3, 2};
		Sorting.selectionSort(array);
		assertArrayEquals(new int[] {1, 2, 3, 4, 8}, array);
	}

	@Test
	public void bubbleSort() {
		final int[] array = new int[] {4, 1, 8, 3, 2};
		Sorting.bubbleSort(array);
		assertArrayEquals(new int[] {1, 2, 3, 4, 8}, array);
	}

	@Test
	public void insertionSort() {
		final int[] array = new int[] {4, 1, 8, 3, 2};
		Sorting.insertionSort(array);
		assertArrayEquals(new int[] {1, 2, 3, 4, 8}, array);
	}

	@Test
	public void merge() {
		final int[] left = new int[] {4, 7, 9};
		final int[] right = new int[] {1, 5, 8};
		int[] merged = Sorting.merge(left, right);
		assertArrayEquals(new int[] {1, 4, 5, 7, 8, 9}, merged);

		merged = Sorting.merge(left, new int[] {});
		assertArrayEquals(left, merged);

		merged = Sorting.merge(new int[] {}, right);
		assertArrayEquals(right, merged);

		merged = Sorting.merge(left, new int[] {14});
		assertArrayEquals(new int[] {4, 7, 9, 14}, merged);
	}

	@Test
	public void mergeSort() {
		int[] sorted = Sorting.mergeSort(new int[] {4, 1, 8, 3, 2});
		assertArrayEquals(new int[] {1, 2, 3, 4, 8}, sorted);

		sorted = Sorting.mergeSort(new int[] {4});
		assertArrayEquals(new int[] {4}, sorted);
	}
}