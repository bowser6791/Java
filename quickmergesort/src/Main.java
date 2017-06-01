
public class Main {
    public static void main(String[] args) {
      final int SIZE = 1000000;

		//SorterGeneric<Integer> sorter = new SorterGeneric<Integer>();
                //Sorter<Integer> sorter1 = new Sorter<Integer>();
                SorterGeneric<Double>sorter3 = new SorterGeneric<Double>();
                Sorter<Double>sorter4 = new Sorter<Double>();
                java.util.Random random = new java.util.Random();

		Integer [] array1 = new Integer [SIZE];
                Integer []array2 = new Integer[SIZE];
                Double []array3 = new Double[SIZE];
                Double []array4 = new Double[SIZE];


		for (int i = 0; i < array1.length; i++ )
		{
		       //array1[i] = new Integer(random.nextInt(100));
                       //array2[i] = new Integer(random.nextInt(100));
                        array3[i] = new Double(random.nextDouble());
                        array4[i] = new Double(random.nextDouble());
		}
                
                //sorter1.setData(array2);
                //long start1 = System.nanoTime();
                //sorter1.quicksort();
                //long end1 = System.nanoTime();
                //double time1 = (end1 - start1) / (double)1000000000;
                //System.out.printf("QuickSort on type int took: %6.2f seconds\n", time1);
		//sorter.setData(array1);
		//long start = System.nanoTime();
		//sorter.mergesort();
		//long end = System.nanoTime();
		//double time = (end - start) / (double)1000000000;
		//System.out.printf("MergeSort on type int took: %6.2f seconds\n", time);
                sorter4.setData(array4);
                long start2 = System.nanoTime();
                sorter4.quicksort();
                long end2 = System.nanoTime();
                double time3 = (end2 - start2) / (double)1000000000;
                System.out.printf("QuickSort on type double took: %6.2f seconds\n", time3);
                sorter3.setData(array3);
                long start3 = System.nanoTime();
                sorter3.mergesort();
                long end3 = System.nanoTime();
                double time4 = (end3 - start3) / (double)1000000000;
                System.out.printf("Mergesort on type double took: %6.2f seconds\n", time4);
}
}
    


