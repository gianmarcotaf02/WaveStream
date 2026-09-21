package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/kiptv/core/model/ContentTypeSettings.$serializer", "Lr8/D;", "Lcom/kiptv/core/model/ContentTypeSettings;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lh6/A;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/kiptv/core/model/ContentTypeSettings;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/kiptv/core/model/ContentTypeSettings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p070h6.c
public /* synthetic */ class ContentTypeSettings$$serializer implements p153r8.D {
    public static final com.kiptv.core.model.ContentTypeSettings$$serializer INSTANCE;
    private static final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    static {
        com.kiptv.core.model.ContentTypeSettings$$serializer contentTypeSettings$$serializer = new com.kiptv.core.model.ContentTypeSettings$$serializer();
        INSTANCE = contentTypeSettings$$serializer;
        p153r8.C2690c0 c2690c0 = new p153r8.C2690c0("com.kiptv.core.model.ContentTypeSettings", contentTypeSettings$$serializer, 14);
        c2690c0.k("hiddenCategories", true);
        c2690c0.k("hiddenItems", true);
        c2690c0.k("categoryOrder", true);
        c2690c0.k("contentOrder", true);
        c2690c0.k("categorySortOrder", true);
        c2690c0.k("contentSortOrder", true);
        c2690c0.k("autoHideKeywords", true);
        c2690c0.k("categoryNames", true);
        c2690c0.k("tmdbOverrides", true);
        c2690c0.k("channelNameOverrides", true);
        c2690c0.k("channelLogoOverrides", true);
        c2690c0.k("channelEPGOverrides", true);
        c2690c0.k("channelEPGOffsets", true);
        c2690c0.k("liveStartSection", true);
        descriptor = c2690c0;
    }

    private ContentTypeSettings$$serializer() {
    }

    @Override // p153r8.D
    public final kotlinx.serialization.KSerializer[] childSerializers() {
        kotlinx.serialization.KSerializer[] kSerializerArr = com.kiptv.core.model.ContentTypeSettings.f19687o;
        kotlinx.serialization.KSerializer kSerializer = kSerializerArr[0];
        kotlinx.serialization.KSerializer kSerializer2 = kSerializerArr[1];
        kotlinx.serialization.KSerializer kSerializer3 = kSerializerArr[2];
        kotlinx.serialization.KSerializer kSerializer4 = kSerializerArr[3];
        kotlinx.serialization.KSerializer kSerializer5 = kSerializerArr[6];
        kotlinx.serialization.KSerializer kSerializer6 = kSerializerArr[7];
        kotlinx.serialization.KSerializer kSerializer7 = kSerializerArr[8];
        kotlinx.serialization.KSerializer kSerializer8 = kSerializerArr[9];
        kotlinx.serialization.KSerializer kSerializer9 = kSerializerArr[10];
        kotlinx.serialization.KSerializer kSerializer10 = kSerializerArr[11];
        kotlinx.serialization.KSerializer kSerializer11 = kSerializerArr[12];
        p153r8.p0 p0Var = p153r8.p0.f26988a;
        return new kotlinx.serialization.KSerializer[]{kSerializer, kSerializer2, kSerializer3, kSerializer4, p0Var, p0Var, kSerializer5, kSerializer6, kSerializer7, kSerializer8, kSerializer9, kSerializer10, kSerializer11, p0Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final com.kiptv.core.model.ContentTypeSettings deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.a aVarC = decoder.c(serialDescriptor);
        kotlinx.serialization.KSerializer[] kSerializerArr = com.kiptv.core.model.ContentTypeSettings.f19687o;
        java.util.List list = null;
        java.util.Map map = null;
        java.util.Map map2 = null;
        java.util.List list2 = null;
        java.util.List list3 = null;
        java.util.Map map3 = null;
        java.lang.String strQ = null;
        java.lang.String strQ2 = null;
        java.util.List list4 = null;
        java.util.Map map4 = null;
        java.util.Map map5 = null;
        java.util.Map map6 = null;
        java.util.Map map7 = null;
        java.lang.String strQ3 = null;
        int i3 = 0;
        int i9 = 1;
        boolean z6 = true;
        while (z6) {
            strQ2 = strQ2;
            int iS = aVarC.s(serialDescriptor);
            switch (iS) {
                case -1:
                    z6 = false;
                    i9 = 1;
                    break;
                case 0:
                    list = (java.util.List) aVarC.x(serialDescriptor, 0, kSerializerArr[0], list);
                    i3 |= 1;
                    strQ = strQ;
                    i9 = 1;
                    break;
                case 1:
                    list2 = (java.util.List) aVarC.x(serialDescriptor, i9, kSerializerArr[i9], list2);
                    i3 |= 2;
                    strQ2 = strQ2;
                    strQ = strQ;
                    break;
                case 2:
                    list3 = (java.util.List) aVarC.x(serialDescriptor, 2, kSerializerArr[2], list3);
                    i3 |= 4;
                    strQ2 = strQ2;
                    strQ = strQ;
                    break;
                case 3:
                    map3 = (java.util.Map) aVarC.x(serialDescriptor, 3, kSerializerArr[3], map3);
                    i3 |= 8;
                    strQ2 = strQ2;
                    strQ = strQ;
                    break;
                case 4:
                    strQ = aVarC.q(serialDescriptor, 4);
                    i3 |= 16;
                    strQ2 = strQ2;
                    break;
                case 5:
                    strQ = strQ;
                    strQ2 = aVarC.q(serialDescriptor, 5);
                    i3 |= 32;
                    strQ = strQ;
                    break;
                case 6:
                    list4 = (java.util.List) aVarC.x(serialDescriptor, 6, kSerializerArr[6], list4);
                    i3 |= 64;
                    strQ2 = strQ2;
                    strQ = strQ;
                    break;
                case 7:
                    map4 = (java.util.Map) aVarC.x(serialDescriptor, 7, kSerializerArr[7], map4);
                    i3 |= 128;
                    strQ2 = strQ2;
                    strQ = strQ;
                    break;
                case 8:
                    map5 = (java.util.Map) aVarC.x(serialDescriptor, 8, kSerializerArr[8], map5);
                    i3 |= 256;
                    strQ2 = strQ2;
                    strQ = strQ;
                    break;
                case 9:
                    map6 = (java.util.Map) aVarC.x(serialDescriptor, 9, kSerializerArr[9], map6);
                    i3 |= 512;
                    strQ2 = strQ2;
                    strQ = strQ;
                    break;
                case 10:
                    map7 = (java.util.Map) aVarC.x(serialDescriptor, 10, kSerializerArr[10], map7);
                    i3 |= 1024;
                    strQ2 = strQ2;
                    strQ = strQ;
                    break;
                case 11:
                    map2 = (java.util.Map) aVarC.x(serialDescriptor, 11, kSerializerArr[11], map2);
                    i3 |= 2048;
                    strQ2 = strQ2;
                    strQ = strQ;
                    break;
                case 12:
                    map = (java.util.Map) aVarC.x(serialDescriptor, 12, kSerializerArr[12], map);
                    i3 |= 4096;
                    strQ2 = strQ2;
                    strQ = strQ;
                    break;
                case 13:
                    strQ3 = aVarC.q(serialDescriptor, 13);
                    i3 |= 8192;
                    strQ2 = strQ2;
                    break;
                default:
                    throw new p119n8.m(iS);
            }
        }
        java.lang.String str = strQ;
        java.lang.String str2 = strQ2;
        aVarC.a(serialDescriptor);
        com.kiptv.core.model.ContentTypeSettings contentTypeSettings = new com.kiptv.core.model.ContentTypeSettings();
        int i10 = i3 & 1;
        p078i6.w wVar = p078i6.w.f23205h;
        if (i10 == 0) {
            contentTypeSettings.f19689a = wVar;
        } else {
            contentTypeSettings.f19689a = list;
        }
        if ((i3 & 2) == 0) {
            contentTypeSettings.f19690b = wVar;
        } else {
            contentTypeSettings.f19690b = list2;
        }
        if ((i3 & 4) == 0) {
            contentTypeSettings.f19691c = wVar;
        } else {
            contentTypeSettings.f19691c = list3;
        }
        int i11 = i3 & 8;
        p078i6.x xVar = p078i6.x.f23206h;
        if (i11 == 0) {
            contentTypeSettings.f19692d = xVar;
        } else {
            contentTypeSettings.f19692d = map3;
        }
        if ((i3 & 16) == 0) {
            contentTypeSettings.f19693e = "default";
        } else {
            contentTypeSettings.f19693e = str;
        }
        if ((i3 & 32) == 0) {
            contentTypeSettings.f19694f = "default";
        } else {
            contentTypeSettings.f19694f = str2;
        }
        if ((i3 & 64) == 0) {
            contentTypeSettings.g = wVar;
        } else {
            contentTypeSettings.g = list4;
        }
        if ((i3 & 128) == 0) {
            contentTypeSettings.f19695h = xVar;
        } else {
            contentTypeSettings.f19695h = map4;
        }
        if ((i3 & 256) == 0) {
            contentTypeSettings.f19696i = xVar;
        } else {
            contentTypeSettings.f19696i = map5;
        }
        if ((i3 & 512) == 0) {
            contentTypeSettings.j = xVar;
        } else {
            contentTypeSettings.j = map6;
        }
        if ((i3 & 1024) == 0) {
            contentTypeSettings.f19697k = xVar;
        } else {
            contentTypeSettings.f19697k = map7;
        }
        if ((i3 & 2048) == 0) {
            contentTypeSettings.f19698l = xVar;
        } else {
            contentTypeSettings.f19698l = map2;
        }
        if ((i3 & 4096) == 0) {
            contentTypeSettings.f19699m = xVar;
        } else {
            contentTypeSettings.f19699m = map;
        }
        if ((i3 & 8192) == 0) {
            contentTypeSettings.f19700n = androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO;
            return contentTypeSettings;
        }
        contentTypeSettings.f19700n = strQ3;
        return contentTypeSettings;
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, com.kiptv.core.model.ContentTypeSettings value) {
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor = descriptor;
        p143q8.b bVarC = encoder.c(serialDescriptor);
        com.kiptv.core.model.ContentTypeSettings.Companion companion = com.kiptv.core.model.ContentTypeSettings.INSTANCE;
        boolean zE = bVarC.E(serialDescriptor);
        p078i6.w wVar = p078i6.w.f23205h;
        kotlinx.serialization.KSerializer[] kSerializerArr = com.kiptv.core.model.ContentTypeSettings.f19687o;
        java.util.List list = value.f19689a;
        if (zE || !kotlin.jvm.internal.m.a(list, wVar)) {
            bVarC.h(serialDescriptor, 0, kSerializerArr[0], list);
        }
        boolean zE2 = bVarC.E(serialDescriptor);
        java.util.List list2 = value.f19690b;
        if (zE2 || !kotlin.jvm.internal.m.a(list2, wVar)) {
            bVarC.h(serialDescriptor, 1, kSerializerArr[1], list2);
        }
        boolean zE3 = bVarC.E(serialDescriptor);
        java.util.List list3 = value.f19691c;
        if (zE3 || !kotlin.jvm.internal.m.a(list3, wVar)) {
            bVarC.h(serialDescriptor, 2, kSerializerArr[2], list3);
        }
        boolean zE4 = bVarC.E(serialDescriptor);
        p078i6.x xVar = p078i6.x.f23206h;
        java.util.Map map = value.f19692d;
        if (zE4 || !kotlin.jvm.internal.m.a(map, xVar)) {
            bVarC.h(serialDescriptor, 3, kSerializerArr[3], map);
        }
        boolean zE5 = bVarC.E(serialDescriptor);
        java.lang.String str = value.f19693e;
        if (zE5 || !kotlin.jvm.internal.m.a(str, "default")) {
            bVarC.s(serialDescriptor, 4, str);
        }
        boolean zE6 = bVarC.E(serialDescriptor);
        java.lang.String str2 = value.f19694f;
        if (zE6 || !kotlin.jvm.internal.m.a(str2, "default")) {
            bVarC.s(serialDescriptor, 5, str2);
        }
        boolean zE7 = bVarC.E(serialDescriptor);
        java.util.List list4 = value.g;
        if (zE7 || !kotlin.jvm.internal.m.a(list4, wVar)) {
            bVarC.h(serialDescriptor, 6, kSerializerArr[6], list4);
        }
        boolean zE8 = bVarC.E(serialDescriptor);
        java.util.Map map2 = value.f19695h;
        if (zE8 || !kotlin.jvm.internal.m.a(map2, xVar)) {
            bVarC.h(serialDescriptor, 7, kSerializerArr[7], map2);
        }
        boolean zE9 = bVarC.E(serialDescriptor);
        java.util.Map map3 = value.f19696i;
        if (zE9 || !kotlin.jvm.internal.m.a(map3, xVar)) {
            bVarC.h(serialDescriptor, 8, kSerializerArr[8], map3);
        }
        boolean zE10 = bVarC.E(serialDescriptor);
        java.util.Map map4 = value.j;
        if (zE10 || !kotlin.jvm.internal.m.a(map4, xVar)) {
            bVarC.h(serialDescriptor, 9, kSerializerArr[9], map4);
        }
        boolean zE11 = bVarC.E(serialDescriptor);
        java.util.Map map5 = value.f19697k;
        if (zE11 || !kotlin.jvm.internal.m.a(map5, xVar)) {
            bVarC.h(serialDescriptor, 10, kSerializerArr[10], map5);
        }
        boolean zE12 = bVarC.E(serialDescriptor);
        java.util.Map map6 = value.f19698l;
        if (zE12 || !kotlin.jvm.internal.m.a(map6, xVar)) {
            bVarC.h(serialDescriptor, 11, kSerializerArr[11], map6);
        }
        boolean zE13 = bVarC.E(serialDescriptor);
        java.util.Map map7 = value.f19699m;
        if (zE13 || !kotlin.jvm.internal.m.a(map7, xVar)) {
            bVarC.h(serialDescriptor, 12, kSerializerArr[12], map7);
        }
        boolean zE14 = bVarC.E(serialDescriptor);
        java.lang.String str3 = value.f19700n;
        if (zE14 || !kotlin.jvm.internal.m.a(str3, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO)) {
            bVarC.s(serialDescriptor, 13, str3);
        }
        bVarC.a(serialDescriptor);
    }

    @Override // p153r8.D
    public /* bridge */ /* synthetic */ kotlinx.serialization.KSerializer[] typeParametersSerializers() {
        return p153r8.AbstractC2686a0.f26940b;
    }
}
