import java.util.*;

class InsertionSortOnList{

    static void isort(List<Integer> arr)
    {
        for(int i = 1; i < arr.size(); i++)
        {   int currValue = arr.get(i);
            int j  = i -1;
            while(j>=0 && arr.get(j) > currValue)
            {
                arr.set(j+1, arr.get(j));
                j--;
            }
            arr.set(j+1, currValue);

        }


    }


    public static void main(String args[])
    {

        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 100; i++)
        {
            arr.add((int)(Math.random()*100));
        }

        System.out.println("Before Sorting" + arr);
        isort(arr);

        System.out.println("After Sorting" + arr);





    }


}