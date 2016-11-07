public class Asteroide extends CuerpoEstelar
{
	Asteroide(int posicion, int masa, int direccion) 
	{
		super(posicion,masa);
		this.direccion = direccion;
	}
	int direccion;
	void FuncionAsteroide()
	{
		System.out.print("Funcion Asteroide");
	}
}
