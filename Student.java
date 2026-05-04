class Student {
    int[] marks;

    Student(int[] marks) {
        this.marks = marks;
    }

    int total() {
        int sum = 0;
        for(int m : marks) sum += m;
        return sum;
    }

    double percentage() {
        return total() / (double)marks.length;
    }

    void grade() {
        double p = percentage();
        if(p >= 75) System.out.println("A");
        else if(p >= 60) System.out.println("B");
        else if(p >= 40) System.out.println("C");
        else System.out.println("Fail");
    }
}