package A7;

/* JADX INFO: renamed from: A7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C0058a implements O6.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ E6.u[] f294i = {kotlin.jvm.internal.B.f24540a.h(new kotlin.jvm.internal.u(A7.C0058a.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B7.i f295h;

    public C0058a(B7.m storageManager, kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.m.e(storageManager, "storageManager");
        this.f295h = new B7.i(storageManager, function0);
    }

    @Override // O6.h
    public final boolean h(p101l7.c cVar) {
        return O2.g.P(this, cVar);
    }

    @Override // O6.h
    public boolean isEmpty() {
        return ((java.util.List) p000a.a.v(this.f295h, f294i[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return ((java.util.List) p000a.a.v(this.f295h, f294i[0])).iterator();
    }

    @Override // O6.h
    public final O6.b k(p101l7.c cVar) {
        return O2.g.J(this, cVar);
    }
}
