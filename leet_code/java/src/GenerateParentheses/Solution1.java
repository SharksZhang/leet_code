package GenerateParentheses;

import java.util.LinkedList;
import java.util.List;

class Solution1 {
    public List<String> generateParenthesis(int n) {
        LinkedList<String> result = new LinkedList<>();
        generate(result, "", n, n);
        return result;
    }

    private void generate(LinkedList<String> result, String sb, int left, int right) {
        if (left == 0 && right == 0){
            result.add(sb);
            return;
        }

        if(left > 0){
            generate(result, sb +"(", left-1, right);
        }
        if(right > left){
            generate(result, sb +")", left, right -1);
        }

    }
}
