package p153r8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f0 extends p153r8.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p153r8.C2694e0 f26960b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(kotlinx.serialization.KSerializer primitiveSerializer) {
        super(primitiveSerializer);
        kotlin.jvm.internal.m.e(primitiveSerializer, "primitiveSerializer");
        this.f26960b = new p153r8.C2694e0(primitiveSerializer.getDescriptor());
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object a() {
        return (p153r8.AbstractC2692d0) g(j());
    }

    @Override // p153r8.AbstractC2685a
    public final int b(java.lang.Object obj) {
        p153r8.AbstractC2692d0 abstractC2692d0 = (p153r8.AbstractC2692d0) obj;
        kotlin.jvm.internal.m.e(abstractC2692d0, "<this>");
        return abstractC2692d0.d();
    }

    @Override // p153r8.AbstractC2685a
    public final java.util.Iterator c(java.lang.Object obj) {
        throw new java.lang.IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p153r8.AbstractC2685a, kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        return e(decoder);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.f26960b;
    }

    @Override // p153r8.AbstractC2685a
    public final java.lang.Object h(java.lang.Object obj) {
        p153r8.AbstractC2692d0 abstractC2692d0 = (p153r8.AbstractC2692d0) obj;
        kotlin.jvm.internal.m.e(abstractC2692d0, "<this>");
        return abstractC2692d0.a();
    }

    @Override // p153r8.r
    public final void i(java.lang.Object obj, int i3, java.lang.Object obj2) {
        kotlin.jvm.internal.m.e((p153r8.AbstractC2692d0) obj, "<this>");
        throw new java.lang.IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract java.lang.Object j();

    public abstract void k(p143q8.b bVar, java.lang.Object obj, int i3);

    @Override // p153r8.r, kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        int iD = d(obj);
        p153r8.C2694e0 c2694e0 = this.f26960b;
        p143q8.b bVarA = encoder.A(c2694e0);
        k(bVarA, obj, iD);
        bVarA.a(c2694e0);
    }
}
