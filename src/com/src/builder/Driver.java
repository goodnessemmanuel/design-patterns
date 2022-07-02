package com.src.builder;

public class Driver {
    public static void main(String[] args) {
        LaunchOrder.Builder builder = new LaunchOrder.Builder();
        LaunchOrder launchOrder = builder.bread("American SandWhich")
                .meat("Turkey")
                .drink("Strawberry")
                .drink("Strawberry")
                .build();

        System.out.println(launchOrder.getBread());
        System.out.println(launchOrder.getDrink());
        System.out.println(launchOrder.getMeat());
        System.out.println(launchOrder.getSausage());
    }
}
