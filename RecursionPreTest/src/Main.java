
public class Main {
    public static void main(String[] args) {
      int [] array = { 1, 4, 16, 256 };
	System.out.println("funny = " + funny(array, array.length-1));

	int [] array2 = { 4, 6, 8, 12, 16 };
	int halfTotal = halfSum(array2, array2.length-1);

	System.out.println("Half the Sum of the Elements = " + halfTotal);


}


public static int funny(int [] a, int i)
{
	if (i == 0)
		return a[0];
	else
		return a[i] / funny(a, i-1);
}


public static int halfSum(int [] a, int i)
{
	if (i == 0)
		return a[0] / 2;
	else
            return a[i-1]/2;
// TODO: Recursive Case
}

}



    


