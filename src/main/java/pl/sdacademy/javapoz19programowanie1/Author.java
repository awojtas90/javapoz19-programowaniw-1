package pl.sdacademy.javapoz19programowanie1;

public class Author {

    private String firstname;
    private String lastname;
    private int birthyear;

    private Nation nation;

    public Author() {
    }

    public Author(String firstname, String lastname, int birthyear, Nation nation) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthyear = birthyear;
        this.nation = nation;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthyear=" + birthyear +
                ", nation=" + nation +
                '}';
    }
}

/*  2 obikety autor
pierwszy za pomocą konstruktora z parametrami
drugi za pomocą konstruktora bez parametrów z seterami
    */
