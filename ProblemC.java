import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

class problemaC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = new String[2];
        inputs[0] = sc.nextLine();
        inputs[1] = sc.nextLine();
        String sum01 = sc.nextLine();

        String sAll = inputs[0].concat(inputs[1]);

        if(sum01.length() != sAll.length())
            System.out.print("NO");
        else{
            ArrayList<String> charsAll = new ArrayList<>(List.of(sAll.split("")));
            ArrayList<String> chars01 = new ArrayList<>((List.of(sum01.split(""))));

            bubbleSort(charsAll);
            bubbleSort(chars01);

            if (!chars01.equals(charsAll)){
                System.out.print("NO");
            } else{
                System.out.print("YES");
            }
        }
    }

    public static void bubbleSort(ArrayList<String> chars){
        for (int j = chars.size(); j >= 1; j--) {
            for (int i = 0; i < chars.size()-1; i++) {
                if(chars.get(i).compareTo(chars.get(i + 1)) >0){
                    String temp = chars.get(i);
                    chars.set(i, chars.get(i + 1));
                    chars.set(i + 1, temp);
                }
            }
        }
    }
}