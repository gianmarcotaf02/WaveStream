package P6;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements P6.b, P6.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final P6.a f8163b = new P6.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final P6.a f8164c = new P6.a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final P6.a f8165d = new P6.a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8166a;

    public /* synthetic */ a(int i3) {
        this.f8166a = i3;
    }

    @Override // P6.b
    public java.util.Collection a(N6.InterfaceC0691e classDescriptor) {
        kotlin.jvm.internal.m.e(classDescriptor, "classDescriptor");
        return p078i6.w.f23205h;
    }

    @Override // P6.b
    public java.util.Collection b(N6.InterfaceC0691e classDescriptor) {
        kotlin.jvm.internal.m.e(classDescriptor, "classDescriptor");
        return p078i6.w.f23205h;
    }

    @Override // P6.b
    public java.util.Collection c(N6.InterfaceC0691e classDescriptor) {
        kotlin.jvm.internal.m.e(classDescriptor, "classDescriptor");
        return p078i6.w.f23205h;
    }

    @Override // P6.b
    public java.util.Collection d(p101l7.e name, N6.InterfaceC0691e classDescriptor) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(classDescriptor, "classDescriptor");
        return p078i6.w.f23205h;
    }

    @Override // P6.d
    public boolean e(N6.InterfaceC0691e classDescriptor, A7.B b9) {
        switch (this.f8166a) {
            case 1:
                kotlin.jvm.internal.m.e(classDescriptor, "classDescriptor");
                return true;
            default:
                kotlin.jvm.internal.m.e(classDescriptor, "classDescriptor");
                return !b9.getAnnotations().h(P6.e.f8167a);
        }
    }
}
