package model;

public class Employee {
    private String id;
    private String name;
    private String contactName;

    public Employee(){

    }

    public Employee(String id, String name, String contactName){
        this.id = id;
        this.name = name;
        this.contactName = contactName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}
