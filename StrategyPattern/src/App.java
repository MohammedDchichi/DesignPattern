import java.util.Arrays;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Context context=new Context();
		String sportName=null;
		System.out.println("------Welcome to APP For Know the info for Sports-----------");
		System.out.println("------Sport availaible :"+ Arrays.toString(Constantes.sportAvailaible)+"-----------");
		
		do {
			System.out.println("------Enter name for sport----------");
			System.out.println("------Or Enter End For Terminate----------");
			Scanner scanner = new Scanner(System.in);
			sportName=scanner.nextLine();
			
			if(Arrays.asList(Constantes.sportAvailaible).contains(sportName)) {
			ISport sport=(ISport) Class.forName(sportName).newInstance();
			context.setIspSport(sport);
			context.excute();
			}
			else if(!sportName.equals("End")){
				System.out.println("-------Please Enter value for Sports "+Arrays.toString(Constantes.sportAvailaible)+" ---------");
			}
		}while(!sportName.equals("End"));
		
		System.out.println("See You !!");

	}

}
