package com.company;

public class headAndTailRecursion
{
    public static int tail(int x)
{
    if(x == 0)
        return 0;
    else
    System.out.println(x);

    return (tail(x-1));

}
    public static int head(int x)
    {
        if(x == 0)
            return 0;
        else
            System.out.println(x);
       return head(x - 1);



    }

}
