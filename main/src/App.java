import java.io.File;
import java.io.FileNotFoundException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\Workspace\\java\\input.txt");
        Scanner readFile = new Scanner(file);
        ArrayList<String> cliens = new ArrayList<>();

        // doc noi dung trong file
        while (readFile.hasNextLine()) {
            var clien = readFile.nextLine();
            cliens.add(clien);
        }
        readFile.close();

        // Date date = new Date();
        // System.out.println("Thoi gian hien tai: " + date);

        SimpleDateFormat dayOfYear = new SimpleDateFormat("D"); // dinh dang thoi gian hien
        System.out.println("Day of year: " + dayOfYear.format(new Date()));

        // var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat();

        System.out.println("Ngay hien tai: " + dateFormat.format(new Date()));

    }

    static void showData(ArrayList<String> cliens) { // phuong thuc in ra danh sach trong ArrayList
        for (String c : cliens) {
            System.out.println(c);
        }
    }
}
