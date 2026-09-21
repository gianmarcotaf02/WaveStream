package p153r8;

/* JADX INFO: renamed from: r8.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2714z implements kotlinx.serialization.KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27025a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f27026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f27027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f27028d;

    public C2714z(java.lang.String str, java.lang.Object objectInstance) {
        kotlin.jvm.internal.m.e(objectInstance, "objectInstance");
        this.f27026b = objectInstance;
        this.f27027c = p078i6.w.f23205h;
        this.f27028d = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, new io.ktor.http.d(str, this, 8));
    }

    @Override // kotlinx.serialization.KSerializer
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
        switch (this.f27025a) {
            case 0:
                kotlin.jvm.internal.m.e(decoder, "decoder");
                int iG = decoder.g(getDescriptor());
                java.lang.Enum[] enumArr = (java.lang.Enum[]) this.f27026b;
                if (iG >= 0 && iG < enumArr.length) {
                    return enumArr[iG];
                }
                throw new p119n8.j(iG + " is not among valid " + getDescriptor().a() + " enum values, values size is " + enumArr.length);
            default:
                kotlin.jvm.internal.m.e(decoder, "decoder");
                kotlinx.serialization.descriptors.SerialDescriptor descriptor = getDescriptor();
                p143q8.a aVarC = decoder.c(descriptor);
                int iS = aVarC.s(getDescriptor());
                if (iS != -1) {
                    throw new p119n8.j(com.google.android.gms.internal.play_billing.M0.l(iS, "Unexpected index "));
                }
                aVarC.a(descriptor);
                return this.f27026b;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [h6.h, java.lang.Object] */
    @Override // kotlinx.serialization.KSerializer
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        switch (this.f27025a) {
            case 0:
                return (kotlinx.serialization.descriptors.SerialDescriptor) ((p070h6.p) this.f27028d).getValue();
            default:
                return (kotlinx.serialization.descriptors.SerialDescriptor) this.f27028d.getValue();
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object value) {
        switch (this.f27025a) {
            case 0:
                java.lang.Enum value2 = (java.lang.Enum) value;
                kotlin.jvm.internal.m.e(encoder, "encoder");
                kotlin.jvm.internal.m.e(value2, "value");
                java.lang.Enum[] enumArr = (java.lang.Enum[]) this.f27026b;
                int iS0 = p078i6.m.s0(enumArr, value2);
                if (iS0 != -1) {
                    encoder.v(getDescriptor(), iS0);
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(value2);
                sb.append(" is not a valid enum ");
                sb.append(getDescriptor().a());
                sb.append(", must be one of ");
                java.lang.String string = java.util.Arrays.toString(enumArr);
                kotlin.jvm.internal.m.d(string, "toString(...)");
                sb.append(string);
                throw new p119n8.j(sb.toString());
            default:
                kotlin.jvm.internal.m.e(encoder, "encoder");
                kotlin.jvm.internal.m.e(value, "value");
                encoder.c(getDescriptor()).a(getDescriptor());
                return;
        }
    }

    public java.lang.String toString() {
        switch (this.f27025a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2714z(java.lang.String str, java.lang.Object objectInstance, java.lang.annotation.Annotation[] annotationArr) {
        this(str, objectInstance);
        kotlin.jvm.internal.m.e(objectInstance, "objectInstance");
        this.f27027c = p078i6.m.S(annotationArr);
    }

    public C2714z(java.lang.String str, java.lang.Enum[] values) {
        kotlin.jvm.internal.m.e(values, "values");
        this.f27026b = values;
        this.f27028d = com.google.common.util.concurrent.D.B(new io.ktor.http.d(this, str, 7));
    }
}
