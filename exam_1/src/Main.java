

    import java.util.*;
import java.util.Map.Entry;

    public class Main {

        public static void main(String args[]) {

            Scanner scanner = new Scanner(System.in);

            HashMap<String, String> details = new HashMap<String, String>();

            String name = null;
            String phone;

            int n = 0;
            while(n < 5) {
                System.out.println("Sinh vien "+ (n + 1) );
                System.out.println("Nhap ten sinh vien (Nhap x de dung lai): ");
                name = scanner.nextLine();
                if((name.equals("x") == true) || (name.equals("X") == true)) break;
                System.out.println("Nhap so dien thoai: ");
                phone = scanner.nextLine();
                details.put(name, phone);
                n++;
            }

            Set<Entry<String, String>> set = details.entrySet();

            Iterator<Entry<String, String>> i = set.iterator();

            while(i.hasNext()) {
                Map.Entry me = (Map.Entry)i.next();
                System.out.print("Ten sinh vien: " + me.getKey());
                System.out.println("    So dien thoai: " + me.getValue());
            }
        }
    }

