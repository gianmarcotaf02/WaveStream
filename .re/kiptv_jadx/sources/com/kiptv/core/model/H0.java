package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class H0 implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.kiptv.core.model.H0 f19790a = new com.kiptv.core.model.H0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p135p8.g f19791b = com.google.crypto.tink.shaded.protobuf.q0.j("XtreamEpisode", new kotlinx.serialization.descriptors.SerialDescriptor[0], new p108m5.c(22));

    /* JADX WARN: Code duplicated, block: B:10:0x002e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Integer num;
        java.lang.Integer num2;
        java.lang.String str3;
        java.lang.String strD;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        p162s8.k kVar = (p162s8.k) decoder;
        kotlinx.serialization.json.c cVarI = p162s8.l.i(kVar.i());
        p162s8.d dVarT = kVar.t();
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVarI.get("id");
        if (bVar != null) {
            try {
                str = (java.lang.String) dVarT.a(com.kiptv.core.model.C1961v.f20848a, bVar);
            } catch (java.lang.Exception unused) {
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
                iIntValue = ((java.lang.Number) dVarT.a(com.kiptv.core.model.C1958s.f20829a, bVar2)).intValue();
            } catch (java.lang.Exception unused2) {
            }
        }
        int i3 = iIntValue;
        java.lang.Object obj = cVarI.get(io.ktor.http.LinkHeader.Parameters.Title);
        com.kiptv.core.model.F0 f9 = null;
        kotlinx.serialization.json.d dVar = obj instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj : null;
        java.lang.String strD2 = dVar != null ? dVar.d() : null;
        java.lang.Object obj2 = cVarI.get("container_extension");
        kotlinx.serialization.json.d dVar2 = obj2 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj2 : null;
        java.lang.String strD3 = dVar2 != null ? dVar2.d() : null;
        kotlinx.serialization.json.b bVar3 = (kotlinx.serialization.json.b) cVarI.get("season");
        if (bVar3 != null) {
            try {
                num = (java.lang.Integer) dVarT.a(com.kiptv.core.model.r.f20826a, bVar3);
            } catch (java.lang.Exception unused3) {
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
                f9 = (com.kiptv.core.model.F0) dVarT.a(com.kiptv.core.model.F0.Companion.serializer(), bVar5);
            } catch (java.lang.Exception unused4) {
            }
        }
        return new com.kiptv.core.model.E0(str2, i3, strD2, strD3, f9, str3, num2, 128);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f19791b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.kiptv.core.model.E0 value = (com.kiptv.core.model.E0) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        throw new java.lang.UnsupportedOperationException("Serialization not supported");
    }
}
