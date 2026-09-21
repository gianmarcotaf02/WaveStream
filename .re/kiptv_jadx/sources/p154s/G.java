package p154s;

/* JADX INFO: loaded from: classes.dex */
public final class G extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f27062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p154s.P f27063i;
    public final /* synthetic */ p154s.Q j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(p154s.P p2, p154s.Q q9, int i3) {
        super(1);
        this.f27062h = i3;
        this.f27063i = p2;
        this.j = q9;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        p163t.A a2;
        p163t.A a9;
        switch (this.f27062h) {
            case 0:
                p163t.s0 s0Var = (p163t.s0) obj;
                p154s.D d4 = p154s.D.f27046h;
                p154s.D d6 = p154s.D.f27047i;
                if (s0Var.c(d4, d6)) {
                    p154s.S s9 = this.f27063i.f27092a.f27111a;
                    return (s9 == null || (a9 = s9.f27096a) == null) ? p154s.K.f27070b : a9;
                }
                if (!s0Var.c(d6, p154s.D.j)) {
                    return p154s.K.f27070b;
                }
                p154s.S s10 = this.j.f27095a.f27111a;
                return (s10 == null || (a2 = s10.f27096a) == null) ? p154s.K.f27070b : a2;
            case 1:
                int iOrdinal = ((p154s.D) obj).ordinal();
                float f9 = 0.0f;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        f9 = 1.0f;
                    } else {
                        if (iOrdinal != 2) {
                            throw new I3.b();
                        }
                        if (this.j.f27095a.f27111a == null) {
                            f9 = 1.0f;
                        }
                    }
                } else if (this.f27063i.f27092a.f27111a == null) {
                    f9 = 1.0f;
                }
                return java.lang.Float.valueOf(f9);
            case 2:
                p163t.s0 s0Var2 = (p163t.s0) obj;
                p154s.D d9 = p154s.D.f27046h;
                p154s.D d10 = p154s.D.f27047i;
                if (s0Var2.c(d9, d10)) {
                    return p154s.K.f27070b;
                }
                if (!s0Var2.c(d10, p154s.D.j)) {
                    return p154s.K.f27070b;
                }
                p154s.b0 b0Var = this.j.f27095a;
                return p154s.K.f27070b;
            default:
                int iOrdinal2 = ((p154s.D) obj).ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        throw new I3.b();
                    }
                    p154s.b0 b0Var2 = this.j.f27095a;
                }
                return java.lang.Float.valueOf(1.0f);
        }
    }
}
