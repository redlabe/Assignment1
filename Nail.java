package acrylicNails;
import java.util.*;

abstract public class Nail {
	String design;
	String nailbase; 
	List<String> nailArt=new ArrayList<String>();

public String getDesign(){
	return design;
}

public void prepare(){
	System.out.println("preparing " + design);
}
void clean(){
	System.out.println("cleaning nails");
}
void prime(){
	System.out.println("priming nails");
}
void mixAcryliResin(){
	System.out.println("mixing Acrylic Resin");
}
void sculpt(){
	System.out.println("Sculpting the nail");
}

String toString() {
//code to display 
StringBuffer display = new StringBuffer();
display.append(design +"\n");
display.append(nailbase +"\n");
display.append(color +"\n");
for(String art : nailArt) {
	display.append(art +"\n");
}
return display.toString();
}
}