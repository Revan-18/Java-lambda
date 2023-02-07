package io;

public class TypeInferenceLambda {

    public static void main(String[] args) {

        //internally lambda expression implements the interface function
        //it knows lambda expression referring String length interface and method takes String arg
        // so no need to mention that arg type.
        StringLength stringLength = s -> s.length();
        System.out.println(stringLength.length("Hello Buddy"));

        Thread t=new Thread(()-> System.out.println("hello from runnable"));
        t.start();

        perform(s -> s.length());
    }

    public static void perform(StringLength l){
        System.out.println(l.length("hello Revanasidda"));
    }






    interface StringLength{
        int length(String s);
    }
}
