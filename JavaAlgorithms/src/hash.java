
public class hash {
	int hValue = 8191;
	int arr[];
	public hash(){
		arr = new int[100];
	}
	
	//TODO: return a integer to use as the placement 
	public int hashFunt(int num){
		return (num % 8191);
	}
	
	//TODO: return an array with the same values of arr but doubled
	public int[] doubArr(int arr[]){
		return arr;
	}
	
	//TODO: Add add the number to the specific position in the hash
	public void add(int num){
		
	}
	
	
}
