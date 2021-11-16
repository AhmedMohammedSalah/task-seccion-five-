package staff;

public class memeberFactory  {
public Staff getMember (String staffType ) {
	switch(staffType.toLowerCase() ) {
	case"doctor":return new Doctor() ;
	case"teaching assistant":return new TeachingAssistant() ;
	default : return null ;
	}
	
}
}
