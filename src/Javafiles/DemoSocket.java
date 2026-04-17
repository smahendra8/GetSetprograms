package Javafiles;

import java.io.*;
import java.net.Socket;

public class DemoSocket {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.218", 8888);
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String str = "", str2 = "";
        while (!str.equals("stop")) {
            str = bfr.readLine();
            dout.writeUTF(str);
            dout.flush();
            str2 = din.readUTF();
            System.out.println("receiver:" + str2);
        }
        dout.close();
        s.close();
    }
}
