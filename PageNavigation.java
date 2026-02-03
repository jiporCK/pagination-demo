package new_features.pagination;

import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PageNavigation {

    static List<Product> productList = new ArrayList<>() {{
        add(new Product(1L, "Laptop Dell XPS 13", 1299.99, 5,
                LocalDateTime.of(2024, 1, 10, 9, 30),
                LocalDateTime.of(2024, 1, 12, 14, 45)));

        add(new Product(2L, "MacBook Air M2", 1199.00, 7,
                LocalDateTime.of(2024, 1, 11, 10, 15),
                LocalDateTime.of(2024, 1, 13, 16, 20)));

        add(new Product(3L, "iPhone 15 Pro", 999.99, 12,
                LocalDateTime.of(2024, 1, 12, 11, 0),
                LocalDateTime.of(2024, 1, 14, 18, 10)));

        add(new Product(4L, "Samsung Galaxy S24", 899.99, 10,
                LocalDateTime.of(2024, 1, 13, 8, 45),
                LocalDateTime.of(2024, 1, 15, 9, 30)));

        add(new Product(5L, "iPad Pro 11\"", 799.00, 6,
                LocalDateTime.of(2024, 1, 14, 14, 20),
                LocalDateTime.of(2024, 1, 16, 17, 5)));

        add(new Product(6L, "Apple Watch Series 9", 399.99, 15,
                LocalDateTime.of(2024, 1, 15, 9, 10),
                LocalDateTime.of(2024, 1, 17, 11, 40)));

        add(new Product(7L, "AirPods Pro 2", 249.99, 20,
                LocalDateTime.of(2024, 1, 16, 10, 50),
                LocalDateTime.of(2024, 1, 18, 13, 25)));

        add(new Product(8L, "Sony WH-1000XM5", 349.99, 8,
                LocalDateTime.of(2024, 1, 17, 15, 35),
                LocalDateTime.of(2024, 1, 19, 16, 45)));

        add(new Product(9L, "Logitech MX Master 3S", 99.99, 25,
                LocalDateTime.of(2024, 1, 18, 12, 0),
                LocalDateTime.of(2024, 1, 20, 14, 10)));

        add(new Product(10L, "Mechanical Keyboard Keychron", 89.99, 18,
                LocalDateTime.of(2024, 1, 19, 11, 25),
                LocalDateTime.of(2024, 1, 21, 10, 55)));

        add(new Product(11L, "27\" 4K Monitor LG", 499.99, 9,
                LocalDateTime.of(2024, 1, 20, 13, 40),
                LocalDateTime.of(2024, 1, 22, 15, 20)));

        add(new Product(12L, "USB-C Docking Station", 159.99, 14,
                LocalDateTime.of(2024, 1, 21, 9, 0),
                LocalDateTime.of(2024, 1, 23, 11, 10)));

        add(new Product(13L, "External SSD 1TB", 129.99, 30,
                LocalDateTime.of(2024, 1, 22, 14, 15),
                LocalDateTime.of(2024, 1, 24, 16, 45)));

        add(new Product(14L, "Gaming Mouse Razer Viper", 79.99, 22,
                LocalDateTime.of(2024, 1, 23, 10, 10),
                LocalDateTime.of(2024, 1, 25, 12, 30)));

        add(new Product(15L, "Webcam Logitech Brio", 199.99, 11,
                LocalDateTime.of(2024, 1, 24, 15, 0),
                LocalDateTime.of(2024, 1, 26, 17, 50)));

        add(new Product(16L, "Office Chair Ergonomic", 299.99, 4,
                LocalDateTime.of(2024, 1, 25, 8, 45),
                LocalDateTime.of(2024, 1, 27, 9, 20)));

        add(new Product(17L, "Standing Desk", 499.00, 3,
                LocalDateTime.of(2024, 1, 26, 11, 30),
                LocalDateTime.of(2024, 1, 28, 13, 10)));

        add(new Product(18L, "Desk Lamp LED", 39.99, 40,
                LocalDateTime.of(2024, 1, 27, 14, 40),
                LocalDateTime.of(2024, 1, 29, 16, 0)));

        add(new Product(19L, "Power Bank 20000mAh", 59.99, 28,
                LocalDateTime.of(2024, 1, 28, 9, 15),
                LocalDateTime.of(2024, 1, 30, 11, 45)));

        add(new Product(20L, "Wireless Charger", 29.99, 35,
                LocalDateTime.of(2024, 1, 29, 10, 5),
                LocalDateTime.of(2024, 1, 31, 12, 30)));

        add(new Product(21L, "Bluetooth Speaker JBL", 149.99, 16,
                LocalDateTime.of(2024, 2, 1, 13, 20),
                LocalDateTime.of(2024, 2, 3, 15, 10)));

        add(new Product(22L, "Smart Home Camera", 89.99, 19,
                LocalDateTime.of(2024, 2, 2, 9, 45),
                LocalDateTime.of(2024, 2, 4, 11, 55)));

        add(new Product(23L, "WiFi Router AX3000", 129.99, 10,
                LocalDateTime.of(2024, 2, 3, 14, 30),
                LocalDateTime.of(2024, 2, 5, 16, 40)));

        add(new Product(24L, "NAS Storage 4TB", 399.99, 5,
                LocalDateTime.of(2024, 2, 4, 10, 10),
                LocalDateTime.of(2024, 2, 6, 12, 0)));

        add(new Product(25L, "HDMI Cable 2.1", 19.99, 50,
                LocalDateTime.of(2024, 2, 5, 8, 20),
                LocalDateTime.of(2024, 2, 7, 9, 45)));

        add(new Product(26L, "USB Flash Drive 128GB", 24.99, 45,
                LocalDateTime.of(2024, 2, 6, 11, 0),
                LocalDateTime.of(2024, 2, 8, 13, 30)));

        add(new Product(27L, "Printer LaserJet", 279.99, 6,
                LocalDateTime.of(2024, 2, 7, 15, 10),
                LocalDateTime.of(2024, 2, 9, 17, 25)));

        add(new Product(28L, "Scanner Document", 199.99, 7,
                LocalDateTime.of(2024, 2, 8, 9, 40),
                LocalDateTime.of(2024, 2, 10, 11, 15)));

        add(new Product(29L, "Projector Full HD", 549.99, 3,
                LocalDateTime.of(2024, 2, 9, 14, 50),
                LocalDateTime.of(2024, 2, 11, 16, 35)));

        add(new Product(30L, "UPS Backup Power", 229.99, 8,
                LocalDateTime.of(2024, 2, 10, 10, 25),
                LocalDateTime.of(2024, 2, 12, 12, 45)));
        add(new Product(30L, "UPS Backup Power", 229.99, 8,
                LocalDateTime.of(2024, 2, 10, 10, 25),
                LocalDateTime.of(2024, 2, 12, 12, 45)));

    }};

    static int pageNumber = 1;
    static int pageSize = 8;
    static int totalPages = (productList.size() + pageSize - 1) / pageSize;
    static int offset = (pageNumber - 1) * pageSize;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                1. Show Data
                2. Set up page size
                3. Next page
                4. Previous page
                5. Go to page
                0. Exit""");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            if (option == 0) {
                System.out.println("Exiting...");
                System.exit(0);
            }

            switch (option) {
                case 1 -> {
                    showProductList(productList, offset, pageSize);
                }
                case 2 -> {
                    System.out.print("Enter new page size: ");
                    pageSize = scanner.nextInt();
                }
                case 3 -> {
                    updatePageNumber(pageNumber + 1);
                    showProductList(productList, offset, pageSize);
                }
                case 4 -> {
                    updatePageNumber(pageNumber - 1);
                    showProductList(productList, offset, pageSize);
                }
                case 5 -> {}
                default -> System.out.println("Invalid option!");
            }

        }



    }

    public static void updatePageNumber(int pageNum) {
        if (pageNum < 1) {
            pageNumber = 1;
            return;
        }
        if (pageNum > totalPages) {
            pageNumber = totalPages;
            return;
        }
        pageNumber = pageNum;
        offset = (pageNumber - 1) * pageSize;
    }

    public static void showProductList(List<Product> products, int offset, int limit) {
        Table table = new Table(
                6, BorderStyle.CLASSIC
        );
        table.addCell(" ID ");
        table.addCell(" Name ");
        table.addCell(" Price ");
        table.addCell(" Qty ");
        table.addCell(" Created At ");
        table.addCell(" Updated At ");

        products
                .stream()
                .skip(offset)
                .limit(limit)
                .forEach(product -> {
            table.addCell(product.getId().toString());
            table.addCell(product.getName());
            table.addCell(product.getPrice().toString());
            table.addCell(product.getQty().toString());
            table.addCell(product.getCreatedAt().toString());
            table.addCell(product.getUpdatedAt().toString());
        });

        System.out.println(table.render());
        System.out.println("Page " + pageNumber + " of " + totalPages);
    }

}
