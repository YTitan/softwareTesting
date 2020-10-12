package st_lab1.part3;

public class Fabric {

    public static Engine CreateEngine(){
        return new PhotonEngine();
    }

    public static SpaceShip CreateShip(){
        return new SpaceShip("Золотое Сердце", CreateEngine());
    }

    public static PhysicalPrinciple CreatePP(){
        return new AtomMoleculeRelationship();
    }
}
