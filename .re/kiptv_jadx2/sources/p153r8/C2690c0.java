package p153r8;

import O7.r;
import com.google.android.gms.internal.play_billing.V0;
import com.google.common.util.concurrent.D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p070h6.i;
import p078i6.C2255f;
import p078i6.o;
import p078i6.w;
import p078i6.x;
import p135p8.j;

public class C2690c0 implements SerialDescriptor, InterfaceC2701l {

    public final String f26945a;

    public final D f26946b;

    public final int f26947c;

    public int f26948d = -1;

    public final String[] f26949e;

    public final List[] f26950f;
    public final boolean[] g;

    public Object f26951h;

    public final Object f26952i;
    public final Object j;

    public final Object f26953k;

    public C2690c0(String str, D d4, int i3) {
        this.f26945a = str;
        this.f26946b = d4;
        this.f26947c = i3;
        String[] strArr = new String[i3];
        for (int i9 = 0; i9 < i3; i9++) {
            strArr[i9] = "[UNINITIALIZED]";
        }
        this.f26949e = strArr;
        int i10 = this.f26947c;
        this.f26950f = new List[i10];
        this.g = new boolean[i10];
        this.f26951h = x.f23206h;
        i iVar = i.f22537i;
        final int i11 = 0;
        this.f26952i = D.A(iVar, new Function0(this) {

            public final C2690c0 f26943i;

            {
                this.f26943i = this;
            }

            @Override
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i11) {
                    case 0:
                        D d6 = this.f26943i.f26946b;
                        return (d6 == null || (kSerializerArrChildSerializers = d6.childSerializers()) == null) ? AbstractC2686a0.f26940b : kSerializerArrChildSerializers;
                    case 1:
                        D d9 = this.f26943i.f26946b;
                        if (d9 == null || (kSerializerArrTypeParametersSerializers = d9.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return AbstractC2686a0.c(arrayList);
                    default:
                        C2690c0 c2690c0 = this.f26943i;
                        return Integer.valueOf(AbstractC2686a0.g(c2690c0, (SerialDescriptor[]) c2690c0.j.getValue()));
                }
            }
        });
        final int i12 = 1;
        this.j = D.A(iVar, new Function0(this) {

            public final C2690c0 f26943i;

            {
                this.f26943i = this;
            }

            @Override
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i12) {
                    case 0:
                        D d6 = this.f26943i.f26946b;
                        return (d6 == null || (kSerializerArrChildSerializers = d6.childSerializers()) == null) ? AbstractC2686a0.f26940b : kSerializerArrChildSerializers;
                    case 1:
                        D d9 = this.f26943i.f26946b;
                        if (d9 == null || (kSerializerArrTypeParametersSerializers = d9.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return AbstractC2686a0.c(arrayList);
                    default:
                        C2690c0 c2690c0 = this.f26943i;
                        return Integer.valueOf(AbstractC2686a0.g(c2690c0, (SerialDescriptor[]) c2690c0.j.getValue()));
                }
            }
        });
        final int i13 = 2;
        this.f26953k = D.A(iVar, new Function0(this) {

            public final C2690c0 f26943i;

            {
                this.f26943i = this;
            }

            @Override
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i13) {
                    case 0:
                        D d6 = this.f26943i.f26946b;
                        return (d6 == null || (kSerializerArrChildSerializers = d6.childSerializers()) == null) ? AbstractC2686a0.f26940b : kSerializerArrChildSerializers;
                    case 1:
                        D d9 = this.f26943i.f26946b;
                        if (d9 == null || (kSerializerArrTypeParametersSerializers = d9.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getDescriptor());
                            }
                        }
                        return AbstractC2686a0.c(arrayList);
                    default:
                        C2690c0 c2690c0 = this.f26943i;
                        return Integer.valueOf(AbstractC2686a0.g(c2690c0, (SerialDescriptor[]) c2690c0.j.getValue()));
                }
            }
        });
    }

    @Override
    public final String a() {
        return this.f26945a;
    }

    @Override
    public final Set b() {
        return this.f26951h.keySet();
    }

    @Override
    public V0 c() {
        return j.f26283f;
    }

    @Override
    public final int e(String name) {
        m.e(name, "name");
        Integer num = (Integer) this.f26951h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2690c0) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f26945a.equals(serialDescriptor.a()) && Arrays.equals((SerialDescriptor[]) this.j.getValue(), (SerialDescriptor[]) ((C2690c0) obj).j.getValue())) {
                int iF = serialDescriptor.f();
                int i3 = this.f26947c;
                if (i3 == iF) {
                    for (int i9 = 0; i9 < i3; i9++) {
                        if (m.a(i(i9).a(), serialDescriptor.i(i9).a()) && m.a(i(i9).c(), serialDescriptor.i(i9).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final int f() {
        return this.f26947c;
    }

    @Override
    public final String g(int i3) {
        return this.f26949e[i3];
    }

    @Override
    public final List getAnnotations() {
        return w.f23205h;
    }

    @Override
    public final List h(int i3) {
        List list = this.f26950f[i3];
        return list == null ? w.f23205h : list;
    }

    public int hashCode() {
        return ((Number) this.f26953k.getValue()).intValue();
    }

    @Override
    public SerialDescriptor i(int i3) {
        return ((KSerializer[]) this.f26952i.getValue())[i3].getDescriptor();
    }

    @Override
    public final boolean j(int i3) {
        return this.g[i3];
    }

    public final void k(String name, boolean z6) {
        m.e(name, "name");
        int i3 = this.f26948d + 1;
        this.f26948d = i3;
        String[] strArr = this.f26949e;
        strArr[i3] = name;
        this.g[i3] = z6;
        this.f26950f[i3] = null;
        if (i3 == this.f26947c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i9 = 0; i9 < length; i9++) {
                map.put(strArr[i9], Integer.valueOf(i9));
            }
            this.f26951h = map;
        }
    }

    public String toString() {
        return o.o1(r.W(0, this.f26947c), ", ", this.f26945a.concat("("), ")", new C2255f(21, this), 24);
    }
}
