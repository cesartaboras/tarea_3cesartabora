public class Planeta extends CuerpoEstelar
{
	Planeta (int posicion, int masa, boolean es_habitable , int especies_conocidas) 
	{
		super(posicion, masa);
		this.especies_conocidas = especies_conocidas;
		this.es_habitable = es_habitable;
	} 
	boolean es_habitable;
	int especies_conocidas;
	void FuncionPlaneta()
	{
		System.out.print("Funcion Planeta");
	}
}
