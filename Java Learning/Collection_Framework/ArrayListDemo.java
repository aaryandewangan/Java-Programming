package Collection_Framework;

import java.util.*;

class ArrayListDemo
    {
        public static void main(String[] args)
        {
            ArrayList<String> test = new ArrayList<String>(4);
            test.add("White");
            test.add("Black");
            test.add("Red");
            test.add("Blue");

            System.out.println("--------COLOUR LIST--------");

            for(int i=0; i<4; i++)
            {
                System.out.println(test.get(i).toString());
            }

            ArrayList<String> sample = new ArrayList<String>(3);
            sample.add("Green");
            sample.add("Pink");
            sample.add("Orange");

            test.addAll(sample);

            System.out.println("New size of Colours are: "+test.size());

            for(int i=0;i<test.size();++i)
            {
                System.out.println(test.get(i).toString());
           }
      
        }
    }