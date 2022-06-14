package queen8;

import static java.lang.Math.abs;

public class BAnew {
    private static BAnew instance;

    public static BAnew Instance(){
        if(instance == null){
            instance = new BAnew();
        }
        return instance;
    }
    
    int dem=1;
    int a[] = new int[20];
    
    void Xuat(int n){
	int i;
        for(i=1; i<=n; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
        dem++;
    }
    
    boolean OK(int x, int y){
        int i;
        for(i=1; i<x; i++)
            if(a[i]==y || abs(i-x)==abs(a[i]-y))
                return false;
        return true;
    }
    
    void Try(int i, int n){
        int j;
        
        for(j=1; j<=n; j++){
            if(OK(i, j)){
                a[i] = j;
                if(i==n){
                    for(int z=1; z<=n; z++){
                        dem++;
                    }
                    Xuat(n);
                    //Interface.Instance().receiveQueen(a, n);
                }
                Try(i+1, n);
            }
        }
    }
    
    void resetdem(){
        dem=1;
    }
    
    void SolveQueen(int n){
        //Interface.Instance().resetdem();
        Try(1, n);
    }
}
