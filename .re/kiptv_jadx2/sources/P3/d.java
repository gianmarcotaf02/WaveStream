package P3;

import B3.o;
import H3.q;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.media3.extractor.ts.TsExtractor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class d {

    public static Boolean f8109c = null;

    public static String f8110d = null;

    public static boolean f8111e = false;

    public static int f8112f = -1;
    public static Boolean g;

    public static h f8115k;

    public static i f8116l;

    public final Context f8117a;

    public static final ThreadLocal f8113h = new ThreadLocal();

    public static final B4.a f8114i = new B4.a(7);
    public static final o j = new o(20);

    public static final o f8108b = new o(21);

    public d(Context context) {
        this.f8117a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(str.length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> clsLoadClass = classLoader.loadClass(sb.toString());
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (q.j(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String strValueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 50 + str.length() + 1);
            sb2.append("Module descriptor id '");
            sb2.append(strValueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(str.length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e6) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e6.getMessage())));
            return 0;
        }
    }

    public static d b(Context context, o oVar) throws b {
        d dVar;
        Cursor cursor;
        int i3;
        Boolean bool;
        h hVarF;
        int i9;
        O3.a aVarF0;
        Object objE0;
        g gVar;
        i iVar;
        g gVar2;
        boolean z6;
        O3.a aVarF1;
        Cursor cursor2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new b("null application Context");
        }
        ThreadLocal threadLocal = f8113h;
        g gVar3 = (g) threadLocal.get();
        g gVar4 = new g();
        threadLocal.set(gVar4);
        B4.a aVar = f8114i;
        Long l2 = (Long) aVar.get();
        long jLongValue = l2.longValue();
        try {
            aVar.set(Long.valueOf(SystemClock.uptimeMillis()));
            c cVarS = oVar.s(context, j);
            int i10 = cVarS.f8105a;
            int i11 = cVarS.f8106b;
            StringBuilder sb = new StringBuilder(46 + 26 + String.valueOf(i10).length() + 19 + 46 + 1 + String.valueOf(i11).length());
            sb.append("Considering local module com.google.android.gms.cast.framework.dynamite:");
            sb.append(i10);
            sb.append(" and remote module com.google.android.gms.cast.framework.dynamite:");
            sb.append(i11);
            Log.i("DynamiteModule", sb.toString());
            int i12 = cVarS.f8107c;
            if (i12 != 0) {
                if (i12 != -1) {
                    if (i12 == 1 || cVarS.f8106b != 0) {
                        if (i12 == -1) {
                            Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.cast.framework.dynamite"));
                            d dVar2 = new d(applicationContext);
                            if (jLongValue == 0) {
                                aVar.remove();
                            } else {
                                aVar.set(l2);
                            }
                            cursor2 = gVar4.f8129a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            threadLocal.set(gVar3);
                            return dVar2;
                        }
                        if (i12 == 1) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 36);
                            sb2.append("VersionPolicy returned invalid code:");
                            sb2.append(i12);
                            throw new b(sb2.toString());
                        }
                        try {
                            i3 = cVarS.f8106b;
                            try {
                                synchronized (d.class) {
                                    if (c(context)) {
                                        throw new b("Remote loading disabled");
                                    }
                                    bool = f8109c;
                                }
                                if (bool != null) {
                                    throw new b("Failed to determine which loading route to use.");
                                }
                                if (bool.booleanValue()) {
                                    StringBuilder sb3 = new StringBuilder(46 + 40 + String.valueOf(i3).length());
                                    sb3.append("Selected remote version of com.google.android.gms.cast.framework.dynamite, version >= ");
                                    sb3.append(i3);
                                    Log.i("DynamiteModule", sb3.toString());
                                    synchronized (d.class) {
                                        iVar = f8116l;
                                    }
                                    if (iVar != null) {
                                        throw new b("DynamiteLoaderV2 was not cached.");
                                    }
                                    gVar2 = (g) threadLocal.get();
                                    if (gVar2 != null || gVar2.f8129a == null) {
                                        throw new b("No result cursor");
                                    }
                                    Context applicationContext2 = context.getApplicationContext();
                                    Cursor cursor3 = gVar2.f8129a;
                                    new O3.b(null);
                                    synchronized (d.class) {
                                        z6 = f8112f >= 2;
                                    }
                                    if (z6) {
                                        Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                        aVarF1 = iVar.g0(new O3.b(applicationContext2), i3, new O3.b(cursor3));
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                        aVarF1 = iVar.f0(new O3.b(applicationContext2), i3, new O3.b(cursor3));
                                    }
                                    Context context2 = (Context) O3.b.e0(aVarF1);
                                    if (context2 == null) {
                                        throw new b("Failed to get module context");
                                    }
                                    dVar = new d(context2);
                                } else {
                                    StringBuilder sb4 = new StringBuilder(46 + 40 + String.valueOf(i3).length());
                                    sb4.append("Selected remote version of com.google.android.gms.cast.framework.dynamite, version >= ");
                                    sb4.append(i3);
                                    Log.i("DynamiteModule", sb4.toString());
                                    hVarF = f(context);
                                    if (hVarF != null) {
                                        throw new b("Failed to create IDynamiteLoader.");
                                    }
                                    Parcel parcelX = hVarF.X(hVarF.Y(), 6);
                                    i9 = parcelX.readInt();
                                    parcelX.recycle();
                                    if (i9 >= 3) {
                                        gVar = (g) threadLocal.get();
                                        if (gVar != null) {
                                            throw new b("No cached result cursor holder");
                                        }
                                        aVarF0 = hVarF.i0(new O3.b(context), i3, new O3.b(gVar.f8129a));
                                    } else if (i9 == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        aVarF0 = hVarF.g0(new O3.b(context), i3);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        aVarF0 = hVarF.f0(new O3.b(context), i3);
                                    }
                                    objE0 = O3.b.e0(aVarF0);
                                    if (objE0 != null) {
                                        throw new b("Failed to load remote module.");
                                    }
                                    dVar = new d((Context) objE0);
                                }
                                if (jLongValue == 0) {
                                    f8114i.remove();
                                } else {
                                    f8114i.set(l2);
                                }
                                cursor = gVar4.f8129a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                f8113h.set(gVar3);
                                return dVar;
                            } catch (b e6) {
                                throw e6;
                            } catch (RemoteException e9) {
                                throw new b("Failed to load remote module.", e9);
                            } catch (Throwable th) {
                                throw new b("Failed to load remote module.", th);
                            }
                        } catch (b e10) {
                            String message = e10.getMessage();
                            StringBuilder sb5 = new StringBuilder(String.valueOf(message).length() + 30);
                            sb5.append("Failed to load remote module: ");
                            sb5.append(message);
                            Log.w("DynamiteModule", sb5.toString());
                            int i13 = cVarS.f8105a;
                            if (i13 != 0) {
                                c cVar = new c();
                                cVar.f8106b = 0;
                                cVar.f8105a = i13;
                                if (i13 != 0) {
                                    cVar.f8107c = -1;
                                }
                                if (cVar.f8107c == -1) {
                                    Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.cast.framework.dynamite"));
                                    dVar = new d(applicationContext);
                                }
                            }
                            throw new b("Remote load failed. No local fallback found.", e10);
                        }
                    }
                } else if (cVarS.f8105a != 0) {
                    i12 = -1;
                    if (i12 == 1) {
                    }
                    if (i12 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.cast.framework.dynamite"));
                        d dVar3 = new d(applicationContext);
                        if (jLongValue == 0) {
                            aVar.remove();
                        } else {
                            aVar.set(l2);
                        }
                        cursor2 = gVar4.f8129a;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        threadLocal.set(gVar3);
                        return dVar3;
                    }
                    if (i12 == 1) {
                        StringBuilder sb6 = new StringBuilder(String.valueOf(i12).length() + 36);
                        sb6.append("VersionPolicy returned invalid code:");
                        sb6.append(i12);
                        throw new b(sb6.toString());
                    }
                    i3 = cVarS.f8106b;
                    synchronized (d.class) {
                        if (c(context)) {
                            throw new b("Remote loading disabled");
                        }
                        bool = f8109c;
                        if (bool != null) {
                            throw new b("Failed to determine which loading route to use.");
                        }
                        if (bool.booleanValue()) {
                            StringBuilder sb7 = new StringBuilder(46 + 40 + String.valueOf(i3).length());
                            sb7.append("Selected remote version of com.google.android.gms.cast.framework.dynamite, version >= ");
                            sb7.append(i3);
                            Log.i("DynamiteModule", sb7.toString());
                            synchronized (d.class) {
                                iVar = f8116l;
                                if (iVar != null) {
                                    throw new b("DynamiteLoaderV2 was not cached.");
                                }
                                gVar2 = (g) threadLocal.get();
                                if (gVar2 != null) {
                                }
                                throw new b("No result cursor");
                            }
                        }
                        StringBuilder sb8 = new StringBuilder(46 + 40 + String.valueOf(i3).length());
                        sb8.append("Selected remote version of com.google.android.gms.cast.framework.dynamite, version >= ");
                        sb8.append(i3);
                        Log.i("DynamiteModule", sb8.toString());
                        hVarF = f(context);
                        if (hVarF != null) {
                            throw new b("Failed to create IDynamiteLoader.");
                        }
                        Parcel parcelX2 = hVarF.X(hVarF.Y(), 6);
                        i9 = parcelX2.readInt();
                        parcelX2.recycle();
                        if (i9 >= 3) {
                            gVar = (g) threadLocal.get();
                            if (gVar != null) {
                                throw new b("No cached result cursor holder");
                            }
                            aVarF0 = hVarF.i0(new O3.b(context), i3, new O3.b(gVar.f8129a));
                        } else if (i9 == 2) {
                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                            aVarF0 = hVarF.g0(new O3.b(context), i3);
                        } else {
                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                            aVarF0 = hVarF.f0(new O3.b(context), i3);
                        }
                        objE0 = O3.b.e0(aVarF0);
                        if (objE0 != null) {
                            throw new b("Failed to load remote module.");
                        }
                        dVar = new d((Context) objE0);
                        if (jLongValue == 0) {
                            f8114i.remove();
                        } else {
                            f8114i.set(l2);
                        }
                        cursor = gVar4.f8129a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        f8113h.set(gVar3);
                        return dVar;
                    }
                }
            }
            int i14 = cVarS.f8105a;
            int i15 = cVarS.f8106b;
            StringBuilder sb9 = new StringBuilder(46 + 46 + String.valueOf(i14).length() + 23 + String.valueOf(i15).length() + 1);
            sb9.append("No acceptable module com.google.android.gms.cast.framework.dynamite found. Local version is ");
            sb9.append(i14);
            sb9.append(" and remote version is ");
            sb9.append(i15);
            sb9.append(".");
            throw new b(sb9.toString());
        } catch (Throwable th2) {
            if (jLongValue == 0) {
                f8114i.remove();
            } else {
                f8114i.set(l2);
            }
            Cursor cursor4 = gVar4.f8129a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f8113h.set(gVar3);
            throw th2;
        }
    }

    public static boolean c(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(g)) {
            return true;
        }
        boolean z6 = false;
        if (g == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", Build.VERSION.SDK_INT >= 29 ? 268435456 : 0);
            if (D3.f.f2108b.b(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z6 = true;
            }
            g = Boolean.valueOf(z6);
            if (z6 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & TsExtractor.TS_STREAM_TYPE_AC3) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f8111e = true;
            }
        }
        if (!z6) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z6;
    }

    public static int d(Context context, boolean z6, boolean z9) throws Throwable {
        Exception exc;
        Throwable th;
        MatrixCursor matrixCursor;
        boolean z10;
        MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z11 = true;
                Uri uriBuild = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z6 ? "api" : "api_force_staging").appendPath("com.google.android.gms.cast.framework.dynamite").appendQueryParameter("requestStartUptime", String.valueOf(((Long) f8114i.get()).longValue())).build();
                ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z12 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i3 = 0; i3 < count; i3++) {
                                    if (!cursorQuery.moveToPosition(i3)) {
                                        throw new RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    Object[] objArr = new Object[columnCount];
                                    for (int i9 = 0; i9 < columnCount; i9++) {
                                        int type = cursorQuery.getType(i9);
                                        if (type == 0) {
                                            objArr[i9] = null;
                                        } else if (type == 1) {
                                            objArr[i9] = Long.valueOf(cursorQuery.getLong(i9));
                                        } else if (type == 2) {
                                            objArr[i9] = Double.valueOf(cursorQuery.getDouble(i9));
                                        } else if (type == 3) {
                                            objArr[i9] = cursorQuery.getString(i9);
                                        } else {
                                            if (type != 4) {
                                                throw new RemoteException("Unknown column type");
                                            }
                                            objArr[i9] = cursorQuery.getBlob(i9);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (RemoteException unused) {
                    } catch (Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i10 = matrixCursor.getInt(0);
                            if (i10 > 0) {
                                synchronized (d.class) {
                                    try {
                                        f8110d = matrixCursor.getString(2);
                                        int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f8112f = matrixCursor.getInt(columnIndex);
                                        }
                                        int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z10 = matrixCursor.getInt(columnIndex2) != 0;
                                            f8111e = z10;
                                        } else {
                                            z10 = false;
                                        }
                                    } catch (Throwable th5) {
                                        throw th5;
                                    }
                                }
                                g gVar = (g) f8113h.get();
                                if (gVar == null || gVar.f8129a != null) {
                                    z11 = false;
                                } else {
                                    gVar.f8129a = matrixCursor;
                                }
                                z12 = z10;
                                matrixCursor2 = z11 ? null : matrixCursor;
                            }
                            if (z9 && z12) {
                                throw new b("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i10;
                        }
                    } catch (Exception e6) {
                        exc = e6;
                        if (exc instanceof b) {
                            throw exc;
                        }
                        String message = exc.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 25);
                        sb.append("V2 version check failed: ");
                        sb.append(message);
                        throw new b(sb.toString(), exc);
                    } catch (Throwable th6) {
                        th = th6;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new b("Failed to connect to dynamite module ContentResolver.");
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e9) {
            exc = e9;
        }
    }

    public static void e(ClassLoader classLoader) throws b {
        try {
            i iVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (iInterfaceQueryLocalInterface instanceof i) {
                    iVar = (i) iInterfaceQueryLocalInterface;
                } else {
                    try {
                        iVar = new i(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 2);
                    } catch (IllegalAccessException e6) {
                        e = e6;
                        throw new b("Failed to instantiate dynamite loader", e);
                    } catch (InstantiationException e9) {
                        e = e9;
                        throw new b("Failed to instantiate dynamite loader", e);
                    } catch (NoSuchMethodException e10) {
                        e = e10;
                        throw new b("Failed to instantiate dynamite loader", e);
                    } catch (InvocationTargetException e11) {
                        e = e11;
                        throw new b("Failed to instantiate dynamite loader", e);
                    }
                }
            }
            f8116l = iVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e12) {
            e = e12;
        }
    }

    public static h f(Context context) {
        h hVar;
        synchronized (d.class) {
            h hVar2 = f8115k;
            if (hVar2 != null) {
                return hVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    hVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    hVar = iInterfaceQueryLocalInterface instanceof h ? (h) iInterfaceQueryLocalInterface : new h(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 2);
                }
                if (hVar != null) {
                    f8115k = hVar;
                    return hVar;
                }
            } catch (Exception e6) {
                String message = e6.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 45);
                sb.append("Failed to load IDynamiteLoader from GmsCore: ");
                sb.append(message);
                Log.e("DynamiteModule", sb.toString());
            }
            return null;
        }
    }
}
