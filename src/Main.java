
public class Main {
    public static void main(String[] args)
    {
        ArrayList arr = new ArrayList(12);
        arr.Add(1);
        arr.Add(1);
        arr.Add(new int[]{1,2,3});
        PrintArr (arr);
    }
    public static void PrintArr (ArrayList array)
    {
        for (int i = 0; i < array.Count; i++)
        {
            System.out.println(array.Get(i));
        }
    }
}