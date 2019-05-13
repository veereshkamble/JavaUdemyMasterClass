package com.veereshkamble;

public class LargestPrime {

    public static int getLargestPrime (int number)
    {
        if (number > 1)
        {
            int largestPrime = number;

            for (int i = (number / 2); i > 1; i--)
            {
                if (largestPrime % i == 0)
                {
                    largestPrime = i;
                }
            }

            return (largestPrime);
        }
        else
        {
            return (-1);
        }
    }
}
