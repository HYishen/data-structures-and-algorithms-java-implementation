package search.binary;

/**
 * <pre>
 * Binary Search。
 * </pre>
 *
 * @author Yishen 844147804@qq.com
 * @version 1.00.00
 */
public class BinarySearch {
    /**
     * <pre>
     * 简单二分查找，给出一个数据不重复的有序数组，找出匹配值的下标。
     * </pre>
     *
     * @return int
     * @Param [array, length, value]
     */
    public static int simpleBinarySearch(int[] array, int length, int value) {
        if (array == null) {
            return -1;
        }
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (array[mid] < value) {
                low = mid + 1;
            } else if (array[mid] > value) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    /**
     * <pre>
     * 查找第一个等于某值的下标，给出的有序数组里面可以有重复值。
     * </pre>
     *
     * @return int
     * @Param [array, length, value]
     */
    public static int firstEqualsBinarySearch(int[] array, int length, int value) {
        if (array == null) {
            return -1;
        }
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (array[mid] >= value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low < length && array[low] == value) {
            return low;
        }
        return -1;
    }

    /**
     * <pre>
     * 查找第一个等于某值的下标,给出的有序数组里面可以有重复值,用较易读的方式实现。
     * </pre>
     *
     * @return int
     * @Param [array, length, value]
     */
    public static int firstEqualsBinarySearchS(int[] array, int length, int value) {
        if (array == null) {
            return -1;
        }
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (array[mid] < value) {
                low = mid + 1;
            } else if (array[mid] > value) {
                high = mid - 1;
            } else {
                if (mid == 0 || array[mid - 1] != value) {
                    return mid;
                }
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * <pre>
     * 查找最后一个等于给定值的下标,给出的有序数组中允许有重复值。
     * </pre>
     *
     * @return int
     * @Param [array, length, value]
     */
    public static int lastEqualsBinarySearch(int[] array, int length, int value) {
        if (array == null) {
            return -1;
        }
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (array[mid] <= value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (high >= 0 && array[high] == value) {
            return high;
        }
        return -1;
    }

    /**
     * <pre>
     * 查找最后一个等于给定值的下标,给出的有序数组中允许有重复值,用较易读的方式实现。
     * </pre>
     *
     * @return int
     * @Param [array, length, value]
     */
    public static int lastEqualsBinarySearchS(int[] array, int length, int value) {
        if (array == null) {
            return -1;
        }
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (array[mid] < value) {
                low = mid + 1;
            } else if (array[mid] > value) {
                high = mid - 1;
            } else {
                if (mid == length - 1 || array[mid + 1] != array[mid]) {
                    return mid;
                }
                low = mid + 1;
            }
        }
        return -1;
    }

    /**
     * <pre>
     * 找出第一个大于或等于给定值的下标,给出的数组可以有重复值。
     * </pre>
     *
     * @return int
     * @Param [array, length, value]
     */
    public static int firstGreaterEqualsBinarySearch(int[] array, int length, int value) {
        if (array == null) {
            return -1;
        }
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (array[mid] >= value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (low < length && array[low] >= value) {
            return low;
        }
        return -1;
    }

    /**
     * <pre>
     * 找出最后一个小于或等于给定值的下标,给出的数组可以有重复值。
     * </pre>
     *
     * @return int
     * @Param [array, length, value]
     */
    public static int lastLessEqualsBinarySearch(int[] array, int length, int value) {
        if (array == null) {
            return -1;
        }
        int low = 0;
        int high = length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (array[mid] <= value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (high >= 0 && array[high] <= value) {
            return high;
        }
        return -1;
    }

}
