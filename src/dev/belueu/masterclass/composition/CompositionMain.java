package dev.belueu.masterclass.composition;

public class CompositionMain {
    public static void main(String[] args) {
        System.out.println("---Hello Java Composition---\n");

        System.out.println("---PC Composition Example---");
        Case aCase = new Case("220B", "DELL", "600W", new Dimensions(20,20, 10));
        Monitor monitor = new Monitor("ExtraWide", "DELL", 27, new Resolution(1900, 1600));
        Motherboard motherboard = new Motherboard("GB-2003", "Gygabyte", 8, 2, "v5.2");

        PC pc = new PC(aCase, monitor, motherboard);

        pc.getMonitor().drawPixelAt(1200, 300, "blue");
        pc.getMotherboard().loadProgram("Linux Mint");
        pc.getaCase().pressPowerButton();
        System.out.println();

        System.out.println("---Room Composition Example---");
        Wall northWall = new Wall("north");
        Wall southWall = new Wall("south");
        Wall eastWall = new Wall("east");
        Wall westWall = new Wall("west");

        Ceiling ceiling = new Ceiling(3, 12334123);
        Bed bed = new Bed("classic", 2, 60, 2, 1);
        Lamp lamp = new Lamp("Modern", false, 20);
        BedRoom bedRoom = new BedRoom("Cris", eastWall, westWall, northWall, southWall, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
}
