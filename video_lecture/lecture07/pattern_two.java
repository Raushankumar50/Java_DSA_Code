import java.util.Scanner;

class pattern_two {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     */
    // for(int i=1;i<=5;i++){
    //   for(int j=1;j<=i;j++){
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    /*
     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
     */
    // for(int i=1;i<=5;i++){
    //   for(int j=1;j<=i;j++){
    //     System.out.print(j+" ");
    //   }
    //   System.out.println();
    // }

    /*
     1
     2 2
     3 3 3
     4 4 4 4
     5 5 5 5 5
     */
    // for(int i=1;i<=5;i++){
    //   for(int j=1;j<=i;j++){
    //     System.out.print(i+" ");
    //   }
    //   System.out.println();
    // }

    /*
     1
     2 1
     3 2 1
     4 3 2 1
     5 4 3 2 1
     */
    // for(int i=1;i<=5;i++){
    //   for(int j=i;j>=1;j--){
    //     System.out.print(j+" ");
    //   }
    //   System.out.println();
    // }

    /*
     a
     b b
     c c c
     d d d d
     e e e e e
     */
    // for(int i=1;i<=5;i++){
    //   char ch =(char)('a'+i-1);
    //   for(int j=1;j<=i;j++){
    //     System.out.print(ch+" ");
    //   }
    //   System.out.println();
    // }

    /*
     * * * * *
     * * * *
     * * *
     * *
     * 
     */
    // for(int i=1;i<=5;i++){
    //   for(int j=1;j<=5-i+1;j++){
    //     System.out.print("* ");
    //   }
    //   System.out.println();
    // }

    /*
     1 2 3 4 5
     1 2 3 4
     1 2 3
     1 2
     1
     */
    // for(int i=1;i<=5;i++){
    //   for(int j=1;j<=5-i+1;j++){
    //     System.out.print(j+" ");
    //   }
    //   System.out.println();
    // }

    /*
     5
     5 4
     5 4 3
     5 4 3 2
     5 4 3 2 1
     */
    for(int i=1;i<=5;i++){
      for(int j=5;j>=5-i+1;j--){
        System.out.print(j+" ");
      }
      System.out.println();
    }

    sc.close();
  }
}