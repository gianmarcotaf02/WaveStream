package p136q;

/* JADX INFO: renamed from: q.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2674s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f26418a = new java.lang.Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long[] f26419b = new long[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f26420c = new java.lang.Object();

    public static final void a(p136q.T t9) {
        int i3 = t9.f26357k;
        int[] iArr = t9.f26356i;
        java.lang.Object[] objArr = t9.j;
        int i9 = 0;
        for (int i10 = 0; i10 < i3; i10++) {
            java.lang.Object obj = objArr[i10];
            if (obj != f26420c) {
                if (i10 != i9) {
                    iArr[i9] = iArr[i10];
                    objArr[i9] = obj;
                    objArr[i10] = null;
                }
                i9++;
            }
        }
        t9.f26355h = false;
        t9.f26357k = i9;
    }

    public static final void b(p136q.C2662f c2662f, int i3) {
        kotlin.jvm.internal.m.e(c2662f, "<this>");
        c2662f.f26381h = new int[i3];
        c2662f.f26382i = new java.lang.Object[i3];
    }

    public static final int c(p136q.C2662f c2662f, java.lang.Object obj, int i3) {
        kotlin.jvm.internal.m.e(c2662f, "<this>");
        int i9 = c2662f.j;
        if (i9 == 0) {
            return -1;
        }
        try {
            int iA = p144r.a.a(c2662f.j, i3, c2662f.f26381h);
            if (iA < 0 || kotlin.jvm.internal.m.a(obj, c2662f.f26382i[iA])) {
                return iA;
            }
            int i10 = iA + 1;
            while (i10 < i9 && c2662f.f26381h[i10] == i3) {
                if (kotlin.jvm.internal.m.a(obj, c2662f.f26382i[i10])) {
                    return i10;
                }
                i10++;
            }
            for (int i11 = iA - 1; i11 >= 0 && c2662f.f26381h[i11] == i3; i11--) {
                if (kotlin.jvm.internal.m.a(obj, c2662f.f26382i[i11])) {
                    return i11;
                }
            }
            return ~i10;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }
}
