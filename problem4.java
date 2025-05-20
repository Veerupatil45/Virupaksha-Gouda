import java.util.Scanner;
class problem4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Output:");
        for(int i=1;i<10;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]%i==0){
                    count++;
                   
                }
                
            }
             System.out.print(i+":"+count+" ");
        }
    }
}