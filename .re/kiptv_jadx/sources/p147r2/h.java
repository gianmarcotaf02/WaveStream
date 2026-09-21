package p147r2;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p155s1.l f26822a = new p155s1.l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f26823b = new java.lang.Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static q2.i f26824c = null;

    public static long a(android.content.Context context) {
        android.content.pm.PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return android.os.Build.VERSION.SDK_INT >= 33 ? p147r2.f.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static q2.i b() {
        q2.i iVar = new q2.i(5);
        f26824c = iVar;
        f26822a.j(iVar);
        return f26824c;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00f5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x002c  */
    /* JADX WARN: Code duplicated, block: B:21:0x002e  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    public static void c(android.content.Context context, boolean z6) {
        int i3;
        boolean z9;
        int i9;
        java.io.File file;
        boolean z10;
        java.io.File file2;
        long length;
        boolean z11;
        java.io.File file3;
        p147r2.g gVarA;
        p147r2.g gVar;
        int i10;
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenFd;
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
                    i9 = android.os.Build.VERSION.SDK_INT;
                    if (i9 >= 28) {
                        file = new java.io.File(new java.io.File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z10 = false;
                        } else {
                            z10 = false;
                        }
                        file2 = new java.io.File(new java.io.File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        long jA = a(context);
                        file3 = new java.io.File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            gVarA = p147r2.g.a(file3);
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
                        gVar = new p147r2.g(jA, 1, i3, length);
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
                    } catch (java.lang.Throwable th) {
                        if (assetFileDescriptorOpenFd == null) {
                            throw th;
                        }
                        try {
                            assetFileDescriptorOpenFd.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (java.io.IOException unused) {
                    z9 = false;
                }
                i9 = android.os.Build.VERSION.SDK_INT;
                if (i9 >= 28 && i9 != 30) {
                    file = new java.io.File(new java.io.File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists() || length3 <= 0) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    file2 = new java.io.File(new java.io.File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    try {
                        long jA2 = a(context);
                        file3 = new java.io.File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                gVarA = p147r2.g.a(file3);
                            } catch (java.io.IOException unused2) {
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
                        gVar = new p147r2.g(jA2, 1, i3, length);
                        if (gVarA != null || !gVarA.equals(gVar)) {
                            try {
                                gVar.b(file3);
                            } catch (java.io.IOException unused3) {
                            }
                        }
                        b();
                        return;
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused4) {
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
