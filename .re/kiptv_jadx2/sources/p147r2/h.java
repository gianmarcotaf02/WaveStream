package p147r2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p155s1.l;
import q2.i;

public abstract class h {

    public static final l f26822a = new l();

    public static final Object f26823b = new Object();

    public static i f26824c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? f.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static i b() {
        i iVar = new i(5);
        f26824c = iVar;
        f26822a.j(iVar);
        return f26824c;
    }

    public static void c(Context context, boolean z6) {
        int i3;
        boolean z9;
        int i9;
        File file;
        boolean z10;
        File file2;
        long length;
        boolean z11;
        File file3;
        g gVarA;
        g gVar;
        int i10;
        AssetFileDescriptor assetFileDescriptorOpenFd;
        if (z6 || f26824c == null) {
            synchronized (f26823b) {
                if (z6) {
                    i3 = 0;
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    if (assetFileDescriptorOpenFd.getLength() > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    assetFileDescriptorOpenFd.close();
                    i9 = Build.VERSION.SDK_INT;
                    if (i9 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        long jA = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            gVarA = g.a(file3);
                        } else {
                            gVarA = null;
                        }
                        if (gVarA == null) {
                            if (!z9) {
                                i3 = 327680;
                            } else if (z10) {
                                i3 = 1;
                            } else if (z11) {
                                i3 = 2;
                            }
                        } else if (!z9) {
                            i3 = 327680;
                        } else if (z10) {
                            i3 = 1;
                        } else if (z11) {
                            i3 = 2;
                        }
                        if (z6) {
                            i3 = 2;
                        }
                        if (gVarA != null) {
                            i3 = 3;
                        }
                        gVar = new g(jA, 1, i3, length);
                        if (gVarA != null) {
                            gVar.b(file3);
                        } else {
                            gVar.b(file3);
                        }
                        b();
                        return;
                    }
                    b();
                    return;
                }
                if (f26824c != null) {
                    return;
                }
                i3 = 0;
                try {
                    assetFileDescriptorOpenFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        if (assetFileDescriptorOpenFd.getLength() > 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        assetFileDescriptorOpenFd.close();
                    } catch (Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                    z9 = false;
                }
                i9 = Build.VERSION.SDK_INT;
                if (i9 >= 28 && i9 != 30) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists() || length3 <= 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    try {
                        long jA2 = a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                gVarA = g.a(file3);
                            } catch (IOException unused2) {
                                b();
                                return;
                            }
                        } else {
                            gVarA = null;
                        }
                        if (gVarA == null && gVarA.f26820c == jA2 && (i10 = gVarA.f26819b) != 2) {
                            i3 = i10;
                        } else if (!z9) {
                            i3 = 327680;
                        } else if (z10) {
                            i3 = 1;
                        } else if (z11) {
                            i3 = 2;
                        }
                        if (z6 && z11 && i3 != 1) {
                            i3 = 2;
                        }
                        if (gVarA != null && gVarA.f26819b == 2 && i3 == 1 && length3 < gVarA.f26821d) {
                            i3 = 3;
                        }
                        gVar = new g(jA2, 1, i3, length);
                        if (gVarA != null || !gVarA.equals(gVar)) {
                            try {
                                gVar.b(file3);
                            } catch (IOException unused3) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused4) {
                        b();
                        return;
                    }
                }
                b();
                return;
                throw th;
            }
        }
    }
}
