package uniandes.cupi2.pxxxx.interfaz.spec;

import java.awt.Color;
import index.I;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import co.edu.uniandes.cupi2.generador.anotaciones.interfaz.*;


@UIPanel
@UIBorderLayout(elementos={@UILayoutInfo(elemento=I.PanelImagen.Att.etiquetaImagen, pos=LayoutPosition.CENTER)})
public class PanelImagen extends _PanelImagen{

	@UIImagen(nombre="Encabezado", extension="jpg")
	private JLabel etiquetaImagen;
	
	public PanelImagen(){
		setBackground(Color.WHITE);
	}
}
