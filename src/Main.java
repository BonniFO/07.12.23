
public class Main {
    public static void main(String[] args)
    {
        ArrayList arr = new ArrayList(12);
        arr.Add(1);
        arr.Add(1);
        arr.Add(1);
        arr.Add(1);
        arr.Add(1);
        arr.Add(1);

        for (int i = 0; i < arr.Count; i++)
        {
            System.out.println(arr.Get(i));
        }

    }
}