package D3;

/* JADX INFO: loaded from: classes.dex */
public final class j implements T1.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static D3.j f2114b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.content.Context f2115a;

    public /* synthetic */ j(android.content.Context context, byte b9) {
        this.f2115a = context;
    }

    public static D3.j c(android.content.Context context) {
        H3.q.g(context);
        synchronized (D3.j.class) {
            if (f2114b == null) {
                D3.m mVar = D3.q.f2128a;
                synchronized (D3.q.class) {
                    if (D3.q.f2130c == null) {
                        D3.q.f2130c = context.getApplicationContext();
                    } else {
                        android.util.Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f2114b = new D3.j(context, 0);
            }
        }
        return f2114b;
    }

    public static final boolean d(android.content.pm.PackageInfo packageInfo, boolean z6) {
        p004a4.f fVar;
        int i3;
        if (packageInfo != null) {
            if (z6 && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                android.content.pm.ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z6 = (applicationInfo == null || (applicationInfo.flags & androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_AC3) == 0) ? false : true;
            }
            try {
                p004a4.f fVar2 = z6 ? D3.p.f2127c : D3.p.f2126b;
                int i9 = android.os.Build.VERSION.SDK_INT;
                if (i9 < 28) {
                    android.content.pm.Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        p004a4.b bVar = p004a4.e.f13086i;
                        java.lang.Object[] objArr = {byteArray};
                        E8.d.c0(objArr, 1);
                        fVar = new p004a4.f(objArr, 1);
                    } else {
                        p004a4.b bVar2 = p004a4.e.f13086i;
                        fVar = p004a4.f.f13087l;
                    }
                } else {
                    if (i9 < 28) {
                        throw new java.lang.IllegalStateException();
                    }
                    android.content.pm.SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        p004a4.b bVar3 = p004a4.e.f13086i;
                        fVar = p004a4.f.f13087l;
                    } else {
                        p004a4.b bVar4 = p004a4.e.f13086i;
                        java.lang.Object[] objArrCopyOf = new java.lang.Object[4];
                        android.content.pm.Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i10].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i12 = i11 + 1;
                            if (i12 < 0) {
                                throw new java.lang.IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i12 <= length2) {
                                i3 = length2;
                            } else {
                                i3 = (length2 >> 1) + length2 + 1;
                                if (i3 < i12) {
                                    int iHighestOneBit = java.lang.Integer.highestOneBit(i11);
                                    i3 = iHighestOneBit + iHighestOneBit;
                                }
                                if (i3 < 0) {
                                    i3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
                                }
                            }
                            if (i3 > length2) {
                                objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, i3);
                            }
                            objArrCopyOf[i11] = byteArray2;
                            i10++;
                            i11 = i12;
                        }
                        fVar = i11 == 0 ? p004a4.f.f13087l : new p004a4.f(objArrCopyOf, i11);
                    }
                }
                if (fVar.isEmpty()) {
                    throw new java.lang.IllegalArgumentException("Unable to obtain package certificate history.");
                }
                p004a4.e eVarO = fVar.o();
                int size = eVarO.size();
                int i13 = 0;
                while (i13 < size) {
                    byte[] bArr = (byte[]) eVarO.get(i13);
                    p004a4.b bVarQ = fVar2.listIterator(0);
                    do {
                        int i14 = i13 + 1;
                        if (!bVarQ.hasNext()) {
                            i13 = i14;
                        }
                    } while (!java.util.Arrays.equals(bArr, (byte[]) bVarQ.next()));
                    return true;
                }
            } catch (java.lang.IllegalArgumentException unused) {
                android.util.Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z6 ? e(packageInfo, D3.p.f2125a) : e(packageInfo, D3.p.f2125a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static D3.n e(android.content.pm.PackageInfo packageInfo, D3.n... nVarArr) {
        android.content.pm.Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                android.util.Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            D3.o oVar = new D3.o(packageInfo.signatures[0].toByteArray());
            for (int i3 = 0; i3 < nVarArr.length; i3++) {
                if (nVarArr[i3].equals(oVar)) {
                    return nVarArr[i3];
                }
            }
        }
        return null;
    }

    @Override // T1.i
    public void a(N3.a aVar) {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(0, 1, 15L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingDeque(), new T1.a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new O.g(this, aVar, threadPoolExecutor, 1));
    }

    public p041e3.j b() {
        android.content.Context context = this.f2115a;
        if (context == null) {
            throw new java.lang.IllegalStateException(android.content.Context.class.getCanonicalName() + " must be set");
        }
        p041e3.j jVar = new p041e3.j();
        jVar.f21398h = p058g3.a.a(p041e3.l.f21405a);
        p050f3.e eVar = new p050f3.e(3, context);
        jVar.f21399i = eVar;
        jVar.j = p058g3.a.a(new p050f3.g(eVar, new p050f3.e(0, eVar), 0));
        p050f3.e eVar2 = jVar.f21399i;
        jVar.f21400k = new p050f3.e(2, eVar2);
        p061g6.a aVarA = p058g3.a.a(new p050f3.g(jVar.f21400k, p058g3.a.a(new p050f3.e(1, eVar2)), 1));
        jVar.f21401l = aVarA;
        p041e3.m mVar = new p041e3.m(1);
        p050f3.e eVar3 = jVar.f21399i;
        p041e3.p pVar = new p041e3.p(eVar3, aVarA, mVar, 1);
        p061g6.a aVar = jVar.f21398h;
        p061g6.a aVar2 = jVar.j;
        jVar.f21402m = p058g3.a.a(new p041e3.p(new p083j3.b(aVar, aVar2, pVar, aVarA, aVarA), new k3.j(eVar3, aVar2, aVarA, pVar, aVar, aVarA, aVarA), new k3.l(aVar, aVarA, pVar, aVarA), 0));
        return jVar;
    }

    public j(android.content.Context context, int i3) {
        switch (i3) {
            case 2:
                this.f2115a = context.getApplicationContext();
                break;
            default:
                this.f2115a = context.getApplicationContext();
                break;
        }
    }
}
