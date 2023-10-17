package OOPseminar7homework;

public interface Publisher {

    void sendOffer(String companyName, int salary, Vacansy vacansy);

    void registerObserver(Observer observer);
    
    void removeObserver(Observer observer);

}
