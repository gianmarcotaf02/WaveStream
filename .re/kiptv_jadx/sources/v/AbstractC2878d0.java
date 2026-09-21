package v;

/* JADX INFO: renamed from: v.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2878d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p020c0.C f28929a = new p020c0.C(new t5.C2804h0(4));

    public static final p137q0.p a(p137q0.p pVar, p202z.k kVar, v.InterfaceC2874b0 interfaceC2874b0) {
        if (interfaceC2874b0 == null) {
            return pVar;
        }
        return interfaceC2874b0 instanceof v.InterfaceC2886h0 ? pVar.d(new v.C2882f0(kVar, (v.InterfaceC2886h0) interfaceC2874b0)) : p137q0.a.a(pVar, new U.L(interfaceC2874b0, kVar, 3));
    }
}
