
public class Context {
	
	
	private ISport ispSport;
	

	public void setIspSport(ISport ispSport) {
		this.ispSport = ispSport;
	}
	
	public void excute() {
		
		ispSport.getInfoSport();
	}
	

}
