package intro_a_eventos_cerrar_ventana;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.Visibility;

import javax.swing.plaf.SliderUI;

import java.awt.Event;

public class EscuchaVentana1 implements WindowListener
{
	public EscuchaVentana1()
	{	
	}
	public void windowClosing(WindowEvent e){
		// para cerrar la ventana y finalizar el programa
		 // correctamente son tres pasos:
		 // 1 – ocultar la ventana con setVisible(false)
		 // 2 – liberarla con el metodo dispose
		 // 3 – finalizar la aplicacion con System.exit
		System.out.println("ocultar , no funciona");
		//setVisible(false);

		 System.out.println("Libero...  tampoco funciona ");
		 //dispose();

		 System.out.println("Bye bye... almenos esto funciona");
		 System.exit(0);
		
	}
	/* la interface WindowListener tiene 7 metodos asi que tenemos que sobreescribirlos
	 * a todos aunque sea 
	 * dejandolos vacio
	 */
	@Override
	public void windowActivated(WindowEvent e)	{	}
	@Override
	public void windowClosed(WindowEvent e)	{		}
	@Override
	public void windowDeactivated(WindowEvent e)	{		}
	@Override
	public void windowDeiconified(WindowEvent e)	{		}
	@Override
	public void windowIconified(WindowEvent e)	{	}
	@Override
	public void windowOpened(WindowEvent e)	{	}
	public static void main(String[] args)
	{
		new EventoCerrarVentana1();
		delaySegundoParaProbar(2000);
		System.exit(0);
	}
	private static void delaySegundoParaProbar(long miliSegundos)
    {
        try
        {
            Thread.sleep(miliSegundos);
        }catch(InterruptedException e){
        	System.out.println("no deberia fallara , java d shet ");
        }
    }

}
