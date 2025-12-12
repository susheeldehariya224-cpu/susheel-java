// class Parent{
// final void show(){
//     System.out.println("Parent show");

// }
// }
    
// class Child extends Parent{
// // void show()// Error
// }











import java.io.*;

class hallo{
    public static void main(String[] args) {
        
try{
    File file=new File("home.html");
    if(file.createNewFile()){
        System.out.println("donee"+ file.getName());
    }else{
        System.out.println("already file created");

    }
} catch (Exception e){
    System.out.println(e);
}

    }
}