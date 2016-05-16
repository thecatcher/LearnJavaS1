public class testDate{
	public static void main(String[] args){
		Date[] days = new Date[3];
		days[0] = new Date(2016,2,1);
		days[1] = new Date(2012,2,1);
		days[2] = new Date(2016,3,1);
		
		for(int i =0;i<days.length;i++){
			System.out.println(days[i]);
		}
		
		bubbleSort(days);
		System.out.println();
		for(int i =0;i<days.length;i++){
			System.out.println(days[i]);
		}
	}
	public static Date[] bubbleSort(Date[] a){
		int len = a.length;
		for(int i = len-1;i>=1;i--){
			for(int j =0;j<=i-1;j++){
				if(a[j].compare(a[j+1])>0){
					Date temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp; 
				}
			}
		}
		return a;
	}
}
class Date{
	private int year,month,day;
	Date(int year,int month,int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int compare(Date date){
		return this.year > date.year? 1 
		: this.year<date.year ? -1 
		: this.month > date.month ? 1 
		: this.month < date.month ? -1 
		: this.day > date.day ? 1
		: this.day < date.day ? -1 : 0; 
	}
	public String toString(){
		return "year:month:day--" +this.year+"-"+this.month+"-"+this.day;
	}
}