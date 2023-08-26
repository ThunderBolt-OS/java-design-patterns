// Product class
class House {
    private String foundation;
    private String walls;
    private String roof;
    private String windows;
    private String doors;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        return "House with " + foundation + " foundation, " + walls + " walls, " +
               roof + " roof, " + windows + " windows, and " + doors + " doors.";
    }
}

// Abstract builder interface
interface HouseBuilder {
    void buildFoundation();
    void buildWalls();
    void buildRoof();
    void buildWindows();
    void buildDoors();
    House getHouse();
}

// Concrete builder
class ConcreteHouseBuilder implements HouseBuilder {
    private House house = new House();

    @Override
    public void buildFoundation() {
        house.setFoundation("concrete");
    }

    @Override
    public void buildWalls() {
        house.setWalls("brick");
    }

    @Override
    public void buildRoof() {
        house.setRoof("slate");
    }

    @Override
    public void buildWindows() {
        house.setWindows("glass");
    }

    @Override
    public void buildDoors() {
        house.setDoors("wooden");
    }

    @Override
    public House getHouse() {
        return house;
    }
}

// Director class
class Architect {
    private HouseBuilder houseBuilder;

    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse() {
        return houseBuilder.getHouse();
    }

    public void designHouse() {
        houseBuilder.buildFoundation();
        houseBuilder.buildWalls();
        houseBuilder.buildRoof();
        houseBuilder.buildWindows();
        houseBuilder.buildDoors();
    }
}

// Client code
public class Main {
    public static void main(String[] args) {
        Architect architect = new Architect();
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();

        architect.setHouseBuilder(concreteHouseBuilder);
        architect.designHouse();

        House house = architect.getHouse();
        System.out.println("Designed house: " + house);
    }
}
