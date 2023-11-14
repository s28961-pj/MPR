public class Person {
    /* Fields */
    private String name;
    private int age;

    /* Constructors */
    public Person(String name, int age) throws InvalidAgeException {
        this.name = name;
        setAge(age);
    }

    public Person(String name) {

        this.name = name;
    }

    /* Setters and Getters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 100) {
            throw new InvalidAgeException("Błędny wiek");
        } else {
            this.age = age;
        }
    }
}
