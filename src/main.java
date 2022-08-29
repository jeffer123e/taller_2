
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oracle persona1= new Oracle();
		Postgres persona2= new Postgres();
		
		persona1.conectar();
		persona2.conectar();
		
		persona1.consultar();
		persona2.consultar();
		
		persona1.insertar();
		persona2.insertar();
		
		persona1.eliminar();
		persona2.eliminar();
		
	}
	
	

	

}
