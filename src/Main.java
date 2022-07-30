import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	
	public static void main(String[] args){
		Cliente drew = new Cliente();
		drew.setNome("Drew");
		
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		Conta cc =  new ContaCorrente(drew);
		Conta poupanca =  new ContaPoupanca(drew);
	

		cc.depositar(1500);	
		cc.transferir(1000, poupanca);
		
		System.out.println("Data da Movimentação: " + sdf.format(data));
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		
	}

}