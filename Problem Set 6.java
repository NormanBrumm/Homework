

/***********************************************************************************
 *  Student Name: Norman Arthur Brumm IV
 *  Date:         10/10/2017
 *  Class:        CS 3103  
 *  Filename:     UAHashMap.java
 *  Description:  Implementation of a hash map (by A. Mackey)
 ***********************************************************************************/

public class UAHashMap {
	
	protected static final int INITIAL_SIZE = 27;
	protected UAEmployee[] T;
	protected int sortType = 0;
	protected int hashMapSize;
	protected int collisionCount;
	
	/*
	 * Constructors
	 */
	
	public UAHashMap(int size) {
		T = new UAEmployee[size];
	}
	
	public UAHashMap() {
		this(INITIAL_SIZE);
	}
	
	/*
	 * Methods to implement in each class:  insert() and search()
	 */
	
	public void readFile(String filename) {
    		BufferedReader br = new BufferedReader(new FileReader(filename));
		String tbi;
		while((tbi = br.readline())!=null) {
			
			
		}
	}
	
	public void insert(UAEmployee k) {
    int loc = findLoc(k.id);
		
	}
	
	public UAEmployee search(int id) {
		return null;
	}
	
	public int size() {
		return 0;
	}
	
	// This should return the number of times a collision occurred.
	
	public int getCollisionCount() {
		return this.collisionCount;
	}
	
	/*
	 * Runtime code
	 */
	
	public static void main(String[] args) {
		readFile(args[0]);
		return(getCollisionCount());
	}
  
  public static int findLoc() {
    if(args[1].equals("linear"))
      UAHashMapLinearProbing();
    if(args[1].equals("quadratic"))
      UAHashMapQuadraticProbing();    
    if(args[1].equals("double"))  
      UAHashMapDoubleHashing
    
    return null;
  } 
	
	
	/*
	 * Class that will be used to store in the hash map implementation.
	 */
	
	public static class UAEmployee {
		
		public UAEmployee(int id, String lastName, String firstName ) {
			this.firstName = firstName; 
			this.lastName = lastName;
		}
		
		public int id;
		public String firstName;
		public String lastName;
		
		public String toString() {
			return String.format("Hash Code: %15d      Name: %30s %n", this.hashCode(), this.lastName + ", " + this.firstName);
		}
		
		// Be sure to update this method!
		public int hashCode() {
			return 0;
		}
	}
	
	/*
	 * Specific implementations of hash maps
	 */
	
	public static class UAHashMapLinearProbing extends UAHashMap {
		
	}
	
	public static class UAHashMapQuadraticProbing extends UAHashMap {
		
	}

	public static class UAHashMapDoubleHashing extends UAHashMap {
	
	}
	

}
