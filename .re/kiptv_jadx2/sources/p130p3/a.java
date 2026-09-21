package p130p3;

import D3.f;
import D3.g;
import H3.D;
import H3.q;
import W3.b;
import W3.c;
import W3.d;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public final class a {

    public D3.a f26180a;

    public d f26181b;

    public boolean f26182c;

    public final Object f26183d = new Object();

    public c f26184e;

    public final Context f26185f;
    public final long g;

    public a(Application application) {
        q.g(application);
        Context applicationContext = application.getApplicationContext();
        this.f26185f = applicationContext != null ? applicationContext : application;
        this.f26182c = false;
        this.g = -1L;
    }

    public static D a(Application application) {
        a aVar = new a(application);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d();
            D dB = aVar.b();
            e(dB, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            aVar.c();
            return dB;
        } catch (Throwable th) {
            try {
                e(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                aVar.c();
                throw th2;
            }
        }
    }

    public static void e(D d4, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            String str = IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            map.put("app_context", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            if (d4 != null) {
                if (true != d4.f3942c) {
                    str = "0";
                }
                map.put("limit_ad_tracking", str);
                String str2 = d4.f3941b;
                if (str2 != null) {
                    map.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new b(map).start();
        }
    }

    public final D b() {
        D d4;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Calling this from your main thread can lead to deadlock");
        }
        synchronized (this) {
            try {
                if (!this.f26182c) {
                    synchronized (this.f26183d) {
                        c cVar = this.f26184e;
                        if (cVar == null || !cVar.f26189k) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d();
                        if (!this.f26182c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e6) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e6);
                    }
                }
                q.g(this.f26180a);
                q.g(this.f26181b);
                try {
                    b bVar = (b) this.f26181b;
                    bVar.getClass();
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    Parcel parcelM = bVar.m(parcelObtain, 1);
                    String string = parcelM.readString();
                    parcelM.recycle();
                    b bVar2 = (b) this.f26181b;
                    bVar2.getClass();
                    Parcel parcelObtain2 = Parcel.obtain();
                    parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int i3 = W3.a.f10594a;
                    parcelObtain2.writeInt(1);
                    Parcel parcelM2 = bVar2.m(parcelObtain2, 2);
                    boolean z6 = parcelM2.readInt() != 0;
                    parcelM2.recycle();
                    d4 = new D(1, string, z6);
                } catch (RemoteException e9) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e9);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f26183d) {
            c cVar2 = this.f26184e;
            if (cVar2 != null) {
                cVar2.j.countDown();
                try {
                    this.f26184e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.f26184e = new c(this, j);
            }
        }
        return d4;
    }

    public final void c() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Calling this from your main thread can lead to deadlock");
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
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f26182c = false;
                this.f26181b = null;
                this.f26180a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException("Calling this from your main thread can lead to deadlock");
        }
        synchronized (this) {
            try {
                if (this.f26182c) {
                    c();
                }
                Context context = this.f26185f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iB = f.f2108b.b(context, 12451000);
                    if (iB != 0 && iB != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    D3.a aVar = new D3.a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!L3.a.a().c(context, context.getClass().getName(), intent, aVar, 1, null)) {
                            throw new IOException("Connection failure");
                        }
                        this.f26180a = aVar;
                        try {
                            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                            IBinder iBinderA = aVar.a();
                            int i3 = c.f10596c;
                            IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                            this.f26181b = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new b(iBinderA);
                            this.f26182c = true;
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } catch (Throwable th2) {
                        throw new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new g();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }
}
