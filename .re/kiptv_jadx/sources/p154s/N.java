package p154s;

/* JADX INFO: loaded from: classes.dex */
public final class N extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f27078h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p154s.O f27079i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N(p154s.O o8, int i3) {
        super(1);
        this.f27078h = i3;
        this.f27079i = o8;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f27078h) {
            case 0:
                p163t.s0 s0Var = (p163t.s0) obj;
                p154s.D d4 = p154s.D.f27046h;
                p154s.D d6 = p154s.D.f27047i;
                boolean zC = s0Var.c(d4, d6);
                java.lang.Object obj2 = null;
                p154s.O o8 = this.f27079i;
                if (zC) {
                    p154s.C2739z c2739z = o8.f27090z.f27092a.f27113c;
                    if (c2739z != null) {
                        obj2 = c2739z.f27195c;
                    }
                } else if (s0Var.c(d6, p154s.D.j)) {
                    p154s.C2739z c2739z2 = o8.f27080A.f27095a.f27113c;
                    if (c2739z2 != null) {
                        obj2 = c2739z2.f27195c;
                    }
                } else {
                    obj2 = p154s.K.f27072d;
                }
                return obj2 == null ? p154s.K.f27072d : obj2;
            default:
                p163t.s0 s0Var2 = (p163t.s0) obj;
                p154s.D d9 = p154s.D.f27046h;
                p154s.D d10 = p154s.D.f27047i;
                boolean zC2 = s0Var2.c(d9, d10);
                p154s.O o9 = this.f27079i;
                if (zC2) {
                    p154s.Z z6 = o9.f27090z.f27092a.f27112b;
                    return z6 != null ? z6.f27106b : p154s.K.f27071c;
                }
                if (!s0Var2.c(d10, p154s.D.j)) {
                    return p154s.K.f27071c;
                }
                p154s.Z z9 = o9.f27080A.f27095a.f27112b;
                return z9 != null ? z9.f27106b : p154s.K.f27071c;
        }
    }
}
