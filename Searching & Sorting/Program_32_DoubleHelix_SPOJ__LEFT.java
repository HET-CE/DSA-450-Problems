import java.util.ArrayList;

public class Program_32_DoubleHelix_SPOJ__LEFT {
    
    public static void totalPath(ArrayList first , ArrayList second) {
        int sum = 0;
        for(int i = 0 ; i < first.size() ; i++){
            while(second.contains(first.get(i))){
                sum += (int)(first.get(i));
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        ArrayList second = new ArrayList<>();
        ArrayList first = new ArrayList<>();
        first.add(3);
        first.add(5);
        first.add(7);
        first.add(9);
        first.add(20);
        first.add(25);
        first.add(30);
        first.add(40);
        first.add(55);
        first.add(56);
        first.add(57);
        first.add(60);
        first.add(62);
        second.add(1);
        second.add(4);
        second.add(7);
        second.add(11);
        second.add(14);
        second.add(25);
        second.add(44);
        second.add(47);
        second.add(55);
        second.add(57);
        second.add(100);
        totalPath(first , second);
    }
}
