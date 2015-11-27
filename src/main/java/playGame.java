
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import javax.xml.bind.JAXBException;

public class playGame {
	
	public String filename = "statesAdjacencyList.txt";
	StatesGraph graph;
	//The computer generated random state
	int randState = randInt(1,51);
	//Number of guesses so far
	int numGuess = 0;
	//Win tracker
	boolean win = false;
	//Variable to track the distance
	int distance =-1;
	
	public void init() throws JAXBException {
		try{
			 graph = new playGame().createGraph();
		}catch(IOException e){
			e.printStackTrace();
		}		
	}
	
	private StatesGraph createGraph() throws FileNotFoundException,IOException, JAXBException {
		String data;
		int num_verticies;
		String[] edges;
		StatesGraph graph;
		BufferedReader in  = new BufferedReader(new FileReader(getClass().getClassLoader().getResource(filename).getFile()));
		
		data = in.readLine();
		num_verticies = Integer.parseInt(data);
		data = in.readLine();
		
		graph = new StatesGraph(num_verticies);
		data = in.readLine();
		while(data != null){
			edges = data.split(" ");
			int v = Integer.parseInt(edges[0].trim());
			int e = Integer.parseInt(edges[1].trim());
			 graph.setEdge(v,e);
			 data = in.readLine();
		 }
		 in.close();
		return graph;
	}

	//returns the minimum number of connections between 2 states 
	public int getDistance(String g){
		int guess = getGuessInt(g);
		if(guess == 0){
			//error
			return -1;
		}
		
		List<Integer> lvl1, lvl2, lvl3;
		lvl1= graph.getEdge(guess);
		//Check 1st level depth
		if(lvl1.contains(randState)){		
			return 1;
		}else {
			//check second level depth
			for(int i = 0; i < lvl1.size(); i++){
				lvl2 = graph.getEdge(lvl1.get(i));
				if(lvl2.contains(randState)){
					return 2;
				}
			}
			//Check 3rd level depth
			for(int i = 0; i < lvl1.size(); i++){
				lvl2 = graph.getEdge(lvl1.get(i));
				for(int x = 0; x < lvl2.size(); x++){
					lvl3 = graph.getEdge(lvl2.get(x));
					if(lvl3.contains(randState)){
						return 3;
					}
				}
			}
		}
			return 4;
	}
	
	//Generates a random integer for the random states
	public int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	//Converts users string guess into an integer for checking
	public int getGuessInt(String state){
		int num = 1;
		try{
			@SuppressWarnings("resource")
			BufferedReader names = new BufferedReader(new FileReader(new File("../resources/stateNames.txt")));
			String line = "";
			
				while((line = names.readLine()) !=null){
					if(line.equalsIgnoreCase(state)){
						return num;
					}else{
						num++;
					}
				}
			names.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		return 0;
	}
}
