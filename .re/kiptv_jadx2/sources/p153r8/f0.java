package p153r8;

import java.util.Iterator;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p143q8.b;

public abstract class f0 extends r {

    public final C2694e0 f26960b;

    public f0(KSerializer primitiveSerializer) {
        super(primitiveSerializer);
        m.e(primitiveSerializer, "primitiveSerializer");
        this.f26960b = new C2694e0(primitiveSerializer.getDescriptor());
    }

    @Override
    public final Object a() {
        return (AbstractC2692d0) g(j());
    }

    @Override
    public final int b(Object obj) {
        AbstractC2692d0 abstractC2692d0 = (AbstractC2692d0) obj;
        m.e(abstractC2692d0, "<this>");
        return abstractC2692d0.d();
    }

    @Override
    public final Iterator c(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override
    public final Object deserialize(Decoder decoder) {
        m.e(decoder, "decoder");
        return e(decoder);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return this.f26960b;
    }

    @Override
    public final Object h(Object obj) {
        AbstractC2692d0 abstractC2692d0 = (AbstractC2692d0) obj;
        m.e(abstractC2692d0, "<this>");
        return abstractC2692d0.a();
    }

    @Override
    public final void i(Object obj, int i3, Object obj2) {
        m.e((AbstractC2692d0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object j();

    public abstract void k(b bVar, Object obj, int i3);

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        m.e(encoder, "encoder");
        int iD = d(obj);
        C2694e0 c2694e0 = this.f26960b;
        b bVarA = encoder.A(c2694e0);
        k(bVarA, obj, iD);
        bVarA.a(c2694e0);
    }
}
