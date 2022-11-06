package studentpassed;

public class App {
    public static void main(String[] args) {
        StudentPass damjan = new StudentPass("Damjan", "Stojcev", 70);
        StudentPass dean = new StudentPass("Dean", "Josevski", 75);
        StudentPass krume = new StudentPass("Krume", "Krumev", 55);
        StudentPass hans = new StudentPass("Hans", "Hansev", 67);
        StudentPass paca = new StudentPass("Paca", "Paceva", 69);

        System.out.println(damjan.getName());
        if (damjan.getPoints() >= 70) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }

        System.out.println(dean.getName());
        if (dean.getPoints() >= 70) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }

        System.out.println(krume.getName());
        if (dean.getPoints() >= 70) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }

        System.out.println(hans.getName());
        if (dean.getPoints() >= 70) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }

        System.out.println(paca.getName());
        if (dean.getPoints() >= 70) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }

    }
}
