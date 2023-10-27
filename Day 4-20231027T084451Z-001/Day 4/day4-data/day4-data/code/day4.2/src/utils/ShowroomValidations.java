package utils;

import java.time.LocalDate;
import java.util.List;

import com.iacsd.core.Color;
import com.iacsd.core.Vehicle;

import custom_exceptions.InvalidInputException;

public class ShowroomValidations {
//add a method to parse n validate color
	public static Color parseAndValidateColor(String clr) throws IllegalArgumentException // optional
	{
		return Color.valueOf(clr.toUpperCase());// throws IllegalArgumentExc
	}

	// add a method to parse n validate manu. date : after 1st Jan 2022
	public static LocalDate parseAndValidateDate(String date) throws InvalidInputException {
		// parsing
		LocalDate manuDate = LocalDate.parse(date);
		// parsing success --> validations
		LocalDate checkDate = LocalDate.of(2022, 1, 1);//year month date
		if (manuDate.isBefore(checkDate))
			throw new InvalidInputException("Manu date must be after 1st Jan 2022");
		return manuDate;
	}
	//add a method to check for dups
	//in case of dup vehicle : throw custom exc
	public static void checkForDup(String chNo,List<Vehicle> vehicles) throws InvalidInputException
	{                            //PrimaryKey   
		//naya object banaya hai 
		
		Vehicle newVehicle=new Vehicle(chNo);//contains method me object jata hai isliye kiya ye
		if(vehicles.contains(newVehicle ))//agar yaha Chno diya to false aayega string hai(ref pass karna hai object ka)  Object hi pass karwana hai compiler warning bhi dega
			throw new InvalidInputException("Dup ch no!!!!!");
	}
	

	// add a method to validate all i/ps
	public static Vehicle validateAllInputs(String chasisNo, String vehicleColor, double price, String manufactureDate,
			String company,List<Vehicle> vehicles) throws IllegalArgumentException, InvalidInputException {
		Color color = parseAndValidateColor(vehicleColor);
		LocalDate validatedDate = parseAndValidateDate(manufactureDate);
		checkForDup(chasisNo, vehicles);
		//=> i/ps are valid   // yaha tak badal chuke string se wapas apne apne datatype me color aur date 
		return new Vehicle(chasisNo, color, price, validatedDate, company); //Same Datatype as declared before
	}
}
