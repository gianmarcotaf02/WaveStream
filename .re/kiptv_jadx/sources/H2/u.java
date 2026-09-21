package H2;

/* JADX INFO: loaded from: classes.dex */
public final class u implements H2.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p028c8.j f3913a;

    public u(p028c8.j jVar) {
        this.f3913a = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:0x0086  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f  */
    /* JADX WARN: Type inference failed for: r1v11, types: [H2.z] */
    @Override // H2.j
    public final H2.k a(J2.i iVar, S2.o oVar) {
        android.graphics.ImageDecoder.Source sourceCreateSource;
        M8.A aL;
        android.graphics.Bitmap.Config configB = S2.j.b(oVar);
        if (configB == android.graphics.Bitmap.Config.ARGB_8888 || configB == android.graphics.Bitmap.Config.HARDWARE) {
            H2.q qVar = iVar.f6009a;
            if (qVar.K() != M8.q.f7275h || (aL = qVar.L()) == null) {
                O2.g metadata = qVar.getMetadata();
                boolean z6 = metadata instanceof H2.a;
                android.content.Context context = oVar.f9284a;
                if (z6) {
                    sourceCreateSource = android.graphics.ImageDecoder.createSource(context.getAssets(), ((H2.a) metadata).f3872l);
                } else if ((metadata instanceof H2.g) && android.os.Build.VERSION.SDK_INT >= 29) {
                    try {
                        final android.content.res.AssetFileDescriptor assetFileDescriptor = ((H2.g) metadata).f3885l;
                        android.system.Os.lseek(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), android.system.OsConstants.SEEK_SET);
                        sourceCreateSource = android.graphics.ImageDecoder.createSource((java.util.concurrent.Callable<android.content.res.AssetFileDescriptor>) new java.util.concurrent.Callable() { // from class: H2.z
                            @Override // java.util.concurrent.Callable
                            public final java.lang.Object call() {
                                return assetFileDescriptor;
                            }
                        });
                    } catch (android.system.ErrnoException unused) {
                        sourceCreateSource = null;
                    }
                } else if (metadata instanceof H2.r) {
                    H2.r rVar = (H2.r) metadata;
                    if (rVar.f3907l.equals(context.getPackageName())) {
                        sourceCreateSource = android.graphics.ImageDecoder.createSource(context.getResources(), rVar.f3908m);
                    } else if (metadata instanceof H2.f) {
                        sourceCreateSource = android.graphics.ImageDecoder.createSource(((H2.f) metadata).f3884l);
                    } else {
                        sourceCreateSource = null;
                    }
                } else if (metadata instanceof H2.f) {
                    sourceCreateSource = android.graphics.ImageDecoder.createSource(((H2.f) metadata).f3884l);
                } else {
                    sourceCreateSource = null;
                }
            } else {
                sourceCreateSource = android.graphics.ImageDecoder.createSource(aL.f());
            }
            if (sourceCreateSource != null) {
                return new H2.y(sourceCreateSource, iVar.f6009a, oVar, this.f3913a);
            }
        }
        return null;
    }
}
