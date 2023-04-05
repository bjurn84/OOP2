import java.awt.dnd.InvalidDnDOperationException;

public class Program {
    public static void main(String[] args) {
        var nikolay = new Person("Николай", 50);
        var aleksander = new Person("Александр", 30);
        var masha = new Person("Нина", 28);
        var olya = new Person("Оля", 10);
        var misha = new Person("Миша", 8);

        FamilyTree ft = new FamilyTree();
        ft.append(nikolay, aleksander);
        ft.append(nikolay, masha);
        ft.append(aleksander, olya);
        ft.append(aleksander, misha);
        System.out.println(new Research(ft).spend(nikolay, Relationships.PARENT));

    }
}