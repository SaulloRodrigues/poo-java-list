package questao9;

public class Main {
    public static void main(String[] args) {
//      Universidade
        University unichristus = new University("UniChristus", "A universidade que lidera o Brasil em excelência acadêmica e inovação.");

//      Cursos
        Course ads = new Course("Análise e Desenvolvimento de Sistemas", 101);
        Course si = new Course("Sistemas da Informação", 103);
        Course cc = new Course("Ciências da Computação", 104);

//      Estudantes
        Student saullo = new Student("Saullo", ads);
        Student sousa = new Student("Sousa", ads);

        Student samuel = new Student("Samuel", si);
        Student rodrigues = new Student("Rodrigues", si);

        Student ambrosio = new Student("Ambrósio", cc);
        Student felipe = new Student("Felipe", cc);

//      Associando Course a University (unichritus).
        unichristus.addCourse(ads);
        unichristus.addCourse(si);
        unichristus.addCourse(cc);

//      Associando Student ao Course respectivo dele.
        ads.addStudent(saullo);
        ads.addStudent(sousa);

        si.addStudent(samuel);
        si.addStudent(rodrigues);

        cc.addStudent(ambrosio);
        cc.addStudent(felipe);

//      Mostrando os dados da University (unichritus).
        System.out.println(unichristus.nameUniversity + " - " + unichristus.description);
        System.out.println("--------------------------------------------");
        System.out.println("Cursos existentes:");
        unichristus.getNameCourses();
        System.out.println("--------------------------------------------");
        System.out.println("Estatísticas:");
        System.out.println("- Total de Cursos: " + unichristus.getTotalCourses() + " cursos.");
        System.out.println("- Total de Alunos na Universidade: " + unichristus.getTotalStudents() + " alunos.");
    }
}
