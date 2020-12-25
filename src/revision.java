import java.util.ArrayList;
import java.util.List;

//parent
class revision {
   void play(){
       System.out.println("I'm playing");
   }
}
interface revision2 {
    abstract void play2();
}
 interface revision3 {
    abstract void play3();
}
//child
class muit implements revision2,revision3 {
    void play(){
        System.out.println(" Im playing football");
    }

     public void play2(){
        System.out.println(" Im playing ");
    }
    public void play3(){
        System.out.println(" Im playing football");
    }
    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
        for(int i=1;i<10;i++)
            al.add(i);

        for(int k : al ){
            System.out.println(k);
        }

    }
}

/*
 public int add(int a , int b ){
        return  a+b;
    }
    public int add(int a , int b ,int c){
        return a+b+c;
    }
revision obj = new muit();
       int age=30;
       if(age > 18 )
           System.out.println("You can vote");
       else if(age<18 ) {
           System.out.println("you cannot vote");
       }
       else {
           System.out.println("not a valid age");
       }
       for(int i=1;i<=10;i++){
           System.out.println(i);
       }
       int ptr=0;
       while ( ptr<10 ){
           System.out.println(ptr);
           ptr++;
       }
       ptr=0;

       do{
           System.out.println(ptr);
           ptr++;
       }while (ptr < 10);

       System.out.println(obj.add(2,3,3));
 */

//syllabus
//java
//conditionals
//loops
//classes and objects - OOPs
//Abstraction
//Polymorphism
//Arrays and linked list

//algorithms
//algorithm analysis
//searching and sorting algo
