

/* import java.util.*;
class Second{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in); 
     int n=sc.nextInt();
     for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
     }
    }
} */

/* import java.util.*;
class Second{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt(); 
     for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print("*");
        
        }
        System.out.println();
     }  
    }
} */

/* import java.util.*; 
class Second{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in); 
     int n=sc.nextInt();
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" * ");
        }
        System.out.println();
     }
     for(int i=1;i<=n;i++){
        for(int j=n-1;j>=i;j--){
            System.out.print(" * ");
        
        }
        System.out.println();
     }  

    }
} */

/* import java.util.*;
class Second{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for( i=1;i<=n;i++){
        for(int j=n-1;j>=i;j--){
            System.out.print("");
        }   
     for(int k=1;k<=i;k++){
            System.out.print("*");
     }
     System.out.println();
    }
    }
} */

 /* import java.util.*;
class Second{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);   
     int n = sc.nextInt();
     int i;
     for( i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" ");
        }
        for(int k=n;k>=i;k--){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}  
 */

/* import java.util.*;
 class Second{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt(); 
     for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println();
     }  
    }
 } */
  
/* import java.util.*;
 class Second{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1||i==1||j==n||i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print( " ");
                }
            }
            System.out.println();
        }
    }
 }  */