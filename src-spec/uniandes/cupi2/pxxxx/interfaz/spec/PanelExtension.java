package uniandes.cupi2.pxxxx.interfaz.spec;

import index.I;
import javax.swing.JButton;
import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;


@UIPanel
@UIBorde(tipo=BorderType.Title, titulo="Panel Extensiones")
public class PanelExtension extends _PanelExtension{
		
	@UIBoton(comando="OPCION_1", label = "Opción 1", metodo = I.InterfazElecciones.Method.reqFuncOpcion1)
	private JButton btnOpcion1;
	
	@UIBoton(comando="OPCION_2", label = "Opción 2", metodo = I.InterfazElecciones.Method.reqFuncOpcion2)
	private JButton btnOpcion2;
	
	public PanelExtension(){
		
	}
	
}
