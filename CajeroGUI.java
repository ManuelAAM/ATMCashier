/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CashierATM1;

/**
 *
 * @author Aragon Martinez Manuel Alejandro
 */
import javax.swing.JOptionPane;

public class CajeroGUI {
	
	int seleccion;
	String[] opciones = {"Ver Saldo-Check Balance", "Depósito-Deposit", "Retiro-Withdrawl", "Salir-Exit"};
	String[] cerrar = {"Si-Yes, Salir-Exit","No, Continuar-Continue"};
	
	public CajeroGUI() {
		seleccion=0;
	}
	
	public int mostrarMenu(){
		
		seleccion=JOptionPane.showOptionDialog(null, "Bienvenido al cajero ATM - Welcome to your ATM Cashier\nPor favor, seleccione una opción - Please select an option:", "ATM",
			JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
		
		return seleccion;
	}
	
	public void invalido() { //Entrada invalida
		JOptionPane.showMessageDialog(null,"Entrada invalida, intente nuevamente. - Invalid option, please try again.");
	}
	
	public void mostrarSaldo(String informacion) {
		JOptionPane.showMessageDialog(null,informacion);
	}
	
	public float realizarDeposito() {
		String aux=JOptionPane.showInputDialog("Introduce tu monto a depositar - Enter the amount you wish to deposit");
		float monto=Float.parseFloat(aux);
		
		if(monto>0) {
			return monto;
		}
		
		else {
			return -1;
		}
	}
	
	public void problema() {
		JOptionPane.showMessageDialog(null,"Entrada invalida, intente nuevamente. - Invalid option, please try again.");
	}
	
	public float realizarRetiro() {
		String aux=JOptionPane.showInputDialog("Introduce el monto por retirar. - Enter the amount you wish to withdrawal:");
		float monto=Float.parseFloat(aux);
		
		if(monto>0) {
			return monto;
		}
		else {
			return -1;
		}
		
	}
	
	public void cancelacion() {
		JOptionPane.showMessageDialog(null,"Regresando a menu principal - Returning to main menu");
	}
	
	public int salir() {
		
		seleccion=JOptionPane.showOptionDialog(null, "Deseas salir? - Do you really want to exit?", "Fin del programa - Program Ended",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, cerrar, cerrar[0]);
		return seleccion;
	}
	
	
	 
}
