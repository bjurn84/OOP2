public class Parents {
    private final Status status;
    private final Person person;

    public Parents(Person person, Status status) {
        this.person = person;
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return this.person.getName();
    }

    @Override
    public String toString() {
        return "Parents{" +
                "status=" + status +
                ", person=" + person +
                '}';
    }
}