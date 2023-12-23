import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class TreeTraversalApp extends JFrame {
    private Node root;

    public TreeTraversalApp() {
        setTitle("Tree Traversal Visualization");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a sample binary tree
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Create a button to trigger traversal
        JButton traverseButton = new JButton("Inorder Traversal");
        traverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                traverseAndDisplay();
            }
        });

        // Add components to the frame
        setLayout(new BorderLayout());
        add(traverseButton, BorderLayout.SOUTH);

        // Center the frame on the screen
        setLocationRelativeTo(null);
    }

    private void traverseAndDisplay() {
        // Perform inorder traversal and display the nodes
        StringBuilder result = new StringBuilder();
        inorderTraversal(root, result);
        JOptionPane.showMessageDialog(this, result.toString(), "Inorder Traversal", JOptionPane.INFORMATION_MESSAGE);
    }

    private void inorderTraversal(Node root, StringBuilder result) {
        if (root != null) {
            inorderTraversal(root.left, result);
            result.append(root.data).append(" ");
            inorderTraversal(root.right, result);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TreeTraversalApp().setVisible(true);
            }
        });
    }
}
