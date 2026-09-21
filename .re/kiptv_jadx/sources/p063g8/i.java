package p063g8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i implements p063g8.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p063g8.l f22379a;

    public i(p063g8.l field, java.util.List list) {
        kotlin.jvm.internal.m.e(field, "field");
        this.f22379a = field;
    }

    @Override // p063g8.j
    public final h8.a a() {
        p063g8.r rVar = this.f22379a.f22380a;
        return new h8.a();
    }

    @Override // p063g8.j
    public final p080i8.p b() {
        p063g8.l lVar = this.f22379a;
        return new p080i8.p(com.google.common.util.concurrent.P.i0(new p080i8.h(com.google.common.util.concurrent.P.i0(new p080i8.b(lVar.f22380a, lVar.f22381b)))), p078i6.w.f23205h);
    }

    @Override // p063g8.j
    public final p063g8.a c() {
        return this.f22379a;
    }
}
