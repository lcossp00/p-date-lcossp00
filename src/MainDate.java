public class MainDate{
 public static void main(String args[]){

	Date today = new Date (28,3,2017);
	Date otherDay = new Date (31,3,2017);
	Date today2= new Date (27,3,2017);
	Date dateFalse= new Date (32,3,2017);


	System.out.println(today.getDay());
	System.out.println(today.isSameDay(otherDay));
	System.out.println(today.isSame(today2));

	
	System.out.println(today.getNameMonth());

	System.out.println(today.getNumDaysOfMonth());

	System.out.println("comprobarsi es correcto el numero de dias: "+dateFalse.checkDayOfMonth());

	System.out.println("Estacion: "+today.seasonForMonth());

	//4
	System.out.println("meses hasta final de año: "+today.monthsLeftEndYear());
	System.out.println("imprimir mi fecha: "+today.getDate());

	System.out.println("dais hasta final de mes: "+today.getDatesUntilEndOfMonth());

	





}
}
