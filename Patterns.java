package patterns;

public class Patterns {

    void pattern4(int n) {

        // *
        // ***
        // ***** approch will be [space,start,space]
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // start
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void pattern5(int n) {
        // *********
        // *******
        // *****
        // ***
        // *
        for (int i = 1; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // start
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    void pattern7(int n) {
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 0; i <= 2 * n - 1; i++) {
            int star = i;
            if (star > n)
                star = 2 * n - i;
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern8(int n) {
        // 1 1
        // 12 21
        // 123 321
        // 1234 4321
        // 1234554321
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // space
            for (int j = 1; j < space; j++) {
                System.out.print(" ");
            }
            space -= 2;
            // reverse numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void pattern9(int n) {
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    void pattern10(int n) {
        // A
        // AB
        // ABC
        // ABCD
        // ABCDE
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    void pattern11(int n) {

        // ABCDE
        // ABCD
        // ABC
        // AB
        // A
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    void pattern12(int n) {
        // A
        // BB
        // CCC
        // DDDD
        // EEEEE
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    void pattern13(int n) {
        // E
        // DE
        // CDE
        // BCDE
        // ABCDE
        for (int i = 0; i < n; i++) {

            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);

            }
            System.out.println();
        }
    }

    void pattern14(int n) {
        // **********
        // **** ****
        // *** ***
        // ** **
        // * *
        for (int i = 0; i < n; i++) {
            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern15(int n) {
// *        *
// **      **
// ***    ***
// ****  ****
// **********
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= (2 * n) - (2 * i); j++) {
                System.out.print(" ");
            }
            // stars

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern16(int n){
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *
        //rows
        int space=2*n-2;
        for(int i=1;i<=2*n-1;i++){
            //stars
            int star=i;
            if(i>n) star=2*n-i;
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
            if(i<n) space-=2; 
            else space+=2;
        }
    }
void pattern17(int n){
// *****
// *   *
// *   *
// *   *
// *****
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(i==0 || j==0 || i==n-1 || j==n-1){
                System.out.print("*");
            }
            else System.out.print(" ");
        }
        System.out.println();
    }
}
void pattern18(int n){
// 555555555
// 544444445
// 543333345
// 543222345
// 543212345
// 543222345
// 543333345
// 544444445
// 555555555
    for(int i=0;i<2*n-1;i++){
        for(int j=0;j<2*n-1;j++){
            int top =i;
            int left=j;
            int right=(2*n-2)-j;
            int down=(2*n-2)-i;
            int num=Math.min(Math.min(right, down),Math.min(top, left));
            System.out.print(n-num);
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        Patterns obj = new Patterns();
        obj.pattern18(5);
        
    }
}