import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Hello {
	public Server() {}

	@Override
	public String say(){
		return "Hello!";
	}

	public static void main(String[] args){
		try {
			Server obj = new Server();
			Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);
			Registry registry = LocateRegistry.getRegistry();
			registry.bind("Hello", stub);

			System.out.println("Server Ready!");
		} catch (Exception e){
			System.err.println("Erro no servidor!");
			e.printStackTrace();
		}
	}
}
