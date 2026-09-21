package p063g8;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends p063g8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p063g8.r f22395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f22398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f22399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p045e8.X f22400f;
    public final int g;

    public u(p063g8.r rVar, int i3, int i9, p045e8.X x9, int i10) {
        int i11;
        java.lang.String name = rVar.f22391h.getName();
        java.lang.Integer num = (i10 & 16) != 0 ? null : 0;
        x9 = (i10 & 32) != 0 ? null : x9;
        kotlin.jvm.internal.m.e(name, "name");
        this.f22395a = rVar;
        this.f22396b = i3;
        this.f22397c = i9;
        this.f22398d = name;
        this.f22399e = num;
        this.f22400f = x9;
        if (i9 < 10) {
            i11 = 1;
        } else if (i9 < 100) {
            i11 = 2;
        } else {
            if (i9 >= 1000) {
                throw new java.lang.IllegalArgumentException(Y6.f.f(i9, "Max value ", " is too large"));
            }
            i11 = 3;
        }
        this.g = i11;
    }

    @Override // p063g8.a
    public final p063g8.r a() {
        return this.f22395a;
    }

    @Override // p063g8.a
    public final java.lang.Object b() {
        return this.f22399e;
    }

    @Override // p063g8.a
    public final java.lang.String c() {
        return this.f22398d;
    }

    @Override // p063g8.a
    public final p045e8.X d() {
        return this.f22400f;
    }
}
