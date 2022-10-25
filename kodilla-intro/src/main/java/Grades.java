public class Grades {
    private int[] grades;
    private int size;

    int calkowita;
    int reszta;

    private int lastGrade;

    public Grades(){
        this.grades = new int[10];
        this.size = 0;
    }
    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }
    public void checkLastGrade() {
        if (this.size == 10) {
            this.size--;
            this.grades[this.size] = lastGrade;
        }
        else{}
        this.size--;
        this.grades[this.size] = lastGrade;
    }
    public void checkSumGrades() {
     for (this.size = 0; this.size <=10; this.size++)
         this.grades[this.size] += this.grades[this.size++];

    }
    public int average() {
        int sumUp = 0;
        for (int i = 0; i < grades.length; i++) {
            sumUp += grades[i];
        }
        return sumUp / grades.length;
    }
}
