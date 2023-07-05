package lessons.array;

public class Array {
    public static void work() {
        // #1
        /* Instantiation of an Array in Java */
        /* arrayRefVar=new datatype[size]; */
        int arr[] = new int[5]; // declaration and instantiation // объявление и создание экземпляра

        arr[0]=10; // initialization
        arr[1]=20;
        arr[2]=70;
        arr[3]=40;
        arr[4]=50;

        for(int i=0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // #2
        String arr_2[] = { "Hello", "World" };

        for(int i=0; i < arr_2.length; i++) {
            System.out.println(arr_2[i]);
        }

        // #3
        Object[] mixedArray = new Object[3];
        mixedArray[0] = "Wow";
        mixedArray[1] = 42;
        mixedArray[2] = true;

        for (int i = 0; i < mixedArray.length; i++) {
            System.out.println(mixedArray[i]);
        }
    }
}

