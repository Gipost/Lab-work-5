package com.edu.spisks;

public class ListUtils
{
    public static ListElement insert(ListElement first, int value) {
            ListElement x = new ListElement(value);
            x.setNext(first);
            return x;
        }


    public static ListElement filter(ListElement first)
    {
         ListElement p = null;
         while (first != null)
         {
             if (first.getValue()%2 != 0) p = insert(p, first.getValue());
             first = first.getNext();
         }
         return p;
    }
    public static ListElement map(ListElement first)
    {
         ListElement p = null;
         while (first != null)
         {
             int value = first.getValue();
             p = insert(p, value*value);
             first = first.getNext();
         }
         return p;
    }
    public static void reduce(ListElement first, int res)
    {
         if (first != null)
         {
             if (first.getValue() % 3 == 0) {
                 res *= first.getValue();
             }
             first = first.getNext();
             reduce(first, res);
         }
         else
             {
                System.out.print("Result = ");
                System.out.print(res);
             }
    }

}