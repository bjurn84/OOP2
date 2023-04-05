import java.util.ArrayList;

public class FamilyTree {
    private final ArrayList<Node> tree = new ArrayList<>();

    public void append(Person parent, Person children) {
        tree.add(new Node(parent, Relationships.PARENT, children));
        tree.add(new Node(children, Relationships.CHILDREN, parent));
    }

    public ArrayList<Node> getTree() {
        return tree;
    }
}
