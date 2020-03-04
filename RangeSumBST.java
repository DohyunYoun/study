import java.util.Stack;

//938. RangeSumBST
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class RangeSumBST{
    public static void main(String[] args) {
        System.out.println("Default Main Fuction Sample");
    }
    
    
    public int rangeSumBST(TreeNode root, int min, int max) {
        
        int result =0;
        /*   
        //[iterative]
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            
            if(node!=null){
                
                
                if(node.val>= min && node.val<=max){
                    result+=node.val;
                }
                if(node.val>min){
                    stack.push(node.left);
                }
                if(node.val<max){
                    stack.push(node.right);
                }
            }
        }
        */
        
        //[recursive]
        // 솔루션 보고 깔끔하게 고친 버전
        if(root!=null){
            if(root.val>= min && root.val<=max){
                result +=root.val;
            }
            if(root.val>min){
                result =  result + rangeSumBST(root.left,min,max);
            }
            if(root.val < max){
                result =  result + rangeSumBST(root.right,min,max);
            }
        }
        
        //엄청 간단한 솔루션
        //min, max를 if문에서 한번 더 걸러주면 runtime 속도가 빨라짐.
        /* 
        if (root == null) return 0; // base case.
        return (min <= root.val && root.val <= max ? root.val : 0) + rangeSumBST(root.right, min, max) + rangeSumBST(root.left, min, max);
        */
        
        /* 
        //원래 버전
        if(root.val >= min){
            if(root.val <= max){
                //더해야함
                result = root.val;
                
                //left가 null일 경우
                //right가 null일 경우
                if(root.left == null){
                    if(root.right == null){
                        return result;
                    }else{
                        result =  result + rangeSumBST(root.right,min,max);
                    }
                }else{
                    if(root.right == null){
                        result =  result + rangeSumBST(root.left,min,max);
                    }else{
                        result =  result + rangeSumBST(root.left,min,max);
                        result =  result + rangeSumBST(root.right,min,max);
                    }
                }
                
            }else{
                if(root.left == null){
                    return result;
                }
                result =  result + rangeSumBST(root.left,min,max);
            }
            
            
        }else{
            if(root.right == null){
                return result;
            } 
            result =  result + rangeSumBST(root.right,min,max);
        }
        */
        
        
        return result;
        
    }
    
}