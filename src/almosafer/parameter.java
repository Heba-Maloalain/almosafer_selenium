package almosafer;

import java.time.LocalDate;
import java.util.Random;

import org.bouncycastle.asn1.cmp.Challenge.Rand;
import org.testng.asserts.SoftAssert;

public class parameter {
	static  String [] website= {"https://www.almosafer.com/en?ncr=1","https://www.almosafer.com/ar?ncr=1" };
	static  Random rand =new Random();	
	
	static   int Randomindex =rand.nextInt(2);
 
 static String [] arabicCity= {"جدة","دبي"};
 static String [] englishCity={"riyadeh","Dubai"};
	
 static int randomindexCity=rand.nextInt(2);
 
 static LocalDate today =LocalDate.now();
 static int today_date =today.getDayOfMonth();
 SoftAssert myAssert1=new SoftAssert();
 
 static int expectedFlight=today_date +1;
 static int expectedReturn =today_date+2;
 
}
