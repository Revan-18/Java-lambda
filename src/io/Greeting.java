package io;

public class Greeting {
    public void greet(Greet greet){
        greet.perform();

    }


    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        Greet helloWorld = new HelloWorld();
        greeting.greet(helloWorld);

        //in a way we're implementing the interface
        Greet myLambda = ()-> System.out.println("Hello there from lambda");
        greeting.greet(myLambda);

        Greet anonymousInnerClass = new Greet() {
            public void perform() {
                System.out.println("Hello world from anonymousInnerClass");
            }
        };

        myLambda.perform();
        anonymousInnerClass.perform();
    }
}
