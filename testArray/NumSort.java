public class NumSort{
	public static void main(String[] args){
		int[] a = new int[args.length];
		for(int i=0;i<a.length;i++){
			a[i] = Integer.parseInt(args[i]);
		}	
		print(a);
		selectionSort(a);
		print(a);
	}
	private static void selectionSort(int[] a){
		//不是非得放到循环中的变量声明,不要放到循环中. 
		//在循环中声明的时候,每次都要重新分配空间,效率上会受影响.
		int k,temp;
		for(int i=0;i<a.length;i++){
			k =i;
			for(int j=k+1;j<a.length;j++){ 
				if(a[j] < a[k]){
					//这里只需要比较后标注索引即可.
					k=j;
				}
				if(k!=i){
					temp = a[i];
					a[i]=a[k];
					a[k]=temp;
				}
			}
		}
	}
	private static void print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}