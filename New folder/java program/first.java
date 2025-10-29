/* 
 import java.util.*;
class first{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);   
     System.out.println("enter a number");
     int n = sc.nextInt();
     int flag =0;
     int sum=0;
     for(int i=1;i<=n;i++){
        flag = 0;
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                flag=1;
                break;
            }
            }

           if(flag==0){
                System.out.println(i);
                 sum =sum+i;
        }
     }
     System.out.println(sum);
       
    
    }
}
 */

/* import java.util.*;
 class first{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //System.out.println("enter a number");
        int n=sc.nextInt();
        int m;
        int i;
        m=n;
        int sum=0;
       for( i=1;i<n;i++){
         //sum=0;
        for(int j=1;j<i;j++){
            if(i%j==0){
                sum=sum+j;
            }
        }
            if(sum==i){
        System.out.println(i);
       }
       }
       
    }
 } */

/* import java.util.*;
 class first{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter range");
        int n=sc.nextInt();
     for(int i=1;i<n;i++){
        int m=i*i;
        int sum = 0;
        while(m!=0){
            int r = m%10;
            sum = sum+r;
            m=m/10;
        }
        if(sum==i){
            System.out.println(i);
        }
     }   
    }
 } */
  
//spy number

/* import java.util.*;
class first{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);  
     System.out.println("enter a number");
     int n = sc.nextInt();
     int sum = 0,product =1;
     while(n>0){
        int digit = n%10;
        sum = sum+digit;
        product = product*digit;
        n = n/10;
     } 
     if(sum == product){
        System.out.println("number is spy");
     }
     else{
        System.out.println("number is not spy");
     }
    }
} */

//sunny number
 import java.util.*;
class first{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a range");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int sqrt = (int)Math.sqrt(i+1);
        if(sqrt * sqrt == i+1){
            System.out.println(i);
        }
        }
    }
} 

