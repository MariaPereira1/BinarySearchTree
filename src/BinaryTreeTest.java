import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

    private BinaryTree<Integer> t;

    @BeforeEach
    void setUp() {
        t = new BinaryTree<>();
    }

    @Test
    void testShouldInsertTheFirstNumber() {
        t.add(10);
        Assertions.assertEquals(10, t.root.getValue());
    }

    @Test
    void testShouldInsertASmallerNumber() {
        t.add(10);
        t.add(5);
        Assertions.assertEquals(5, t.root.getLeft().getValue());
        Assertions.assertNull(t.root.getRight());
    }

    @Test
    void testShouldInsertALargerNumber() {
        t.add(10);
        t.add(20);
        Assertions.assertEquals(20, t.root.getRight().getValue());
        Assertions.assertNull(t.root.getLeft());
    }

    @Test
    void testShouldInsertASecondSmallerNumber() {
        t.add(10);
        t.add(5);
        t.add(3);
        Assertions.assertEquals(5, t.root.getLeft().getValue());
        Assertions.assertNull(t.root.getRight());
        Assertions.assertEquals(3, t.root.getLeft().getLeft().getValue());
    }

    @Test
    void testShouldInsertASecondLargerNumber() {
        t.add(10);
        t.add(20);
        t.add(30);
        Assertions.assertNull(t.root.getLeft());
        Assertions.assertEquals(20, t.root.getRight().getValue());
        Assertions.assertEquals(30, t.root.getRight().getRight().getValue());
    }

    @Test
    void testShouldInsertASecondSmallerNumberWhithTwoLargerNumber() {
        t.add(10);
        t.add(20);
        t.add(1);
        t.add(30);
        t.add(15);

        Assertions.assertEquals(10, t.root.getValue());
        Assertions.assertEquals(20, t.root.getRight().getValue());
        Assertions.assertEquals(1, t.root.getLeft().getValue());
        Assertions.assertEquals(30, t.root.getRight().getRight().getValue());
        Assertions.assertEquals(15, t.root.getRight().getLeft().getValue());
    }

    @Test
    void testShouldInsertASecondLargerNumberWhithTwoSmallerNumber() {
        t.add(10);
        t.add(20);
        t.add(5);
        t.add(7);
        t.add(1);

        Assertions.assertEquals(10, t.root.getValue());
        Assertions.assertEquals(20, t.root.getRight().getValue());
        Assertions.assertEquals(5, t.root.getLeft().getValue());
        Assertions.assertEquals(7, t.root.getLeft().getRight().getValue());
        Assertions.assertEquals(1, t.root.getLeft().getLeft().getValue());
    }

//    @Test
//    void testShouldFindTheNumberOfTheFirstPosition(){
//        t.add(10);
//        t.add(15);
//        t.add(7);
//
//        Assertions.assertNotNull(t.search(10));
//    }
//
//    @Test
//    void testShouldFindTheNumberInAMiddlePosition(){
//        t.add(10);
//        t.add(15);
//        t.add(7);
//        t.add(6);
//        t.add(20);
//
//        Assertions.assertNotNull(t.search(15));
//    }
//
//    @Test
//    void testShouldFindTheNumberOfTheLastPosition(){
//        t.add(10);
//        t.add(15);
//        t.add(7);
//        t.add(6);
//        t.add(20);
//        t.add(3);
//        t.add(30);
//
//        Assertions.assertNotNull(t.search(30));
//    }
//
//    @Test
//    void testShouldFindAllNumbers(){
//        t.add(10);
//        t.add(15);
//        t.add(7);
//        t.add(6);
//        t.add(20);
//        t.add(3);
//        t.add(30);
//
//        Assertions.assertNotNull(t.search(10));
//        Assertions.assertNotNull(t.search(15));
//        Assertions.assertNotNull(t.search(7));
//        Assertions.assertNotNull(t.search(6));
//        Assertions.assertNotNull(t.search(20));
//        Assertions.assertNotNull(t.search(3));
//        Assertions.assertNotNull(t.search(30));
//    }
//
//    @Test
//    void testShouldNotFindANumber(){
//        t.add(10);
//        t.add(15);
//        t.add(7);
//        t.add(6);
//        t.add(20);
//
//        Assertions.assertNull(t.search(100));
//    }
//
//    @Test
//    void testShouldFindTheOnlyNumber(){
//        t.add(10);
//
//        Assertions.assertNotNull(t.search(10));
//    }
//
//    @Test
//    void testShouldFindTheMax(){
//        t.add(10);
//        t.add(15);
//        t.add(7);
//        t.add(6);
//        t.add(20);
//
//        Assertions.assertEquals(20, t.max());
//    }
//
//    @Test
//    void testShouldFindTheMaxWithOnlyOneNumber(){
//        t.add(10);
//
//        Assertions.assertEquals(10, t.max());
//    }
//
//    @Test
//    void testShouldFindTheMin(){
//        t.add(10);
//        t.add(15);
//        t.add(7);
//        t.add(6);
//        t.add(20);
//
//        Assertions.assertEquals(6, t.min());
//    }
//
//    @Test
//    void testShouldFindTheMinWithOnlyOneNumber(){
//        t.add(10);
//
//        Assertions.assertEquals(10, t.min());
//    }
//
//    @Test
//    void testShouldDeleteTheFirstNumber(){
//        t.add(10);
//        t.add(15);
//        t.add(7);
//        t.add(6);
//        t.add(20);
//
//        t.delete(10);
//
//        Assertions.assertNull(t.search(10));
//    }
//
//    @Test
//    void testShouldDeleteTheOnlyNumber(){
//        t.add(10);
//
//        t.delete(10);
//
//        Assertions.assertNull(t.search(10));
//    }
}