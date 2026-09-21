package y7;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends p179v4.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p101l7.c f32104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p101l7.c fqName, p079i7.e nameResolver, Q6.z zVar, p044e7.g gVar) {
        super(nameResolver, zVar, gVar);
        kotlin.jvm.internal.m.e(fqName, "fqName");
        kotlin.jvm.internal.m.e(nameResolver, "nameResolver");
        this.f32104e = fqName;
    }

    @Override // p179v4.d
    public final p101l7.c a() {
        return this.f32104e;
    }
}
