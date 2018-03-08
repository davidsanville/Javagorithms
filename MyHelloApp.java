

class MyHelloApp {
    public static void main(String[] args) {

        System.out.println("Hello World!"); // Display the string.
        int2bin(1);
        int2bin(2);
        int2bin(3);
        int2bin(8);
    }

    public static void int2bin(int N) {
      int rem = N;
      int fix = 8;
      char[] result = new char[fix];

      int c = 0;

      System.out.println("N is " + N);

      while( rem >0 ) {



        if(rem %2 == 0) {
          result[c] = '0';
        }

        else if (rem %2 == 1)
          result[c] = '1';

        rem = rem /2;
        c++;

      }
      /*
      while( rem>0 ) {
        if( Math.ceil(rem % 2) == 1) {
          result[c] = '1';;
        }
        else {
          result[c] = '0';
        };

        rem = rem / 2;
        c++;
      }
      */

      for(int j = result.length-1; j>=0; j--) {
        //if( result[j] != '') {System.out.println(result[j] + " "); }
        System.out.println(result[j]);
      }

    }
}
