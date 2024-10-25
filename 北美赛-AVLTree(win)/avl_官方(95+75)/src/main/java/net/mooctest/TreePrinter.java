package net.mooctest;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by louay on 4/29/2017.
 */
public class TreePrinter {

    public static <T extends Comparable<?>> String printNode(AVLNode<T> root) {
        int maxLevel = TreePrinter.maxLevel(root);
        StringBuilder sb = new StringBuilder();
        return printNodeInternal(Collections.singletonList(root), 1, maxLevel, sb);
    }

    private static <T extends Comparable<?>> String printNodeInternal(List<AVLNode<T>> nodes, int level, int maxLevel, StringBuilder sb) {
        if (nodes.isEmpty() || TreePrinter.isAllElementsNull(nodes))
            return "";

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        TreePrinter.printWhitespaces(firstSpaces, sb);

        List<AVLNode<T>> newNodes = new ArrayList<>();
        for (AVLNode<T> node : nodes) {
            if (node != null) {
                System.out.print(node.getElement());
                sb.append(node.getElement());
                newNodes.add(node.getLeft());
                newNodes.add(node.getRight());
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
                sb.append(" ");
            }

            TreePrinter.printWhitespaces(betweenSpaces, sb);
        }
        System.out.println("");
        sb.append("\n");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                TreePrinter.printWhitespaces(firstSpaces - i, sb);
                if (nodes.get(j) == null) {
                    TreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1, sb);
                    continue;
                }

                if (nodes.get(j).getLeft() != null) {
                    System.out.print("/");
                    sb.append("/");
                }
                else
                    TreePrinter.printWhitespaces(1, sb);

                TreePrinter.printWhitespaces(i + i - 1, sb);

                if (nodes.get(j).getRight() != null) {
                    System.out.print("\\");
                    sb.append("\\");
                }
                else
                    TreePrinter.printWhitespaces(1,  sb);

                TreePrinter.printWhitespaces(endgeLines + endgeLines - i, sb);
            }

            System.out.println("");
            sb.append("\n");
        }
        printNodeInternal(newNodes, level + 1, maxLevel, sb);
        return sb.toString();
    }

    private static void printWhitespaces(int count, StringBuilder sb) {
        for (int i = 0; i < count; i++) {
            System.out.print(" ");
            sb.append(" ");
        }

    }

    private static <T extends Comparable<?>> int maxLevel(AVLNode<T> node) {
        if (node == null)
            return 0;

        return Math.max(TreePrinter.maxLevel(node.getLeft()), TreePrinter.maxLevel(node.getRight())) + 1;
    }

    private static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

}