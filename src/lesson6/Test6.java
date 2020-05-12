package lesson6;

public class Test6 {
    public static void main(String[] args) {
        Tree<Person> tree = new TreeImpl<>();
        tree.add(new Person(60, "Alex"));
        tree.add(new Person(25, "Alex"));
        tree.add(new Person(66, "Alex"));
        tree.add(new Person(15, "Alex"));
        tree.add(new Person(5, "Alex"));
        tree.add(new Person(20, "Alex"));
        tree.add(new Person(45, "Alex"));
        tree.add(new Person(30, "Alex"));
        tree.add(new Person(55, "Alex"));
        tree.add(new Person(32, "Alex"));

        tree.traverse(Tree.TraverseMode.IN_ORDER);

        tree.display();

        System.out.println("Contains 30: " + tree.contains(new Person(30, "Alex")));
        System.out.println("Contains 77: " + tree.contains(new Person(77, "Alex")));

        tree.remove(new Person(25, "Alex"));
        tree.display();
    }

}
