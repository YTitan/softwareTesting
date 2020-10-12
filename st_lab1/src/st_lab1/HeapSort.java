package st_lab1;

public class HeapSort {

    public static class Heap{
       int[] data;
       int heapSize;

        Heap(int capacity){
            data = new int[capacity];
        }

        Heap(int[] arr){
            data = arr;
            heapSize = arr.length;
            for (int i = 1; i < heapSize; ++i)
                SiftUp(i);
        }


        void SiftUp(int index){
            while (index > 0 && data[index] > data[GetParentIndex(index)]){
                int pIndex = GetParentIndex(index);
                Swap(index, pIndex);
                index = pIndex;
            }
        }

        void SiftDown(int index){
            while (LeftChildIndex(index) < heapSize){
                int left = LeftChildIndex(index);
                int right = RightChildIndex(index);
                int j = left;
                if (right < heapSize && data[right] > data[left])
                    j = right;
                if (data[index] >= data[j])
                    break;
                Swap(index, j);
                index = j;
            }
        }

        private int RightChildIndex(int parentIndex){
            return parentIndex*2 + 2;
        }

        private int LeftChildIndex(int i){
            return 2*i + 1;
        }

        private int GetParentIndex(int i){
            return (i - 1) / 2;
        }

        void Swap(int i, int j){
            int temp = data[i];
            data[i] = data[j];
            data[j] = temp;
        }
    }


    public static void Sort(int[] arr){
        Heap heap = new Heap(arr);
        if (SortTest.Instance() != null){
            SortTest.Instance().EnqueueSnapshot(arr);
        }
        for (int i = 0; i < arr.length; i++){
            heap.Swap(0, --heap.heapSize);
            heap.SiftDown(0);
            if (SortTest.Instance() != null){
                SortTest.Instance().EnqueueSnapshot(arr);
            }
        }
    }
}
