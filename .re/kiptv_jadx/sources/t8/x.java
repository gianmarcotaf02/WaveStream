package t8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t8.y f28645a = new t8.y();

    public static final t8.u a(java.lang.Number number, java.lang.String output) {
        kotlin.jvm.internal.m.e(output, "output");
        return new t8.u("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((java.lang.Object) q(output, -1)));
    }

    public static final t8.u b(kotlinx.serialization.descriptors.SerialDescriptor keyDescriptor) {
        kotlin.jvm.internal.m.e(keyDescriptor, "keyDescriptor");
        return new t8.u("Value of type '" + keyDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final t8.s c(int i3, java.lang.String message) {
        kotlin.jvm.internal.m.e(message, "message");
        if (i3 >= 0) {
            message = "Unexpected JSON token at offset " + i3 + ": " + message;
        }
        return new t8.s(message);
    }

    public static final t8.s d(java.lang.String message, java.lang.CharSequence input, int i3) {
        kotlin.jvm.internal.m.e(message, "message");
        kotlin.jvm.internal.m.e(input, "input");
        return c(i3, message + "\nJSON input: " + ((java.lang.Object) q(input, i3)));
    }

    public static final t8.H e(p162s8.d json, t8.o oVar, char[] cArr) {
        kotlin.jvm.internal.m.e(json, "json");
        return new t8.H(oVar, cArr);
    }

    public static final void f(kotlinx.serialization.KSerializer kSerializer, kotlinx.serialization.KSerializer kSerializer2, java.lang.String str) {
        if (kSerializer instanceof p119n8.f) {
            kotlinx.serialization.descriptors.SerialDescriptor descriptor = kSerializer2.getDescriptor();
            kotlin.jvm.internal.m.e(descriptor, "<this>");
            if (p153r8.AbstractC2686a0.b(descriptor).contains(str)) {
                java.lang.StringBuilder sbO = Y6.f.o("Sealed class '", kSerializer2.getDescriptor().a(), "' cannot be serialized as base class '", ((p119n8.f) kSerializer).getDescriptor().a(), "' because it has property name that conflicts with JSON class discriminator '");
                sbO.append(str);
                sbO.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                throw new java.lang.IllegalStateException(sbO.toString().toString());
            }
        }
    }

    public static final kotlinx.serialization.descriptors.SerialDescriptor g(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, v8.d module) {
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptorG;
        kotlinx.serialization.KSerializer kSerializerA;
        kotlin.jvm.internal.m.e(serialDescriptor, "<this>");
        kotlin.jvm.internal.m.e(module, "module");
        if (!kotlin.jvm.internal.m.a(serialDescriptor.c(), p135p8.h.f26281f)) {
            return serialDescriptor.isInline() ? g(serialDescriptor.i(0), module) : serialDescriptor;
        }
        E6.InterfaceC0331d interfaceC0331dF0 = com.google.android.gms.internal.play_billing.AbstractC1864o0.f0(serialDescriptor);
        kotlinx.serialization.descriptors.SerialDescriptor descriptor = null;
        if (interfaceC0331dF0 != null && (kSerializerA = v8.e.a(module, interfaceC0331dF0)) != null) {
            descriptor = kSerializerA.getDescriptor();
        }
        return (descriptor == null || (serialDescriptorG = g(descriptor, module)) == null) ? serialDescriptor : serialDescriptorG;
    }

    public static final byte h(char c9) {
        if (c9 < '~') {
            return t8.C2861k.f28626b[c9];
        }
        return (byte) 0;
    }

    public static final void i(com.google.android.gms.internal.play_billing.V0 kind) {
        kotlin.jvm.internal.m.e(kind, "kind");
        if (kind instanceof p135p8.i) {
            throw new java.lang.IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof p135p8.f) {
            throw new java.lang.IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof p135p8.d) {
            throw new java.lang.IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final java.lang.String j(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, p162s8.d json) {
        kotlin.jvm.internal.m.e(serialDescriptor, "<this>");
        kotlin.jvm.internal.m.e(json, "json");
        for (java.lang.annotation.Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof p162s8.i) {
                return ((p162s8.i) annotation).discriminator();
            }
        }
        return json.f27388a.f27413h;
    }

    public static final java.lang.Object k(p162s8.d json, kotlinx.serialization.KSerializer deserializer, t8.o oVar) {
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        t8.H hE = e(json, oVar, t8.C2860j.f28624c.d(16384));
        try {
            java.lang.Object objP = new t8.I(json, t8.N.OBJ, hE, deserializer.getDescriptor(), null).p(deserializer);
            hE.p();
            return objP;
        } finally {
            hE.F();
        }
    }

    public static final void l(p162s8.d json, t8.q qVar, kotlinx.serialization.KSerializer serializer, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.e(serializer, "serializer");
        new t8.J(new B7.l(qVar), json, t8.N.OBJ, new p162s8.o[t8.N.f28600o.d()]).z(serializer, obj);
    }

    public static final int m(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, p162s8.d json, java.lang.String name) {
        kotlin.jvm.internal.m.e(serialDescriptor, "<this>");
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.e(name, "name");
        r(serialDescriptor, json);
        int iE = serialDescriptor.e(name);
        if (iE != -3 || !json.f27388a.j) {
            return iE;
        }
        t8.y yVar = f28645a;
        io.ktor.http.d dVar = new io.ktor.http.d(serialDescriptor, json, 13);
        p008a8.c cVar = json.f27390c;
        cVar.getClass();
        java.lang.Object objQ = cVar.Q(serialDescriptor, yVar);
        if (objQ == null) {
            objQ = dVar.invoke();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) cVar.f15522i;
            java.lang.Object concurrentHashMap2 = concurrentHashMap.get(serialDescriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new java.util.concurrent.ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, concurrentHashMap2);
            }
            ((java.util.Map) concurrentHashMap2).put(yVar, objQ);
        }
        java.lang.Integer num = (java.lang.Integer) ((java.util.Map) objQ).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int n(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, p162s8.d json, java.lang.String name, java.lang.String suffix) {
        kotlin.jvm.internal.m.e(serialDescriptor, "<this>");
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(suffix, "suffix");
        int iM = m(serialDescriptor, json, name);
        if (iM != -3) {
            return iM;
        }
        throw new p119n8.j(serialDescriptor.a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final boolean o(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, p162s8.d json) {
        kotlin.jvm.internal.m.e(serialDescriptor, "<this>");
        kotlin.jvm.internal.m.e(json, "json");
        if (json.f27388a.f27408b) {
            return true;
        }
        java.util.List annotations = serialDescriptor.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        java.util.Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((java.lang.annotation.Annotation) it.next()) instanceof p162s8.p) {
                return true;
            }
        }
        return false;
    }

    public static final void p(t8.AbstractC2851a abstractC2851a, java.lang.String str) {
        abstractC2851a.q(abstractC2851a.f28603a - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final java.lang.CharSequence q(java.lang.CharSequence charSequence, int i3) {
        kotlin.jvm.internal.m.e(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i3 != -1) {
                int i9 = i3 - 30;
                int i10 = i3 + 30;
                java.lang.String str = i9 <= 0 ? "" : ".....";
                java.lang.String str2 = i10 >= charSequence.length() ? "" : ".....";
                java.lang.StringBuilder sbV = p121o0.p.v(str);
                if (i9 < 0) {
                    i9 = 0;
                }
                int length = charSequence.length();
                if (i10 > length) {
                    i10 = length;
                }
                sbV.append(charSequence.subSequence(i9, i10).toString());
                sbV.append(str2);
                return sbV.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void r(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, p162s8.d json) {
        kotlin.jvm.internal.m.e(serialDescriptor, "<this>");
        kotlin.jvm.internal.m.e(json, "json");
        kotlin.jvm.internal.m.a(serialDescriptor.c(), p135p8.j.f26283f);
    }

    public static final java.lang.Object s(p162s8.d dVar, java.lang.String discriminator, kotlinx.serialization.json.c cVar, kotlinx.serialization.KSerializer kSerializer) {
        kotlin.jvm.internal.m.e(dVar, "<this>");
        kotlin.jvm.internal.m.e(discriminator, "discriminator");
        return new t8.B(dVar, cVar, discriminator, kSerializer.getDescriptor()).p(kSerializer);
    }

    public static final t8.N t(kotlinx.serialization.descriptors.SerialDescriptor desc, p162s8.d dVar) {
        kotlin.jvm.internal.m.e(dVar, "<this>");
        kotlin.jvm.internal.m.e(desc, "desc");
        com.google.android.gms.internal.play_billing.V0 v0C = desc.c();
        if (v0C instanceof p135p8.d) {
            return t8.N.POLY_OBJ;
        }
        if (kotlin.jvm.internal.m.a(v0C, p135p8.j.g)) {
            return t8.N.LIST;
        }
        if (!kotlin.jvm.internal.m.a(v0C, p135p8.j.f26284h)) {
            return t8.N.OBJ;
        }
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptorG = g(desc.i(0), dVar.f27389b);
        com.google.android.gms.internal.play_billing.V0 v0C2 = serialDescriptorG.c();
        if ((v0C2 instanceof p135p8.f) || kotlin.jvm.internal.m.a(v0C2, p135p8.i.f26282f)) {
            return t8.N.MAP;
        }
        if (dVar.f27388a.f27410d) {
            return t8.N.LIST;
        }
        throw b(serialDescriptorG);
    }

    public static final void u(t8.AbstractC2851a abstractC2851a, java.lang.Number number) {
        t8.AbstractC2851a.r(abstractC2851a, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final void v(java.lang.String str, kotlinx.serialization.json.b bVar) {
        java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Class with serial name ", str, " cannot be serialized polymorphically because it is represented as ");
        sbQ.append(kotlin.jvm.internal.B.f24540a.b(bVar.getClass()).h());
        sbQ.append(". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
        throw new t8.u(sbQ.toString());
    }

    public static final java.lang.String w(byte b9) {
        if (b9 == 1) {
            return "quotation mark '\"'";
        }
        if (b9 == 2) {
            return "string escape sequence '\\'";
        }
        if (b9 == 4) {
            return "comma ','";
        }
        if (b9 == 5) {
            return "colon ':'";
        }
        if (b9 == 6) {
            return "start of the object '{'";
        }
        if (b9 == 7) {
            return "end of the object '}'";
        }
        if (b9 == 8) {
            return "start of the array '['";
        }
        if (b9 == 9) {
            return "end of the array ']'";
        }
        if (b9 == 10) {
            return "end of the input";
        }
        return b9 == 127 ? "invalid token" : "valid token";
    }

    public static final java.lang.String x(java.lang.Number number, java.lang.String str, java.lang.String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((java.lang.Object) q(str2, -1));
    }
}
