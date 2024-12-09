package main.rocket;

import main.interfaces.Protectable;

public class Stair extends Chamber implements Protectable {
    @Override
    public void absorbImpact(int impactReceived) {
        CurrentState = CurrentState - impactReceived + protectionLevel;
        if (CurrentState < 0) {
            throw new IllegalArgumentException("Pookie dookie has to fix the Stair of the Rocket!");
        }

        System.out.println("Stair's damage absorbed: " + impactReceived);
        System.out.println("Current protection level is " + CurrentState);
    }
}
