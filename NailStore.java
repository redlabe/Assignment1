package acrylicNails;
public class NailStore{
	AcrylicNailFactory factory;
	public NailStore(AcrylicNailfactory factory) {
		this.factory = factory;
	}
	public Nail customiseNails(String type){
	Nail nail;
	nail=factory.prepare(type);
	nail.clean();
	nail.prime();
	nail.mixAcrylicResin();
	nail.sculpt();
	
	return nail;
	}
}