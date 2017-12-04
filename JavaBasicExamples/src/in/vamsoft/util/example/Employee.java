package in.vamsoft.util.example;

public class Employee implements Comparable<Employee> {
  int id;
  String name;
  int age;

  public Employee() {
    super();
  }

  /**
   * Pojo class for employee in following fiels for EmployeeSort.
   * 
   * @param id.
   * @param name.
   * @param age.
   */
  public Employee(int id, String name, int age) {
    super();
    this.id = id;
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + age;
    result = prime * result + id;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Employee other = (Employee) obj;
    if (age != other.age) {
      return false;
    }
    if (id != other.id) {
      return false;
    }
    if (name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!name.equals(other.name)) {
      return false;
    }
    return true;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public int compareTo(Employee o) {
    if (this.id < o.id) {
      return -1;
    } else if (this.id > o.id) {
      return 1;
    } else {
      return 0;
    }

  }
}