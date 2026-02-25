package wipro;

public class StudentScore {
    String name;
    int english;
    int maths;
    int total;
    double percentage;
    char grade;

    public void setDetails(String n, int e, int m) {
        this.name = n;
        this.english = e;
        this.maths = m;
        calculateResults();
    }

    private void calculateResults() {
        this.total = english + maths;
        this.percentage = (total / 200.0) * 100;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 75) {
            grade = 'B';
        } else if (percentage >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
    }

    public void display() {
        System.out.println("Student: " + name);
        System.out.println("English: " + english);
        System.out.println("Maths: " + maths);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage + "%");
        
        switch (grade) {
            case 'F':
                System.out.println("Grade: Fail");
                break;
            default:
                System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Error: Please provide input as: java wipro.StudentScore <Name> <English> <Maths>");
            return;
        }

        try {
            String n = args[0];
            int e = Integer.parseInt(args[1]);
            int m = Integer.parseInt(args[2]);

            StudentScore student = new StudentScore();
            student.setDetails(n, e, m);
            
            student.display();

        } catch (NumberFormatException ex) {
            System.out.println("Error: Marks must be valid integers.");
        }
    }
}