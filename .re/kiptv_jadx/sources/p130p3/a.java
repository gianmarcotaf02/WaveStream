package p130p3;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D3.a f26180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public W3.d f26181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f26183d = new java.lang.Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p130p3.c f26184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final android.content.Context f26185f;
    public final long g;

    public a(android.app.Application application) {
        H3.q.g(application);
        android.content.Context applicationContext = application.getApplicationContext();
        this.f26185f = applicationContext != null ? applicationContext : application;
        this.f26182c = false;
        this.g = -1L;
    }

    public static H3.D a(android.app.Application application) {
        p130p3.a aVar = new p130p3.a(application);
        try {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            aVar.d();
            H3.D dB = aVar.b();
            e(dB, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            aVar.c();
            return dB;
        } catch (java.lang.Throwable th) {
            try {
                e(null, -1L, th);
                throw th;
            } catch (java.lang.Throwable th2) {
                aVar.c();
                throw th2;
            }
        }
    }

    public static void e(H3.D d4, long j, java.lang.Throwable th) {
        if (java.lang.Math.random() <= 0.0d) {
            java.util.HashMap map = new java.util.HashMap();
            java.lang.String str = androidx.media3.extractor.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            map.put("app_context", androidx.media3.extractor.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            if (d4 != null) {
                if (true != d4.f3942c) {
                    str = "0";
                }
                map.put("limit_ad_tracking", str);
                java.lang.String str2 = d4.f3941b;
                if (str2 != null) {
                    map.put("ad_id_size", java.lang.Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", java.lang.Long.toString(j));
            new p130p3.b(map).start();
        }
    }

    public final H3.D b() {
        H3.D d4;
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("Calling this from your main thread can lead to deadlock");
        }
        synchronized (this) {
            try {
                if (!this.f26182c) {
                    synchronized (this.f26183d) {
                        p130p3.c cVar = this.f26184e;
                        if (cVar == null || !cVar.f26189k) {
                            throw new java.io.IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d();
                        if (!this.f26182c) {
                            throw new java.io.IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (java.lang.Exception e6) {
                        throw new java.io.IOException("AdvertisingIdClient cannot reconnect.", e6);
                    }
                }
                H3.q.g(this.f26180a);
                H3.q.g(this.f26181b);
                try {
                    W3.b bVar = (W3.b) this.f26181b;
                    bVar.getClass();
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    android.os.Parcel parcelM = bVar.m(parcelObtain, 1);
                    java.lang.String string = parcelM.readString();
                    parcelM.recycle();
                    W3.b bVar2 = (W3.b) this.f26181b;
                    bVar2.getClass();
                    android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i3 = W3.a.f10594a;
                    parcelObtain2.writeInt(1);
                    android.os.Parcel parcelM2 = bVar2.m(parcelObtain2, 2);
                    boolean z6 = parcelM2.readInt() != 0;
                    parcelM2.recycle();
                    d4 = new H3.D(1, string, z6);
                } catch (android.os.RemoteException e9) {
                    android.util.Log.i("AdvertisingIdClient", "GMS remote exception ", e9);
                    throw new java.io.IOException("Remote exception");
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        synchronized (this.f26183d) {
            p130p3.c cVar2 = this.f26184e;
            if (cVar2 != null) {
                cVar2.j.countDown();
                try {
                    this.f26184e.join();
                } catch (java.lang.InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.f26184e = new p130p3.c(this, j);
            }
        }
        return d4;
    }

    public final void c() {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("Calling this from your main thread can lead to deadlock");
        }
        synchronized (this) {
            try {
                if (this.f26185f == null || this.f26180a == null) {
                    return;
                }
                try {
                    if (this.f26182c) {
                        L3.a.a().b(this.f26185f, this.f26180a);
                    }
                } catch (java.lang.Throwable th) {
                    android.util.Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f26182c = false;
                this.f26181b = null;
                this.f26180a = null;
            } catch (java.lang.Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            throw new java.lang.IllegalStateException("Calling this from your main thread can lead to deadlock");
        }
        synchronized (this) {
            try {
                if (this.f26182c) {
                    c();
                }
                android.content.Context context = this.f26185f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iB = D3.f.f2108b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
                        throw new java.io.IOException("Google Play services not available");
                    }
                    D3.a aVar = new D3.a();
                    android.content.Intent intent = new android.content.Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!L3.a.a().c(context, context.getClass().getName(), intent, aVar, 1, null)) {
                            throw new java.io.IOException("Connection failure");
                        }
                        this.f26180a = aVar;
                        try {
                            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
                            android.os.IBinder iBinderA = aVar.a();
                            int i3 = W3.c.f10596c;
                            android.os.IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f26181b = iInterfaceQueryLocalInterface instanceof W3.d ? (W3.d) iInterfaceQueryLocalInterface : new W3.b(iBinderA);
                            this.f26182c = true;
                        } catch (java.lang.InterruptedException unused) {
                            throw new java.io.IOException("Interrupted exception");
                        } catch (java.lang.Throwable th) {
                            throw new java.io.IOException(th);
                        }
                    } catch (java.lang.Throwable th2) {
                        throw new java.io.IOException(th2);
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                    throw new D3.g();
                }
            } catch (java.lang.Throwable th3) {
                throw th3;
            }
        }
    }

    public final void finalize() throws java.lang.Throwable {
        c();
        super.finalize();
    }
}
