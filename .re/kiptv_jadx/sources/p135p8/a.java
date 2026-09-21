package p135p8;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f26254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.util.List f26255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f26256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f26257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f26258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f26259f;
    public final java.util.ArrayList g;

    public a(java.lang.String serialName) {
        kotlin.jvm.internal.m.e(serialName, "serialName");
        this.f26254a = serialName;
        this.f26255b = p078i6.w.f23205h;
        this.f26256c = new java.util.ArrayList();
        this.f26257d = new java.util.HashSet();
        this.f26258e = new java.util.ArrayList();
        this.f26259f = new java.util.ArrayList();
        this.g = new java.util.ArrayList();
    }

    public final void a(java.lang.String elementName, kotlinx.serialization.descriptors.SerialDescriptor descriptor, boolean z6) {
        p078i6.w wVar = p078i6.w.f23205h;
        kotlin.jvm.internal.m.e(elementName, "elementName");
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        if (!this.f26257d.add(elementName)) {
            java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Element with name '", elementName, "' is already registered in ");
            sbQ.append(this.f26254a);
            throw new java.lang.IllegalArgumentException(sbQ.toString().toString());
        }
        this.f26256c.add(elementName);
        this.f26258e.add(descriptor);
        this.f26259f.add(wVar);
        this.g.add(java.lang.Boolean.valueOf(z6));
    }
}
