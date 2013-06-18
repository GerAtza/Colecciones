import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;




public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<String> equipo=new LinkedList();
		List<String> equipo=new LinkedList<String>();
		
		equipo.add("Mario");
		equipo.add("Luigui");
		equipo.add("Peach");
		
		/*
		ListIterator<String> it= equipo.listIterator();
		String primero=(String) it.next();
		System.out.println("1: "+primero);
		String segundo=(String) it.previous();
		System.out.println("2: "+segundo);
		it.remove();
		*/
		/*
		for(String e:equipo){
			System.out.println(e);
		}
		
		Iterator it=equipo.iterator();
		
		String primero=(String) it.next();
		System.out.println("1: "+primero);
		String segundo=(String) it.next();
		System.out.println("2: "+segundo);
		it.remove();
		*/
	}
}
