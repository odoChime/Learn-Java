class TemperatureConversion
{
    public static void main(String arg[])
    {
        double fahrenheit = 98.4;
	double celsius = 36.8;
        
        double celsiusResult = ( 5.0 * (fahrenheit - 32.0) ) / 9.0;
	double fahrenheitResult = ( 9.0 * (celsius + 32.0) ) / 5.0;
        
        System.out.println(fahrenheit + " F is same as " + celsiusResult + " C.");
	System.out.println(celsius + " C is same as " + fahrenheitResult + " F.");
	    
    }
}
