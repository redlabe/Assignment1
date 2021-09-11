package acrylicNails;
public class AcrylicNailFactory{
	public Nail DesignNails(String type){
	Nail nail=null;

		if(type.equals("ombree")){
		nail=new OmbreeNail();
		}
		if(type.equals("plain")){
		nail=new PlainNail();
		}
		
	return nail;
	}
}