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

public class Cuenta {
	
	private String identCuenta;
	private String nombreCliente;

	private float saldo;
	private CajeroGUI salida;
	
	public Cuenta(){		
		nombreCliente="Aragon Martinez Manuel Alejandro";//name can be modified, further update to be made	
		saldo=1500;//saldo or initial bank balance can be modified here, further update will allow creating accounts with custom balance
		salida=new CajeroGUI();
	}
	
	public void verSaldo() {
		
		if(contratoComision()) {
			salida.mostrarSaldo(String.format("Tiene un saldo de\nYour account balance is: %.2f\n",saldo));
		}
		
		else {
			
			if(saldo<=30.5) {
				salida.mostrarSaldo(String.format("Saldo insuficiente, operacion no permitida.\nNon allowed operation, Insufficient balance."));
			}
			
			else {
				saldo=saldo-(float)30.5; //if bank account balance is lower than 30.5 a fee will be charged and will be withdrawn from the account.
				salida.mostrarSaldo(String.format("Se han cobrado: 30.5 MXN de comision-You have been charged with a 30.5MXN fee for consulting your balance\n"
						+"Tiene un nuevo saldo total\nYour new balance is: %.2f\n",saldo));
			}
			
		}
		
	}
	
	public void depositarCantidad(float deposito) {
		float aux=saldo;
		saldo=saldo+deposito;
		salida.mostrarSaldo(String.format("Su saldo anterior - Your old balance is: %.2f\n"
				+"Se realizo el deposito - Your deposit was: %.2f\n"
				+"Saldo actual - New balance: %.2f",aux,deposito,saldo));
	}
	
	public void retirarCantidad(float retiro) {
		
		if(retiro>saldo) {
		salida.mostrarSaldo(String.format("El monto a retirar es mayor que el saldo disponible, ingrese una cantidad válida.\nThe withdrawal is not possible due to insuffuicient funds,"
                        + " try again with a valid number."));
		}
		
		else {
			float aux=saldo;
			saldo=saldo-retiro;
			salida.mostrarSaldo(String.format("Su saldo anterior - Your previous balance is: %.2f\n"
					+"Retiro exitoso - Succesful Withdrawal of: %.2f\n"
					+"Saldo actual - New Balance: %.2f",aux,retiro,saldo));
		}
	}
	
	public boolean contratoComision() {
		
		if(saldo>=1000) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
}
