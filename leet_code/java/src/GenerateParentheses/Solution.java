package GenerateParentheses;

import java.util.LinkedList;
import java.util.List;

class Solution {
    public List<String> generateParenthesis(int n) {
        LinkedList<LinkedList<String>> results = new LinkedList<>();
        generate(n,results, new LinkedList<>(), new LinkedList<>(), 0 );
        LinkedList<String> strings = new LinkedList<>();
        for (LinkedList<String> result : results) {

            StringBuilder stringBuilder = new StringBuilder();
            for (String s : result) {
                stringBuilder.append(s);
            }
            strings.add(stringBuilder.toString());
        }
        return strings;
    }

    private void generate(int n, LinkedList<LinkedList<String>> result, LinkedList<String> tmpResult,
                          LinkedList<String> comparedResult, int i) {

        if(i >= 2* n){
            return;
        }

        comparedResult.push("(");

        if((2*n - i   > comparedResult.size() )){
            tmpResult.addLast("(");
            generate(n, result, tmpResult, comparedResult, i +1);
            tmpResult.removeLast();
        }
            comparedResult.pop();



        if (!comparedResult.isEmpty()) {
            comparedResult.pop();
            tmpResult.addLast(")");
            if(i == 2 *n -1 ){
                result.add(new LinkedList<>(tmpResult));
            }
            generate(n, result, tmpResult, comparedResult, i +1);
            comparedResult.push("(");
            tmpResult.removeLast();
        }





    }
}
