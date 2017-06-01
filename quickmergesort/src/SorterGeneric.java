
import java.lang.reflect.Array;

public class SorterGeneric <T extends Comparable> {

private T [] data;

public SorterGeneric() {
	this(null); }

public SorterGeneric(T [] data) {
	this.data = data; }


public void setData(T [] data) {
	this.data = data; }

public void mergesort() {
	mergesort(0, data.length-1); }


@SuppressWarnings({"unchecked"})	// this eliminates 2 warnings
void merge (int f, int m, int l) {

// Allocate temp array of the same type as element[0], meaning type T
// This is required since T [] temp = new T[l-f+1] is illegal code for generics
// Note: L-F+1 is the number of elements from F to L (inclusive)

T [] temp = (T [])Array.newInstance(data[0].getClass(),l-f+1);


int f1=f, l1=m, f2=m+1, l2=l, i=0;

// As long as you have 2 sublists w/ elements continue
// merging in ascending order into the temp array
// Note: One of the lists will run out of elements first
// so we will have elelemtns left over in one of the
// we get the left over elementsd from one of the
// sublists below

while ((f1 <= l1) && (f2 <= l2))

	if (data[f1].compareTo(data[f2]) < 0)
		temp[i++] = data[f1++];
	else
		temp[i++] = data[f2++];


// If we have left over elements in the left
// sublist, add them in

if (f1 <= l1)
	while (f1 <= l1)
		temp[i++] = data[f1++];

// otherwise add the left over right sublist elements
else
	while (f2 <= l2)
		temp[i++] = data[f2++];


// Now copy temp array back into permanent array
i=0;
for (int j=f; j <= l; i++, j++)
  data[j] = temp[i];

}

void mergesort(int f, int l) {
int mid;

if (f < l) {
  mid = (f+l)/2;
  mergesort(f,mid);
  mergesort(mid+1,l);
  merge(f,mid,l); } }


void display() {

System.out.print("[");

for (int i = 0; i < data.length-1; i++)
	System.out.print(data[i] + ",");

System.out.println(data[data.length-1] + "]");

}

} // Sorter
