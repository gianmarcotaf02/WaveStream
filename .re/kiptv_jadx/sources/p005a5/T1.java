package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class T1 {
    private static final p005a5.N1 Companion = new p005a5.N1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p057g2.a f13909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p194x6.j f13910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p117n6.i f13911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p194x6.m f13912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p100l6.h f13914f;
    public final p028c8.d g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.LinkedHashMap f13915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.HashSet f13916i;
    public final java.util.HashSet j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f13917k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13918l;

    /* JADX WARN: Multi-variable type inference failed */
    public T1(p057g2.a aVar, p194x6.j jVar, p194x6.n nVar, p194x6.m mVar, S7.AbstractC0906w workerContext, int i3) {
        int i9 = (i3 & 16) != 0 ? 3 : 1;
        kotlin.jvm.internal.m.e(workerContext, "workerContext");
        this.f13909a = aVar;
        this.f13910b = jVar;
        this.f13911c = (p117n6.i) nVar;
        this.f13912d = mVar;
        this.f13913e = i9;
        this.f13914f = workerContext;
        this.g = new p028c8.d();
        this.f13915h = new java.util.LinkedHashMap();
        this.f13916i = new java.util.HashSet();
        this.j = new java.util.HashSet();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009f A[Catch: all -> 0x009d, TryCatch #2 {all -> 0x009d, blocks: (B:29:0x008c, B:32:0x0092, B:43:0x00b1, B:45:0x00b9, B:46:0x00bb, B:48:0x00cc, B:40:0x009f, B:50:0x00d9), top: B:94:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:94:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [n6.i, x6.n] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0150 -> B:92:0x015a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(p005a5.T1 r18, p117n6.c r19) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p005a5.T1.a(a5.T1, n6.c):java.lang.Object");
    }

    public final void b(java.lang.Object obj) {
        S7.C.A(this.f13909a, null, new p005a5.P1(this, obj, null), 3);
    }

    public final void c(java.lang.Object obj, boolean z6) {
        S7.C.A(this.f13909a, this.f13914f, new p005a5.R1(this, obj, z6, null), 2);
    }
}
