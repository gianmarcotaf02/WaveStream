package p118n7;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f25858h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p118n7.g f25859i;

    public /* synthetic */ f(p118n7.g gVar, int i3) {
        this.f25858h = i3;
        this.f25859i = gVar;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) throws java.io.IOException {
        switch (this.f25858h) {
            case 0:
                C7.P it = (C7.P) obj;
                kotlin.jvm.internal.m.e(it, "it");
                if (it.c()) {
                    return "*";
                }
                C7.AbstractC0191x abstractC0191xB = it.b();
                kotlin.jvm.internal.m.d(abstractC0191xB, "getType(...)");
                java.lang.String strW = this.f25859i.W(abstractC0191xB);
                if (it.a() == C7.b0.j) {
                    return strW;
                }
                return it.a() + ' ' + strW;
            default:
                C7.AbstractC0191x abstractC0191x = (C7.AbstractC0191x) obj;
                kotlin.jvm.internal.m.b(abstractC0191x);
                return this.f25859i.W(abstractC0191x);
        }
    }
}
