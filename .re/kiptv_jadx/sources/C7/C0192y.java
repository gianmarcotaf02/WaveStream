package C7;

/* JADX INFO: renamed from: C7.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0192y implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1613h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C7.M f1614i;

    public C0192y(C7.I i3, C7.M m8, java.util.List list, p180v7.o oVar, boolean z6) {
        this.f1614i = m8;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        D7.f refiner = (D7.f) obj;
        switch (this.f1613h) {
            case 0:
                kotlin.jvm.internal.m.e(refiner, "refiner");
                this.f1614i.h();
                break;
            default:
                kotlin.jvm.internal.m.e(refiner, "kotlinTypeRefiner");
                this.f1614i.h();
                break;
        }
        return null;
    }

    public C0192y(C7.I i3, C7.M m8, java.util.List list, boolean z6) {
        this.f1614i = m8;
    }
}
