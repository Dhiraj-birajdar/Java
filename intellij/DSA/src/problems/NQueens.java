package problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NQueens {
    Set<Integer> col = new HashSet<>();
    Set<Integer> pDiag = new HashSet<>(); // r+c
    Set<Integer> nDiag = new HashSet<>(); // r-c
    int n ;
//    String[]

    public NQueens(int i) {
        this.n = i;

    }

    public static void main(String[] args) {
        var q = new NQueens(4);
        q.solve();
    }

    private void solve() {
    }

    public List<List<String>> solveNQueens(int n) {

        return List.of();
    }
}
