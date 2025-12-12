// import java.util.*;

// import java.util.*;

//  public class D{
//     public static void main(String[] args) {
//         HashMap<Integer,Integer> map =new HashMap<>();

//     map.put(2, 60);
//     map.put(45, 20);

//     System.out.println(map);
//     System.out.println(map.get(1));
//     System.out.println(map.getOrDefault(11, 10));
//     for(int x:map.keySet()){

//  for(int x:map.keySet()){
//         System.out.println(x);

// }
//     }
// }

//  }

// import java.util.*;

// // import java.util.HashMap;

// public class D {
//    public static void main(String[] args) {
//     HashMap<Integer,Integer> map=new HashMap<>();

//     map.put(1, 30);
//     map.put(2, 60);
//     map.put(45, 20);

//     System.out.println(map);
//     System.out.println(map.get(1));
//     System.out.println(map.getOrDefault(11, 10));
//     for(int x:map.keySet()){
//         System.out.println(x);
// }
// }

// }

// import java.util.*;

// import java.util.HashMap;

// public class D {
//    public static void main(String[] args) {

//       String str = "aabcad";
//       HashMap<Integer, Integer> map = new HashMap<>();
//       for (char ch : str.toCharArray()) {
//          map.put(ch, map.getOrDefault(ch, 0) + 1);
//       }
//       System.out.println(map);
//       for (char ch : str.toCharArray()) {
//          if (map.get(ch) == 1) {
//             System.out.println(ch);
//             break;
//          }
//       }
//    }
// }






// public class D{
//     public static void main(String[] args) {
//         ArrayList<Integer> list=new ArrayList<>();
//         list.add(1);
//         list.add(0);
//         list.add(5);
//         Collection.Sort(list);
//         System.out.println(list);

//     }
// }





// import java.util.ArrayList;
// import java.util.Collections;


// class Student implements Comparable<Student>{
//    String name;
//    int RollN;
//    public Student(int RollN,String name){
//       this.name=name;
//       this.RollN=RollN;


//    }
//    public int compareTo(Student s1){
//       return this.RollN-s1.RollN;

//    }
//    public String toString(){
//       return RollN + " " +name;
//    }
   
// }




// public class D{
// public static void main(String[] args) {

//    ArrayList<Student> list=new ArrayList<>();

//    list.add(new Student(6, "shyam"));
//    list.add(new Student(1, "radha"));
//    Collections.sort(list);
//    System.out.println(list.toString());
// }
// }








// // import java.util.ArrayList;
// // import java.util.Collections;

// // class hello{
// // static void fun(int a){
// //    if(a>0){
// //       fun(--a);
// //       System.out.println(a);
// //       fun(--a);


// //    }
// // }
// // public static void main(String[] args) {
// //    fun(4);
// // }
// // }





// // import java.util.ArrayList;
// // import java.util.Collections;
// // import java.util.Comparator;



// class Student{













//     String name;
//     int RollN;
//     public Student(int RollN,String name){
//         this.name=name;
//         this.RollN=RollN;

//     }
// }

// class NameSorted implements Comparable<Student>{
//     public int compare(Student s1,Student s2){
//         return s1.name.compareTo(s2.name);
//     }
// }

// class hello{
//     public static void main(String[] args) {
//         ArrayList<Student> list=new ArrayList<>();
//         list.add(new Student(1, "shyam"));
//         list.add(new Student(1, "radha"));
//       Collections.sort(list,new NameSorted());
//         for(Student s : list){
//             System.out.println(s.RollN +s.name);
//         }
//     }
// }

















