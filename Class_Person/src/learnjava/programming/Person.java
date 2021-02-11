package learnjava.programming;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public void setFirstName(String fName){
        this.firstName = fName;
    }
    public void setLastName(String lName){
        this.lastName = lName;
    }
    public void setAge(int age1){
        if(age1<0 || age1>100){
            this.age=0;
        }
        else
            this.age=age1;
    }
    public boolean isTeen(){
        return getAge() > 12 && getAge() < 20;
    }
    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty())
            return " ";
        else if(lastName.isEmpty())
            return getFirstName();
        else if(firstName.isEmpty())
            return getLastName();
        else
            return getFirstName() + " " +getLastName();
    }
}
