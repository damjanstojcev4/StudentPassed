package studentpassed;

public class StudentPass {
    private String name;
    private String lastName;
    private int points;

    public StudentPass(String name, String lastName, int points) {
        this.name = name;
        this.lastName = lastName;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }


    public void student() {
        System.out.println("Student full name:" + name + lastName
                + " points: " + points);
        System.out.println();
    }
}

