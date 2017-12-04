package in.vamsoft.training.enumprogram;



public class Days {
  public static void main(String[] args)
  {
   
     for (Day d: Day.values())
      
    {
      printToday(d);
    }
  }
  public static void printToday(Day theDay)
  {
    switch (theDay)
    {
    case SUNDAY:    System.out.println("SUNDAY=1");
    break;

      case MONDAY:System.out.println("MONDAY=2");
                  break;
      case TUESDAY:System.out.println("TUESDAY=3");
      break;
      case WEDNESDAY:System.out.println("WEDNESDAY=4");
      break;
      case THURSDAY:  System.out.println("THURSDAY=5");
                      break;

      case FRIDAY:    System.out.println("FRIDAY=6");
                      break;

      case SATURDAY:System.out.println("SATURDAY=7");
      break;
      
      
    }
  }
}

/**
 * Our "Day" enum type
 */
enum Day
{
  SUNDAY(), MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
}



