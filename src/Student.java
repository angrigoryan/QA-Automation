class Student {
        String name;
        int marks;
        char section;

        public Student(String name, int marks, char section) {
                this.name = name;
                this.marks = marks;
                this.section = section;
        }

        public Student(String name, int marks) {
                this(name, marks, 'A');
        }

        public Student(String name) {
                this(name, 0, 'A');
        }

        public Student() {
                this("", 0, 'A');
        }

        public static void main(String arg[])
        {
        Student yogesh = new Student("Yogesh", 67, 'B');
        Student narayan = new Student("Narayan", 72);
        Student mahesh = new Student("Mahesh");
        Student kiran = new Student();
        System.out.println("Name = " + yogesh.name + ", section = " + yogesh.section + ", marks = " +
        yogesh.marks);
        System.out.println("Name = " + narayan.name + ", section = " + narayan.section + ", marks = "
        + narayan.marks);
        System.out.println("Name = " + mahesh.name + ", section = " + mahesh.section + ", marks = "
        + mahesh.marks);
        System.out.println("Name = " + kiran.name + ", section = " + kiran.section + ", marks = " +
        kiran.marks);
        }
}
