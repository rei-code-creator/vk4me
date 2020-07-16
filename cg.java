import javax.microedition.io.Connector;
import javax.microedition.io.file.FileConnection;

final class cg extends Thread {
  final cm a;
  
  final ea a;
  
  cg(ea paramea, cm paramcm) {
    this.a = paramea;
    this.a = (ea)paramcm;
  }
  
  public final void run() {
    this.a.c = true;
    try {
      FileConnection fileConnection;
      if (!(fileConnection = (FileConnection)Connector.open(aq.a((cm)this.a), 3)).exists())
        fileConnection.create(); 
      if (fileConnection.canWrite()) {
        aq aq = new aq(this);
        hk.a((String)((cm)this.a).a, fileConnection.openOutputStream(), aq);
      } 
      fileConnection.close();
    } catch (Exception exception) {}
    this.a.c = false;
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/cg.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */