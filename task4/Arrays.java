class Arrays{
	int[] numbers = {1,2,3};
	String[] carBrands = {"hans", "billy", "carl"};
	boolean[] state = {false, true, false};

	public void printString(){
		for(int i = 0; i < carBrands.length-1; i++){
			print(carBrands[i]);
		}
	}
	public void printSum(){
		return numbers[0]+numbers[1]+numbers[2];
		}
	public void printSumHalf(){
		return (numbers[0]+numbers[1]+numbers[2])/2;
		}


}
