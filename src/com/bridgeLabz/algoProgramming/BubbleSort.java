package com.bridgeLabz.algoProgramming;

public class BubbleSort<K extends Comparable<K>> {
	
	void bubbleSort(K array[])
    {
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j].compareTo(array[j+1]) > 0)
                {
                    K temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
  

  
    public static void main(String args[])
    {
        Integer[] array = {64, 34, 25, 12, 22, 11, 90};
        
        BubbleSort<Integer> buSort = new BubbleSort<>();
        buSort.bubbleSort(array);
        
        for (int i=0; i<array.length; ++i)
            System.out.print(array[i] + " ");
    }

}
