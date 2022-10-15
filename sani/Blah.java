package sani;

import java.util.Stack;

public class Blah
{
    public static void main(String[] args)
    {
        String s = "\0";
        System.out.println(s);
    }
}

//public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
//
//    int a_index = 0;
//    int b_index = 0;
//    int count = 0;
//    int sum = 0;
//
//    while (b_index < b.size() && sum + b.get(b_index) <= maxSum)
//    {
//        sum += b.get(b_index);
//        b_index++;
//    }
//    count = b_index;
//    b_index--;
//
//    while (a_index < a.size() && b_index < b.size())
//    {
//        sum += a.get(a_index);
//        if (sum > maxSum)
//        {
//            while (b_index >= 0)
//            {
//                sum -= b.get(b_index);
//                b_index--;
//                if (sum <= maxSum)
//                    break;
//            }
//            if (sum > maxSum && b_index < 0)
//            {
//                a_index--;
//                break;
//            }
//        }
//        count = Math.max(a_index + b_index + 2, count);
//        a_index++;
//    }
//
//    return count;
//}
