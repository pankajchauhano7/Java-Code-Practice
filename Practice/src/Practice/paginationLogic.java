package Practice;

import java.util.*;

public class paginationLogic {
	public static void main(String[] args) {
        // Sample data (can be fetched from DB in real case)
        List<String> items = new ArrayList<>();
        for (int i = 1; i <= 53; i++) {
            items.add("Item " + i);
        }

        // Pagination variables
        int pageSize = 10; // items per page
        int currentPage = 3; // change this to test different pages

        // Calculate total pages
        int totalItems = items.size();
        int totalPages = (int) Math.ceil((double) totalItems / pageSize);

        // Validate current page
        if (currentPage > totalPages || currentPage < 1) {
            System.out.println("Invalid page number.");
            return;
        }

        // Calculate start and end index for sublist
        int startIndex = (currentPage - 1) * pageSize;
        int endIndex = Math.min(startIndex + pageSize, totalItems);

        // Get the page data
        List<String> pageItems = items.subList(startIndex, endIndex);

        // Display results
        System.out.println("Showing page " + currentPage + " of " + totalPages);
        for (String item : pageItems) {
            System.out.println(item);
        }
    }

}
