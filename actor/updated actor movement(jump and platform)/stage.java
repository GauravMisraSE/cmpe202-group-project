import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stage here.
 * 
 * @SAGAR MANE
 * @version (a version number or a date)
 */
public class stage extends World
{

    
    String[] map={
        "                         ",
        "                         ",
        "         aaa                ",
        "                         ",
        "              aaaaa     ",
        "                         ",
        "                  ",
        "                         ",
        "               aaaaaaaaaa  ",
        "        aaa                  ",
        "                      ",
        "           aa              ",
        "               aaa       ",
        "                        ",
        "         aaaaa                ",
        "                         ",
        "                          ",
        "                         ",
        "pppppppppppppppppppppppppp",
        
        
    };
    
    public stage()
    { 
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(800, 600, 1);
       
        addObject(new Player(),40,544);
       // setBackground(new GreenfootImage("world.png"));
        //setFields();
       for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++) // Example of Iteration
            {
                
                int kind="apcm".indexOf(""+map[i].charAt(j));
                
                if(kind<0) continue;
                Actor actor=null;
                if(kind==0) actor=new platform1();
                if(kind==1) actor=new platform2();
                if(kind==2) actor=new platform3();
                if(kind==3) actor=new Player();
                addObject(actor, 16+j*32, 16+i*32);                
            }
    }
    public void setFields(){}
}
