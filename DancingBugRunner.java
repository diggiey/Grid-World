import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        DancingBug joe = new DancingBug();
        world.add(new Location(1,1), joe);
        world.show();
    }
}