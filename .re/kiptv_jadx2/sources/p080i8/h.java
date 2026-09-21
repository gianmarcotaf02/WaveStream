package p080i8;

import A8.m;
import K0.C0656d;
import androidx.media3.common.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.y;
import p055f8.b;
import p078i6.p;
import p078i6.q;

public final class h implements o {

    public final List f23264a;

    public final int f23265b;

    public final boolean f23266c;

    public h(List list) {
        boolean z6;
        boolean z9;
        int i3;
        this.f23264a = list;
        Iterator it = list.iterator();
        int i9 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer num = ((d) it.next()).f23257a;
            if (num != null) {
                iIntValue = num.intValue();
            }
            i9 += iIntValue;
        }
        this.f23265b = i9;
        List list2 = this.f23264a;
        if (list2.isEmpty()) {
            z6 = false;
            break;
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((d) it2.next()).f23257a == null) {
                    z6 = true;
                    break;
                }
            } else {
                z6 = false;
                break;
            }
        }
        this.f23266c = z6;
        List list3 = this.f23264a;
        if (list3.isEmpty()) {
            z9 = true;
            break;
        }
        Iterator it3 = list3.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z9 = true;
                break;
            }
            Integer num2 = ((d) it3.next()).f23257a;
            if (!((num2 != null ? num2.intValue() : Log.LOG_LEVEL_OFF) > 0)) {
                z9 = false;
                break;
            }
        }
        if (!z9) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List list4 = this.f23264a;
        if (list4.isEmpty()) {
            i3 = 0;
        } else {
            Iterator it4 = list4.iterator();
            i3 = 0;
            while (it4.hasNext()) {
                if ((((d) it4.next()).f23257a == null) && (i3 = i3 + 1) < 0) {
                    p.G0();
                    throw null;
                }
            }
        }
        if (i3 <= 1) {
            return;
        }
        List list5 = this.f23264a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((d) obj).f23257a == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q.I0(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((d) it5.next()).f23258b);
        }
        throw new IllegalArgumentException(("At most one variable-length numeric field in a row is allowed, but got several: " + arrayList2 + ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.").toString());
    }

    @Override
    public final Object a(c cVar, String str, int i3) {
        int i9 = this.f23265b;
        if (i3 + i9 > str.length()) {
            return new i(i3, new m(19, this));
        }
        y yVar = new y();
        while (yVar.f24555h + i3 < str.length() && b.a(str.charAt(yVar.f24555h + i3))) {
            yVar.f24555h++;
        }
        if (yVar.f24555h < i9) {
            return new i(i3, new C0656d(yVar, this, 11));
        }
        List list = this.f23264a;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            Integer num = ((d) list.get(i10)).f23257a;
            int iIntValue = (num != null ? num.intValue() : (yVar.f24555h - i9) + 1) + i3;
            f fVarA = ((d) list.get(i10)).a(cVar, str, i3, iIntValue);
            if (fVarA != null) {
                return new i(i3, new g(str.subSequence(i3, iIntValue).toString(), this, i10, fVarA));
            }
            i10++;
            i3 = iIntValue;
        }
        return Integer.valueOf(i3);
    }

    public final String b() {
        List<d> list = this.f23264a;
        ArrayList arrayList = new ArrayList(q.I0(list, 10));
        for (d dVar : list) {
            StringBuilder sb = new StringBuilder();
            Integer num = dVar.f23257a;
            sb.append(num == null ? "at least one digit" : num + " digits");
            sb.append(" for ");
            sb.append(dVar.f23258b);
            arrayList.add(sb.toString());
        }
        boolean z6 = this.f23266c;
        int i3 = this.f23265b;
        if (z6) {
            return "a number with at least " + i3 + " digits: " + arrayList;
        }
        return "a number with exactly " + i3 + " digits: " + arrayList;
    }

    public final String toString() {
        return b();
    }
}
