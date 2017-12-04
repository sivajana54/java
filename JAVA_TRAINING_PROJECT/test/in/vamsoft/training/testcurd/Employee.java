package in.vamsoft.training.testcurd;

public class Employee {
  /** The employee details Here **/
  private int id;
  private String Name;
  private String DepartmentName;

  /** The Constructor For Employee Class Create **/
  public Employee() {
    super();
  }

  /** The Constructor For Employee Class Create with Parameter **/
  public Employee(int id, String name, String departmentName) {
    super();
    this.id = id;
    Name = name;
    DepartmentName = departmentName;
  }

  /** The HasCode Equals Method are created **/
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((Name == null) ? 0 : Name.hashCode());
    result = prime * result + id;
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
    if (Name == null) {
      if (other.Name != null) {
        return false;
      }
    } else if (!Name.equals(other.Name)) {
      return false;
    }
    if (id != other.id) {
      return false;
    }
    return true;
  }

  /** The toString Method are created **/
  @Override
  public String toString() {
    return "Employee [id=" + id + ", Name=" + Name + ", DepartmentName=" + DepartmentName + "]";
  }

  /** Getter And Setter Method are created **/
  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public String getDepartmentName() {
    return DepartmentName;
  }

  public void setDepartmentName(String departmentName) {
    DepartmentName = departmentName;
  }

  public void setId(int id) {
    this.id = id;
  }

}
