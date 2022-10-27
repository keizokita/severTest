package app;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws  Exception {

        ServerSocket server = new ServerSocket(3333);

        System.out.println("Aguardando conexao...");
        Socket socket = server.accept(); // Ele para aqui e aguarda conexoes
        System.out.println("Conectando a: " + socket.getRemoteSocketAddress());

        InputStream entrada = socket.getInputStream();
        ObjectInputStream objectStream = new ObjectInputStream(entrada);

        Pedido pedido = (Pedido) objectStream.readObject();
        System.out.println("Cogigo: " + pedido.getCogigo());
        System.out.println("Descricao: " + pedido.getDescricao());
        System.out.println("Quantidade: " + pedido.getQuantidade());

        OutputStream saida = socket.getOutputStream();
        DataOutput dataOutput = new DataOutputStream(saida);
        dataOutput.writeUTF("Recebido com sucesso!");

        server.close();
    }
}
