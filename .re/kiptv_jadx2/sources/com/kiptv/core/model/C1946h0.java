package com.kiptv.core.model;

import com.google.android.gms.internal.play_billing.V0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class C1946h0 implements KSerializer {

    public static final C1946h0 f20773a = new C1946h0();

    public static final p162s8.q f20774b = AbstractC1909d.e(new C1933b(6));

    public static final p135p8.g f20775c = com.google.crypto.tink.shaded.protobuf.q0.j("com.kiptv.core.model.PlaylistSettingsExtra", new SerialDescriptor[0], new p108m5.c(22));

    public static final Set f20776d = p078i6.m.F0(new String[]{"movies", "series", "live"});

    @Override
    public final Object deserialize(Decoder decoder) {
        Object objT;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.json.b bVarI = ((p162s8.k) decoder).i();
        ArrayList arrayList = null;
        kotlinx.serialization.json.c cVar = bVarI instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVarI : null;
        if (cVar == null) {
            return new C1944g0();
        }
        PlaylistSettingsExtraSerializer$Surrogate playlistSettingsExtraSerializer$Surrogate = (PlaylistSettingsExtraSerializer$Surrogate) f20774b.a(PlaylistSettingsExtraSerializer$Surrogate.INSTANCE.serializer(), cVar);
        int i3 = playlistSettingsExtraSerializer$Surrogate.f20071a;
        kotlinx.serialization.json.b bVar = playlistSettingsExtraSerializer$Surrogate.f20082n;
        kotlinx.serialization.json.a aVar = bVar instanceof kotlinx.serialization.json.a ? (kotlinx.serialization.json.a) bVar : null;
        if (aVar != null) {
            p162s8.q qVarE = AbstractC1909d.e(new C1933b(5));
            ArrayList arrayList2 = new ArrayList();
            Iterator it = aVar.f24557h.iterator();
            while (it.hasNext()) {
                try {
                    objT = (HomeSectionConfig) qVarE.a(HomeSectionConfig.INSTANCE.serializer(), (kotlinx.serialization.json.b) it.next());
                } catch (Throwable th) {
                    objT = com.google.common.util.concurrent.P.T(th);
                }
                if (objT instanceof p070h6.m) {
                    objT = null;
                }
                HomeSectionConfig homeSectionConfig = (HomeSectionConfig) objT;
                if (homeSectionConfig != null) {
                    arrayList2.add(homeSectionConfig);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return new C1944g0(i3, playlistSettingsExtraSerializer$Surrogate.f20072b, playlistSettingsExtraSerializer$Surrogate.f20073c, playlistSettingsExtraSerializer$Surrogate.f20074d, playlistSettingsExtraSerializer$Surrogate.f20075e, playlistSettingsExtraSerializer$Surrogate.f20076f, playlistSettingsExtraSerializer$Surrogate.f20079k, playlistSettingsExtraSerializer$Surrogate.g, playlistSettingsExtraSerializer$Surrogate.f20077h, playlistSettingsExtraSerializer$Surrogate.f20078i, playlistSettingsExtraSerializer$Surrogate.j, playlistSettingsExtraSerializer$Surrogate.f20080l, playlistSettingsExtraSerializer$Surrogate.f20081m, arrayList, cVar);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f20775c;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        C1944g0 value = (C1944g0) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        p162s8.o oVar = (p162s8.o) encoder;
        KSerializer kSerializerSerializer = PlaylistSettingsExtraSerializer$Surrogate.INSTANCE.serializer();
        List list = value.f20765n;
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) f20774b.c(kSerializerSerializer, new PlaylistSettingsExtraSerializer$Surrogate(value.f20754a, value.f20755b, value.f20756c, value.f20757d, value.f20758e, value.f20759f, value.f20760h, value.f20761i, value.j, value.f20762k, value.g, value.f20763l, value.f20764m, list == null ? null : AbstractC1909d.e(new C1933b(4)).c(V0.a(HomeSectionConfig.INSTANCE.serializer()), list)));
        kotlinx.serialization.json.c cVar2 = value.f20766o;
        if (cVar2 != null) {
            LinkedHashMap linkedHashMapZ0 = p078i6.C.Z0(cVar2);
            for (Map.Entry entry : cVar.f24558h.entrySet()) {
                String str = (String) entry.getKey();
                Object cVar3 = (kotlinx.serialization.json.b) entry.getValue();
                Object obj2 = (kotlinx.serialization.json.b) linkedHashMapZ0.get(str);
                if (f20776d.contains(str) && (obj2 instanceof kotlinx.serialization.json.c) && (cVar3 instanceof kotlinx.serialization.json.c)) {
                    LinkedHashMap linkedHashMapZ1 = p078i6.C.Z0((Map) obj2);
                    linkedHashMapZ1.putAll((Map) cVar3);
                    cVar3 = new kotlinx.serialization.json.c(linkedHashMapZ1);
                }
                linkedHashMapZ0.put(str, cVar3);
            }
            cVar = new kotlinx.serialization.json.c(linkedHashMapZ0);
        }
        oVar.w(cVar);
    }
}
