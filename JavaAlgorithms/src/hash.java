
public class hash {
	int hValue = 31;
	String arr[][];
	
	public hash(){
		arr = new String[10000][100];
	}
	
	//TODO: return a integer to use as the placement 
	private int hashFunt(String var){
		int varValue = 0; 
		for(int i = 0; i < var.length(); i++){
			 varValue += var.charAt(i);
		}
		
		return (varValue * hValue) % arr.length;
	}
	
	//return an array with the same values of arr but doubled
	private String[][] doubArr(String arr[][]){
		return arr;
	}
	
	// Doubles the inner array;
	private String[][] doubleInnerArr(String arr[][], int innerArrIndex){
		return arr;
	}
	
	//TODO: Add add the String to the specific position in the hash
	private void add(String var){
		int outArrIndex= hashFunt(var);
		System.out.println(outArrIndex);
		if(outArrIndex > arr.length) doubArr(arr);
		
		int innerArrLength = this.arr[outArrIndex].length;
		
		int tempCount = 0;
		while(tempCount < this.arr[outArrIndex].length ){
			if(this.arr[outArrIndex][tempCount] == null){
				this.arr[outArrIndex][tempCount] = var;
				break;
			}else{
				tempCount++;
			}
		}
	}
	
	private int getCount(String var){
		int outArrIndex = hashFunt(var);
		int varCount = 0;
		int tempCount = 0;
		while(tempCount < this.arr[outArrIndex].length ){
			if(this.arr[outArrIndex][tempCount] == null) break;
			
			if(this.arr[outArrIndex][tempCount].equals(var)){
				varCount++;
			}
			
			tempCount++;

		}
		
		return varCount;
	}
	
	public static void main(String[] args){
		hash obj = new hash();
		obj.add("Hello");
		obj.add("Hello");
		obj.add("Hello");
		obj.add("How");
		obj.add("How");
		obj.add("Are");
		obj.add("Hello");
		obj.add("Hello");
		obj.add("Hello");
		
		System.out.println(obj.getCount("Hello"));
	}
	
	
}
