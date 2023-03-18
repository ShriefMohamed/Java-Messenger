import java.net.*;
import java.util.Vector;
import java.io.*;

public calss ChatServer {
	static vector ClientSockets;
	static vector LoginNames;

	ChatServer() throws IOExeption {
		ServerSocket server = new ServerSocket(5217);
		
		ClientSockets = new Vector();
		LoginNames = new Vector();

		while (true) {
			Socket client = server.accept();
			AcceptClient acceptClient = new AcceptClient(client);
		}
	}

	class AcceptClient extends Thread {
		Socket ClientSocket;
		DataInputStream din;
		DataOutputStream dout;

		AcceptClient (Socket client) throws IOExeption {
			ClientSocket client;
			din = new DataInputStream(ClientSocket.getInputStream());
			dout = new DataOutputStream(ClientSocket.getOutputStream());

			String LoginName = din.readUTF();

			LoginNames.add(LoginName);
			ClientSockets.add(ClientSocket);

			start();
		}

		public void run() {
			while (true) {
				
			}
		}
	}
}