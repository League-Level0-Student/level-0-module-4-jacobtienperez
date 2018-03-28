import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happiness = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
       String pet = JOptionPane.showInputDialog("Wut peettt wud u wunt to eat.");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 999999999; i++) {
			
		
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "hau do u wunt to make your pet more tasty. Ur pet shud be the freshest when it's happiness is 21.", "Taste enhancers", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "feed it ", "water", "clean", "pick up feces", "play ball", "walk it", "pet"}, null);
              System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
		  if(task == 0) {
			 feed();
		  }
		  else if(task == 1) {
				  water();
			  }
		  else if(task == 2) {
			  clean();
		  }
		  else if(task == 3) {
			  poop();
		  }
		  else if(task == 4) {
			  play();
		  }
		  else if(task == 5) {
			  walk();
		  }
		  else if(task == 6) {
			  pett();
		  }
		  
				
			

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	               if(happiness == 21) {
	            	   JOptionPane.showMessageDialog(null, "Ur pet is redy for dinner");
	            	   break;
	               }
		}
	               }
                 
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

static void pett(){
	JOptionPane.showMessageDialog(null, "petting it gives the pet more carbohydrates");
	
	happiness++;
}
static void feed(){
	JOptionPane.showMessageDialog(null, "feeding it gives the pet more fat ");
	
	happiness++;
}

static void water(){
	JOptionPane.showMessageDialog(null, "watering it gives the pet more Vitamin A ");
	
	happiness++;
}

static void clean(){
	JOptionPane.showMessageDialog(null, "cleaning it gives the pet less germs and harmful viruses/parasites ");
	
	happiness++;
}

static void poop(){
	JOptionPane.showMessageDialog(null, "picking up it's feces gives the pet more Vitamin C ");
	
	happiness++;
}

static void play(){
	JOptionPane.showMessageDialog(null, "playing with it gives the pet more Vitamin A ");
	
	happiness++;
}

static void walk(){
	JOptionPane.showMessageDialog(null, "Walking it gives the pet more Vitamin B ");
	
	happiness++;
}
}