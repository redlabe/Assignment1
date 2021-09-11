package acrylicNails;
public class NailTestDrive {
public static void main(String[] args) {
AcrylicNailFactory factory=new AcrylicNailFactory();
NailStore store = new NailStore(factory);

Nail nail=store.customiseNails("ombree");
System.out.println("we need a "+nail.getDesign() + "\n");
System.out.println(nail);
}
}
