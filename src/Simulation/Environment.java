/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Simulation;

import java.util.logging.Logger;
import ws3dproxy.CommandUtility;
import ws3dproxy.WS3DProxy;
import ws3dproxy.model.Creature;
import ws3dproxy.model.World;

/**
 *
 * @author Danilo
 */
public class Environment
{
    Logger logger = Logger.getLogger(Environment.class.getName());
    WS3DProxy proxy = null;
    //SoarBridge soarBridge = null;
    Creature c = null;
    World w = null;

    public Environment(Boolean prepareEnviromentAndStartGame)
    {
        proxy = new WS3DProxy();
        //proxy.connect();
        try {
        w = proxy.getWorld();
        w.reset();
        c = proxy.createCreature(100,100,0);
        c.start();
        w.grow(1);

        if (prepareEnviromentAndStartGame)
        {
            // Create Simulation Enviroment - Bricks
            CommandUtility.sendNewBrick(4,747.0,2.0,800.0,567.0);
            CommandUtility.sendNewBrick(4,50.0,-4.0,747.0,47.0);
            CommandUtility.sendNewBrick(4,49.0,562.0,796.0,599.0);
            CommandUtility.sendNewBrick(4,-2.0,6.0,50.0,599.0);            
        }
        } catch (Exception e) {
            logger.severe("Error in starting the Environment ");
            e.printStackTrace();
        }
    }
    
    public Creature getCreature() {
        return(c);
    }

    
}
