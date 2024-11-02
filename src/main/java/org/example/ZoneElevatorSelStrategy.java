package org.example;

public class ZoneElevatorSelStrategy implements ElevatorSelectionStrategy{

    @Override
    public int selectElevator(ExternalRequest extRequest) {
        System.out.println("Selecting elevator according to zone strategy and returning elevator id 3");
        return 3;
    }
}
