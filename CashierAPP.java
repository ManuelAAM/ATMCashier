/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CashierATM1;

/**
 *
 * @author Aragon Martinez (Manny) Manuel Alejandro
 */
public class CashierAPP { //main application
	
	public static void main(String args[]){
            
		
		CajeroGUI prueba=new CajeroGUI();
		Cuenta cliente=new Cuenta();
		boolean continuar=true;
		float monto=0;
		int eleccion=prueba.mostrarMenu();
		eleccion++;
		
		while(continuar){ 
			
			try {
				
				if(eleccion>0 && eleccion<5) { 
					
					switch(eleccion){
						case 1:
							cliente.verSaldo();
							break;
							
						case 2: 
							monto=prueba.realizarDeposito();
							if(monto==-1) {
								prueba.problema();
							}
							else {
								cliente.depositarCantidad(monto);
							}
							break;
							
						case 3:
							monto=prueba.realizarRetiro();
							if(monto==-1) {
								prueba.problema();
							}
							else {
								cliente.retirarCantidad(monto);
							}
							break;
							
						case 4:
							if(prueba.salir()==0) {
								continuar=false;
								System.exit(0);
							}
							
							break;
					}
					
				}
				
				else { 
					prueba.invalido();
				}
				
				eleccion=prueba.mostrarMenu();
				eleccion++;
			} 
			
			catch(NullPointerException ex) { 
				prueba.cancelacion();
				eleccion=prueba.mostrarMenu();
				eleccion++;
			}
			
			catch(Exception ex) {
				prueba.invalido();
				eleccion=prueba.mostrarMenu();
				eleccion++;
			}
			
		}
		
	}
	
}
