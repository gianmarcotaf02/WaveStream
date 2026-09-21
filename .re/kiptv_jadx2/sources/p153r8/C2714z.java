package p153r8;

import com.google.android.gms.internal.play_billing.M0;
import com.google.common.util.concurrent.D;
import io.ktor.http.d;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p070h6.i;
import p070h6.p;
import p078i6.w;
import p119n8.j;
import p143q8.a;

public final class C2714z implements KSerializer {

    public final int f27025a = 1;

    public final Object f27026b;

    public Object f27027c;

    public final Object f27028d;

    public C2714z(String str, Object objectInstance) {
        m.e(objectInstance, "objectInstance");
        this.f27026b = objectInstance;
        this.f27027c = w.f23205h;
        this.f27028d = D.A(i.f22537i, new d(str, this, 8));
    }

    @Override
    public final Object deserialize(Decoder decoder) {
        switch (this.f27025a) {
            case 0:
                m.e(decoder, "decoder");
                int iG = decoder.g(getDescriptor());
                Enum[] enumArr = (Enum[]) this.f27026b;
                if (iG >= 0 && iG < enumArr.length) {
                    return enumArr[iG];
                }
                throw new j(iG + " is not among valid " + getDescriptor().a() + " enum values, values size is " + enumArr.length);
            default:
                m.e(decoder, "decoder");
                SerialDescriptor descriptor = getDescriptor();
                a aVarC = decoder.c(descriptor);
                int iS = aVarC.s(getDescriptor());
                if (iS != -1) {
                    throw new j(M0.l(iS, "Unexpected index "));
                }
                aVarC.a(descriptor);
                return this.f27026b;
        }
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        switch (this.f27025a) {
            case 0:
                return (SerialDescriptor) ((p) this.f27028d).getValue();
            default:
                return (SerialDescriptor) this.f27028d.getValue();
        }
    }

    @Override
    public final void serialize(Encoder encoder, Object value) {
        switch (this.f27025a) {
            case 0:
                Enum value2 = (Enum) value;
                m.e(encoder, "encoder");
                m.e(value2, "value");
                Enum[] enumArr = (Enum[]) this.f27026b;
                int iS0 = p078i6.m.s0(enumArr, value2);
                if (iS0 != -1) {
                    encoder.v(getDescriptor(), iS0);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(value2);
                sb.append(" is not a valid enum ");
                sb.append(getDescriptor().a());
                sb.append(", must be one of ");
                String string = Arrays.toString(enumArr);
                m.d(string, "toString(...)");
                sb.append(string);
                throw new j(sb.toString());
            default:
                m.e(encoder, "encoder");
                m.e(value, "value");
                encoder.c(getDescriptor()).a(getDescriptor());
                return;
        }
    }

    public String toString() {
        switch (this.f27025a) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().a() + '>';
            default:
                return super.toString();
        }
    }

    public C2714z(String str, Object objectInstance, Annotation[] annotationArr) {
        this(str, objectInstance);
        m.e(objectInstance, "objectInstance");
        this.f27027c = p078i6.m.S(annotationArr);
    }

    public C2714z(String str, Enum[] values) {
        m.e(values, "values");
        this.f27026b = values;
        this.f27028d = D.B(new d(this, str, 7));
    }
}
