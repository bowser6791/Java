
public class Main {
    public static void main(String[] args) {
       final int SIZE = 100000;
       Sorter<Integer> sorter = new Sorter<Integer>();
       java.util.Random random = new java.util.Random();
       Integer [] array1 = new Integer [SIZE];
       for (int i = 0; i < array1.length;i++){
           array1[i] = new Integer (random.nextInt(100));
       }
       sorter.setData(array1);
       long start = System.nanoTime();
       sorter.quicksort();
       long end = System.nanoTime();
       double time = (end - start)/(double)1000000000;
        System.out.printf("Integer Sort; %6.2f seconds \n",time);
        Sorter<Double> sorter2 = new Sorter<Double>();
        Double [] array2 = new Double[SIZE];
        for(int i = 0; i < array2.length;i++){
            array2[i]=new Double(random.nextDouble());
        }
        sorter2.setData(array2);
        start = System.nanoTime();
        sorter2.quicksort();
        end = System.nanoTime();
        time = (end - start)/(double)1000000000;
        System.out.printf("Double Sort: %6.2f seconds\n",time);
        Sorter<Rational> sorter3 = new Sorter<Rational>();
        Rational [] array3 = new Rational [SIZE];
        for(int i = 0;i<array3.length;i++){
            array3[i]=new Rational(random.nextInt(100),random.nextInt(100)+1);
            sorter3.setData(array3);
            start = System.nanoTime();
            sorter3.quicksort();
            end = System.nanoTime();
            time = (end - start)/(double)1000000000;
            System.out.printf("Rational Sort: %6.2f seconds\n",time);
        }
    }
}

