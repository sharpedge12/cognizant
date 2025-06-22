public class SearchAnalysis {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(202, "Shirt", "Clothing"),
            new Product(303, "Book", "Education"),
            new Product(404, "Phone", "Electronics"),
            new Product(505, "Shoes", "Footwear")
        };

        int targetId = 404;

        // Linear Search
        long startLinear = System.nanoTime();
        Product resultLinear = LinearSearch.search(products, targetId);
        long endLinear = System.nanoTime();

        System.out.println("Linear Search Result: " + resultLinear);
        System.out.println("Time taken (ns): " + (endLinear - startLinear));

        // Binary Search
        long startBinary = System.nanoTime();
        Product resultBinary = BinarySearch.search(products, targetId);
        long endBinary = System.nanoTime();

        System.out.println("Binary Search Result: " + resultBinary);
        System.out.println("Time taken (ns): " + (endBinary - startBinary));
    }
}
