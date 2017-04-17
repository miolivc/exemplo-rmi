import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import javax.swing.*;

public class Client {
	private Client() {}

	public static void main(String[] args){
		try {
			Registry registry = LocateRegistry.getRegistry(1099);
			Hello stub = (Hello) registry.lookup("Hello");
			String response = stub.say();
			JOptionPane.showMessageDialog(null, response);
		} catch (Exception e){
			System.err.println("Erro no cliente");
			e.printStackTrace();
		}
	}
}
