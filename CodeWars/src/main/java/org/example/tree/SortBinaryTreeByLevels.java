package org.example.tree;



import java.util.*;

public class SortBinaryTreeByLevels {
    public static List<Integer> treeByLevels(Node node)
    {
        List<Integer> result = new ArrayList<>();
        if(node == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while(!queue.isEmpty()){
            Node current = queue.poll();
            result.add(current.value);

            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }

        return result;
    }
}
