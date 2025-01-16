//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StarPattern {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //  hollowPattern(4,5);
        /*
         *****
         *   *
         *   *
         *****

         */
        //  invertedRotatedHalfPyramid(5);
        System.out.println();
        /*
         *
         **
         ***
         ****
         *****
         */
        //  pyramidPattern(5);
        //  System.out.println();
        /*
         *
         ***
         *****
         *******
         *********
         */
        // invertedHalfPyramidWithNumber(5);
        //  System.out.println();
        //  System.out.println("____");
        //  topRightTriangle(4);
        // System.out.println();
        // floydTriangle(5);
        /*
            1
            2 3
            4 5 6
            7 8 9 10
            11 12 13 14 15
         */
        //   System.out.println();
        //  triangleWith1_0(5);
        /*
            1
            01
            101
            0101
            10101
         */

        //   butterflyPattern(4);
        /*
         *      *
         **    **
         ***  ***
         ********
         ********
         ***  ***
         **    **
         *      *
         */
//System.out.println();

        // rhombusPattern(4);
        /*
         ****
         ****
         ****
         ****
         */
        // hollowRhombusPattern(5);

        //  diamondPattern(4);

        /*
         *
         ***
         *****
         *******
         *******
         *****
         ***
         *

         */
        // topRightTriangle(4);
        // topLeftTriangle(4);
        patterX(5);
    }

    public static void invertedRotatedHalfPyramid(int n) {
        //for lins or row
        for (int i = 1; i <= n; i++) {
            //first print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //now print star
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramidWithNumber(int n) {
        //for lins or row
        for (int i = 1; i <= n; i++) {
            //first print spaces
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void pyramidPattern(int n) {
        //for lines or row
        for (int i = 1; i <= n; i++) {
            //first print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //now print star
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void hollowPattern(int totalRows, int totalColumn) {
        //outer loop for row
        for (int i = 1; i <= totalRows; i++) {
            //inner loop for column and condition
            for (int j = 1; j <= totalColumn; j++) {
                //condition check it is boundary position or not means (for row, 1,4  for column 1,5
                if (i == 1 || i == totalRows || j == 1 || j == totalColumn) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void floydTriangle(int n)
    {
        //taking counter which will increase b y 1 later
        int counter=1;

        //print the number of row
        for(int i=1;i<=n;i++)
        {
            //print the counter then increase, counter will print by row times
            for(int j=1;j<=i;j++)
            {
                System.out.print(counter +" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void triangleWith1_0(int n)
    {//for row
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i-j)%2==0)
                    System.out.print(1);
                else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
    public static void butterflyPattern(int n)
    {
        //first half
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int space=1;space<=2*(n-i);space++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //second half
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int space=1;space<=2*(n-i);space++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void rhombusPattern(int n)
    {
        //for printing row
        for(int i=1;i<=n;i++)
        {
            //now first print space n-i times
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }


    public static void hollowRhombusPattern(int n)
    {
        //for printing row
        for(int i=1;i<=n;i++)
        {
            //now first print space n-i times
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }

            //star print condition
            for(int k=1;k<=n;k++)
            {
                if(i==1||i==n||k==1||k==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void diamondPattern(int n)
    {
        //upper part
        //for lines or row
        for (int i = 1; i <= n; i++) {
            //first print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //now print star
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //now lower part
        for (int i = n; i >=1; i--) {
            //first print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //now print star
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void topRightTriangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i-j>0)
                    System.out.print(" ");
                else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }


    }
    public static void topLeftTriangle(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i+j<=n+1)
                    System.out.print("*");

            }

            System.out.println();
        }


    }

    public static void patterX(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {

                if(i==j || (i+j)==n+1){
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }


}

