//please refer to the next file...
import java.util.*;

public class ar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases=sc.nextInt();
        for(int w=0;w<cases;w++){
        int n = sc.nextInt();
        boolean flag=false;
        int lst = 0;
        int ival = 0;
        int myarr[] = new int[n];
        for (int i = 0; i < n; i++) {
            myarr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    j++;
                } else {
                    if (myarr[i] == myarr[j]) {
                        // System.out.println(i);
                        lst = 1;
                        ival = i;
                        flag=true;
                        break;
                    } else {
                        if(flag==true){
                            break;
                        }
                        else{
                        lst = -1;
                        }
                    }
                }
                if(flag==true){
                    break;
                }
            }
            if(flag==true){
                break;
            }
        }
        if (lst == 1) {
            System.out.println(ival);
        } else {
            System.out.println("-1");
        }
    }
}
}
