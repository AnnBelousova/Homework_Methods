import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year = readYear();
        defineLeapYear(year);

        int clientOs = readOsType();
        int clientDeviceYear = LocalDate.now().getYear();
        suggestToSetUpVersion(clientOs, clientDeviceYear);

        int deliveryDistance = readDeliveryDistance();
        System.out.printf("The %d days it needs to delivery.\n",
                defineDaysQuantity(deliveryDistance));
    }

    public static int readYear() {
        System.out.println("Task1: \nEnter the year:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        return year;
    }

    public static int readOsType() {
        System.out.println("\nTask2:\nIf your OS is iOS enter 1, if Android - 0");
        Scanner scanner = new Scanner(System.in);
        int osType = scanner.nextInt();
        return osType;
    }

    public static int readDeliveryDistance() {
        System.out.println("\nTask3:\nEnter the delivery distance");
        Scanner scanner = new Scanner(System.in);
        int osType = scanner.nextInt();
        return osType;
    }

    public static void defineLeapYear(int year) {
        String answer = "";
        if (year % 4 == 0 && year % 400 == 0) {
            answer = " is leap";
        } else if (year % 4 == 0 && year % 100 != 0) {
            answer = " is leap";
        } else {
            answer = " is not leap";
        }
        System.out.println("The " + year + answer + " year");
    }

    public static void suggestToSetUpVersion(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Set up the iOS version by using reference.");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Set up the Android version by using reference.");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Set up the lite version for iOS by using reference.");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Set up the lite version for Android by using reference.");
        }
    }

    public static int defineDaysQuantity(int deliveryDistance) {
        int days;
        if (deliveryDistance < 20) {
            days = 1;
        } else {
            days = (((deliveryDistance - 20) / 40) + 2);
        }
        return days;
    }
}
