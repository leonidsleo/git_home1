package OOPseminar7homework;

public class Student implements Observer{

    private String name;
    private int salary = 2000;
    private Vacansy vacansy;
    


    public Student(String name, Vacansy vacansy) {
        this.name = name;
        this.vacansy = vacansy;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacansy vacansy) {
        if (this.vacansy == vacansy) {
            if (this.salary <= salary){
                System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                        name, nameCompany, vacansy, salary);
                this.salary = salary;
            } else {
                System.out.println(name + " " + "Специальность хорошая, но зп маловата, я еще поищу: " + " " + nameCompany + "; Вакансия: " + vacansy + "; ЗП: " + salary);
            }
        }
        else {
            System.out.printf("Студент %s: Мне необходима другая вакансия! (компания: %s; вакансия: %s; заработная плата: %d)\n",
                    name, nameCompany, vacansy, salary);
        }
    }


}

