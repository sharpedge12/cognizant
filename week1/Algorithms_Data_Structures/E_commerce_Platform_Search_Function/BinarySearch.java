import java.util.Arrays;

public class BinarySearch {
    public static Product search(Product[] products, int productId) {
        Arrays.sort(products); // Ensure the array is sorted before binary search

        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == productId) {
                return products[mid];
            } else if (products[mid].productId < productId) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}
