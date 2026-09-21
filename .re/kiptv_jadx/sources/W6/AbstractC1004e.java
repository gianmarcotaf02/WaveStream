package W6;

/* JADX INFO: renamed from: W6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1004e extends W6.G {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f10651l = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static final N6.InterfaceC0706u a(N6.InterfaceC0706u functionDescriptor) {
        kotlin.jvm.internal.m.e(functionDescriptor, "functionDescriptor");
        p101l7.e name = ((Q6.AbstractC0804m) functionDescriptor).getName();
        kotlin.jvm.internal.m.d(name, "getName(...)");
        if (b(name)) {
            return (N6.InterfaceC0706u) p161s7.d.b(functionDescriptor, W6.C1003d.f10644i);
        }
        return null;
    }

    public static boolean b(p101l7.e eVar) {
        kotlin.jvm.internal.m.e(eVar, "<this>");
        return W6.G.f10629e.contains(eVar);
    }
}
