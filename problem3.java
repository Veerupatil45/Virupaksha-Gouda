import java.util.Scanner;
class problem3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        
        if(a%2==0){
            a=a-1;
        }
        int nums[]=new int[a];

        for(int i=0;i<a;i++){
            nums[i]=i*2+1;
        }
        System.out.println("The array elements are:");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}