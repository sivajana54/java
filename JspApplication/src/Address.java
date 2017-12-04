
public class Address {
String houseno;
String city;
public String getHouseno() {
  return houseno;
}
public void setHouseno(String houseno) {
  this.houseno = houseno;
}
public String getCity() {
  return city;
}
public void setCity(String city) {
  this.city = city;
}
public Address(String houseno, String city) {
  super();
  this.houseno = houseno;
  this.city = city;
}
public Address() {
  super();
  // TODO Auto-generated constructor stub
}
@Override
public String toString() {
  return "Address [houseno=" + houseno + ", city=" + city + "]";
}

}
