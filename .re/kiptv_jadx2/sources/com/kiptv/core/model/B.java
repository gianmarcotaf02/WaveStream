package com.kiptv.core.model;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class B implements KSerializer {

    public static final B f19671a = new B();

    public static final p135p8.g f19672b = com.google.crypto.tink.shaded.protobuf.q0.j("HomeSectionKind", new SerialDescriptor[0], new p108m5.c(22));

    @Override
    public final Object deserialize(Decoder decoder) {
        Object next;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        String strM = decoder.m();
        A.Companion.getClass();
        Iterator it = A.f19667q.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((A) next).f19668h.equals(strM));
        A a2 = (A) next;
        if (a2 != null) {
            return a2;
        }
        throw new IllegalArgumentException(p121o0.p.C("unknown HomeSectionKind: ", strM));
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f19672b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        A value = (A) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        encoder.F(value.f19668h);
    }
}
