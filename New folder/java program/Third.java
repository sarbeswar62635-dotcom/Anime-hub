/*  import java.util.*;
class second{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("enter a no");
     int n=sc.nextInt();
    int digit=0;
    int t=n;
    int r;
    int sum=0;
     while(t!=0){
        t =t/10;
        digit++;
     }   
     //System.out.println(digit);
     t=n;
     while(t!=0){
         r=t%10;
      sum=sum+(int)Math.pow(r,digit);
      t=t/10;
      if(sum==n){
        System.out.println("no is armrstrong");
      }
     }   
    }
} 
   */

   /* import java.util.*;
 class first{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
      for(int i=1;i<=n;i++){
        int digit = 0;
        int m = i;
        int sum=0;
        while(m!=0){
           m = m/10;
           digit++; 
        }
        m=i;
        while(m!=0){
            int r = m%10;
             sum = sum + (int) Math.pow(r,digit);
             m=m/10;
        }
        if(sum==i){
            System.out.println(i);
        }
      }
    }
 } */

/* import java.util.*;
class Second{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number ");
    int n = sc.nextInt();
    int temp = n;
    int sum = 0;
    
      while(temp>0){
      int digit = temp%10;
      sum = sum+digit;
      temp = temp/10;
    }   
    if(n%sum==0){
      System.out.println("harsad number");
    }
    else{
      System.out.println("not harsad number");
    }
   }
} */ 


/* import java.util.*;
class Second{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number ");
    int n = sc.nextInt();
    int temp = n;
    int sum = 0;
    while(temp>0){
      int digit = temp % 10;
      int fact = 1;
      for(int i=1;i<=digit;i++){
         fact = fact*i;
      }
      sum = sum + fact;
      temp = temp/10;
    }   
    if(sum==n){
      System.out.println("strong number ");
    }
    else{
      System.out.println("not strong number ");
    }
   }
} */

 /* import java.util.*;//disarium number
class Third{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a range");
         int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int temp=i;
           int len = 0;
           int t= temp;
           while(t>0){
            len++;
            t= t/10;
           }
           int sum = 0;
           t=i; int pow =len;
           while(t>0){
            int digit = t%10;
            sum = sum+(int)Math.pow(digit,pow);
            pow--;
            t=t/10;
           }
           if(sum==i){
            System.out.println(i);
           }
        }
    }
}  */