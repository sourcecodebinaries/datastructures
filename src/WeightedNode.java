import java.util.*;

public class WeightedNode implements Comparable<WeightedNode>{
	
	String name;
	int index;
	int distance;
	ArrayList<WeightedNode> neighbors = new ArrayList<>();
	Boolean isVisited = false;
	HashMap<WeightedNode,Integer> weightMap = new HashMap<>();
	WeightedNode parent;
	
	public WeightedNode(String name, int index) {
		this.name = name;
		this.index = index;
		distance = Integer.MAX_VALUE;		
	}
	
	@Override
	public String toString()
	{
		return name;
	}
	
	@Override
	public int compareTo(WeightedNode o) {
		
		return this.distance-o.distance;	
		
	}

}
