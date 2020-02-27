package Log4J.Interest_Area;

import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;

public class SimpleInterest 
{

	private static final org.apache.logging.log4j.Logger LOGGER =LogManager.getLogger(SimpleInterest.class);
	double principle;
	int years;
	double rate;
	public SimpleInterest(double principle,double rate,int years)
	{
		this.principle=principle;
		this.rate=rate;
		this.years=years;
	}
	public double calculateSI()
	{
		double result;
		result=(principle*years*rate);
		result=result/100;
		LOGGER.info(result);
		LOGGER.error("There will be corrrection");
		LOGGER.warn("there is something wrong in code");
		LOGGER.fatal("there is any case of abort");
		return result;
	}
}
