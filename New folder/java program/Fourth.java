/* public class Fourth{
    public static void main(String[]args){
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        int sum=0;
        for(int i=0;i<length;i++){
            sum=sum+arr[i];
            System.out.print(sum);
        }
    }
} */

/* public class Fourth{
public static void main(String[] args) {
 int arr[]={10,20,30,40,50};
 int length=arr.length;
 int large=arr[0];
 for(int i=0;i<length;i++) {
    if(arr[i]>large){
        large=arr[i];
    }
 }  
 System.out.println(large);
}
} */
/* public class Fourth{
    public static void main(String[] args) {
     int arr[]={10,20,30,40,50};
     int length=arr.length;
     int small=arr[0];
     for(int i=0;i<length;i++){
        if(arr[i]<small){
            small=arr[i];
        }
     }   
     System.out.println(small);
} 
}*/

/* public class Fourth{
    public static void mmain(String[]args){
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        int arr1[]=new  int[length];
        int j=0;
        for(int i=length-1;i>=0;i++){
            arr1[j]=arr[i];
            j++;
        }
            for(int i=0;i<length;i++){
        System.out.println(arr1[i]);
}
    }
} */

/* public class Fourth{
    public static void main(String[] args) {
     int arr[]={10,20,30,40,50};
     int length=arr.length;
     int left=0;
     int right=length-1;
     int temp;
     while(left<right){
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
     }  
     for (int i = 0; i< length; i++) {
         System.out.println(arr[i]);  
     }
    }
} */

 /* public class Fourth{
    public static void main(String[] args) {
     int arr[]={5,6,7,10,11,5,5,9,6,2};
     int length=arr.length;
     int key=5;
     int count=0;
     for (int i = 0;  i <length;i++){
       if(arr[i]==key){
        count++;
       } 
    } 
    System.out.println("my key value " + count + " time apper");
}
}  */
 /* public class Fourth{
    public static void main(String[] args) {
       int arr[]={10,20,30,30,40,50,60,60,60,70,70};
       int length=arr.length;
       int large=-1;
       int second=-1;
       for (int i = 0; i < length; i++) {
        if(arr[i]>large){
            second=large;
            large=arr[i];
        }
        else if(arr[i]>second && arr[i]!=large){
            second=arr[i];
        }
       }
       System.out.println("second large is " +second);
    }
}  */
  public class Fourth{
    public static void main(String[] args) {
       int arr[]={10,20,30,30,40,50,50,60};
       int length=arr.length;
       int large=-1;
       int second=-1;
       int third=-1;
       for (int i = 0; i < length; i++) {
        if(arr[i]>large){
            third=second;
            second=large;
            large=arr[i];
        }
        else if(arr[i]>second && arr[i]!=large){
            third=second;
            second=arr[i];
        }
        else if(arr[i]>third&& arr[i]!=second){
            third=arr[i];
        }
       }
       System.out.println("third large is " +third);
    }
} 