import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;
import java.io.BufferedWriter;

public class Main2 {

    public static void main(String[] args) {
        String code;
        String title;
        String author;
        float price;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sách: " );
        code = scanner.nextLine();
        System.out.println("Nhập tiêu đề: " );
        title = scanner.nextLine();
        System.out.println("Nhập tên tác giả: " );
        author = scanner.nextLine();
        System.out.println("Nhập  giá: " );
        price = scanner.nextFloat();

        // Ghi file
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\ACER\\Desktop\\exam\\exam_1\\src\\Book.txt", true);
            BufferedWriter info = new BufferedWriter(myWriter);
            info.newLine();
            info.write("Mã sách:" + code + ", Tiêu đề: " + title + ", Tác giả: " + author + ", Giá: " + price);
            info.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("Successfully wrote to the file.");

        // Đọc File từ Book.txt
        try {
            File myObj = new File("C:\\Users\\ACER\\Desktop\\exam\\exam_1\\src\\Book.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
