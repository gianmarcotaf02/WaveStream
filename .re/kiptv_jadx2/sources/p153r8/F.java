package p153r8;

import com.google.android.gms.internal.play_billing.M0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import p078i6.C;
import p135p8.f;
import p143q8.a;
import p143q8.b;

public final class F extends AbstractC2685a {

    public final KSerializer f26906a;

    public final KSerializer f26907b;

    public final int f26908c;

    public final E f26909d;

    public F(KSerializer kSerializer, KSerializer kSerializer2, byte b9) {
        this.f26906a = kSerializer;
        this.f26907b = kSerializer2;
    }

    @Override
    public final Object a() {
        switch (this.f26908c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override
    public final int b(Object obj) {
        switch (this.f26908c) {
            case 0:
                HashMap map = (HashMap) obj;
                m.e(map, "<this>");
                return map.size() * 2;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                m.e(linkedHashMap, "<this>");
                return linkedHashMap.size() * 2;
        }
    }

    @Override
    public final Iterator c(Object obj) {
        switch (this.f26908c) {
            case 0:
                Map map = (Map) obj;
                m.e(map, "<this>");
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                m.e(map2, "<this>");
                return map2.entrySet().iterator();
        }
    }

    @Override
    public final int d(Object obj) {
        switch (this.f26908c) {
            case 0:
                Map map = (Map) obj;
                m.e(map, "<this>");
                return map.size();
            default:
                Map map2 = (Map) obj;
                m.e(map2, "<this>");
                return map2.size();
        }
    }

    @Override
    public final void f(a aVar, int i3, Object obj) {
        Map builder = (Map) obj;
        m.e(builder, "builder");
        Object objX = aVar.x(getDescriptor(), i3, this.f26906a, null);
        int iS = aVar.s(getDescriptor());
        if (iS != i3 + 1) {
            throw new IllegalArgumentException(M0.k(i3, iS, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean zContainsKey = builder.containsKey(objX);
        KSerializer kSerializer = this.f26907b;
        builder.put(objX, (!zContainsKey || (kSerializer.getDescriptor().c() instanceof f)) ? aVar.x(getDescriptor(), iS, kSerializer, null) : aVar.x(getDescriptor(), iS, kSerializer, C.M0(objX, builder)));
    }

    @Override
    public final Object g(Object obj) {
        switch (this.f26908c) {
            case 0:
                m.e(null, "<this>");
                return new HashMap((Map) null);
            default:
                m.e(null, "<this>");
                return new LinkedHashMap((Map) null);
        }
    }

    @Override
    public final SerialDescriptor getDescriptor() {
        switch (this.f26908c) {
            case 0:
                break;
        }
        return this.f26909d;
    }

    @Override
    public final Object h(Object obj) {
        switch (this.f26908c) {
            case 0:
                HashMap map = (HashMap) obj;
                m.e(map, "<this>");
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                m.e(linkedHashMap, "<this>");
                return linkedHashMap;
        }
    }

    @Override
    public final void serialize(Encoder encoder, Object obj) {
        m.e(encoder, "encoder");
        d(obj);
        SerialDescriptor descriptor = getDescriptor();
        b bVarA = encoder.A(descriptor);
        Iterator itC = c(obj);
        int i3 = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i9 = i3 + 1;
            bVarA.h(getDescriptor(), i3, this.f26906a, key);
            i3 += 2;
            bVarA.h(getDescriptor(), i9, this.f26907b, value);
        }
        bVarA.a(descriptor);
    }

    public F(KSerializer kSerializer, KSerializer vSerializer, int i3) {
        this(kSerializer, vSerializer, (byte) 0);
        this.f26908c = i3;
        switch (i3) {
            case 1:
                m.e(kSerializer, "kSerializer");
                m.e(vSerializer, "vSerializer");
                this(kSerializer, vSerializer, (byte) 0);
                SerialDescriptor keyDesc = kSerializer.getDescriptor();
                SerialDescriptor valueDesc = vSerializer.getDescriptor();
                m.e(keyDesc, "keyDesc");
                m.e(valueDesc, "valueDesc");
                this.f26909d = new E("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
                break;
            default:
                m.e(kSerializer, "kSerializer");
                m.e(vSerializer, "vSerializer");
                SerialDescriptor keyDesc2 = kSerializer.getDescriptor();
                SerialDescriptor valueDesc2 = vSerializer.getDescriptor();
                m.e(keyDesc2, "keyDesc");
                m.e(valueDesc2, "valueDesc");
                this.f26909d = new E("kotlin.collections.HashMap", keyDesc2, valueDesc2);
                break;
        }
    }
}
