package org.example;

public class OddEvenElevatorSelStrategy implements ElevatorSelectionStrategy {

    @Override
    public int selectElevator(ExternalRequest extRequest) {
        System.out.print("Selecting elevator according to odd-even strategy and returning elevator id ");
        if (extRequest.getSrcFloor() % 2 == 0) {
            System.out.println(2);
            return 2;
        }
        System.out.println(1);
        return 1;
    }
}
