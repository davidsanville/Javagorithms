//Split an array of Size N at position k,
//Reverse the order of both subarrays keeping k constant
//For example with k = 3, [1,2,3,4,5,6,7]
//Result is [3,2,1,4,7,6,5]


public class splitflip {
  public static void main(String args[]) {
    int[] original1= {1,2,3,4,5,6,7};
    int[] original2 = {0,1,2,3,4,5,6,7};

    splitflip(original1,3);
    splitflip(original2,3);

  }

  public static void splitflip(int[] input, int pos) {
    //create two substrings
    int sz = 8;
    int result[] = new int [sz];

    int[] subarray1;
    subarray1 = new int [sz];
    int[] subarray2;
    subarray2 = new int [sz];

    int middle_val = input[pos];
    int real_sz1 = 0;
    int real_sz2 =0 ;

    //copy first subarray1
    for(int i =0; i<pos; i++) {
      subarray1[i] = input[i];
      real_sz1 = i+1;
    }

    //copy second subarray2
    for(int i =pos+1; i<input.length; i++) {
      subarray2[i] = input[i];
      real_sz2 = i -(pos +1)+1;
    }

    //display subarray1
    System.out.println("subarray1 is ");
    for(int i = 0; i<subarray1.length; i++) {
      System.out.println(subarray1[i]);
    }

    //display second subarray
    System.out.println("subarray2 is ");
    for(int i = 0; i<subarray2.length; i++) {
      System.out.println(subarray2[i]);
    }

    //for each substring, swap 1 with N-1, 2 with N-2, etc

    //array size is 8, but only a few non-zero positions.
    for(int i = 0; i< real_sz1; i++) {
      //swap(1st, last) moving inward
      int temp = subarray1[subarray1.length-1-i];
      subarray1[subarray1.length-1-i] = subarray1[i];
      subarray1[i] = temp;
    }

    //flip subarray2
    for(int i = 0; i< real_sz2; i++) {
      //swap(1st, last) moving inward
      int temp = subarray2[subarray2.length-1-i];
      subarray2[subarray2.length-1-i] = subarray2[i];
      subarray2[i] = temp;
    }

    //System.out.println("Real sz1 is " + real_sz1);

    //display first flipped subarray
    System.out.println("flipped subarray1 is ");
    for(int i = 0; i<subarray1.length; i++) {
      System.out.println(subarray1[i]);
    }

    //display first flipped subarray2
    System.out.println("flipped subarray2 is ");
    for(int i = 0; i<subarray2.length; i++) {
      System.out.println(subarray2[i]);
    }

    System.out.println("middle val is " + middle_val);

    //recombine flipped_subarray1, middle, flipped_subarry2

    //append first flipped subarray1 to result
    for(int i=0; i<real_sz1; i++){
      result[i] = subarray1[subarray1.length-i-1];
    }

    result[pos] = middle_val; //append rotated position

    //append second flipped subarray2
    for(int i =pos+1; i< pos+1 +real_sz2; i++) {
      result[i] = subarray2[i-(pos+1)];
    }

    //result = subarray1 + middle_val + subarray2;

    //display result
    for (int i =0; i<result.length; i++) {
      System.out.println(result[i]);
    }


    //return
  }
}
