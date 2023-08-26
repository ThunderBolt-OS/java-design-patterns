// Product class
class House {
    private String foundation;
    private String walls;
    private String roof;
    private String windows;
    private String doors;
    private boolean hasSwimmingPool;

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

    public void setSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }

    @Override
    public String toString() {
        String poolStatus = hasSwimmingPool ? "with a swimming pool" : "without a swimming pool";
        return "House with " + foundation + " foundation, " + walls + " walls, " +
               roof + " roof, " + windows + " windows, and " + doors + " doors, " + poolStatus + ".";
    }
}

// Abstract builder interface
interface HouseBuilder {
    void buildFoundation();
    void buildWalls();
    void buildRoof();
    void buildWindows();
    void buildDoors();
    void buildSwimmingPool();
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
    public void buildSwimmingPool() {
        house.setSwimmingPool(false);
    }

    @Override
    public House getHouse() {
        return house;
    }
}

class HouseWithPoolBuilder implements HouseBuilder {
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
    public void buildSwimmingPool() {
        house.setSwimmingPool(true);
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
        houseBuilder.buildSwimmingPool();
    }
}

// Client code
public class Example {
    public static void main(String[] args) {
        Architect architect = new Architect();
        HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        HouseBuilder houseWithPoolBuilder = new HouseWithPoolBuilder();

        architect.setHouseBuilder(concreteHouseBuilder);
        architect.designHouse();
        House houseWithoutPool = architect.getHouse();
        System.out.println("Designed house without a swimming pool: " + houseWithoutPool);

        architect.setHouseBuilder(houseWithPoolBuilder);
        architect.designHouse();
        House houseWithPool = architect.getHouse();
        System.out.println("Designed house with a swimming pool: " + houseWithPool);
    }
}
