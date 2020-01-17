package heap;

/**
 * <pre>
 * heap。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class Heap {
    private int[] array;
    private int capacity;
    private int count;

    public Heap(int capacity) {
        array = new int[capacity + 1];
        this.capacity = capacity;
        count = 0;
    }

    public Heap(int[] array, int capacity, int count) {
        this.array = array;
        this.capacity = capacity;
        this.count = count;
    }

    public void insert(int data) {
        if (count >= capacity) {
            throw new RuntimeException("数组已满");
        }
        count++;
        array[count] = data;
        int i = count;
        while (i > 1 && array[i / 2] < array[i]) {
            this.swap(array, i / 2, i);
            i = i / 2;
        }
    }

    public int removeMax() {
        if (count <= 0) {
            return -1;
        }
        int max = array[1];
        array[1] = array[count--];
        this.heapify(array, count, 1);
        return max;
    }

    private static void heapify(int[] array, int count, int i) {
        while (true) {
            int maxIndex = i;
            if (i * 2 <= count && array[i] < array[i * 2]) {
                maxIndex = i * 2;
            }
            if (i * 2 + 1 <= count && array[maxIndex] < array[i * 2 + 1]) {
                maxIndex = i * 2 + 1;
            }
            if (i == maxIndex) {
                break;
            }
            swap(array, i, maxIndex);
            i = maxIndex;
        }
    }

    private static void swap(int[] array, int indexA, int indexB) {
        int temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

    public static void buildHeap(int[] array, int capacity) {
        if (capacity <= 1) {
            return;
        }
        for (int i = capacity / 2; i >= 1; i--) {
            heapify(array, capacity, i);
        }
    }

    public static void heapSort(int[] array, int length) {
        int count = length - 1;
        buildHeap(array, count);
        while (count > 0) {
            swap(array, 1, count--);
            heapify(array, count, 1);
        }
    }

}
