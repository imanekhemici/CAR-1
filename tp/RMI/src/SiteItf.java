import java.rmi.Remote;
import java.rmi.RemoteException;


public interface SiteItf extends Remote {
	public void sendMessage(String Message) throws RemoteException;
	public void addSon(SiteImpl son);
}