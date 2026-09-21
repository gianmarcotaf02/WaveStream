package com.kiptv.core.model;

import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.http.LinkHeader;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class C0 implements KSerializer {

    public static final C0 f19679a = new C0();

    public static final p135p8.g f19680b = com.google.crypto.tink.shaded.protobuf.q0.j("XtreamEPGProgram", new SerialDescriptor[0], new p108m5.c(22));

    public static String a(String str) {
        String string;
        String str2 = null;
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
                    String strV0 = O7.x.v0(O7.x.v0(string, '-', '+'), '_', '/');
                    int length = strV0.length() % 4;
                    if (length != 0) {
                        strV0 = p121o0.p.o(strV0, O7.x.u0(4 - length, "="));
                    }
                    try {
                        byte[] bArrA = p168t6.c.a(p168t6.c.f28521c, strV0, 0, 6);
                        if (bArrA.length != 0) {
                            String string2 = O7.q.r1(new String(bArrA, O7.a.f8024b)).toString();
                            if (string2.length() != 0) {
                                for (int i10 = 0; i10 < string2.length(); i10++) {
                                    if (Character.isLetterOrDigit(string2.charAt(i10))) {
                                        for (int i11 = 0; i11 < string2.length(); i11++) {
                                            char cCharAt2 = string2.charAt(i11);
                                            if (Character.isISOControl(cCharAt2) && cCharAt2 != '\n' && cCharAt2 != '\t') {
                                                break;
                                            }
                                        }
                                        str2 = string2;
                                        break;
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                return str2 != null ? str2 : string;
            }
        }
        return null;
    }

    @Override
    public final Object deserialize(Decoder decoder) {
        String strD;
        kotlin.jvm.internal.m.e(decoder, "decoder");
        kotlinx.serialization.json.c cVarI = p162s8.l.i(((p162s8.k) decoder).i());
        Object obj = cVarI.get("id");
        kotlinx.serialization.json.d dVar = obj instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj : null;
        String strD2 = dVar != null ? dVar.d() : null;
        Object obj2 = cVarI.get(LinkHeader.Parameters.Title);
        kotlinx.serialization.json.d dVar2 = obj2 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj2 : null;
        String strA = a(dVar2 != null ? dVar2.d() : null);
        if (strA == null) {
            strA = "—";
        }
        String str = strA;
        Object obj3 = cVarI.get("desc");
        kotlinx.serialization.json.d dVar3 = obj3 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj3 : null;
        if (dVar3 == null || (strD = dVar3.d()) == null) {
            Object obj4 = cVarI.get("description");
            kotlinx.serialization.json.d dVar4 = obj4 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj4 : null;
            if (dVar4 != null) {
                strD = dVar4.d();
            } else {
                Object obj5 = cVarI.get("program_description");
                kotlinx.serialization.json.d dVar5 = obj5 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj5 : null;
                strD = dVar5 != null ? dVar5.d() : null;
                if (strD == null) {
                    Object obj6 = cVarI.get("programme_description");
                    kotlinx.serialization.json.d dVar6 = obj6 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj6 : null;
                    strD = dVar6 != null ? dVar6.d() : null;
                    if (strD == null) {
                        Object obj7 = cVarI.get("epg_description");
                        kotlinx.serialization.json.d dVar7 = obj7 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj7 : null;
                        strD = dVar7 != null ? dVar7.d() : null;
                        if (strD == null) {
                            Object obj8 = cVarI.get("plot");
                            kotlinx.serialization.json.d dVar8 = obj8 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj8 : null;
                            strD = dVar8 != null ? dVar8.d() : null;
                        }
                    }
                }
            }
        }
        String strA2 = a(strD);
        Object obj9 = cVarI.get(TtmlNode.START);
        kotlinx.serialization.json.d dVar9 = obj9 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj9 : null;
        String strD3 = dVar9 != null ? dVar9.d() : null;
        Object obj10 = cVarI.get("stop");
        kotlinx.serialization.json.d dVar10 = obj10 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj10 : null;
        String strD4 = dVar10 != null ? dVar10.d() : null;
        Object obj11 = cVarI.get("start_timestamp");
        kotlinx.serialization.json.d dVar11 = obj11 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj11 : null;
        String strD5 = dVar11 != null ? dVar11.d() : null;
        Object obj12 = cVarI.get("stop_timestamp");
        kotlinx.serialization.json.d dVar12 = obj12 instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) obj12 : null;
        return new B0(strD2, str, strA2, strD3, strD4, strD5, dVar12 != null ? dVar12.d() : null);
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        return f19680b;
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        B0 value = (B0) obj;
        kotlin.jvm.internal.m.e(encoder, "encoder");
        kotlin.jvm.internal.m.e(value, "value");
        throw new UnsupportedOperationException("Serialization not supported");
    }
}
