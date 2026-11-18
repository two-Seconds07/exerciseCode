import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =    new Scanner(System.in);
        //键盘录入数组长度
        int n = sc.nextInt();
        int[] arr = new int[n];

        //循环给数组赋上键盘录入的值
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        //对数组进行排序
        Arrays.sort(arr);

        //循环输出排序好的数组
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}