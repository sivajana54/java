package in.vamsoft.training.collection;
import java.lang.String;
public class CollectionExample implements Comparable<CollectionExample> {
 public int id;
 public String name;
 public int rollno;
  public CollectionExample() {
    super();
    // TODO Auto-generated constructor stub
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
  public int getRollno() {
    return rollno;
  }
  public void setRollno(int rollno) {
    this.rollno = rollno;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CollectionExample other = (CollectionExample) obj;
    if (id != other.id)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }
  public CollectionExample(int id, String name, int rollno) {
    super();
    this.id = id;
    this.name = name;
    this.rollno = rollno;
  }
  @Override
  public String toString() {
    return "CollectionExample [id=" + id + ", name=" + name + ", rollno=" + rollno + "]\n";
  }
  @Override
  public int compareTo(CollectionExample o) {
    if(this.id < o.id)
    return -1;
    else if(this.id >o.id) {
      return 1;
    }
    else {
      return 0;
    }
          
          
          
 
  }
  
  
 
}
