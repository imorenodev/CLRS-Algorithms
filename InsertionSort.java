public class InsertionSort {
  public static void main(String[] args) {
    int[] array = {5,2,4,6,1,3};
    int i = 0,
        j = 0,
        key = 0;

    // print unsorted array
    printArray(array);

    for (j = 0; j < array.length; j++) {
      key = array[j]; 
      i = j-1; 
      while (i >= 0 && array[i] > key) {
        array[i+1] = array[i];
        i--;
      }
      array[i+1] = key;
    }
    
    //print sorted array
    printArray(array);
  }

  public static void printArray(int[] array) {
    int i = 0;
    for (i = 0; i < array.length; i++) {
      if (i == array.length-1) {
        System.out.print(array[i] + "\n");
      } else {
        System.out.print(array[i] + ", ");
      }
    }
  }
}
