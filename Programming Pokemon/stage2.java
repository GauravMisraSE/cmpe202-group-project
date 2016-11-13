import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stage2 extends stage
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
        "                         ",
        "         aaaaa                ",
        "  m                       ",
        "                         ",
        "ppppppppppppppppppppppppp",
        
        
    };
    public stage2()
    {
        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++) // Example of Iteration
            {
                
                int kind="apcm".indexOf(""+map[i].charAt(j));
                
                if(kind<0) continue;
                Actor actor=null;
                if(kind==0) actor=new platform1();
                if(kind==1) actor=new platform2();
                if(kind==2) actor=new platform3();
                if(kind==3) actor=new player();
                addObject(actor, 16+j*32, 16+i*32);
            }
    }
    
}
