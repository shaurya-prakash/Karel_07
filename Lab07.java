  	//Torbert, e-mail: smtorbert@fcps.edu
	//version 4.22.2003

   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
    public class Lab07
   {
       public static void main(String[] args) 
      {
        String filename = JOptionPane.showInputDialog("What robot world?");
         String type = JOptionPane.showInputDialog("What type of climber?");
         String avenue = JOptionPane.showInputDialog("What x-coordinate?");
         int x = Integer.parseInt(avenue);
      
         Display.openWorld("maps/" + filename + ".map");
         Display.setSize(17, 15);
         Display.setSpeed(10);
      
         if(type.equals("Climber"))
         {
            Mountain.explore( new Climber(x, 1, Display.NORTH, 1) );
         }
         else if(type.equals("HillClimber"))
         {
            Mountain.explore( new HillClimber(x, 1, Display.NORTH, 1) );
         }
         else if(type.equals("StepClimber"))
         {
            Mountain.explore( new StepClimber(x, 1, Display.NORTH, 1) );
         }
         else
         {
            System.out.println("Invalid robot type.");
         }
      }
   }