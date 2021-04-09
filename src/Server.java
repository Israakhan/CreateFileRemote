import java.net.*;
import java.io.*;
public class Server {
   
    public static void main(String arg[])throws Exception{
    ServerSocket server=new ServerSocket(9090);
     Socket socket=server.accept();
    DataInputStream in=new DataInputStream(socket.getInputStream());
    PrintStream out=new PrintStream(socket.getOutputStream());
     String path=in.readLine();
     String textarea=in.readLine();
     FileOutputStream f=new FileOutputStream(path);
     PrintStream outFile=new PrintStream(f);
        outFile.println(textarea);
            outFile.close();
    }
            
    
            
        
 
    } 
    
    

