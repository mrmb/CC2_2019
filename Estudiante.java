public class Estudiante extends Persona {
	// clase hijo

	// campos
	String carrera, universidad;
	int edad;
	// campos que son parte de persona

	/*
		super = hacer referencia a la clase padre
			- super() constructore
				super(nom, ape, alt)
				super()

			- super.campo
				super.nombre
				super.apellido
				super.edad

			- super.metodo()
				super.cambiarNombre();
				super.cambiarApellido();
				super.hablar();
	*/

	// constructores
	public Estudiante(String n, String a, String c, String u, int e, int al){
		super(n,a,al);
		carrera = c;
		universidad = u;
		edad = e;
		
	}

	// metodos





}