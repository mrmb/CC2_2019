public class Persona implements Humano{
  // clase padre

	// campos
  String nombre, apellido;
  int altura;
  
  // constructores
  public Persona(String nombre, String apellido, int altura){
  	this.nombre = nombre;
    this.apellido = apellido;
    this.altura = altura;
  }

  public Persona(){
    nombre = "";
    apellido = "";
    altura = 0;
  }
  
  // metodos 
  
  public void cambiarNombre(String n){
  	this.nombre = n;
  }

  public void cambiarApellido(String a){
    this.apellido = a;
  }

  public void hablar(){
    System.out.println("Hablar");
  }

  public void correr(){
    System.out.println("Este metodo es para correr");
  }

  public void comer(){

  }

  public void caminar(){

  }

}