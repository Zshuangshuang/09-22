import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Description:判断一个数字的二进制有几个1
 * 思路：让这个数字每次和1相与，若与后的结果为仍有1，则count++。然后这个数字右移，直至原来的数字的二进制=0为止
 * 思路2：让这个数字每次&n-1
 * User:ZouSS
 * Date:2020-09-22
 * Time:19:30
 **/
public class TestDemo {
    public static int getTwoMaxNum(int x,int y){
        return x>y ? x:y;
    }
    public static int getThreeMaxNum(int x,int y, int z){
        int tmp = getTwoMaxNum(x,y);
        return tmp>z ? tmp : z;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int ret = getThreeMaxNum(num1,num2,num3);
        System.out.println(ret);
    }
    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 31; i >= 1 ; i-=2) {
            System.out.print(((num >> i) & 1)+"  ");
        }
        System.out.println();
        for (int i = 30; i >= 0; i-=2) {
            System.out.print(+((num >> i) & 1)+"  ");
        }
    }
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while(num != 0){
            count++;
            num &= (num-1);

        }
        System.out.println("1的个数为："+count);
    }
    public static int findOne(int num){
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (((num >> i) & 1) == 1) {
                count++;
            }
        }
        return count;
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ret = findOne(num);
        System.out.println("1的个数为："+ret);

    }
}
