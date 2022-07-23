package com.model;

public class Greeting {
    interface HelloWorld{
        void greet();
        void greetSomeone(String someone);
    }

    public static void main(String[] args) {
        /**
         * notice that this classes(both the local and anonymous)
         * uses HelloWorld interface
         */
        // local class
        class EnglishGreeting implements HelloWorld{
            String someone;
            @Override
            public void greet() {
                System.out.println("Greeting in english");
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("You're Welcome " + someone);
            }
        }
        EnglishGreeting englishGreeting = new EnglishGreeting();

        // anonymous class
        HelloWorld germanGreetingAnonymous = new HelloWorld() {
            @Override
            public void greet() {
                System.out.println("Begrüßung auf deutsch");
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Gern geschehen ".concat(someone));
            }
        };

        englishGreeting.greet();
        englishGreeting.greetSomeone("Oche");
        germanGreetingAnonymous.greet();
        germanGreetingAnonymous.greetSomeone("Jessika");

    }

}
