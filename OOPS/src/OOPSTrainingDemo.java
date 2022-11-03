
public class OOPSTrainingDemo {

	public static void main(String[] args) {
				
		TrainingProvider edureka = null;

		edureka.name = "Edureka Training Institute";
		edureka.address = "Bangalore";
		edureka.yearOfEstablishment = 2010;
		
		TrainingProvider greatLearning = null;
		greatLearning.name = "Great Learning";
		greatLearning.address = "India";
		greatLearning.yearOfEstablishment = 2005;
		
		Participant rajesh = null;
		rajesh.educationalQualification = "BE";
		rajesh.currentEmployer = "IBM";

		Participant joy = null;
		joy.educationalQualification = "BTech";
		joy.currentEmployer = "Google";
		
		TechnicalCourse awsCourse = null;
		
		rajesh.joinCourse(awsCourse);
		
		
		TechnicalCourse pythonCourse = null;
		joy.joinCourse(pythonCourse);
		
		
		// Edureka offers awsCourse
		edureka.offers(awsCourse);
		edureka.offers(pythonCourse);
		
		Batch awsBatch1 = null;
		awsBatch1.start("10-Jan-2023");	
		awsBatch1.stop("16-Jan-2023");
		
		Batch javaBatch3 = null;
		javaBatch3.start("1-Dec-2022");
		
	}
	
	void predefinedString(){
		
		String goodMorning = "Good Morning";
		
		int length  = goodMorning.length();
		
		String welcomeMessage = "Welcome everyone";
		
		int length2 = welcomeMessage.length();
		
	}
	
//	void trainingObject1() {
//		
//		Participant john = null;
//		
//		john.joinCourse();
//		
//		john.leaveCourse();
//		
//		Participant jenny = null;;
//		
//		jenny.joinCourse();
//	}
}

class Participant {
	
	String educationalQualification;
	String currentEmployer;
	
	void joinCourse(TechnicalCourse anyCourse){
		
	}
	
	void leaveCourse(){
		
	}
}

class TechnicalCourse{
	
	
}

class TrainingProvider{
	
	String name;
	String address;
	int yearOfEstablishment;
	
	void offers(TechnicalCourse anyCourse) {
		
	}
}

class Batch{
	
	void start(String startDate) {
		
	}
	
	void stop(String endDate) {
		
	}
}
