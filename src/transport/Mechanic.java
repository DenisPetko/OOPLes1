package transport;

public class Mechanic<T extends Transport> { //Raw use of parameterized class 'Transport' ?? - это можно игнорировать?

    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public void goService(T transport) {
        System.out.println(transport.getBrand() + " " + transport.getModel() +
                " на тех обслуживании у механика: " + name + " компания: " + company);
    }

    public void repair(T transport) {
        System.out.println(transport.getBrand() + " " + transport.getModel() +
                " на ремонте у механика: " + name + " компания: " + company);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}