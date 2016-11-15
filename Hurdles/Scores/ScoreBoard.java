import greenfoot.Actor;
import greenfoot.GreenfootImage;
 import greenfoot.UserInfo;
 import java.awt.Color;
 import java.util.List;
 import java.util.ArrayList; 

public class ScoreBoard
   extends Actor
{
  private static final int GAP = 10;
   private static final int HEADER_TEXT_HEIGHT = 25;
  private static final Color MAIN_COLOR = new Color(50, 50, 50);
   private static final Color SCORE_COLOR = new Color(200, 100, 50);
  private static final Color BACKGROUND_COLOR = new Color(100, 100, 100);
  private static final Color BACKGROUND_HIGHLIGHT_COLOR = new Color(150, 150, 250);

  public ScoreBoard()
  {
    setImage(new GreenfootImage(300, 400));
    drawScores();
   }

  private void drawString(String text, int x, int y, Color color, int height)
  {
    getImage().drawImage(new GreenfootImage(text, height, color, new Color(0, true)), x, y);
  }

  private void drawScores()
   {
    int pixelsPerUser = 70;
   
  int numUsers = (getImage().getHeight() - 35) / 70;
 int topSpace = getImage().getHeight() - numUsers * 70 - 10;
   
    getImage().setColor(BACKGROUND_COLOR);
     getImage().fill();
    
     drawString("All Time", getImage().getWidth() / 2 - 35, topSpace - 25 - 5, MAIN_COLOR, 25);
    
     drawUserPanel(10, topSpace, getImage().getWidth() - 10, topSpace + numUsers * 70, numUsers);
   }
  
  private void drawUserPanel(int left, int top, int right, int bottom, int numUsers)
   {
                  List users = UserInfo.getTop(0);
                  List newusers = new ArrayList();
                  int t = 0;
                  for(Object obj : users) {
                      t ++;
                      if(obj instanceof UserInfo) {
                          UserInfo ui = (UserInfo)obj;
                          if((ui.getInt(0) == 1) && (t < numUsers+1)) {
                              newusers.add(ui);
                            }
                        }
                    }
    getImage().setColor(MAIN_COLOR);
     getImage().drawRect(left, top, right - left, bottom - top);
    if (users == null) {
      return;
   }
     UserInfo me = UserInfo.getMyInfo();
    int y = top + 10;
                  int a = 1;
    for (Object obj : newusers)
    {
      UserInfo playerData = (UserInfo)obj;
       Color c;
      
      if ((me != null) && (playerData.getUserName().equals(me.getUserName()))) {
         c = BACKGROUND_HIGHLIGHT_COLOR;
       } else {
        c = BACKGROUND_COLOR;
       }
      getImage().setColor(c);
      getImage().fillRect(left + 5, y - 10 + 1, right - left - 10, 69);
       
       int x = left + 10;
      //drawString("#" + Integer.toString(playerData.getRank()), x, y + 18, MAIN_COLOR, 14);
       drawString("#" + Integer.toString(a), x, y + 18, MAIN_COLOR, 14);
       x += 50;
       drawString(Integer.toString(playerData.getScore()), x, y + 18, SCORE_COLOR, 14);
       x += 80;
       getImage().drawImage(playerData.getUserImage(), x, y);
       x += 55;
       drawString(playerData.getUserName(), x, y + 18, MAIN_COLOR, 14);
       y += 70; a++;
     }
}
}

