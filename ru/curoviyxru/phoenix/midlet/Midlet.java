package ru.curoviyxru.phoenix.midlet;

import ad;
import bc;
import by;
import ca;
import ci;
import fw;
import fy;
import hk;
import javax.microedition.midlet.MIDlet;
import le;
import v;

public class Midlet extends MIDlet implements ca {
  public static String a;
  
  private boolean b;
  
  public boolean a;
  
  public static Midlet a;
  
  public static void a(String paramString) {
    try {
      a.platformRequest(paramString);
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  protected void startApp() {
    a = this;
    this.a = false;
    if (this.b)
      return; 
    try {
      a = (Midlet)getAppProperty("MIDlet-Version");
    } catch (Exception exception) {
      a = (Midlet)"0.0.0";
    } 
    try {
      hk.a = (le)new by();
      fy.a = this;
      v.a.c();
      this.b = true;
      return;
    } catch (Exception exception) {
      return;
    } 
  }
  
  protected void pauseApp() {
    this.a = true;
  }
  
  protected void destroyApp(boolean paramBoolean) {
    ci.a.a();
    bc.f();
  }
  
  public final void c() {
    destroyApp(false);
    notifyDestroyed();
  }
  
  public final void a() {
    v.a(ad.a.a);
  }
  
  public final void b() {
    fw.f();
  }
}


/* Location:              /home/kost/Загрузки/latest.jar!/ru/curoviyxru/phoenix/midlet/Midlet.class
 * Java compiler version: 4 (48.0)
 * JD-Core Version:       1.1.3
 */