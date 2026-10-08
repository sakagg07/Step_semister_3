package classes3.classes_problems;

import java.time.LocalDate;

abstract class LibraryItem {
    String title;
    LocalDate currentDate;

    LibraryItem(String title, LocalDate currentDate) {
        this.title = title;
        this.currentDate = currentDate;
    }

    abstract int getDays();

    LocalDate getDueDate() {
        return currentDate.plusDays(getDays());
    }
}

class Book extends LibraryItem {
    Book(String title, LocalDate currentDate) {
        super(title, currentDate);
    }

    int getDays() {
        return 14;
    }
}

class DVD extends LibraryItem {
    DVD(String title, LocalDate currentDate) {
        super(title, currentDate);
    }

    int getDays() {
        return 7;
    }
}

class Magazine extends LibraryItem {
    Magazine(String title, LocalDate currentDate) {
        super(title, currentDate);
    }

    int getDays() {
        return 3;
    }
}

public class LibraryDueDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.of(2023, 10, 26);

        LibraryItem[] items = {
                new Book("1984", currentDate),
                new DVD("The Matrix", currentDate),
                new Magazine("Forbes Issue 500", currentDate)
        };

        for (LibraryItem item : items) {
            System.out.println(item.title + ": " + item.getDueDate());
        }
    }
}
