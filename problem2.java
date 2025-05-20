import java.util.Scanner;
class problem2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        int nums[]=new int[a];
        if(a<=0){
            System.out.println("Invalid input");
            return;
        }

        for(int i=0;i<a;i++){
            nums[i]=i*2+1;
        }
        System.out.println("The array elements are:");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}