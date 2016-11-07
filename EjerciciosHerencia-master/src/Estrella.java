public class Estrella extends CuerpoEstelar
{
	Estrella(int posicion, int masa, int luminosidad) 
	{
		super(posicion,masa);
		this.luminosidad = luminosidad;
	}
	int luminosidad;
	
	void FuncionEstrella()
	{
		System.out.print("Funcion Estrella");
	}
}