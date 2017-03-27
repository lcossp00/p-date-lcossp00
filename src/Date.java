public class Date{
	 private int _day, _month, _year;
	
public Date(int day, int month, int year){ //Constructor
	_day = day;
	_month = month;
	_year = year;
}
	public int getDay(){
		return this._day;
	}
	public int getMonth(){
		return this._month;
	}
	public int getYear(){
		return this._year;
	}

	public boolean isSameDay(Date another){ //Desplegado para entenderlo mejor

		if(this._day == another.getDay()){
			return true;
		}else{
			return false; 
		}
	}
	public boolean isSameMonth(Date another){

		return (this._month == another.getMonth());
	}

	public boolean isSameYear(Date another){

		return (this._year == another.getYear());
	}
	public boolean isSame(Date another){
		if(this._day == another.getDay() && this._month == another.getMonth() && this._year == another.getYear()){
		return true;
		}else{
		return false;
		}
	}


	public String getNameMonth(){
		String nameMonth="Enero";
		switch(this._month){
			case 1: nameMonth="Enero";
				break;
			case 2: nameMonth="Febrero";
				break;
			case 3: nameMonth="Marzo";
				break;
			case 4:nameMonth="Abril";
				break;
			case 5:nameMonth="Mayo";
				break;
			case 6:nameMonth="Junio";
				break;
			case 7:nameMonth="Julio";
				break;
			case 8:nameMonth="Agosto";
				break;
			case 9:nameMonth="Septiembre";
				break;
			case 10: nameMonth="Octubre";
				break;
			case 11: nameMonth="Noviembre";
				break;
			case 12:nameMonth="Diciembre";
				break;
		}
		return nameMonth.toString();
	} 
	

public int getNumDaysOfMonth(){
	int numOfDays=0;
	switch(this._month){
		case 1: //next
		case 3: //next
		case 5: //next
		case 7: //next
		case 8: //next
		case 10: //next
		case 12: numOfDays=31;
			break;
		case 4: //next
		case 6: //next
		case 9: //next
		case 11: numOfDays=30;
			break;
		case 2:numOfDays=28;
			break;
	}
	return numOfDays;
}

public boolean checkDayOfMonth(){
	if(this._day > this.getNumDaysOfMonth()){
		return false;
	}else{
		return true;
	}
}
}
