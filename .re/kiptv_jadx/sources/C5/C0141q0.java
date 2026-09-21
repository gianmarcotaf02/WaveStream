package C5;

/* JADX INFO: renamed from: C5.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0141q0 implements V7.InterfaceC0982h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f1429i;
    public final /* synthetic */ kotlin.jvm.functions.Function0 j;

    public /* synthetic */ C0141q0(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function1, int i3) {
        this.f1428h = i3;
        this.f1429i = function0;
        this.j = function1;
    }

    @Override // V7.InterfaceC0982h
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
        switch (this.f1428h) {
            case 0:
                C5.AbstractC0117i0 abstractC0117i0 = (C5.AbstractC0117i0) obj;
                if (kotlin.jvm.internal.m.a(abstractC0117i0, C5.C0114h0.f1343a)) {
                    this.f1429i.invoke();
                } else {
                    if (!kotlin.jvm.internal.m.a(abstractC0117i0, C5.C0111g0.f1333a)) {
                        throw new I3.b();
                    }
                    this.j.invoke();
                }
                return p070h6.A.f22523a;
            case 1:
                E5.U u6 = (E5.U) obj;
                if (kotlin.jvm.internal.m.a(u6, E5.P.f2928a)) {
                    this.f1429i.invoke();
                } else if (kotlin.jvm.internal.m.a(u6, E5.S.f2936a)) {
                    this.j.invoke();
                }
                return p070h6.A.f22523a;
            case 2:
                E5.B b9 = (E5.B) obj;
                if (kotlin.jvm.internal.m.a(b9, E5.A.f2839a) || kotlin.jvm.internal.m.a(b9, E5.C0324y.f3180a)) {
                    this.f1429i.invoke();
                } else {
                    if (!kotlin.jvm.internal.m.a(b9, E5.C0326z.f3187a)) {
                        throw new I3.b();
                    }
                    this.j.invoke();
                }
                return p070h6.A.f22523a;
            default:
                J5.InterfaceC0621p interfaceC0621p = (J5.InterfaceC0621p) obj;
                if (kotlin.jvm.internal.m.a(interfaceC0621p, J5.C0617o.f6520a)) {
                    this.f1429i.invoke();
                } else {
                    if (!kotlin.jvm.internal.m.a(interfaceC0621p, J5.C0613n.f6511a)) {
                        throw new I3.b();
                    }
                    this.j.invoke();
                }
                return p070h6.A.f22523a;
        }
    }
}
