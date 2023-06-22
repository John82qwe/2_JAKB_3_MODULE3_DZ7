import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Phone> phoneList = new ArrayList<>();
        phoneList.add(new Phone("Apple", "Iphone 14", 125000));
        phoneList.add(new Phone("Apple", "Iphone 11", 105000));
        phoneList.add(new Phone("Apple", "Iphone X", 55000));
        phoneList.add(new Phone("Samsung", "Samsung Galaxy S23 Ultra", 125000));
        phoneList.add(new Phone("Samsung", "Samsung Galaxy S21 Ultra", 85000));
        phoneList.add(new Phone("Google", "Google Pixel 7 Pro", 70000));
        phoneList.add(new Phone("Google", "Google Pixel 6a", 40000));
        phoneList.add(new Phone("OnePlus", "OnePlus 9 pro", 50000));
        phoneList.add(new Phone("Nokia", "Nokia 3310", 1));


        ArrayList<Phone> GoogleList = phoneList.stream()
                .filter(o -> o.name.equals("Google"))
                .collect(() -> new ArrayList<Phone>(), (list, item) -> list.add(item), (list1, list2)
                        -> list1.addAll(list2));

        phoneList.stream().sorted().forEach(System.out::println);
        System.out.println("First task result: ");
        System.out.println(GoogleList);

    }
}