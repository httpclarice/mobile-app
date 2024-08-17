public class User {

    public String name;
    public String surname;
    public String email;
    public Integer age;
    public String adress;

    public User(String name, String surname, String email, Integer age, String adress) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() {
        return age;
    }

    public String getAdress() {
        return adress;
    }

    public String getName() {
        return this.name;
    }
    ;

    public String getSurname() {
        return this.surname;
    }
    ;

    public void setName(String name) {
        this.name = name;
    }

    ;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    ;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
