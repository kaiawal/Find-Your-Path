import java.util.Scanner; 
class IfElseStatements{
  public static void main(String args[])
  {
      System.out.println("Welcome. This is an interactive story where you decide where to go. Just type in the response requested and press enter to follow the path."); // intro to begin
      System.out.println("Press ENTER to continue...\r\n"); 
      Scanner scannerff = new Scanner(System.in); //creates new scanner that's user throughout the file.
      scannerff.nextLine();
      System.out.println("You look around and notice that you're in a dense forest. There are 2 paths worn into the ground. There's one to the left and one to the right."); // pathways
      System.out.println("Do you want to take the path to the LEFT or the RIGHT? \r\n"); // left or right
      String lerigg =  scannerff.nextLine()
      lerigg = lerigg.toLowerCase(); // makes it so everything is the same case

      if (lerigg.equals("left")) { // first if else statement
        System.out.println("As you walk on the left path, you notice the forest starts to turn into a swamp. You notice walking along the path a house built into the stump of a tree."); // swamp 
        System.out.println("Do you want to GO to the house or CONTINUE on the path.\r\n"); // Go or continue
        String shrekk =  scannerff.nextLine();
        shrekk = shrekk.toLowerCase();

        if (shrekk.equals("go")) { // if you say go
          System.out.println("As you approach the house, you overhear a loud arguement between two people inside the shack. \nDo you want to KNOCK or INVESTIGATE the house?\r\n"); // approaching shrek's house
          String knoinvv =  scannerff.nextLine();
          knoinvv = knoinvv.toLowerCase();

          if (knoinvv.equals("knock")) { // happy ending 
            System.out.println("You knock and wait a few seconds, but the two are still arguing. You knock louder and suddent ceases. The door is flung open by an angry Shrek. \r\n'What do you want?' he asks. Donkey shoves passed Shrek and says. \r\n'Come on Shrek, this is a chance to be nice. Invite them in!' Sherek relents and moves to the side. Do you ENTER or RUN away?\r\n");
            String entlea = scannerff.nextLine(); 
            entlea = entlea.toLowerCase(); // enter or run

            if (entlea.equals("enter")) { // happy ending
              System.out.println("You walk past Shrek and sit in one of the chairs at the table. Shrek walks over to a cabinet and pulls out 3 drinks and distributes them. You all stare at each other in akward silence. Donkey breaks the tension and starts up a conversation. As the night went on, you got more of a liking towards Shrek and Donkey. When they invited you to join them the next day to hang out, you happily agreed. THE END");
            }

            else { // sad ending
              System.out.println("You turn around and run as fast as you can away from Shrek and Donkey and end up on the edge of a cliff. You turn around to run in another direction but Shrek is standing in front of you with an angry sneer. He starts yelling at you, but the power of his yelling makes you fall back off the cliff and you die. THE END");
            }
          }

          else if (knoinvv.equals("investigate")); //sad ending
          System.out.println("You start to walk around the house. You notice a tiny outhouse next to the house. As you peek inside the window, you see Shrek and Donkey arguing. Your foot slips and you fall. The arguing stops. You watch from the ground as an angry Shrek comes stomping out and yells in your face. He grabs your ankle and tosses you 300 feet in the air to your death. THE END");
        }

        else if (shrekk.equals("continue")) { // wizard math man
          System.out.println("You continue on the path and notice a man sitting on a rock. He calls you over and asks if you want to try for a prize by answering a few questions. Do you say YES or NO?");
          String yesnos = scannerff.nextLine();
          yesnos = yesnos.toLowerCase();

          if (yesnos.equals("yes")) { // math option
            System.out.println("'Great!' the man replies. These are pretty simple. What is 2 + 5?");
            int twofiv = scannerff.nextInt();
            System.out.println("Ok, what is 5 x 10?");
            int fivten = scannerff.nextInt();
            System.out.println("Last one. What is 40 + 18?");
            int foreit = scannerff.nextInt();

            if (twofiv == 7 || // boolean statement
                fivten == 50 ||
                foreit == 58) {
                  System.out.println("The man breaks into a big grin. 'Good job!!' Here's your prize. The man pulls a staff from his jacket and gives it to you. You wave it around and suddenly, you're in your bed. You realize this was all a dream. THE END");
                }

            else { // sad ending
              System.out.println("The man suddenly gets red in the face and stands up. With unatural speed, he stabs you. THE END");
            }
          }

          else if (yesnos.equals("no")) { // sad ending
            System.out.println("The man suddenly gets red in the face and stands up. With unatural speed, he stabs you. THE END");
          }
        }
      }

      else if (lerigg.equals("right")) { // fire
        System.out.println("As you walk further into the forest, it smells like somethings on fire. Do you head TOWARD the fire or STAY on the path?");
        String fireif = scannerff.nextLine();
        fireif = fireif.toLowerCase();

        if (fireif.equals("toward")) { // sad vs happy ending
          System.out.println("You walk towards the smell and your eyes start to water from the smoke. You see the light of the fire in the distance and realize that its a forestfire! Do you CALL 911 or RUN?");
          String callfire = scannerff.nextLine();
          callfire = callfire.toLowerCase();

          if (callfire.equals("call")) { // happy ending
            System.out.println("You call 911 and tell them the situation. They said that they're coming and to move to safe location. You sit on a log and wait for the firefighters to show up. After 15 minutes, you hear the sirens in the distance. After they pull up at the bottom of the hill, they motion you to climb down to them.");
            System.out.println("They tell you to enter the truck and drive you over to the police station. You call your family and they come and pick you up. THE END");
          }

          else { // sad ending
            System.out.println("You turn around and run away as fast as you can, but the smell of hte fire isn't dissapating. You still smell it no matter where you go. You realize then, you're surrounded by the fire. The smoke starts to get to you and you start choking. You can't get any air in your lungs and pass out and die. THE END");
          }
        }

        else if (fireif.equals("stay")) { // sad ending
          System.out.println("As you stay on the path, you notice that the fire smell isn't going away, it's growing. You veer off the path away from the fire and realize that direction smells like smoke too. You're surrounded. The smoke starts to get to you and you start choking. You can't get any air in your lungs and pass out and die. THE END");
        }
      }
      scannerff.close();
  }
}