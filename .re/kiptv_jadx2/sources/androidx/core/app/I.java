package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class I implements Handler.Callback, ServiceConnection {

    public final Context f15989h;

    public final Handler f15990i;
    public final HashMap j = new HashMap();

    public HashSet f15991k = new HashSet();

    public I(Context context) {
        this.f15989h = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f15990i = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(H h9) {
        boolean z6;
        ArrayDeque arrayDeque;
        boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = h9.f15984a;
        if (zIsLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + h9.f15987d.size() + " queued tasks");
        }
        if (h9.f15987d.isEmpty()) {
            return;
        }
        if (h9.f15985b) {
            z6 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f15989h;
            boolean zBindService = context.bindService(component, this, 33);
            h9.f15985b = zBindService;
            if (zBindService) {
                h9.f15988e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z6 = h9.f15985b;
        }
        if (!z6 || h9.f15986c == null) {
            b(h9);
            return;
        }
        while (true) {
            arrayDeque = h9.f15987d;
            F f9 = (F) arrayDeque.peek();
            if (f9 == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + f9);
                }
                f9.a(h9.f15986c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e6) {
                Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e6);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(h9);
    }

    public final void b(H h9) {
        Handler handler = this.f15990i;
        ComponentName componentName = h9.f15984a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i3 = h9.f15988e;
        int i9 = i3 + 1;
        h9.f15988e = i9;
        if (i9 <= 6) {
            int i10 = (1 << i3) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i10 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i10);
            return;
        }
        StringBuilder sb = new StringBuilder("Giving up on delivering ");
        ArrayDeque arrayDeque = h9.f15987d;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(h9.f15988e);
        sb.append(" retries");
        Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    @Override
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i3 = message.what;
        p009b.c cVar = null;
        if (i3 == 0) {
            F f9 = (F) message.obj;
            String string = Settings.Secure.getString(this.f15989h.getContentResolver(), "enabled_notification_listeners");
            synchronized (J.f15992c) {
                if (string != null) {
                    try {
                        if (!string.equals(J.f15993d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            J.f15994e = hashSet2;
                            J.f15993d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = J.f15994e;
            }
            if (!hashSet.equals(this.f15991k)) {
                this.f15991k = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f15989h.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.j.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.j.put(componentName2, new H(componentName2));
                    }
                }
                Iterator it = this.j.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        H h9 = (H) entry.getValue();
                        if (h9.f15985b) {
                            this.f15989h.unbindService(this);
                            h9.f15985b = false;
                        }
                        h9.f15986c = null;
                        it.remove();
                    }
                }
            }
            for (H h10 : this.j.values()) {
                h10.f15987d.add(f9);
                a(h10);
            }
        } else if (i3 == 1) {
            G g = (G) message.obj;
            ComponentName componentName3 = g.f15982a;
            IBinder iBinder = g.f15983b;
            H h11 = (H) this.j.get(componentName3);
            if (h11 != null) {
                int i9 = p009b.b.f17527c;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(p009b.c.f17528b);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof p009b.c)) {
                        p009b.a aVar = new p009b.a();
                        aVar.f17526c = iBinder;
                        cVar = aVar;
                    } else {
                        cVar = (p009b.c) iInterfaceQueryLocalInterface;
                    }
                }
                h11.f15986c = cVar;
                h11.f15988e = 0;
                a(h11);
                return true;
            }
        } else if (i3 == 2) {
            H h12 = (H) this.j.get((ComponentName) message.obj);
            if (h12 != null) {
                if (h12.f15985b) {
                    this.f15989h.unbindService(this);
                    h12.f15985b = false;
                }
                h12.f15986c = null;
                return true;
            }
        } else {
            if (i3 != 3) {
                return false;
            }
            H h13 = (H) this.j.get((ComponentName) message.obj);
            if (h13 != null) {
                a(h13);
                return true;
            }
        }
        return true;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f15990i.obtainMessage(1, new G(componentName, iBinder)).sendToTarget();
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f15990i.obtainMessage(2, componentName).sendToTarget();
    }
}
