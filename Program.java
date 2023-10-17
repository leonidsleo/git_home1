package OOPseminar7homework;

public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000, Vacansy.разнорабочий);
        Company yandex = new Company("Yandex", jobAgency, 9000, Vacansy.разнорабочий);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000, Vacansy.инженер);

        Student student1 = new Student("Студент #1", Vacansy.разнорабочий);
        Master master1 = new Master("Мастер #1", Vacansy.мастер_участка);
        Master master2 = new Master("Мастер #2", Vacansy.мастер_цеха);
        Engineer engineer = new Engineer("ЛОПАТА", Vacansy.инженер);

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(engineer);

        for (int i = 0; i < 3; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
        }

    }

}