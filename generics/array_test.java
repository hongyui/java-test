class Array{
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class array_test {
    public static void main(String[] args) {
        Array array = new Array();
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Hello", "World"};
        array.printArray(intArray);
        array.printArray(stringArray);
    }
}
