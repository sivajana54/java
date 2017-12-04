package in.vamsoft.training.collection.main;

public class Customer implements Comparable<Customer> {

  int custid;
  String name;
  int mobile;
  String address;

  public int getCustid() {
    return custid;
  }

  public void setCustid(int custid) {
    this.custid = custid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMobile() {
    return mobile;
  }

  public void setMobile(int mobile) {
    this.mobile = mobile;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Customer [custid=" + custid + ", name=" + name + ", mobile=" + mobile + ", address=" + address + "]\n";
  }

  public Customer(int custid, String name, int mobile, String address) {
    super();
    this.custid = custid;
    this.name = name;
    this.mobile = mobile;
    this.address = address;
  }

  

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + custid;
    result = prime * result + mobile;
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
    Customer other = (Customer) obj;
    if (custid != other.custid)
      return false;
    if (mobile != other.mobile)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }

  @Override
  public int compareTo(Customer o) {
    if (this.custid > o.custid)
      return 1;
    else if (this.custid < o.custid) {
      return -1;
    } else {
      return 0;
    }
  }
}
