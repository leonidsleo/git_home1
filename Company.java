package OOPseminar7homework;

import java.util.Random;

public class Company {
    
    private Random random = new Random();

    private String name;

    private int maxSalary;

    private Publisher jobAgency;

    private Vacansy vacansy;

    Vacansy[] vacans = new Vacansy[] {Vacansy.инженер, Vacansy.мастер_участка, Vacansy.мастер_цеха, Vacansy.разнорабочий, Vacansy.фрилансер};

    public Company(String name, Publisher jobAgency, int maxSalary, Vacansy vacansy) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        this.vacansy = vacansy;
    }

    

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary, vacansy);
        vacansy = vacans[random.nextInt(vacans.length)];
    }
}
