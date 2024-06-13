import ra.run.BookManagement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_WHITE = "\u001B[37m";


        do {
            // In menu với màu chữ và khung khác nhau
            System.out.println(ANSI_BLUE + "╔══════════════════════════════════════════════════════════════════════════╗" + ANSI_RESET);
            System.out.println(ANSI_CYAN + "        ****************JAVA-HACKATHON-05-BASIC-MENU***************        " + ANSI_RESET);
            System.out.println(ANSI_BLUE + "╠══════════════════════════════════════════════════════════════════════════╣" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "║ 1. Nhập số lượng sách thêm mới và nhập thông tin cho từng cuốn           ║" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "║ 2. Hiển thị thông tin tất cả sách trong thư viện                         ║" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "║ 3. Sắp xếp sách theo lợi nhuận tăng dần                                  ║" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "║ 4. Xóa sách theo mã sách.                                                ║" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "║ 5. Tìm kiếm tương đối sách theo tên sách hoặc mô tả.                     ║" + ANSI_RESET);
            System.out.println(ANSI_YELLOW + "║ 6. Thay đổi thông tin sách theo mã sách.                                 ║" + ANSI_RESET);
            System.out.println(ANSI_RED + "║ 7. Thoát.                                                                ║" + ANSI_RESET);
            System.out.println(ANSI_BLUE + "╚══════════════════════════════════════════════════════════════════════════╝" + ANSI_RESET);
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    BookManagement.addBooks(scanner);
                    break;
                case 2:
                    BookManagement.displayAllBooks();
                    break;
                case 3:
                    BookManagement.sortBooksByInterest();
                    break;
                case 4:
                    BookManagement.deleteBookById(scanner);
                    break;
                case 5:
                    BookManagement.searchBooks(scanner);
                    break;
                case 6:
                    BookManagement.updateBookById(scanner);
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 7);
    }
}
