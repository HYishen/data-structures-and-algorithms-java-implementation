package sort.bucket;

import sort.quick.QuickSort;

import java.util.Arrays;

/**
 * <pre>
 * bucket。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class Bucket {
    private int[] array;
    private int size;
    private int start;
    private int end;

    public Bucket(int start, int end) {
        this(new int[10], 0, start, end);
    }

    public Bucket(int[] array, int size, int start, int end) {
        this.array = array;
        this.size = size;
        this.start = start;
        this.end = end;
    }

    public void sort() {
        QuickSort.quickSort(this.array, this.size);
    }

    public void add(int data) {
        if (array.length <= size) {
            int newLength = array.length + (array.length >> 1);
            this.array = Arrays.copyOf(this.array, newLength);
        }
        this.array[size++] = data;
    }

    public int[] getArray() {
        return this.array;
    }

    public int getSize() {
        return size;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
