//! Enums
//--> An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

public class Enums {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    Level myVar1 = Level.MEDIUM; 
    Level myVar2=Level.LOW;
     Level myVar3=Level.HIGH;
    System.out.println(myVar1+"\n"+myVar2+"\n"+myVar3);
  }
}



//! Use Case example:
//? When u have  fixed set of known values
// enum Day {
//     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
// }
// public class EnumExample {

//     public static void main(String[] args) {
    
//         Day today = Day.FRIDAY;
//         switch (today) {
//             case MONDAY:
//                 System.out.println("It's Monday! Let's start the week.");
//                 break;
//             case TUESDAY:
//                 System.out.println("It's Tuesday! Keep going.");
//                 break;
//             case WEDNESDAY:
//                 System.out.println("It's Wednesday! Halfway through.");
//                 break;
//             case THURSDAY:
//                 System.out.println("It's Thursday! Almost the weekend.");
//                 break;
//             case FRIDAY:
//                 System.out.println("It's Friday! Weekend is near!");
//                 break;
//             case SATURDAY:
//                 System.out.println("It's Saturday! Time to relax.");
//                 break;
//             case SUNDAY:
//                 System.out.println("It's Sunday! Rest and recharge.");
//                 break;
//             default:
//                 System.out.println("Invalid day.");
//         }
//     }
// }
