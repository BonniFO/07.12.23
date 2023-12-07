public class ArrayList
{
    private int[] _array;
    private int _size; //истинная длина массива

    public int Count; //сколько элементов

    public ArrayList()
    {
        _array = new int[10];
        Count = 0;
    }

    public ArrayList(int element)
    {
        _array = new int[10];
        _array[0] = element;
        Count = 1;
    }

    public ArrayList(int[] elements)
    {
        _array = new int[(int) (elements.length * 1.5)];
        System.arraycopy(
                elements,
                0,
                _array,
                0,
                elements.length);
        Count = elements.length;
    }
    public int Get(int index)
    {
        if (index < 0 || index >= Count){
            throw new IndexOutOfBoundsException("Bad index");
        }
        return _array[index];
    }
    public void Add(int element)
    {
        if (Count >= _array.length)
        {
            IncreaseLenght(1);
        }
        _array[Count] = element;
        Count++;


    }

    private void IncreaseLenght (int elementCount)
    {
        int newLenght = (int)((_array.length + elementCount) * 1.5);
        int[] newArray = new int[newLenght];
            System.arraycopy(
                    _array,
                    0,
                    _array,
                    0,
                    _array.length);
            _array = newArray;
        }
    }
