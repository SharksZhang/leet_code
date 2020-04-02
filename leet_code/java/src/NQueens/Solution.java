package NQueens;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        ArrayList<List<String>> mark = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<String> subResult = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                subResult.add(".");
            }
            mark.add(subResult);
        }
        ArrayList<List<String>> result = new ArrayList<>();
        recursive(result, mark, n, 0);
        return result;
    }


    public void recursive(ArrayList<List<String>> result, ArrayList<List<String>> mark, int n, int row) {
        if (row >= n ) {
            result.add(constructResult(mark));
            return;
        }
        for (int i = 0; i < n ; i++) {

            if(mark.get(row).get(i) != "K"){
                ArrayList<List<String>> tmpResult = deepCopy(mark);
                mark.get(row).set(i, "Q");
                mark(mark, n, row, i, "K");
                recursive(result, mark, n, row + 1);
                mark = tmpResult;
            }

        }
    }

    private List<String> constructResult(ArrayList<List<String>> mark) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < mark.size(); i++) {
            StringBuilder sb = new StringBuilder();
            for (String s : mark.get(i)) {
                if(s == "Q"){
                    sb.append("Q");
                }else {
                    sb.append(".");
                }
            }
            result.add(sb.toString());
        }
        return result;
    }

    private void mark(ArrayList<List<String>> result, int n, int row, int column, String s) {
        int[] abscissas = new int[]{1, 1, 0, -1, -1, -1, 0, 1};
        int[] ordinates = new int[]{0, 1, 1, 1, 0, -1, -1, -1};
        for (int i = 0; i < abscissas.length; i++) {
            int currentAbscissas = row + abscissas[i];
            int currentOrdinate = column + ordinates[i];
            while (currentAbscissas >= 0 && currentAbscissas < n && currentOrdinate >= 0 && currentOrdinate < n) {
                if(result.get(currentAbscissas).get(currentOrdinate) != "Q"){
                    result.get(currentAbscissas).set(currentOrdinate, s);
                }
                currentAbscissas += abscissas[i];
                currentOrdinate += ordinates[i];
            }
        }
    }
    private ArrayList<List<String>> deepCopy(ArrayList<List<String>> source){
        ArrayList<List<String>> result = new ArrayList<>();
        for (int i = 0; i < source.size(); i++) {
            result.add(new ArrayList<>(source.get(i))) ;
        }
        return result;
    }
}


