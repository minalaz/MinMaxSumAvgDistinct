import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            ArrayList<Integer> num = new ArrayList<>();
            num.add(1);
            num.add(1);
            num.add(2);
            num.add(3);
            num.add(4);
            num.add(5);
            num.add(5);
            num.add(6);
            System.out.println(num);
            System.out.println(min(num));
            System.out.println(max(num));
            System.out.println(sum(num));
            System.out.println(avg(num));
            System.out.println(distinct(num));
        }
        public static int min(ArrayList<Integer> list){
            int min = list.get(0);
            for(int i = 0; i < list.size(); i++){
                if(min>list.get(i)){
                    min = list.get(i);
                }
            }return min;
        }
        public static int max(ArrayList<Integer> list){
            int max = list.get(0);
            for(int i = 0; i < list.size(); i++){
                if(max< list.get(i)){
                    max=list.get(i);
                }
            }return max;
        }
        public static int sum(ArrayList<Integer> list){
            int sum = 0;
            for (int i = 0; i<list.size(); i++){
                sum = sum + list.get(i);
            }return sum;
        }
        public static double avg(ArrayList<Integer> list){
            int sum = 0;
            for (int i = 0; i<list.size(); i++){
                sum = sum + list.get(i);
            }
            return (double)sum/ list.size();
        }
        public static ArrayList<Integer>distinct(ArrayList<Integer>list){
            ArrayList<Integer> uniqueNum = new ArrayList<>();
            for(int i= 0; i< list.size(); i++){
                if(!uniqueNum.contains(list.get(i))){
                    uniqueNum.add(list.get(i));
                }
            }
            return uniqueNum;
        }
    }
