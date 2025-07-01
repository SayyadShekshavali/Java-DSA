//! Directory format:
//?  └── root
//?   └── mypack
//?     └── MyPackageClass.java


package mypack;
class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}


//!  compile  Code  and  save it like this :  -d  .
//--> -d used for where to save the code (destination) 
//--> . it is root file (means informed to save at root folder) 