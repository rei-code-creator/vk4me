final class gd extends Thread {
  public final void run() {
    while (true) {
      try {
        if (eg.a == null || eg.a.a == null || !(((gz)gz.a).a instanceof eg) || ((kz)((gz)gz.a).a).a != 0) {
          try {
            Thread.sleep(3000L);
          } catch (Exception exception) {}
          continue;
        } 
        for (byte b = 0; b < eg.a.a.size(); b++) {
          fl fl = eg.a.a.elementAt(b);
          try {
            if (fl.a instanceof jc) {
              fl.a(gz.b((((jc)fl.a).a()).b));
            } else if (fl.a instanceof dp) {
              fl.a(gz.b(((dp)fl.a).a));
            } 
          } catch (Exception exception) {}
          eg.a.a.removeElementAt(b);
          if (((gz)gz.a).a instanceof bc)
            gz.a.b(); 
        } 
        try {
          Thread.sleep(3000L);
        } catch (Exception exception) {}
      } catch (OutOfMemoryError outOfMemoryError) {
        eg.a.a.removeAllElements();
        System.gc();
      } catch (Exception exception) {}
    } 
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/gd.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */