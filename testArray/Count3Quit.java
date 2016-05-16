public class Count3Quit{
	public static void main(String[] args){
		boolean[] array = new boolean[500];
		for(int i = 0;i<array.length;i++){
			array[i] = true;
		}
		int leftCount = array.length;
		int countNum = 0;
		int index = 0;
		
		while(leftCount>1){
			if (array[index]==true){
				countNum++;
				if(countNum==3){
					countNum = 0;
					array[index]=false;
					leftCount --;
				}
			}
			index++;
			if(index == leftCount){
				index = 0;
			}
		}
		for(int i = 0; i<array.length;i++){
			if(array[i]){
				System.out.println(i);
			}
		}

	}
}
