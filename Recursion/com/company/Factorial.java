package com.company;



public class Factorial

{

public static int factormult(int x)

    {


        if (x > 1)
        {
            return x * factormult(x - 1);
        }

        else if (x == 1 )

        {
            return 1;
        }

        else

        {
            return 0;
        }
    }
}
