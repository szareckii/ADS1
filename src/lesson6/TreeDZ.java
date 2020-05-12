package lesson6;

public class TreeDZ {

//    private final int RANGE = 50;

    public static void main(String[] args) {

        final int RANGE = 50;
        int count = 0;

//        TreeImplDZ[] array  = new TreeImplDZ[20];
//        array[i] = new TreeImplDZ<>();

        Tree<Integer> tree = new TreeImplDZ<>();

       // for (int i = 0; i < 15; i++) {
            //array[i] = new TreeImplDZ<>();
/*
        tree.add(-12);
        tree.add(16);
        tree.add(5);
        tree.add(1);
        tree.add(2);
        tree.add(-3);
        tree.add(-13);
        tree.add(18);
        tree.add(4);
        tree.add(31);
        tree.add(22);
        tree.add(-43);
        tree.add(-62);
        tree.add(34);
        tree.add(12);
        tree.add(11);
        tree.add(22);
        tree.add(-30);
*/

        for (int i = 0; i < 15; i++) {
           int id = -1 * RANGE/2 + (int) (Math.random() * RANGE);
            tree.add(id);
        }


        //}
        //Tree<Integer> tree = new TreeImplDZ<>();


        //array[0].add(new Person(60, "Alex"));
//        array[0].display();
        tree.display();

    }
}
