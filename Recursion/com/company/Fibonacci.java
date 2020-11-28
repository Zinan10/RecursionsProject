package com.company;


public class Fibonacci

{
    public static int fRecursion(int x)

    {


        if(x <= 1  )

        {
            return x;
        }

        else

            return fRecursion(x - 1 ) + fRecursion (x- 2);
    }
}
