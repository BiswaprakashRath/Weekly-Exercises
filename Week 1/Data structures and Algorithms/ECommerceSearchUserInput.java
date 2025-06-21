import java.util.*;

// Class to store product details
class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}

public class ECommerceSearchUserInput {

    // Linear search by product name
    public static Product linearSearchByName(Product[] products, String name) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // Binary search by product ID (make sure products are sorted by ID)
    public static Product binarySearchById(Product[] products, int id) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == id) {
                return products[mid];
            } else if (products[mid].productId < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of products from user
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Product[] products = new Product[n];

        // Take product details from user
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1) + ":");

            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Category: ");
            String category = sc.nextLine();

            products[i] = new Product(id, name, category);
        }

        // Linear search by name
        System.out.print("\nEnter product name to search (linear search): ");
        String nameSearch = sc.nextLine();

        Product resultByName = linearSearchByName(products, nameSearch);
        if (resultByName != null) {
            System.out.println("Found: " + resultByName.productName + " | Category: " + resultByName.category);
        } else {
            System.out.println("Product with name '" + nameSearch + "' not found.");
        }

        // Sort by product ID for binary search
        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        // Binary search by ID
        System.out.print("\nEnter product ID to search (binary search): ");
        int idSearch = sc.nextInt();

        Product resultById = binarySearchById(products, idSearch);
        if (resultById != null) {
            System.out.println("Found: " + resultById.productName + " | Category: " + resultById.category);
        } else {
            System.out.println("Product with ID " + idSearch + " not found.");
        }

        sc.close();
    }
}
