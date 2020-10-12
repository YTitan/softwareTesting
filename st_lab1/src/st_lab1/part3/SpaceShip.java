package st_lab1.part3;

import com.sun.istack.internal.NotNull;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Vector;

public class SpaceShip {
    private String name;
    private boolean isSailing;
    private Engine engine;
    private Vector<Person> crew;

    public boolean GetIsSailing(){
        return isSailing;
    }

    public SpaceShip(@NotNull String name, Engine engine){
        this.name = name;
        crew = new Vector<>();
    }

    public void StartSailing(){
        System.out.println("Sailing");
        isSailing = true;
    }

    public int GetNumCrewMembers(){
        return crew.size();
    }

    private void AddCrewMember(Person p){
        crew.add(p);
    }

    public void AddCrewMembersAccordingToPhysicalPrinciple(PhysicalPrinciple pp){
        Random rand = new Random();
        rand.setSeed(pp.GetSeed());
        Set<Integer> rands = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            int r = rand.nextInt();
            while(rands.contains(r))
                r = rand.nextInt();
            rands.add(r);
            AddCrewMember(new Person(Math.abs(r)));
        }
    }

    public Person GetCrewMember(int i){
        return crew.get(i);
    }
}
