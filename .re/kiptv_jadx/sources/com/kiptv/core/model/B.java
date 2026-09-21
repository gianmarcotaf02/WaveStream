package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class B implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.kiptv.core.model.B f19671a = new com.kiptv.core.model.B();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p135p8.g f19672b = com.google.crypto.tink.shaded.protobuf.q0.j("HomeSectionKind", new kotlinx.serialization.descriptors.SerialDescriptor[0], new p108m5.c(22));

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object next;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        java.lang.String strM = decoder.m();
        com.kiptv.core.model.A.Companion.getClass();
        java.util.Iterator it = com.kiptv.core.model.A.f19667q.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((com.kiptv.core.model.A) next).f19668h.equals(strM));
        com.kiptv.core.model.A a2 = (com.kiptv.core.model.A) next;
        if (a2 != null) {
            return a2;
        }
        throw new java.lang.IllegalArgumentException(p121o0.p.C("unknown HomeSectionKind: ", strM));
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f19672b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.kiptv.core.model.A value = (com.kiptv.core.model.A) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        encoder.F(value.f19668h);
    }
}
