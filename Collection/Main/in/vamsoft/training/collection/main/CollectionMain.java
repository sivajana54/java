
package in.vamsoft.training.collection.main;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import in.vamsoft.training.collection.CollectionExample;
class Name implements Comparator<CollectionExample>{

  @Override
  public int compare(CollectionExample o1, CollectionExample o2) {
    return o1.getName().compareToIgnoreCase(o1.getName());
  }

 

}
 
public class CollectionMain  {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
Set<CollectionExample> list =new TreeSet<>();
Set<CollectionExample> name =new TreeSet<>(new Name());
CollectionExample s1= new CollectionExample(2,"siva",002);
CollectionExample s2 =new CollectionExample(1,"bala",001);
CollectionExample s3 = new CollectionExample(3,"demo",003);
 list.add(s1);
 list.add(s2);
 list.add(s3);
 name.add(s1);
 name.add(s2);
 name.add(s3);
   System.out.println(list);
   System.out.println(name);
  }

}


