package p005a5;

import S7.AbstractC0906w;
import S7.C;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p028c8.d;
import p057g2.a;
import p100l6.h;
import p117n6.i;
import p194x6.j;
import p194x6.m;
import p194x6.n;

public final class T1 {
    private static final N1 Companion = new N1();

    public final a f13909a;

    public final j f13910b;

    public final i f13911c;

    public final m f13912d;

    public final int f13913e;

    public final h f13914f;
    public final d g;

    public final LinkedHashMap f13915h;

    public final HashSet f13916i;
    public final HashSet j;

    public Object f13917k;

    public int f13918l;

    public T1(a aVar, j jVar, n nVar, m mVar, AbstractC0906w workerContext, int i3) {
        int i9 = (i3 & 16) != 0 ? 3 : 1;
        kotlin.jvm.internal.m.e(workerContext, "workerContext");
        this.f13909a = aVar;
        this.f13910b = jVar;
        this.f13911c = (i) nVar;
        this.f13912d = mVar;
        this.f13913e = i9;
        this.f13914f = workerContext;
        this.g = new d();
        this.f13915h = new LinkedHashMap();
        this.f13916i = new HashSet();
        this.j = new HashSet();
    }

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

    public final void b(Object obj) {
        C.A(this.f13909a, null, new P1(this, obj, null), 3);
    }

    public final void c(Object obj, boolean z6) {
        C.A(this.f13909a, this.f13914f, new R1(this, obj, z6, null), 2);
    }
}
