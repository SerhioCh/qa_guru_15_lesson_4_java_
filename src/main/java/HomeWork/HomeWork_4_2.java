package HomeWork;

public class HomeWork_4_2 {
}

    class Student {
        int id;
        String name;
        String surname;
        int yearEducation;
        double ballOfMath;
        double ballOfEconomics;
        double ballOfLanguage;
    }

    class StudentTest {
        public static void main(String[] args) {


            Student Student1 = new Student();
            Student Student2 = new Student();
            Student Student3 = new Student();

            Student1.name = "Serega";
            Student1.surname = "Romanich";
            Student1.ballOfMath = 4.2;
            Student1.ballOfEconomics = 5.0;
            Student1.ballOfLanguage = 4.4;

            Student2.name = "Nikita";
            Student2.surname = "Romanich";
            Student2.ballOfMath = 5.0;
            Student2.ballOfEconomics = 2.2;
            Student2.ballOfLanguage = 3.3;


            Student3.name = "Sanches";
            Student3.surname = "Romanich";
            Student3.ballOfMath = 4.8;
            Student3.ballOfEconomics = 4.2;
            Student3.ballOfLanguage = 3.1;

            System.out.println("Студент: " + Student1.name + " " + Student1.surname + "\n" +
                    "Cредний балл по предметам : " + (Student1.ballOfLanguage + Student1.ballOfEconomics + Student1.ballOfMath) / 3);
            System.out.println("Студент: " + Student2.name + " " + Student2.surname + "\n" +
                    "Cредний балл по предметам : " + (Student2.ballOfLanguage + Student2.ballOfEconomics + Student2.ballOfMath) / 3);
            System.out.println("Студент: " + Student3.name + " " + Student3.surname + "\n" +
                    "Cредний балл по предметам : " + (Student3.ballOfLanguage + Student3.ballOfEconomics + Student3.ballOfMath) / 3);


        }
    }


