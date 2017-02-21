/* Opens a drawing panel, and draws two hyperbolas
 * Submission Confirmation: 7e7b8012-c605-4fa4-bb70-03f5bfc03c72
 */

import java.awt.*;

public class Hyperbola {
  
  // The width and height of the DrawingPanel.
  public static final int PANEL_SIZE = 512;
  //The pixel interval for the left hyperbola
  public static final int LEFT_INTERVAL = 32;
  //The pixel interval for the right hyperbola
  public static final int RIGHT_INTERVAL = 8;
  
  
  /*! \brief draws two hyperbolas.
   */
  public static void main(String[] args) {
    System.out.println("Lab 4 written by GREGORY V ROBERTS");
    
    DrawingPanel panel = new DrawingPanel(PANEL_SIZE, PANEL_SIZE);
    Graphics g = panel.getGraphics();
    
    for(int ii = 0; ii < PANEL_SIZE; ii += LEFT_INTERVAL) {
      g.drawLine(0, ii, ii, PANEL_SIZE);
    }
    
    for(int ii = PANEL_SIZE; ii > 0; ii -= RIGHT_INTERVAL) {
      g.drawLine(PANEL_SIZE, ii, ii, 0);
    }
  }
}
