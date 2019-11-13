public class Node<T extends Comparable<? super T>> {
    private Node<T> right;
    private Node<T> left;
    private T value;
    private int conterNode = 1;

    Node(T value) {
        this.value = value;
    }

    Node<T> getLeft() {
        return left;
    }

    Node<T> getRight() {
        return right;
    }

    void setRight(Node<T> right) {
        this.right = right;
    }

    void setLeft(Node<T> left) {
        this.left = left;
    }

    T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getConterNode() {
        return conterNode;
    }

    void setConterNode() {
        this.conterNode++;
    }
}
