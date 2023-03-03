package h3.class_object;

//Սահմանել Employee class-ը, որը ունի
//● fields (id, name, department, age, gender)
//● methods printEmploye() որը տպում է Employee մասին ամբողջական
//ինֆորմացիա։
public class Employee {

    private int id;

    private String name;

    private String department;

    private int age;

    private String gender;

    public Employee(int id,
                    String name,
                    String department,
                    int age,
                    String gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        if ((gender != "male") && (gender != "female")) {
            System.out.println("Parameter gender must be 'male' or 'female', otherwise it will be 'null'");
            return;
        }
        this.gender = gender;
    }

    public void printEmployee() {
        System.out.println("Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}');
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
