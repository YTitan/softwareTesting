package st_lab1;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Queue;

public class SortTest {

    private Queue<int[]> snapQueue = new ArrayDeque<>();

    final int[] initial = {912, 871, 813, 876, 220, 708, 308, 313, 128, 864, 836, 655, 183, 699, 462, 699, 95, 775, 228, 152, 106, 184, 815, 790, 499, 437, 453, 14, 292, 768, 506};

    int[] snapshot1 = {708, 699, 699, 506, 462, 655, 499, 437, 228, 220, 292, 14, 453, 308, 184, 313, 95, 128, 183, 152, 106, 768, 775, 790, 813, 815, 836, 864, 871, 876, 912};
    int[] snapshot2 = {437, 313, 308, 228, 292, 152, 184, 106, 183, 220, 128, 14, 95, 453, 462, 499, 506, 655, 699, 699, 708, 768, 775, 790, 813, 815, 836, 864, 871, 876, 912};
    int[] snapshot3 = {152, 128, 106, 14, 95, 183, 184, 220, 228, 292, 308, 313, 437, 453, 462, 499, 506, 655, 699, 699, 708, 768, 775, 790, 813, 815, 836, 864, 871, 876, 912};
    int[] finalSnap = {14, 95, 106, 128, 152, 183, 184, 220, 228, 292, 308, 313, 437, 453, 462, 499, 506, 655, 699, 699, 708, 768, 775, 790, 813, 815, 836, 864, 871, 876, 912};

    private static SortTest inst = null;

    public static SortTest Instance(){
        return inst;
    }

    public SortTest(){
        assert (inst == null);
        inst = this;
    }

    public void EnqueueSnapshot(int[] arr){
        int[] snap = new int[arr.length];
        System.arraycopy(arr, 0, snap, 0, arr.length);
        snapQueue.add(snap);
    }

    @Test
    public void Test(){
        snapQueue.clear();
        int arr[] = new int[initial.length];
        System.arraycopy(initial, 0, arr, 0, initial.length);
        HeapSort.Sort(arr);

        assertTrue("Heap constructed incorrectly", VerifyHeap(snapQueue.remove()));

        Queue<int[]> testQueue = new ArrayDeque<>();
        testQueue.add(snapshot1);
        testQueue.add(snapshot2);
        testQueue.add(snapshot3);
        testQueue.add(finalSnap);

        // make sure all snapshots appear in snapQueue ignoring the snapshots that are not in testQueue
        boolean res;
        while (!testQueue.isEmpty() && !snapQueue.isEmpty()){
            int[] arr1 = testQueue.peek();
            int[] arr2 = snapQueue.peek();
            if (ArraysEqual(arr1, arr2))
                testQueue.remove();
            snapQueue.remove();
        }
        res = testQueue.isEmpty();
        assertTrue("wrong order of steps or just invalid data", res);
    }

    boolean ArraysEqual(int[] arr1, int[] arr2){
        if (arr1 == null || arr2 == null)
            return false;
        if (arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; ++i)
            if (arr1[i] != arr2[i])
                return false;
        return true;
    }

    boolean VerifyHeap(int[] arr){
        // verify that each child in the heap has a value less than the child's parent's value
        for (int i = 1; i < arr.length; ++i)
            if (arr[i] > arr[(i-1)/2])
                return false;

        return true;
    }
}
