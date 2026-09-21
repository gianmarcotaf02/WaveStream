package p153r8;

import kotlin.jvm.internal.m;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class C2694e0 extends M {

    public final String f26958b;

    public C2694e0(SerialDescriptor primitive) {
        super(primitive);
        m.e(primitive, "primitive");
        this.f26958b = primitive.a() + "Array";
    }

    @Override
    public final String a() {
        return this.f26958b;
    }
}
