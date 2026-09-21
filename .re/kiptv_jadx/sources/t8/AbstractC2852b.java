package t8;

/* JADX INFO: renamed from: t8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2852b implements p162s8.k, kotlinx.serialization.encoding.Decoder, p143q8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f28607a = new java.util.ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p162s8.d f28609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f28610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p162s8.j f28611e;

    public AbstractC2852b(p162s8.d dVar, java.lang.String str) {
        this.f28609c = dVar;
        this.f28610d = str;
        this.f28611e = dVar.f27388a;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short A() {
        return Q(V());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float B() {
        return M(V());
    }

    @Override // p143q8.a
    public final char C(p153r8.C2694e0 descriptor, int i3) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return K(T(descriptor, i3));
    }

    @Override // p143q8.a
    public final float D(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i3) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return M(T(descriptor, i3));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double E() {
        return L(V());
    }

    public abstract kotlinx.serialization.json.b F(java.lang.String str);

    public final kotlinx.serialization.json.b G() {
        kotlinx.serialization.json.b bVarF;
        java.lang.String str = (java.lang.String) p078i6.o.s1(this.f28607a);
        return (str == null || (bVarF = F(str)) == null) ? U() : bVarF;
    }

    public final java.lang.Object H(kotlinx.serialization.KSerializer deserializer) {
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        return p(deserializer);
    }

    public final boolean I(java.lang.Object obj) {
        java.lang.String tag = (java.lang.String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (bVarF instanceof kotlinx.serialization.json.d) {
            kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
            try {
                java.lang.Boolean boolE = p162s8.l.e(dVar);
                if (boolE != null) {
                    return boolE.booleanValue();
                }
                Y(dVar, "boolean", tag);
                throw null;
            } catch (java.lang.IllegalArgumentException unused) {
                Y(dVar, "boolean", tag);
                throw null;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        sb.append(c9.b(kotlinx.serialization.json.d.class).h());
        sb.append(", but had ");
        sb.append(c9.b(bVarF.getClass()).h());
        sb.append(" as the serialized body of boolean at element: ");
        sb.append(X(tag));
        throw t8.x.d(sb.toString(), bVarF.toString(), -1);
    }

    public final byte J(java.lang.Object obj) {
        java.lang.String tag = (java.lang.String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (!(bVarF instanceof kotlinx.serialization.json.d)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
            sb.append(c9.b(kotlinx.serialization.json.d.class).h());
            sb.append(", but had ");
            sb.append(c9.b(bVarF.getClass()).h());
            sb.append(" as the serialized body of byte at element: ");
            sb.append(X(tag));
            throw t8.x.d(sb.toString(), bVarF.toString(), -1);
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
        try {
            long jL = p162s8.l.l(dVar);
            java.lang.Byte bValueOf = (-128 > jL || jL > 127) ? null : java.lang.Byte.valueOf((byte) jL);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            Y(dVar, io.sentry.profilemeasurements.ProfileMeasurement.UNIT_BYTES, tag);
            throw null;
        } catch (java.lang.IllegalArgumentException unused) {
            Y(dVar, io.sentry.profilemeasurements.ProfileMeasurement.UNIT_BYTES, tag);
            throw null;
        }
    }

    public final char K(java.lang.Object obj) {
        java.lang.String tag = (java.lang.String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (bVarF instanceof kotlinx.serialization.json.d) {
            kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
            try {
                return O7.q.Z0(dVar.d());
            } catch (java.lang.IllegalArgumentException unused) {
                Y(dVar, "char", tag);
                throw null;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        sb.append(c9.b(kotlinx.serialization.json.d.class).h());
        sb.append(", but had ");
        sb.append(c9.b(bVarF.getClass()).h());
        sb.append(" as the serialized body of char at element: ");
        sb.append(X(tag));
        throw t8.x.d(sb.toString(), bVarF.toString(), -1);
    }

    public final double L(java.lang.Object obj) {
        java.lang.String tag = (java.lang.String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (!(bVarF instanceof kotlinx.serialization.json.d)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
            sb.append(c9.b(kotlinx.serialization.json.d.class).h());
            sb.append(", but had ");
            sb.append(c9.b(bVarF.getClass()).h());
            sb.append(" as the serialized body of double at element: ");
            sb.append(X(tag));
            throw t8.x.d(sb.toString(), bVarF.toString(), -1);
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
        try {
            p153r8.G g = p162s8.l.f27416a;
            kotlin.jvm.internal.m.e(dVar, "<this>");
            double d4 = java.lang.Double.parseDouble(dVar.d());
            if (this.f28609c.f27388a.f27414i || !(java.lang.Double.isInfinite(d4) || java.lang.Double.isNaN(d4))) {
                return d4;
            }
            java.lang.Double dValueOf = java.lang.Double.valueOf(d4);
            java.lang.String output = G().toString();
            kotlin.jvm.internal.m.e(output, "output");
            throw t8.x.c(-1, t8.x.x(dValueOf, tag, output));
        } catch (java.lang.IllegalArgumentException unused) {
            Y(dVar, "double", tag);
            throw null;
        }
    }

    public final float M(java.lang.Object obj) {
        java.lang.String tag = (java.lang.String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (!(bVarF instanceof kotlinx.serialization.json.d)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
            sb.append(c9.b(kotlinx.serialization.json.d.class).h());
            sb.append(", but had ");
            sb.append(c9.b(bVarF.getClass()).h());
            sb.append(" as the serialized body of float at element: ");
            sb.append(X(tag));
            throw t8.x.d(sb.toString(), bVarF.toString(), -1);
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
        try {
            p153r8.G g = p162s8.l.f27416a;
            kotlin.jvm.internal.m.e(dVar, "<this>");
            float f9 = java.lang.Float.parseFloat(dVar.d());
            if (this.f28609c.f27388a.f27414i || !(java.lang.Float.isInfinite(f9) || java.lang.Float.isNaN(f9))) {
                return f9;
            }
            java.lang.Float fValueOf = java.lang.Float.valueOf(f9);
            java.lang.String output = G().toString();
            kotlin.jvm.internal.m.e(output, "output");
            throw t8.x.c(-1, t8.x.x(fValueOf, tag, output));
        } catch (java.lang.IllegalArgumentException unused) {
            Y(dVar, "float", tag);
            throw null;
        }
    }

    public final kotlinx.serialization.encoding.Decoder N(java.lang.Object obj, kotlinx.serialization.descriptors.SerialDescriptor inlineDescriptor) {
        java.lang.String tag = (java.lang.String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlin.jvm.internal.m.e(inlineDescriptor, "inlineDescriptor");
        if (!t8.K.a(inlineDescriptor)) {
            this.f28607a.add(tag);
            return this;
        }
        kotlinx.serialization.json.b bVarF = F(tag);
        java.lang.String strA = inlineDescriptor.a();
        if (bVarF instanceof kotlinx.serialization.json.d) {
            java.lang.String source = ((kotlinx.serialization.json.d) bVarF).d();
            p162s8.d json = this.f28609c;
            kotlin.jvm.internal.m.e(json, "json");
            kotlin.jvm.internal.m.e(source, "source");
            return new t8.r(new t8.L(source), json);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        sb.append(c9.b(kotlinx.serialization.json.d.class).h());
        sb.append(", but had ");
        sb.append(c9.b(bVarF.getClass()).h());
        sb.append(" as the serialized body of ");
        sb.append(strA);
        sb.append(" at element: ");
        sb.append(X(tag));
        throw t8.x.d(sb.toString(), bVarF.toString(), -1);
    }

    public final int O(java.lang.Object obj) {
        java.lang.String tag = (java.lang.String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (!(bVarF instanceof kotlinx.serialization.json.d)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
            sb.append(c9.b(kotlinx.serialization.json.d.class).h());
            sb.append(", but had ");
            sb.append(c9.b(bVarF.getClass()).h());
            sb.append(" as the serialized body of int at element: ");
            sb.append(X(tag));
            throw t8.x.d(sb.toString(), bVarF.toString(), -1);
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
        try {
            long jL = p162s8.l.l(dVar);
            java.lang.Integer numValueOf = (-2147483648L > jL || jL > 2147483647L) ? null : java.lang.Integer.valueOf((int) jL);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            Y(dVar, "int", tag);
            throw null;
        } catch (java.lang.IllegalArgumentException unused) {
            Y(dVar, "int", tag);
            throw null;
        }
    }

    public final long P(java.lang.Object obj) {
        java.lang.String tag = (java.lang.String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (bVarF instanceof kotlinx.serialization.json.d) {
            kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
            try {
                return p162s8.l.l(dVar);
            } catch (java.lang.IllegalArgumentException unused) {
                Y(dVar, "long", tag);
                throw null;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        sb.append(c9.b(kotlinx.serialization.json.d.class).h());
        sb.append(", but had ");
        sb.append(c9.b(bVarF.getClass()).h());
        sb.append(" as the serialized body of long at element: ");
        sb.append(X(tag));
        throw t8.x.d(sb.toString(), bVarF.toString(), -1);
    }

    public final short Q(java.lang.Object obj) {
        java.lang.String tag = (java.lang.String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (!(bVarF instanceof kotlinx.serialization.json.d)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
            sb.append(c9.b(kotlinx.serialization.json.d.class).h());
            sb.append(", but had ");
            sb.append(c9.b(bVarF.getClass()).h());
            sb.append(" as the serialized body of short at element: ");
            sb.append(X(tag));
            throw t8.x.d(sb.toString(), bVarF.toString(), -1);
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
        try {
            long jL = p162s8.l.l(dVar);
            java.lang.Short shValueOf = (-32768 > jL || jL > 32767) ? null : java.lang.Short.valueOf((short) jL);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            Y(dVar, "short", tag);
            throw null;
        } catch (java.lang.IllegalArgumentException unused) {
            Y(dVar, "short", tag);
            throw null;
        }
    }

    public final java.lang.String R(java.lang.Object obj) {
        java.lang.String tag = (java.lang.String) obj;
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        if (!(bVarF instanceof kotlinx.serialization.json.d)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
            sb.append(c9.b(kotlinx.serialization.json.d.class).h());
            sb.append(", but had ");
            sb.append(c9.b(bVarF.getClass()).h());
            sb.append(" as the serialized body of string at element: ");
            sb.append(X(tag));
            throw t8.x.d(sb.toString(), bVarF.toString(), -1);
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) bVarF;
        if (!(dVar instanceof p162s8.r)) {
            java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("Expected string value for a non-null key '", tag, "', got null literal instead at element: ");
            sbQ.append(X(tag));
            throw t8.x.d(sbQ.toString(), G().toString(), -1);
        }
        p162s8.r rVar = (p162s8.r) dVar;
        if (rVar.f27420h || this.f28609c.f27388a.f27409c) {
            return rVar.j;
        }
        java.lang.StringBuilder sbQ2 = com.google.android.gms.internal.play_billing.M0.q("String literal for key '", tag, "' should be quoted at element: ");
        sbQ2.append(X(tag));
        sbQ2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw t8.x.d(sbQ2.toString(), G().toString(), -1);
    }

    public java.lang.String S(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i3) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return descriptor.g(i3);
    }

    public final java.lang.String T(kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor, int i3) {
        kotlin.jvm.internal.m.e(serialDescriptor, "<this>");
        java.lang.String nestedName = S(serialDescriptor, i3);
        kotlin.jvm.internal.m.e(nestedName, "nestedName");
        return nestedName;
    }

    public abstract kotlinx.serialization.json.b U();

    public final java.lang.Object V() {
        java.util.ArrayList arrayList = this.f28607a;
        java.lang.Object objRemove = arrayList.remove(p078i6.p.A0(arrayList));
        this.f28608b = true;
        return objRemove;
    }

    public final java.lang.String W() {
        java.util.ArrayList arrayList = this.f28607a;
        return arrayList.isEmpty() ? "$" : p078i6.o.o1(arrayList, ".", "$.", null, null, 60);
    }

    public final java.lang.String X(java.lang.String currentTag) {
        kotlin.jvm.internal.m.e(currentTag, "currentTag");
        return W() + '.' + currentTag;
    }

    public final void Y(kotlinx.serialization.json.d dVar, java.lang.String str, java.lang.String str2) {
        throw t8.x.d("Failed to parse literal '" + dVar + "' as " + (O7.x.x0(str, androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_INIT_SEGMENT, false) ? "an " : "a ").concat(str) + " value at element: " + X(str2), G().toString(), -1);
    }

    public void a(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
    }

    @Override // p143q8.a
    public final v8.e b() {
        return this.f28609c.f27389b;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public p143q8.a c(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlinx.serialization.json.b bVarG = G();
        com.google.android.gms.internal.play_billing.V0 v0C = descriptor.c();
        boolean zA = kotlin.jvm.internal.m.a(v0C, p135p8.j.g);
        p162s8.d dVar = this.f28609c;
        if (zA || (v0C instanceof p135p8.d)) {
            java.lang.String strA = descriptor.a();
            if (bVarG instanceof kotlinx.serialization.json.a) {
                return new t8.C(dVar, (kotlinx.serialization.json.a) bVarG);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
            sb.append(c9.b(kotlinx.serialization.json.a.class).h());
            sb.append(", but had ");
            sb.append(c9.b(bVarG.getClass()).h());
            sb.append(" as the serialized body of ");
            sb.append(strA);
            sb.append(" at element: ");
            sb.append(W());
            throw t8.x.d(sb.toString(), bVarG.toString(), -1);
        }
        if (!kotlin.jvm.internal.m.a(v0C, p135p8.j.f26284h)) {
            java.lang.String strA2 = descriptor.a();
            if (bVarG instanceof kotlinx.serialization.json.c) {
                return new t8.B(dVar, (kotlinx.serialization.json.c) bVarG, this.f28610d, 8);
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected ");
            kotlin.jvm.internal.C c10 = kotlin.jvm.internal.B.f24540a;
            sb2.append(c10.b(kotlinx.serialization.json.c.class).h());
            sb2.append(", but had ");
            sb2.append(c10.b(bVarG.getClass()).h());
            sb2.append(" as the serialized body of ");
            sb2.append(strA2);
            sb2.append(" at element: ");
            sb2.append(W());
            throw t8.x.d(sb2.toString(), bVarG.toString(), -1);
        }
        kotlinx.serialization.descriptors.SerialDescriptor serialDescriptorG = t8.x.g(descriptor.i(0), dVar.f27389b);
        com.google.android.gms.internal.play_billing.V0 v0C2 = serialDescriptorG.c();
        if ((v0C2 instanceof p135p8.f) || kotlin.jvm.internal.m.a(v0C2, p135p8.i.f26282f)) {
            java.lang.String strA3 = descriptor.a();
            if (bVarG instanceof kotlinx.serialization.json.c) {
                return new t8.D(dVar, (kotlinx.serialization.json.c) bVarG);
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Expected ");
            kotlin.jvm.internal.C c11 = kotlin.jvm.internal.B.f24540a;
            sb3.append(c11.b(kotlinx.serialization.json.c.class).h());
            sb3.append(", but had ");
            sb3.append(c11.b(bVarG.getClass()).h());
            sb3.append(" as the serialized body of ");
            sb3.append(strA3);
            sb3.append(" at element: ");
            sb3.append(W());
            throw t8.x.d(sb3.toString(), bVarG.toString(), -1);
        }
        if (!dVar.f27388a.f27410d) {
            throw t8.x.b(serialDescriptorG);
        }
        java.lang.String strA4 = descriptor.a();
        if (bVarG instanceof kotlinx.serialization.json.a) {
            return new t8.C(dVar, (kotlinx.serialization.json.a) bVarG);
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Expected ");
        kotlin.jvm.internal.C c12 = kotlin.jvm.internal.B.f24540a;
        sb4.append(c12.b(kotlinx.serialization.json.a.class).h());
        sb4.append(", but had ");
        sb4.append(c12.b(bVarG.getClass()).h());
        sb4.append(" as the serialized body of ");
        sb4.append(strA4);
        sb4.append(" at element: ");
        sb4.append(W());
        throw t8.x.d(sb4.toString(), bVarG.toString(), -1);
    }

    @Override // p143q8.a
    public final kotlinx.serialization.encoding.Decoder d(p153r8.C2694e0 descriptor, int i3) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return N(T(descriptor, i3), descriptor.i(i3));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean e() {
        return I(V());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char f() {
        return K(V());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int g(kotlinx.serialization.descriptors.SerialDescriptor enumDescriptor) {
        kotlin.jvm.internal.m.e(enumDescriptor, "enumDescriptor");
        java.lang.String tag = (java.lang.String) V();
        kotlin.jvm.internal.m.e(tag, "tag");
        kotlinx.serialization.json.b bVarF = F(tag);
        java.lang.String strA = enumDescriptor.a();
        if (bVarF instanceof kotlinx.serialization.json.d) {
            return t8.x.n(enumDescriptor, this.f28609c, ((kotlinx.serialization.json.d) bVarF).d(), "");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        sb.append(c9.b(kotlinx.serialization.json.d.class).h());
        sb.append(", but had ");
        sb.append(c9.b(bVarF.getClass()).h());
        sb.append(" as the serialized body of ");
        sb.append(strA);
        sb.append(" at element: ");
        sb.append(X(tag));
        throw t8.x.d(sb.toString(), bVarF.toString(), -1);
    }

    @Override // p143q8.a
    public final long h(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i3) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return P(T(descriptor, i3));
    }

    @Override // p162s8.k
    public final kotlinx.serialization.json.b i() {
        return G();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int j() {
        return O(V());
    }

    @Override // p143q8.a
    public final int k(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i3) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return O(T(descriptor, i3));
    }

    @Override // p143q8.a
    public final byte l(p153r8.C2694e0 descriptor, int i3) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return J(T(descriptor, i3));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final java.lang.String m() {
        return R(V());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long n() {
        return P(V());
    }

    @Override // p143q8.a
    public final boolean o(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i3) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return I(T(descriptor, i3));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final java.lang.Object p(kotlinx.serialization.KSerializer deserializer) {
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        if (!(deserializer instanceof p153r8.AbstractC2687b)) {
            return deserializer.deserialize(this);
        }
        p162s8.d dVar = this.f28609c;
        p162s8.j jVar = dVar.f27388a;
        p153r8.AbstractC2687b abstractC2687b = (p153r8.AbstractC2687b) deserializer;
        java.lang.String strJ = t8.x.j(abstractC2687b.getDescriptor(), dVar);
        kotlinx.serialization.json.b bVarG = G();
        java.lang.String strA = abstractC2687b.getDescriptor().a();
        if (!(bVarG instanceof kotlinx.serialization.json.c)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected ");
            kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
            sb.append(c9.b(kotlinx.serialization.json.c.class).h());
            sb.append(", but had ");
            sb.append(c9.b(bVarG.getClass()).h());
            sb.append(" as the serialized body of ");
            sb.append(strA);
            sb.append(" at element: ");
            sb.append(W());
            throw t8.x.d(sb.toString(), bVarG.toString(), -1);
        }
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) bVarG;
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get(strJ);
        java.lang.String strD = null;
        if (bVar != null) {
            kotlinx.serialization.json.d dVarJ = p162s8.l.j(bVar);
            if (!(dVarJ instanceof kotlinx.serialization.json.JsonNull)) {
                strD = dVarJ.d();
            }
        }
        try {
            return t8.x.s(dVar, strJ, cVar, com.google.common.util.concurrent.AbstractC1903s.t((p153r8.AbstractC2687b) deserializer, this, strD));
        } catch (p119n8.j e6) {
            java.lang.String message = e6.getMessage();
            kotlin.jvm.internal.m.b(message);
            throw t8.x.d(message, cVar.toString(), -1);
        }
    }

    @Override // p143q8.a
    public final java.lang.String q(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i3) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return R(T(descriptor, i3));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean r() {
        return !(G() instanceof kotlinx.serialization.json.JsonNull);
    }

    @Override // p162s8.k
    public final p162s8.d t() {
        return this.f28609c;
    }

    @Override // p143q8.a
    public final java.lang.Object u(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i3, kotlinx.serialization.KSerializer deserializer, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        this.f28607a.add(T(descriptor, i3));
        java.lang.Object objH = (deserializer.getDescriptor().d() || r()) ? H(deserializer) : null;
        if (!this.f28608b) {
            V();
        }
        this.f28608b = false;
        return objH;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final kotlinx.serialization.encoding.Decoder v(kotlinx.serialization.descriptors.SerialDescriptor descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        if (p078i6.o.s1(this.f28607a) != null) {
            return N(V(), descriptor);
        }
        return new t8.z(this.f28609c, U(), this.f28610d).v(descriptor);
    }

    @Override // p143q8.a
    public final double w(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i3) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return L(T(descriptor, i3));
    }

    @Override // p143q8.a
    public final java.lang.Object x(kotlinx.serialization.descriptors.SerialDescriptor descriptor, int i3, kotlinx.serialization.KSerializer deserializer, java.lang.Object obj) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        kotlin.jvm.internal.m.e(deserializer, "deserializer");
        this.f28607a.add(T(descriptor, i3));
        java.lang.Object objH = H(deserializer);
        if (!this.f28608b) {
            V();
        }
        this.f28608b = false;
        return objH;
    }

    @Override // p143q8.a
    public final short y(p153r8.C2694e0 descriptor, int i3) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return Q(T(descriptor, i3));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte z() {
        return J(V());
    }
}
