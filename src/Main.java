public class Main {

    public static void printLeapYearCheck(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void printInfoAboutDevice(int osName, int releaseYear) {

        int testYear = 2015;

        switch (osName) {
            case 0:
                if (releaseYear > testYear) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }

                break;
            case 1:
                if (releaseYear > testYear) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Данный тип ОС не поддерживается");
                break;
        }
    }

    public static void printDeliveryTime(int deliveryDistance) {

        int deliveryTime = 0;

        if (deliveryDistance > 100) {
            System.out.println("доставки нет");
            return;

        } else if (deliveryDistance > 0) {
            deliveryTime += 1;
            if (deliveryDistance > 20) {
                deliveryTime += 1;
                if (deliveryDistance > 60) {
                    deliveryTime += 1;
                }
            }
        }

        System.out.println("Потребуется дней - " + deliveryTime);
    }

    public static void main(String[] args) {

        System.out.println("Задание 1");
        printLeapYearCheck(2000);

        System.out.println("Задание 2");
        printInfoAboutDevice(0, 2016);

        System.out.println("Задание 3");
        printDeliveryTime(95);
    }
}