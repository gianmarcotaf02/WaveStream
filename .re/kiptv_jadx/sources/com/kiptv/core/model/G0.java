package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class G0 implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.kiptv.core.model.G0 f19784a = new com.kiptv.core.model.G0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p135p8.g f19785b = com.google.crypto.tink.shaded.protobuf.q0.j("XtreamEpisodeInfo", new kotlinx.serialization.descriptors.SerialDescriptor[0], new p108m5.c(22));

    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String strD;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.json.b bVarI = ((p162s8.k) decoder).i();
        if (!(bVarI instanceof kotlinx.serialization.json.c)) {
            return new com.kiptv.core.model.F0(null, null, null);
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
        java.lang.Object obj = cVarI.get("plot");
        kotlinx.serialization.json.d dVar = obj instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj : null;
        java.lang.String strD2 = dVar != null ? dVar.d() : null;
        java.lang.Object obj2 = cVarI.get("movie_image");
        kotlinx.serialization.json.d dVar2 = obj2 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj2 : null;
        return new com.kiptv.core.model.F0(strD, strD2, dVar2 != null ? dVar2.d() : null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f19785b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.kiptv.core.model.F0 value = (com.kiptv.core.model.F0) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        throw new java.lang.UnsupportedOperationException("Serialization not supported");
    }
}
