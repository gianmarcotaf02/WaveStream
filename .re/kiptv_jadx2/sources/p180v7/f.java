package p180v7;

import com.google.android.gms.internal.play_billing.M0;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import p078i6.o;
import p078i6.w;

public final class f {

    public static final m f29662c = new m();

    public static final int f29663d;

    public static final int f29664e;

    public static final int f29665f;
    public static final int g;

    public static final int f29666h;

    public static final int f29667i;
    public static final int j;

    public static final int f29668k;

    public static final int f29669l;

    public static final f f29670m;

    public static final f f29671n;

    public static final f f29672o;

    public static final f f29673p;

    public static final f f29674q;

    public static final ArrayList f29675r;

    public static final ArrayList f29676s;

    public final List f29677a;

    public final int f29678b;

    static {
        e eVar;
        int i3 = f29663d;
        int i9 = i3 << 1;
        f29664e = i3;
        int i10 = i3 << 2;
        f29665f = i9;
        int i11 = i3 << 3;
        g = i10;
        int i12 = i3 << 4;
        f29666h = i11;
        int i13 = i3 << 5;
        f29667i = i12;
        j = i13;
        f29663d = i3 << 7;
        int i14 = (i3 << 6) - 1;
        f29668k = i14;
        int i15 = i3 | i9 | i10;
        f29669l = i15;
        f29670m = new f(i14);
        f29671n = new f(i12 | i13);
        new f(i3);
        new f(i9);
        new f(i10);
        f29672o = new f(i15);
        new f(i11);
        f29673p = new f(i12);
        f29674q = new f(i13);
        new f(i9 | i12 | i13);
        Field[] fields = f.class.getFields();
        m.d(fields, "getFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            e eVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            f fVar = obj instanceof f ? (f) obj : null;
            if (fVar != null) {
                String name = field2.getName();
                m.d(name, "getName(...)");
                eVar2 = new e(fVar.f29678b, name);
            }
            if (eVar2 != null) {
                arrayList2.add(eVar2);
            }
        }
        f29675r = arrayList2;
        Field[] fields2 = f.class.getFields();
        m.d(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (m.a(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            m.c(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                m.d(name2, "getName(...)");
                eVar = new e(iIntValue, name2);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList5.add(eVar);
            }
        }
        f29676s = arrayList5;
    }

    public f(int i3, List excludes) {
        m.e(excludes, "excludes");
        this.f29677a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i3 &= ~((d) it.next()).a();
        }
        this.f29678b = i3;
    }

    public final boolean a(int i3) {
        return (i3 & this.f29678b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        m.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        f fVar = (f) obj;
        return m.a(this.f29677a, fVar.f29677a) && this.f29678b == fVar.f29678b;
    }

    public final int hashCode() {
        return (this.f29677a.hashCode() * 31) + this.f29678b;
    }

    public final String toString() {
        Object next;
        Iterator it = f29675r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((e) next).f29660a != this.f29678b);
        e eVar = (e) next;
        String strO1 = eVar != null ? eVar.f29661b : null;
        if (strO1 == null) {
            ArrayList<e> arrayList = f29676s;
            ArrayList arrayList2 = new ArrayList();
            for (e eVar2 : arrayList) {
                String str = a(eVar2.f29660a) ? eVar2.f29661b : null;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            strO1 = o.o1(arrayList2, " | ", null, null, null, 62);
        }
        return M0.n(M0.q("DescriptorKindFilter(", strO1, ", "), this.f29677a, ')');
    }

    public f(int i3) {
        this(i3, w.f23205h);
    }
}
