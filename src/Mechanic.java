import transport.Transport;

import java.util.LinkedList;

public class Mechanic <T extends Transport> {
    private String name;
    private String company;

    public Mechanic(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public void service(T transport) {
        System.out.println(transport.getBrand() + transport.getModel() +
                " на тех обслуживании у механика: " + name + " компания: " + company);
    }
    public void repair(T transport) {
        System.out.println(transport.getBrand() + transport.getModel() +
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

}