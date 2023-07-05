import com.vehicle.Car;
import java.util.Scanner;

public class Main {
    public static void main(String[] var0) {
        System.out.println("Hello world");

        Car lada = new Car(4);
        lada.echo();

        int[] arr = new int[3];
        arr[0] = 100;

        System.out.println(arr[0]);

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        System.out.println(str);
    }
}
