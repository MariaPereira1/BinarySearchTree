class BinaryTree<T extends Comparable<? super T>> {
    Node<T> root = null;
    private int size = 0;

    void add(T value) {
        if (this.root == null) {
            root = new Node<>(value);
        } else {
            Node<T> temp = this.root;

            while (temp.getRight() != null || temp.getLeft() != null) {
                if (value.compareTo(temp.getValue()) < 0) {
                    if (temp.getRight() == null) {
                        break;
                    } else {
                        temp = temp.getRight();
                    }
                } else if (value.compareTo(temp.getValue()) > 0) {
                    if (temp.getLeft() == null) {
                        break;
                    } else {
                        temp = temp.getLeft();
                    }
                } else {
                    return;
                }
            }

            if (value.compareTo(temp.getValue()) < 0) {
                temp.setRight(new Node<>(value));
                temp.setConterNode();
            } else {
                temp.setLeft(new Node<>(value));
                temp.setConterNode();
            }
        }

        size++;
    }

//    Par search(Comparable<T> value) {
//        Par par;
//
//        if (root.getValue() == value) {
//            return par = new Par(root, null);
//        }
//
//        Node temp = this.root;
//
//        while (temp != null) {
//            if (value > temp.getValue()) {
//                temp = temp.getRight();
//            }
//            if (value < temp.getValue()) {
//                temp = temp.getLeft();
//            }
//        }
//
//        if (value == temp.getValue()) {
//            return temp;
//        } else {
//            return null;
//        }
//    }
//
//    int max() {
//        Node temp = this.root;
//
//        while (temp.getRight() != null) {
//            temp = temp.getRight();
//        }
//
//        return temp.getValue();
//    }
//
//    int min() {
//        Node temp = this.root;
//
//        while (temp.getLeft() != null) {
//            temp = temp.getLeft();
//        }
//
//        return temp.getValue();
//    }
//
//    void delete(int value) {
//        if (node == null) {
//            return;
//        }
//
//        if (node.getLeft() == null && node.getRight() == null) {
//            node = null;
//            return;
//        }
//
//        Node tempRight = null;
//        Node tempLeft = null;
//
//        if (node.getRight() != null) {
//            tempRight = node.getRight();
//        } else if (node.getLeft() != null) {
//            tempLeft = node.getLeft();
//        }
//
//    }
}
