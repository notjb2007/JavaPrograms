import java.util.*;

public class Experiment21_RemoveEle_Indec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Read integers separated by space (until non-numeric)
        String line = sc.nextLine();
        Scanner lineScanner = new Scanner(line);
        while (lineScanner.hasNextInt()) {
            list.add(lineScanner.nextInt());
        }

        // Read the index to remove
        int idx = sc.nextInt();

        if (idx < 0 || idx >= list.size()) {
            System.out.println("Index out of range");
        } else {
            list.remove(idx);
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(list.get(i));
            }
        }
    }
}
