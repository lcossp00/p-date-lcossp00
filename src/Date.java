public class Date{
	 private int _day, _month, _year;
	
public Date(int day, int month, int year){
	_day = day;
	_month = month;
	_year = year;
}
	public int getDay(){
		return this.day;
	}
	public int getMonth(){
		return this.month;
	}
	public int getYear(){
		return this.year;
	}

	public boolean isSameDay(Date another){

		if(this.day == another.getDay()){
			return true;
		}else{
			return false; 
		}
	}
	public boolean isSameMonth(Date another){

		return (this.month == another.getMonth());
	}

	public boolean isSameYear(Date another){

		return (this.year == another.getYear());
	}













}
