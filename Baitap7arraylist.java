
package baitap7arraylist;
   import java.util.ArrayList;
import java.util.Collections;


public class Baitap7arraylist {

    public static void main(String[] args) {
        // 1. Tạo và Thêm Phần Tử vào ArrayList
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Nam");
        friends.add("Tan");
        friends.add("Tu");
        friends.add("Huyen");
        friends.add("Nhi");
        System.out.println("Danh sach ban be: " + friends);

        // 2. Xóa một phần tử khỏi ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        numbers.remove(Integer.valueOf(5));
        System.out.println("Danh sach sau khi xoa so 5: " + numbers);

        // 3. Duyệt qua ArrayList
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ha Noi");
        cities.add("Da Nang");
        cities.add("Ho Cho Minh");
        cities.add("Hai Phong");
        cities.add("Da Lat");
        System.out.println("Ten cac thanh pho:");
        for (String city : cities) {
            System.out.println(city);
        }

        // 4. Tìm kiếm một phần tử trong ArrayList
        ArrayList<String> keywords = new ArrayList<>();
        keywords.add("Java");
        keywords.add("Python");
        keywords.add("C++");
        keywords.add("JavaScript");
        boolean containsPython = keywords.contains("Python");
        System.out.println("Danh sach co chua 'Python': " + containsPython);

        // 5. Cập nhật một phần tử trong ArrayList
        ArrayList<Integer> numbersToUpdate = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbersToUpdate.add(i);
        }
        numbersToUpdate.set(2, 100); // cập nhật phần tử thứ 3 (index 2) thành 100
        System.out.println("Danh sach sau khi cap nhat phan tu thu 3: " + numbersToUpdate);

        // 6. Sắp xếp ArrayList
        ArrayList<Integer> numbersToSort = new ArrayList<>();
        numbersToSort.add(5);
        numbersToSort.add(3);
        numbersToSort.add(8);
        numbersToSort.add(2);
        numbersToSort.add(4);
        Collections.sort(numbersToSort);
        System.out.println("Danh sach sau khi sap xep: " + numbersToSort);

        // 7. Chuyển đổi ArrayList thành Array
        ArrayList<Integer> arrayListToConvert = new ArrayList<>();
        arrayListToConvert.add(10);
        arrayListToConvert.add(20);
        arrayListToConvert.add(30);
        arrayListToConvert.add(40);
        arrayListToConvert.add(50);
        Integer[] array = new Integer[arrayListToConvert.size()];
        array = arrayListToConvert.toArray(array);
        System.out.println("Mang sau khi chuyen đoi tu ArrayList:");
        for (int num : array) {
            System.out.println(num);
        }
    }
}
 /**
  