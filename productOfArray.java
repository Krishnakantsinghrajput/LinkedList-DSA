public class productOfArray {
      public static void main(String args[]){
int ar[]={1,2,3,4};
int result1[]=fun1(ar);
for(int i:result1){
    System.out.println(i+" ");
}
    }

    public static int [] fun1(int ar[]){
        int n=ar.length;
        int result[]=new int[n];
        result[0]=1;
        for(int i=1;i<n;i++){
            result[i]=result[i-1]*ar[i-1];
        }

        int suffix=1;
        for(int i=n-1;i>=0;i--){
            result[i]=result[i]*suffix;
            suffix*=ar[i];
        }

        return result;
    }
}
