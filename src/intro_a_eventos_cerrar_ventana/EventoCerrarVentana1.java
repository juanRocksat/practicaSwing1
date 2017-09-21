package intro_a_eventos_cerrar_ventana;
import java.awt.*;
public class EventoCerrarVentana1 extends Frame
{
	private Button botonDelFlow;
	public EventoCerrarVentana1()
	{
		super("Intro a los tipos de eventos ");
		addWindowListener(new EscuchaVentana1());
		setSize(300,400);
		setVisible(true);
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
