package tipos_de_eventos;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import intro_a_eventos_cerrar_ventana.EscuchaVentana1;
import intro_a_eventos_cerrar_ventana.EventoCerrarVentana1;

public class Action2_por_el_momento_no_funciona extends Frame
{
	private  Button bAgregar;
	private  TextField tfItem;
	private  List lista = new List(); 
	public Action2_por_el_momento_no_funciona()
	{
		super("Action Listener");
		setLayout(new BorderLayout());
		add(crearPanelNorte(),BorderLayout.NORTH);
		add(lista,BorderLayout.CENTER);
		bAgregar.addActionListener(new EscucharAgregar1());
		tfItem.addActionListener(new EscucharAgregar1());
		lista.addActionListener(new EscuchaDobleClick1());
		//this.addWindowListener((WindowListener)new EventoCerrarVentana1());
//		this.addWindowListener(new EventoCerrarVentana1());
		setVisible(true);
		setSize(300,400);
		tfItem.requestFocus();//el cursor aparecera por defecto en el Text Field
		
	}
	private Panel crearPanelNorte()
	{
		Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
		p.add(new Label("Nick: "));	
		TextField tfNick = new TextField(10);
		p.add(tfNick);	
		Button bLogin = new Button("Loggear");
		p.add(bLogin);	
		p.add(new Button("Logout"));
		return p;
	}

	class EscucharAgregar1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			// hay que tomar el texto ingreado en el TextField
			String itemm = tfItem.getText(); 
			//item agregar a la lista
			lista.add(itemm);;
			// seleccionar tod el texto del TextField
			tfItem.selectAll();
			// seteo el foco en el TextField 
			tfItem.requestFocus();
		}
	}
	 class EscuchaDobleClick1 implements ActionListener
	{	@Override
		public void actionPerformed(ActionEvent e)
		{
			//tomo la posicion del item seleccionado
			int idx = lista.getSelectedIndex();
			//seteo el item selecciona en el textField
			tfItem.setText(lista.getSelectedItem());
			//lo remuevo de la lista 
			lista.remove(idx);
			//selecciono todo el todo del TextField
			tfItem.selectAll();
			//seteo el foco en el TextField
			tfItem.requestFocus();
		}
	}
	public static void main(String[] args)
	{
		Action2_por_el_momento_no_funciona a = new Action2_por_el_momento_no_funciona();
	}
}
