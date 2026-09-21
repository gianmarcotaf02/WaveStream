package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public final class C0 implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.kiptv.core.model.C0 f19679a = new com.kiptv.core.model.C0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p135p8.g f19680b = com.google.crypto.tink.shaded.protobuf.q0.j("XtreamEPGProgram", new kotlinx.serialization.descriptors.SerialDescriptor[0], new p108m5.c(22));

    public static java.lang.String a(java.lang.String str) {
        java.lang.String string;
        java.lang.String str2 = null;
        if (str != null && (string = O7.q.r1(str).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                if (string.length() >= 4) {
                    for (int i3 = 0; i3 < string.length(); i3++) {
                        char cCharAt = string.charAt(i3);
                        if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\t') {
                        }
                    }
                    for (int i9 = 0; i9 < string.length(); i9++) {
                        if (O7.q.C0("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=_-", string.charAt(i9))) {
                        }
                    }
                    java.lang.String strV0 = O7.x.v0(O7.x.v0(string, '-', '+'), '_', '/');
                    int length = strV0.length() % 4;
                    if (length != 0) {
                        strV0 = p121o0.p.o(strV0, O7.x.u0(4 - length, "="));
                    }
                    try {
                        byte[] bArrA = p168t6.c.a(p168t6.c.f28521c, strV0, 0, 6);
                        if (bArrA.length != 0) {
                            java.lang.String string2 = O7.q.r1(new java.lang.String(bArrA, O7.a.f8024b)).toString();
                            if (string2.length() != 0) {
                                for (int i10 = 0; i10 < string2.length(); i10++) {
                                    if (java.lang.Character.isLetterOrDigit(string2.charAt(i10))) {
                                        for (int i11 = 0; i11 < string2.length(); i11++) {
                                            char cCharAt2 = string2.charAt(i11);
                                            if (java.lang.Character.isISOControl(cCharAt2) && cCharAt2 != '\n' && cCharAt2 != '\t') {
                                                break;
                                            }
                                        }
                                        str2 = string2;
                                        break;
                                    }
                                }
                            }
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
                return str2 != null ? str2 : string;
            }
        }
        return null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        java.lang.String strD;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.json.c cVarI = p162s8.l.i(((p162s8.k) decoder).i());
        java.lang.Object obj = cVarI.get("id");
        kotlinx.serialization.json.d dVar = obj instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj : null;
        java.lang.String strD2 = dVar != null ? dVar.d() : null;
        java.lang.Object obj2 = cVarI.get(io.ktor.http.LinkHeader.Parameters.Title);
        kotlinx.serialization.json.d dVar2 = obj2 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj2 : null;
        java.lang.String strA = a(dVar2 != null ? dVar2.d() : null);
        if (strA == null) {
            strA = "—";
        }
        java.lang.String str = strA;
        java.lang.Object obj3 = cVarI.get("desc");
        kotlinx.serialization.json.d dVar3 = obj3 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj3 : null;
        if (dVar3 == null || (strD = dVar3.d()) == null) {
            java.lang.Object obj4 = cVarI.get("description");
            kotlinx.serialization.json.d dVar4 = obj4 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj4 : null;
            if (dVar4 != null) {
                strD = dVar4.d();
            } else {
                java.lang.Object obj5 = cVarI.get("program_description");
                kotlinx.serialization.json.d dVar5 = obj5 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj5 : null;
                strD = dVar5 != null ? dVar5.d() : null;
                if (strD == null) {
                    java.lang.Object obj6 = cVarI.get("programme_description");
                    kotlinx.serialization.json.d dVar6 = obj6 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj6 : null;
                    strD = dVar6 != null ? dVar6.d() : null;
                    if (strD == null) {
                        java.lang.Object obj7 = cVarI.get("epg_description");
                        kotlinx.serialization.json.d dVar7 = obj7 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj7 : null;
                        strD = dVar7 != null ? dVar7.d() : null;
                        if (strD == null) {
                            java.lang.Object obj8 = cVarI.get("plot");
                            kotlinx.serialization.json.d dVar8 = obj8 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj8 : null;
                            strD = dVar8 != null ? dVar8.d() : null;
                        }
                    }
                }
            }
        }
        java.lang.String strA2 = a(strD);
        java.lang.Object obj9 = cVarI.get(androidx.media3.extractor.text.ttml.TtmlNode.START);
        kotlinx.serialization.json.d dVar9 = obj9 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj9 : null;
        java.lang.String strD3 = dVar9 != null ? dVar9.d() : null;
        java.lang.Object obj10 = cVarI.get("stop");
        kotlinx.serialization.json.d dVar10 = obj10 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj10 : null;
        java.lang.String strD4 = dVar10 != null ? dVar10.d() : null;
        java.lang.Object obj11 = cVarI.get("start_timestamp");
        kotlinx.serialization.json.d dVar11 = obj11 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj11 : null;
        java.lang.String strD5 = dVar11 != null ? dVar11.d() : null;
        java.lang.Object obj12 = cVarI.get("stop_timestamp");
        kotlinx.serialization.json.d dVar12 = obj12 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj12 : null;
        return new com.kiptv.core.model.B0(strD2, str, strA2, strD3, strD4, strD5, dVar12 != null ? dVar12.d() : null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return f19680b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
        com.kiptv.core.model.B0 value = (com.kiptv.core.model.B0) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        throw new java.lang.UnsupportedOperationException("Serialization not supported");
    }
}
