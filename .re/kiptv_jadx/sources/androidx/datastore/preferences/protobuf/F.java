package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.C1511s f16133b = new androidx.datastore.preferences.protobuf.C1511s(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f16134a;

    public F(androidx.datastore.preferences.protobuf.C1505l c1505l) {
        androidx.datastore.preferences.protobuf.AbstractC1516x.a(c1505l, "output");
        this.f16134a = c1505l;
        c1505l.f16229m = this;
    }

    public void a(int i3, java.lang.Object obj, androidx.datastore.preferences.protobuf.X x9) {
        androidx.datastore.preferences.protobuf.C1505l c1505l = (androidx.datastore.preferences.protobuf.C1505l) this.f16134a;
        c1505l.G0(i3, 3);
        x9.e((androidx.datastore.preferences.protobuf.AbstractC1494a) obj, c1505l.f16229m);
        c1505l.G0(i3, 4);
    }

    public F() {
        androidx.datastore.preferences.protobuf.U u6 = androidx.datastore.preferences.protobuf.U.f16162c;
        androidx.datastore.preferences.protobuf.L l2 = f16133b;
        try {
            l2 = (androidx.datastore.preferences.protobuf.L) java.lang.Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (java.lang.Exception unused) {
        }
        androidx.datastore.preferences.protobuf.L[] lArr = {androidx.datastore.preferences.protobuf.C1511s.f16248b, l2};
        androidx.datastore.preferences.protobuf.E e6 = new androidx.datastore.preferences.protobuf.E();
        e6.f16132a = lArr;
        java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC1516x.f16267a;
        this.f16134a = e6;
    }
}
