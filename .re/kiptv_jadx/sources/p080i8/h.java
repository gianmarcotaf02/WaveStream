package p080i8;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p080i8.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f23264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f23266c;

    public h(java.util.List list) {
        boolean z6;
        boolean z9;
        int i3;
        this.f23264a = list;
        java.util.Iterator it = list.iterator();
        int i9 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Integer num = ((p080i8.d) it.next()).f23257a;
            if (num != null) {
                iIntValue = num.intValue();
            }
            i9 += iIntValue;
        }
        this.f23265b = i9;
        java.util.List list2 = this.f23264a;
        if (list2.isEmpty()) {
            z6 = false;
            break;
        }
        java.util.Iterator it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((p080i8.d) it2.next()).f23257a == null) {
                    z6 = true;
                    break;
                }
            } else {
                z6 = false;
                break;
            }
        }
        this.f23266c = z6;
        java.util.List list3 = this.f23264a;
        if (list3.isEmpty()) {
            z9 = true;
            break;
        }
        java.util.Iterator it3 = list3.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z9 = true;
                break;
            }
            java.lang.Integer num2 = ((p080i8.d) it3.next()).f23257a;
            if (!((num2 != null ? num2.intValue() : androidx.media3.common.util.Log.LOG_LEVEL_OFF) > 0)) {
                z9 = false;
                break;
            }
        }
        if (!z9) {
            throw new java.lang.IllegalArgumentException("Failed requirement.");
        }
        java.util.List list4 = this.f23264a;
        if (list4.isEmpty()) {
            i3 = 0;
        } else {
            java.util.Iterator it4 = list4.iterator();
            i3 = 0;
            while (it4.hasNext()) {
                if ((((p080i8.d) it4.next()).f23257a == null) && (i3 = i3 + 1) < 0) {
                    p078i6.p.G0();
                    throw null;
                }
            }
        }
        if (i3 <= 1) {
            return;
        }
        java.util.List list5 = this.f23264a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list5) {
            if (((p080i8.d) obj).f23257a == null) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(arrayList, 10));
        java.util.Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((p080i8.d) it5.next()).f23258b);
        }
        throw new java.lang.IllegalArgumentException(("At most one variable-length numeric field in a row is allowed, but got several: " + arrayList2 + ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.").toString());
    }

    @Override // p080i8.o
    public final java.lang.Object a(p080i8.c cVar, java.lang.String str, int i3) {
        int i9 = this.f23265b;
        if (i3 + i9 > str.length()) {
            return new p080i8.i(i3, new A8.m(19, this));
        }
        kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
        while (yVar.f24555h + i3 < str.length() && p055f8.b.a(str.charAt(yVar.f24555h + i3))) {
            yVar.f24555h++;
        }
        if (yVar.f24555h < i9) {
            return new p080i8.i(i3, new K0.C0656d(yVar, this, 11));
        }
        java.util.List list = this.f23264a;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            java.lang.Integer num = ((p080i8.d) list.get(i10)).f23257a;
            int iIntValue = (num != null ? num.intValue() : (yVar.f24555h - i9) + 1) + i3;
            p080i8.f fVarA = ((p080i8.d) list.get(i10)).a(cVar, str, i3, iIntValue);
            if (fVarA != null) {
                return new p080i8.i(i3, new p080i8.g(str.subSequence(i3, iIntValue).toString(), this, i10, fVarA));
            }
            i10++;
            i3 = iIntValue;
        }
        return java.lang.Integer.valueOf(i3);
    }

    public final java.lang.String b() {
        java.util.List<p080i8.d> list = this.f23264a;
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(list, 10));
        for (p080i8.d dVar : list) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Integer num = dVar.f23257a;
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

    public final java.lang.String toString() {
        return b();
    }
}
