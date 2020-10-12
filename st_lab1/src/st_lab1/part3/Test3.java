package st_lab1.part3;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static st_lab1.part3.Fabric.*;

public class Test3 {



    @Test
    public void TestCreateEngine(){
        Engine en = CreateEngine();
        assertNotNull(en);
        assertTrue(en instanceof PhotonEngine);
    }

    @Test
    public void TestCreateShip(){
        SpaceShip ship = CreateShip();
        assertNotNull(ship);
    }

    @Test
    public void TestAddCrew(){
        SpaceShip ship = CreateShip();
        PhysicalPrinciple pp = CreatePP();
        assertNotNull(pp);
        assertTrue(pp instanceof AtomMoleculeRelationship);
        ship.AddCrewMembersAccordingToPhysicalPrinciple(pp);
        assertEquals("There should be 4 crew members on the ship", 4, ship.GetNumCrewMembers());

        for (int i = 0; i < 4; ++i)
            assertEquals("All crew members should feel uncomfortable", PersonFeeling.UNCOMFORTABLE, ship.GetCrewMember(i).feeling);

        // test crew has different ID's
        Set<Integer> ids = new HashSet<>();
        for (int i = 0; i < 4; ++i)
            ids.add(ship.GetCrewMember(i).id);
        assertEquals("Duplicate ID's found", 4, ids.size());
    }
}
