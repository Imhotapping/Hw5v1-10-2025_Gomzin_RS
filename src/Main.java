import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[] {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));

        swapElements(arr,0,2);

        System.out.println(Arrays.toString(arr));



    }
    public static <T> void swapElements(T[] array, int i, int j) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            throw new IndexOutOfBoundsException("Индекс выходит за границы массива");
        }

        if (i == j) {
            return;
        }

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}

