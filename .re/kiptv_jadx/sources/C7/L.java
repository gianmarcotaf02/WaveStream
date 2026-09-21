package C7;

/* JADX INFO: loaded from: classes4.dex */
public class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f1554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D7.b f1555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D7.e f1556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D7.f f1557e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1558f;
    public java.util.ArrayDeque g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public L7.h f1559h;

    public L(boolean z6, boolean z9, D7.b typeSystemContext, D7.e kotlinTypePreparator, D7.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(typeSystemContext, "typeSystemContext");
        kotlin.jvm.internal.m.e(kotlinTypePreparator, "kotlinTypePreparator");
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f1553a = z6;
        this.f1554b = z9;
        this.f1555c = typeSystemContext;
        this.f1556d = kotlinTypePreparator;
        this.f1557e = kotlinTypeRefiner;
    }

    public final void a() {
        java.util.ArrayDeque arrayDeque = this.g;
        kotlin.jvm.internal.m.b(arrayDeque);
        arrayDeque.clear();
        L7.h hVar = this.f1559h;
        kotlin.jvm.internal.m.b(hVar);
        hVar.clear();
    }

    public final void b() {
        if (this.g == null) {
            this.g = new java.util.ArrayDeque(4);
        }
        if (this.f1559h == null) {
            this.f1559h = new L7.h();
        }
    }

    public final C7.a0 c(F7.d type) {
        kotlin.jvm.internal.m.e(type, "type");
        return this.f1556d.a(type);
    }

    public final C7.AbstractC0191x d(F7.d type) {
        kotlin.jvm.internal.m.e(type, "type");
        this.f1557e.getClass();
        return (C7.AbstractC0191x) type;
    }
}
