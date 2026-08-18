import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("=============================");
            System.out.println("\n===== دفترچه مخاطبین =====");
            System.out.println(" افزودن مخاطب . 1");
            System.out.println("افزودن شماره به مخاطب . 2 ");
            System.out.println(" حذف مخاطب . 3");
            System.out.println(" نمایش همه . 4");
            System.out.println(" خروج. 0");
            System.out.print("انتخاب کنید: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("نام مخاطب: ");
                    String name = scanner.nextLine();
                    if (phoneBook.createContact(name))
                        System.out.println("مخاطب ساخته شد.");
                    else
                        System.out.println("ظرفیت پر است!");
                    break;
                case 2:
                    phoneBook.displayAll();
                    if (phoneBook.getCount() == 0) break;
                    System.out.print("ایندکس مخاطب را وارد کنید: ");
                    int idx = scanner.nextInt();
                    scanner.nextLine();
                    Contact c = phoneBook.getContact(idx);
                    if (c != null) {
                        System.out.print("شماره موبایل: ");
                        String num = scanner.nextLine();
                        if (c.addMobile(num))
                            System.out.println("شماره اضافه شد.");
                        else
                            System.out.println("حداکثر ۵ شماره مجاز است.");
                    } else {
                        System.out.println("مخاطب یافت نشد.");
                    }
                    break;
                case 3:
                    phoneBook.displayAll();
                    if (phoneBook.getCount() == 0) break;
                    System.out.print("ایندکس برای حذف: ");
                    int delIdx = scanner.nextInt();
                    if (phoneBook.deleteContact(delIdx))
                        System.out.println("حذف شد.");
                    else
                        System.out.println("خطا در حذف!");
                    break;
                case 4:
                    phoneBook.displayAll();
                    break;
                case 0:
                    System.out.println("خداحافظ!:)");
                    scanner.close();
                    return;
                default:
                    System.out.println("انتخاب نامعتبر.");
            }

        }
    }
}
