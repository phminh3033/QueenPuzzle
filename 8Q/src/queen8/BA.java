package queen8;

import queen8.Interface.*;
import static java.lang.Math.abs;

public class BA {
    
    private static BA instance;
    public static BA Instance(){
        if(instance == null){
            instance = new BA();
        }
        return instance;
    }

    int dem = 1;
    int board[] = new int[50];

    boolean check(int x, int y){
        int i;
        for(i = 1; i < x; i++)
            if(board[i] == y || abs(i-x) == abs(board[i]-y))
                return false;
        return true;
    }

    void solveNQ8(int i, int N){
        int j;
        
        for(j = 1; j <= N; j++){
            if(check(i, j)){
                board[i] = j;
                if(i == N){
                    for(int z = 1; z <= N; z++){
                        dem++;
                    }
                    Interface.Instance().receiveQ8(board, N);
                }
                solveNQ8(i+1, N);
            }
        }
    }
    
    void resetC(){
        dem = 1;
    }
    
    void startBA(int N){
        Interface.Instance().resetdem();
        solveNQ8(1, N);
    }
}
