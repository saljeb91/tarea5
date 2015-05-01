package listacircular;


class Nodo{
	int num;
	Nodo next;
	Nodo back;
	
	public Nodo(int num){
		this.num=num;
		next=null;
		back=null;
	}
}



public class Listac {
	Nodo inicio;
	Nodo fin;
	
	public Listac(){
		inicio=null;
		fin=null;
	}
	public void agregar(int num){
		
		Nodo tmp  = new Nodo(num);
		tmp.num=num;
		if (inicio==null){
			inicio=tmp;
			fin=inicio;
			inicio.next=fin;
		}
		else{
			
			fin.next = tmp;
			tmp.next = inicio;
			fin=tmp;	
			}	
	}
	

		void visualizar(){
			Nodo tmp = inicio;
			if(inicio==null)
				System.out.println("Esta lista esta vacia");
			
			else{
				System.out.print("[ ");
				while(tmp!=null){
					System.out.print(" "+tmp.num+" ");
					tmp=tmp.next;
				}	
				System.out.println(" ]");
				
		}
	}
	public static void main(String[] args){
		Listac listac =new Listac();
		listac.agregar(10);
		listac.agregar(20);
		listac.agregar(30);
		listac.agregar(40);
		listac.visualizar();
	}
}