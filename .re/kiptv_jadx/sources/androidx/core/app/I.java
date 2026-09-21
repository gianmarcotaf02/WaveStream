package androidx.core.app;

/* JADX INFO: loaded from: classes.dex */
public final class I implements android.os.Handler.Callback, android.content.ServiceConnection {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.content.Context f15989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.os.Handler f15990i;
    public final java.util.HashMap j = new java.util.HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.util.HashSet f15991k = new java.util.HashSet();

    public I(android.content.Context context) {
        this.f15989h = context;
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f15990i = new android.os.Handler(handlerThread.getLooper(), this);
    }

    public final void a(androidx.core.app.H h9) {
        boolean z6;
        java.util.ArrayDeque arrayDeque;
        boolean zIsLoggable = android.util.Log.isLoggable("NotifManCompat", 3);
        android.content.ComponentName componentName = h9.f15984a;
        if (zIsLoggable) {
            android.util.Log.d("NotifManCompat", "Processing component " + componentName + ", " + h9.f15987d.size() + " queued tasks");
        }
        if (h9.f15987d.isEmpty()) {
            return;
        }
        if (h9.f15985b) {
            z6 = true;
        } else {
            android.content.Intent component = new android.content.Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            android.content.Context context = this.f15989h;
            boolean zBindService = context.bindService(component, this, 33);
            h9.f15985b = zBindService;
            if (zBindService) {
                h9.f15988e = 0;
            } else {
                android.util.Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
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
            androidx.core.app.F f9 = (androidx.core.app.F) arrayDeque.peek();
            if (f9 == null) {
                break;
            }
            try {
                if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                    android.util.Log.d("NotifManCompat", "Sending task " + f9);
                }
                f9.a(h9.f15986c);
                arrayDeque.remove();
            } catch (android.os.DeadObjectException unused) {
                if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                    android.util.Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (android.os.RemoteException e6) {
                android.util.Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e6);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(h9);
    }

    public final void b(androidx.core.app.H h9) {
        android.os.Handler handler = this.f15990i;
        android.content.ComponentName componentName = h9.f15984a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i3 = h9.f15988e;
        int i9 = i3 + 1;
        h9.f15988e = i9;
        if (i9 <= 6) {
            int i10 = (1 << i3) * 1000;
            if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                android.util.Log.d("NotifManCompat", "Scheduling retry for " + i10 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i10);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Giving up on delivering ");
        java.util.ArrayDeque arrayDeque = h9.f15987d;
        sb.append(arrayDeque.size());
        sb.append(" tasks to ");
        sb.append(componentName);
        sb.append(" after ");
        sb.append(h9.f15988e);
        sb.append(" retries");
        android.util.Log.w("NotifManCompat", sb.toString());
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        java.util.HashSet hashSet;
        int i3 = message.what;
        p009b.c cVar = null;
        if (i3 == 0) {
            androidx.core.app.F f9 = (androidx.core.app.F) message.obj;
            java.lang.String string = android.provider.Settings.Secure.getString(this.f15989h.getContentResolver(), "enabled_notification_listeners");
            synchronized (androidx.core.app.J.f15992c) {
                if (string != null) {
                    try {
                        if (!string.equals(androidx.core.app.J.f15993d)) {
                            java.lang.String[] strArrSplit = string.split(":", -1);
                            java.util.HashSet hashSet2 = new java.util.HashSet(strArrSplit.length);
                            for (java.lang.String str : strArrSplit) {
                                android.content.ComponentName componentNameUnflattenFromString = android.content.ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            androidx.core.app.J.f15994e = hashSet2;
                            androidx.core.app.J.f15993d = string;
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                hashSet = androidx.core.app.J.f15994e;
            }
            if (!hashSet.equals(this.f15991k)) {
                this.f15991k = hashSet;
                java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = this.f15989h.getPackageManager().queryIntentServices(new android.content.Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                java.util.HashSet<android.content.ComponentName> hashSet3 = new java.util.HashSet();
                for (android.content.pm.ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        android.content.pm.ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        android.content.ComponentName componentName = new android.content.ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            android.util.Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (android.content.ComponentName componentName2 : hashSet3) {
                    if (!this.j.containsKey(componentName2)) {
                        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                            android.util.Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.j.put(componentName2, new androidx.core.app.H(componentName2));
                    }
                }
                java.util.Iterator it = this.j.entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
                            android.util.Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        androidx.core.app.H h9 = (androidx.core.app.H) entry.getValue();
                        if (h9.f15985b) {
                            this.f15989h.unbindService(this);
                            h9.f15985b = false;
                        }
                        h9.f15986c = null;
                        it.remove();
                    }
                }
            }
            for (androidx.core.app.H h10 : this.j.values()) {
                h10.f15987d.add(f9);
                a(h10);
            }
        } else if (i3 == 1) {
            androidx.core.app.G g = (androidx.core.app.G) message.obj;
            android.content.ComponentName componentName3 = g.f15982a;
            android.os.IBinder iBinder = g.f15983b;
            androidx.core.app.H h11 = (androidx.core.app.H) this.j.get(componentName3);
            if (h11 != null) {
                int i9 = p009b.b.f17527c;
                if (iBinder != null) {
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(p009b.c.f17528b);
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
            androidx.core.app.H h12 = (androidx.core.app.H) this.j.get((android.content.ComponentName) message.obj);
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
            androidx.core.app.H h13 = (androidx.core.app.H) this.j.get((android.content.ComponentName) message.obj);
            if (h13 != null) {
                a(h13);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            android.util.Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f15990i.obtainMessage(1, new androidx.core.app.G(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        if (android.util.Log.isLoggable("NotifManCompat", 3)) {
            android.util.Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f15990i.obtainMessage(2, componentName).sendToTarget();
    }
}
