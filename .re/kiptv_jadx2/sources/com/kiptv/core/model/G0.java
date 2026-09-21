package com.kiptv.core.model;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class G0 implements KSerializer {

    public static final G0 f19784a = new G0();

    public static final p135p8.g f19785b = com.google.crypto.tink.shaded.protobuf.q0.j("XtreamEpisodeInfo", new SerialDescriptor[0], new p108m5.c(22));

    @Override
    public final Object deserialize(Decoder decoder) {
        String strD;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.json.b bVarI = ((p162s8.k) decoder).i();
        if (!(bVarI instanceof kotlinx.serialization.json.c)) {
            return new F0(null, null, null);
        }
        kotlinx.serialization.json.c cVarI = p162s8.l.i(bVarI);
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVarI.get("duration");
        if (bVar == null || !(bVar instanceof kotlinx.serialization.json.d)) {
            strD = null;
        } else {
            strD = ((kotlinx.serialization.json.d) bVar).d();
            if (strD.length() <= 0) {
                strD = null;
            }
        }
        Object obj = cVarI.get("plot");
        kotlinx.serialization.json.d dVar = obj instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj : null;
        String strD2 = dVar != null ? dVar.d() : null;
        Object obj2 = cVarI.get("movie_image");
        kotlinx.serialization.json.d dVar2 = obj2 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj2 : null;
        return new F0(strD, strD2, dVar2 != null ? dVar2.d() : null);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f19785b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        F0 value = (F0) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        throw new UnsupportedOperationException("Serialization not supported");
    }
}
