public class Date{
	 private int day;
	 private int month;
	 private int year;


public Date(int day, int month, int year){ //Constructor
	this.day = day;
	this.month = month;
	this.year = year;
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

	public boolean isSameDay(Date another){ //Desplegado para entenderlo mejor

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
	public boolean isSame(Date another){
		if(this.day == another.getDay() && this.month == another.getMonth() && this.year == another.getYear()){
		return true;
		}else{
		return false;
		}
	}

	public String getNameMonth(){
		String nameMonth="Enero";
		switch(this.month){
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
return	this.getNumDaysOfMonth(this.month);
}
private int getNumDaysOfMonth(int month){ //Porque private
int numOfDays=0;
	switch(this.month){
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
	if(this.day > this.getNumDaysOfMonth()){
		return false;
	}else{
		return true;
	}
}

public String seasonForMonth(){
	String estacion="a";
	String primavera="Primavera";
	String verano="Verano";
	String otonio="Otoño";
	String invierno="Invierno";
	switch(this.month){
		case 3:if(this.day<=20){
				estacion=invierno;
			}if(this.day>20){
				estacion=primavera;
			}
			break;
		case 4: //next
		case 5: estacion=primavera;
			break;
		case 6: if(this.day<=20){
			 	estacion=primavera;
			}if(this.day>20){
			 	estacion=verano;
			}
			break;
		case 7: //next
		case 8: estacion=verano;
			break;
		case 9: if(this.day<=20){
			 	estacion=verano;
			}if(this.day>20){
			 	estacion=otonio;
			}
			break;
		case 10: //next
		case 11: estacion=otonio;
			break;
		case 12: if(this.day<=20){
			 	estacion=otonio;
			}if(this.day>20){
			 	estacion=invierno;
			}
		case 1: //next
		case 2:	estacion=invierno;
			break;	
	}
	return estacion.toString();
}

public int monthsLeftEndYear(){
	int counter=0;
	for (int i=getMonth();i<12;i++){
	//se puede cambiar el i<=12 por otra cosa?
	//hay forma de declarar la i dentro del for sin que me den errores?
	//Es mas correcto colocar this._month o getMonth()
	counter++;
	}
 	return counter;
}	

public String getDate(){
	String fecha= (getDay()+"/"+getMonth()+"/"+getYear()); 
	return fecha.toString();
}


public String getDatesUntilEndOfMonth(){
	StringBuilder salida= new StringBuilder();
	for(int i=this.day;i<=getNumDaysOfMonth();i++){
	// salida.append(i+"/"+getNameMonth()+"/"+getYear());	
	salida.append(new Date(i, this.month, this.year).toString());
	}
	return salida.toString();
}	

/*
public void printMonthsSameAmountDays(){
	for(int i=1;i<=12;i++){
		if(this.getNumDaysOfMonth(i)==this.getNumDaysOfMonth(this.month)){
			System.out.println(this.getNameMonth(i));
		}
	}		
	
}
*/
public String toString(){
	return this.day+"/"+this.month+"/"+this.year+"\n";
 }

public int countDaysSinceFirstOfYear(){
	int counter=this.day;
	for(int i=1;i<this.month;i++){
		counter=counter+getNumDaysOfMonth();
	}
	return counter;
}
public Date(int year){
	this.year=year;
	this.month=(int) (Math.random()*12+1);
	this.day=(int) (Math.random()*(getNumDaysOfMonth(this.month))+1);
	}
/*
public int getNumGuess(){
	int counter=0;
	Date randomDate;
	boolean end=false;
	while(end=false){
		randomDate=new Date(this.year);
		counter++;
	
		if(this.equals(randomDate)){
			end=true;
		}
	}
	return counter;
}
*/
public int getNumGuess(){
	int counter=0;
	Date randomDate;
	boolean end=false;
	do{
		randomDate=new Date(this.year);
		counter++;
	
		if(this.equals(randomDate)){
			end=true;
		}
	}while(end=false);
	return counter;
}

















}
