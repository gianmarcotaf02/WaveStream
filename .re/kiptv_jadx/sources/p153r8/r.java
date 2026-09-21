package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r extends p153r8.AbstractC2685a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.KSerializer f26994a;

    public r(kotlinx.serialization.KSerializer kSerializer) {
        this.f26994a = kSerializer;
    }

    @Override // p153r8.AbstractC2685a
    public void f(p143q8.a aVar, int i3, java.lang.Object obj) {
        i(obj, i3, aVar.x(getDescriptor(), i3, this.f26994a, null));
    }

    public abstract void i(java.lang.Object obj, int i3, java.lang.Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        int iD = d(obj);
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
        p143q8.b bVarA = encoder.A(descriptor);
        java.util.Iterator itC = c(obj);
        for (int i3 = 0; i3 < iD; i3++) {
            bVarA.h(getDescriptor(), i3, this.f26994a, itC.next());
        }
        bVarA.a(descriptor);
    }
}
