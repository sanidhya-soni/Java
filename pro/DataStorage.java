package pro;

public class DataStorage
{
    int day, size;
    DataStorage(String data)
    {
        this.day = Integer.parseInt(data.substring(0, 1)) - 1;
        this.size = Integer.parseInt(data.substring(2, 3)) - 1;
    }
}
