package listadoble;


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




public class Listad {
	Nodo inicio;
	Nodo fin;
	
	public Listad(){
		inicio=null;
		fin=null;
	}
	
	public void agregaran(int num){
		
		Nodo tmp  = new Nodo(num);
		if (inicio==null){
			inicio=tmp;
		    fin = tmp;
		}
		else{
			tmp.next = inicio;
			inicio.back =tmp;
			inicio=tmp;	
			}
	}
	
	public void agregarde(int num){
		
		Nodo tmp  = new Nodo(num);
		if (inicio==null){
			inicio=tmp;
		    fin = tmp;
		}
		else{
			fin.next = tmp;
			tmp.back = fin ;
			fin=tmp;	
			}
	}

	
	
	void quitarant(){
		inicio=inicio.next;
		inicio.back=null;
		
	}
	

	void quitardes(){
		if(fin.back==null){
			inicio=null;
			fin=null;
		}
		else{
			fin=fin.back;
			fin.next=null;
		}
	}
	
	
	public String Listar(){
		String num="";
		Nodo aux=inicio;
		while(aux!=null){
			num+="["+aux.num+"]";
			aux=aux.next;
		}
		return(num);
		
	}
	
	
	public String Listarde(){
		String num="";
		Nodo aux=fin;
		while(aux!=null){
			num+="["+aux.num+"]";
			aux=aux.back;
		}
		return(num);
		
	}
	
	
	public void elimpos(int pos){
		Nodo back=inicio;
		Nodo actual= inicio;
		int k=0;
		if(pos>0){
			while(k!=pos && actual.next!=null){
				back=actual;
			actual=actual.next;
			k++;
			System.out.println(" k "+ k);
			}
			back.next=actual.next;
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
		Listad listad =new Listad();
		listad.agregaran(10);
		listad.agregaran(20);
		listad.agregaran(30);
		listad.agregaran(40);
		System.out.println(listad.Listar());
		System.out.println(listad.Listarde());
		System.out.println("Eliminar");
		listad.quitarant();
		//listad.quitardes();
	    System.out.println(listad.Listar());
	    System.out.println(listad.Listarde());
		
		
	}
}

