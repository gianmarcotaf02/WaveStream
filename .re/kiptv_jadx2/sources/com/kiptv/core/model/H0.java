package com.kiptv.core.model;

import io.ktor.http.LinkHeader;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class H0 implements KSerializer {

    public static final H0 f19790a = new H0();

    public static final p135p8.g f19791b = com.google.crypto.tink.shaded.protobuf.q0.j("XtreamEpisode", new SerialDescriptor[0], new p108m5.c(22));

    @Override
    public final Object deserialize(Decoder decoder) {
        String str;
        String str2;
        Integer num;
        Integer num2;
        String str3;
        String strD;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        p162s8.k kVar = (p162s8.k) decoder;
        kotlinx.serialization.json.c cVarI = p162s8.l.i(kVar.i());
        p162s8.d dVarT = kVar.t();
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVarI.get("id");
        if (bVar != null) {
            try {
                str = (String) dVarT.a(C1961v.f20848a, bVar);
            } catch (Exception unused) {
                str = "";
            }
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
        } else {
            str2 = "";
        }
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) cVarI.get("episode_num");
        int iIntValue = 0;
        if (bVar2 != null) {
            try {
                iIntValue = ((Number) dVarT.a(C1958s.f20829a, bVar2)).intValue();
            } catch (Exception unused2) {
            }
        }
        int i3 = iIntValue;
        Object obj = cVarI.get(LinkHeader.Parameters.Title);
        F0 f9 = null;
        kotlinx.serialization.json.d dVar = obj instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj : null;
        String strD2 = dVar != null ? dVar.d() : null;
        Object obj2 = cVarI.get("container_extension");
        kotlinx.serialization.json.d dVar2 = obj2 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj2 : null;
        String strD3 = dVar2 != null ? dVar2.d() : null;
        kotlinx.serialization.json.b bVar3 = (kotlinx.serialization.json.b) cVarI.get("season");
        if (bVar3 != null) {
            try {
                num = (Integer) dVarT.a(r.f20826a, bVar3);
            } catch (Exception unused3) {
                num = null;
            }
            num2 = num;
        } else {
            num2 = null;
        }
        kotlinx.serialization.json.b bVar4 = (kotlinx.serialization.json.b) cVarI.get("added");
        if (bVar4 != null) {
            if (bVar4 instanceof kotlinx.serialization.json.d) {
                strD = ((kotlinx.serialization.json.d) bVar4).d();
                if (strD.length() <= 0) {
                    strD = null;
                }
            } else {
                strD = null;
            }
            str3 = strD;
        } else {
            str3 = null;
        }
        kotlinx.serialization.json.b bVar5 = (kotlinx.serialization.json.b) cVarI.get("info");
        if (bVar5 != null && (bVar5 instanceof kotlinx.serialization.json.c)) {
            try {
                f9 = (F0) dVarT.a(F0.Companion.serializer(), bVar5);
            } catch (Exception unused4) {
            }
        }
        return new E0(str2, i3, strD2, strD3, f9, str3, num2, 128);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f19791b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        E0 value = (E0) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        throw new UnsupportedOperationException("Serialization not supported");
    }
}
