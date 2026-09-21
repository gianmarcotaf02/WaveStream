package com.kiptv.core.model;

/* JADX INFO: renamed from: com.kiptv.core.model.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1946h0 implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.kiptv.core.model.C1946h0 f20773a = new com.kiptv.core.model.C1946h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p162s8.q f20774b = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.e(new com.kiptv.core.model.C1933b(6));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p135p8.g f20775c = com.google.crypto.tink.shaded.protobuf.q0.j("com.kiptv.core.model.PlaylistSettingsExtra", new kotlinx.serialization.descriptors.SerialDescriptor[0], new p108m5.c(22));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.Set f20776d = p078i6.m.F0(new java.lang.String[]{"movies", "series", "live"});

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.Object objT;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.json.b bVarI = ((p162s8.k) decoder).i();
        java.util.ArrayList arrayList = null;
        kotlinx.serialization.json.c cVar = bVarI instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVarI : null;
        if (cVar == null) {
            return new com.kiptv.core.model.C1944g0();
        }
        com.kiptv.core.model.PlaylistSettingsExtraSerializer$Surrogate playlistSettingsExtraSerializer$Surrogate = (com.kiptv.core.model.PlaylistSettingsExtraSerializer$Surrogate) f20774b.a(com.kiptv.core.model.PlaylistSettingsExtraSerializer$Surrogate.INSTANCE.serializer(), cVar);
        int i3 = playlistSettingsExtraSerializer$Surrogate.f20071a;
        kotlinx.serialization.json.b bVar = playlistSettingsExtraSerializer$Surrogate.f20082n;
        kotlinx.serialization.json.a aVar = bVar instanceof kotlinx.serialization.json.a ? (kotlinx.serialization.json.a) bVar : null;
        if (aVar != null) {
            p162s8.q qVarE = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.e(new com.kiptv.core.model.C1933b(5));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = aVar.f24557h.iterator();
            while (it.hasNext()) {
                try {
                    objT = (com.kiptv.core.model.HomeSectionConfig) qVarE.a(com.kiptv.core.model.HomeSectionConfig.INSTANCE.serializer(), (kotlinx.serialization.json.b) it.next());
                } catch (java.lang.Throwable th) {
                    objT = com.google.common.util.concurrent.P.T(th);
                }
                if (objT instanceof p070h6.m) {
                    objT = null;
                }
                com.kiptv.core.model.HomeSectionConfig homeSectionConfig = (com.kiptv.core.model.HomeSectionConfig) objT;
                if (homeSectionConfig != null) {
                    arrayList2.add(homeSectionConfig);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new com.kiptv.core.model.C1944g0(i3, playlistSettingsExtraSerializer$Surrogate.f20072b, playlistSettingsExtraSerializer$Surrogate.f20073c, playlistSettingsExtraSerializer$Surrogate.f20074d, playlistSettingsExtraSerializer$Surrogate.f20075e, playlistSettingsExtraSerializer$Surrogate.f20076f, playlistSettingsExtraSerializer$Surrogate.f20079k, playlistSettingsExtraSerializer$Surrogate.g, playlistSettingsExtraSerializer$Surrogate.f20077h, playlistSettingsExtraSerializer$Surrogate.f20078i, playlistSettingsExtraSerializer$Surrogate.j, playlistSettingsExtraSerializer$Surrogate.f20080l, playlistSettingsExtraSerializer$Surrogate.f20081m, arrayList, cVar);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f20775c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.kiptv.core.model.C1944g0 value = (com.kiptv.core.model.C1944g0) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        p162s8.o oVar = (p162s8.o) encoder;
        kotlinx.serialization.KSerializer kSerializerSerializer = com.kiptv.core.model.PlaylistSettingsExtraSerializer$Surrogate.INSTANCE.serializer();
        java.util.List list = value.f20765n;
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) f20774b.c(kSerializerSerializer, new com.kiptv.core.model.PlaylistSettingsExtraSerializer$Surrogate(value.f20754a, value.f20755b, value.f20756c, value.f20757d, value.f20758e, value.f20759f, value.f20760h, value.f20761i, value.j, value.f20762k, value.g, value.f20763l, value.f20764m, list == null ? null : com.google.crypto.tink.shaded.protobuf.AbstractC1909d.e(new com.kiptv.core.model.C1933b(4)).c(com.google.android.gms.internal.play_billing.V0.a(com.kiptv.core.model.HomeSectionConfig.INSTANCE.serializer()), list)));
        kotlinx.serialization.json.c cVar2 = value.f20766o;
        if (cVar2 != null) {
            java.util.LinkedHashMap linkedHashMapZ0 = p078i6.C.Z0(cVar2);
            for (java.util.Map.Entry entry : cVar.f24558h.entrySet()) {
                java.lang.String str = (java.lang.String) entry.getKey();
                java.lang.Object cVar3 = (kotlinx.serialization.json.b) entry.getValue();
                java.lang.Object obj2 = (kotlinx.serialization.json.b) linkedHashMapZ0.get(str);
                if (f20776d.contains(str) && (obj2 instanceof kotlinx.serialization.json.c) && (cVar3 instanceof kotlinx.serialization.json.c)) {
                    java.util.LinkedHashMap linkedHashMapZ1 = p078i6.C.Z0((java.util.Map) obj2);
                    linkedHashMapZ1.putAll((java.util.Map) cVar3);
                    cVar3 = new kotlinx.serialization.json.c(linkedHashMapZ1);
                }
                linkedHashMapZ0.put(str, cVar3);
            }
            cVar = new kotlinx.serialization.json.c(linkedHashMapZ0);
        }
        oVar.w(cVar);
    }
}
