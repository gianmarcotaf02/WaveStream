package p015b5;

/* JADX INFO: loaded from: classes.dex */
public final class D {
    private static final p015b5.y Companion = new p015b5.y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V4.P f17933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p005a5.i9 f17934b;

    public D(V4.P watchProgressDataStore, p005a5.i9 watchProgressRepository) {
        kotlin.jvm.internal.m.e(watchProgressDataStore, "watchProgressDataStore");
        kotlin.jvm.internal.m.e(watchProgressRepository, "watchProgressRepository");
        this.f17933a = watchProgressDataStore;
        this.f17934b = watchProgressRepository;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final java.lang.Object a(com.kiptv.core.local.datastore.LocalProgressEntry localProgressEntry, p117n6.c cVar) {
        p015b5.B b9;
        if (cVar instanceof p015b5.B) {
            b9 = (p015b5.B) cVar;
            int i3 = b9.f17923k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b9.f17923k = i3 - Integer.MIN_VALUE;
            } else {
                b9 = new p015b5.B(this, cVar);
            }
        } else {
            b9 = new p015b5.B(this, cVar);
        }
        p015b5.B b10 = b9;
        java.lang.Object objL = b10.f17922i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = b10.f17923k;
        com.kiptv.core.model.WatchProgress watchProgress = null;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objL);
                if (localProgressEntry.f19652d <= 0 && !localProgressEntry.f19657k) {
                    return null;
                }
                p005a5.i9 i9Var = this.f17934b;
                java.lang.String str = localProgressEntry.f19649a;
                java.lang.Integer num = localProgressEntry.g;
                java.lang.Integer num2 = localProgressEntry.f19655h;
                java.lang.String str2 = localProgressEntry.f19654f;
                b10.f17921h = localProgressEntry;
                b10.f17923k = 1;
                objL = i9Var.l(num, num2, str, str2, b10);
                if (objL == aVar) {
                    return aVar;
                }
            } else {
                if (i9 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                localProgressEntry = b10.f17921h;
                com.google.common.util.concurrent.P.u0(objL);
            }
            watchProgress = (com.kiptv.core.model.WatchProgress) objL;
        } catch (java.lang.Exception e6) {
            android.util.Log.d("WatchProgressMigration", "Remote lookup failed for " + localProgressEntry.f19649a + ": " + e6.getMessage());
        }
        if (watchProgress == null) {
            return new p015b5.z(localProgressEntry.f19652d, localProgressEntry.f19653e, localProgressEntry.f19657k, false);
        }
        int i10 = localProgressEntry.f19652d;
        int i11 = watchProgress.j;
        return new p015b5.z(java.lang.Math.max(i10, i11), java.lang.Math.max(localProgressEntry.f19653e, watchProgress.f20618k), localProgressEntry.f19657k || watchProgress.f20620m, !(i10 >= i11));
    }

    /* JADX WARN: Code duplicated, block: B:132:0x014e A[EXC_TOP_SPLITTER, PHI: r0 r2 r3 r5 r11 r12 r13 r14 r15 r17
  0x014e: PHI (r0v11 java.lang.Object) = (r0v30 java.lang.Object), (r0v1 java.lang.Object) binds: [B:63:0x014a, B:30:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r2v22 com.kiptv.core.local.datastore.LocalProgressEntry) = (r2v28 com.kiptv.core.local.datastore.LocalProgressEntry), (r2v38 com.kiptv.core.local.datastore.LocalProgressEntry) binds: [B:63:0x014a, B:30:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r3v8 b5.C) = (r3v11 b5.C), (r3v2 b5.C) binds: [B:63:0x014a, B:30:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r5v12 int) = (r5v13 int), (r5v31 int) binds: [B:63:0x014a, B:30:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r11v5 java.util.Iterator) = (r11v6 java.util.Iterator), (r11v10 java.util.Iterator) binds: [B:63:0x014a, B:30:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r12v5 int) = (r12v7 int), (r12v13 int) binds: [B:63:0x014a, B:30:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r13v5 int) = (r13v10 int), (r13v18 int) binds: [B:63:0x014a, B:30:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r14v5 b5.D) = (r14v7 b5.D), (r14v13 b5.D) binds: [B:63:0x014a, B:30:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r15v9 int) = (r15v11 int), (r15v20 int) binds: [B:63:0x014a, B:30:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x014e: PHI (r17v6 int) = (r17v8 int), (r17v14 int) binds: [B:63:0x014a, B:30:0x00a3] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x012c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0152  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v37, types: [b5.D, l6.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0152 -> B:59:0x0126). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01e1 -> B:84:0x01e3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(p117n6.c r34) {
        /*
            Method dump skipped, instruction units count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p015b5.D.b(n6.c):java.lang.Object");
    }
}
