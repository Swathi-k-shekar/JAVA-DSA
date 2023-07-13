package com.company;
// we are using static method,so we can call a function without creating object
// as static methods loaded by the class loader while jvm calls class file
// when we create object it creates space/memory for methods,variables,functions
class Advaced{
    void btrfly(){
        int n=4;
        for(int i=1;i<=n;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + "*" + " ");
            }
            for (int j = 0; j < 2*(n-i); j++) {
                System.out.print(" " + " " + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" " + "*" + " ");
            }
            System.out.println();

        }
        for(int i=n;i>0;i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" " + "*" + " ");
            }
            for (int j = 0; j < 2*(n-i); j++) {
                System.out.print(" " + " " + " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" " + "*" + " ");
            }
            System.out.println();

        }
    }
    void diamond(){
        int n=4;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}


public class pattrens {
    public static void solid_rectangle() {
        int m = 4;
        int n = 5;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void hallow_rectangle() {
        int m = 4;
        int n = 5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == m || j == n || j == 1)
                    System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }

    public static void half_pyramid() {
        int m = 4;
//        int n = 5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" * ");

            }
            System.out.println();
        }
    }

    public static void inv_half_pyramid() {
        int m = 4;
        int n = 5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void inv_half180_pyramid() {
        int m = 4;
        int n = 5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }

    public static void half_pyramid_num() {
        int m = 4;
//        int n = 5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(" " + j + " ");

            }
            System.out.println();
        }
    }

    public static void inv_half_pyramid_num() {
        int m = 4;
        int n = 5;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }

    public static void floydstri() {
        int mi = 4;
        int ni = 1;
        for (int i = 1; i <= mi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + ni + " ");
                ni++;
            }
            System.out.println();
        }
    }
    public static void bintri() {
        int mi = 4;
//        int ni = 1;
        // if sum of i is odd then 1
        // else 0
        for (int i = 1; i <= mi; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==1)
                System.out.print(" " + 0 + " ");
                else
                    System.out.print(" " + 1 + " ");

//                if(ni==1)
//                {
//                    ni--;
//                }
//                else
//                    ni++;
            }
            System.out.println();
        }
    }
    public static void  Rhombs() {
        int mi = 5;
        for (int i = 1; i <= mi; i++) {
            for (int j = 1; j < (mi-i)+1; j++) {
                    System.out.print(" " + " " +" ");
            }
            for (int k = 1; k < mi; k++) {
                System.out.print(" " + "*" +" ");
            }
            System.out.println();
        }
    }

    public static void  trinum() {
        int mi = 5;
        for (int i = 1; i <= mi; i++) {
            for (int j = 1; j < (mi-i)+1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print(" " + i +" ");
            }
            System.out.println();
        }
    }
    public static void  pymnum() {

            int n=6, i, j;
            System.out.print("Enter number of rows : ");
            for(i=1; i<=n; i++)
            {
                for(j=i; j<=n; j++)
                {
                    System.out.print(" ");
                }
                for(j=1; j<=i; j++)
                {
                    System.out.print(j);
                }
                for(j=i-1; j>=1; j--)
                {
                    System.out.print(j);
                }
                System.out.print("\n");

        }
    }


    public static <Advanced> void main(String[] arg){
        System.out.println("SOLID RECTANGLE");
        solid_rectangle();
        System.out.println("HALLOW RECTANGLE");
        hallow_rectangle();
        System.out.println("HALF PYRIMID");
        half_pyramid();
        System.out.println("INVHALF PYRIMID");
        inv_half_pyramid();
        System.out.println("INVHALF PYRIMID 180 ROT");
        inv_half180_pyramid();
        System.out.println("Numberd HALF PYRIMID 180 ROT");
        half_pyramid_num();
        System.out.println("NUMBRED INVHALF PYRIMID");
        inv_half_pyramid_num();
        System.out.println("FLOYD'S TRIANGLE");
        floydstri();
        System.out.println("BINARY NUMBERD FLOYD'S TRIANGLE");
        bintri();
        System.out.println("Rhombus");
        Rhombs();
        System.out.println(" NUMBERD TRIANGLE");
        trinum();
        System.out.println(" PALINDROMIC pyrimid" );
        pymnum();
        Advaced ad=new Advaced();
        System.out.println("Butter fly");
        ad.btrfly();
        System.out.println("DIMOND");
        ad.diamond();

    }
}
