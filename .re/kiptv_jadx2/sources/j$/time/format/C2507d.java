package j$.time.format;

import java.util.ArrayList;

public final class C2507d implements InterfaceC2508e {

    public final InterfaceC2508e[] f23691a;

    public final boolean f23692b;

    public C2507d(ArrayList arrayList, boolean z6) {
        this((InterfaceC2508e[]) arrayList.toArray(new InterfaceC2508e[arrayList.size()]), z6);
    }

    public C2507d(InterfaceC2508e[] interfaceC2508eArr, boolean z6) {
        this.f23691a = interfaceC2508eArr;
        this.f23692b = z6;
    }

    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p(x xVar, StringBuilder sb) {
        int length = sb.length();
        boolean z6 = this.f23692b;
        if (z6) {
            xVar.f23748c++;
        }
        try {
            for (InterfaceC2508e interfaceC2508e : this.f23691a) {
                if (!interfaceC2508e.p(xVar, sb)) {
                    sb.setLength(length);
                }
            }
        } catch (Throwable th) {
            if (z6) {
                xVar.f23748c--;
            }
            throw th;
        }
    }

    @Override
    public final int r(v vVar, CharSequence charSequence, int i3) {
        boolean z6 = this.f23692b;
        InterfaceC2508e[] interfaceC2508eArr = this.f23691a;
        int i9 = 0;
        if (z6) {
            ArrayList arrayList = vVar.f23740d;
            C c9 = vVar.c();
            c9.getClass();
            C c10 = new C();
            c10.f23654a.putAll(c9.f23654a);
            c10.f23655b = c9.f23655b;
            c10.f23656c = c9.f23656c;
            c10.f23657d = c9.f23657d;
            arrayList.add(c10);
            int length = interfaceC2508eArr.length;
            int iR = i3;
            while (i9 < length) {
                iR = interfaceC2508eArr[i9].r(vVar, charSequence, iR);
                if (iR < 0) {
                    arrayList.remove(arrayList.size() - 1);
                    return i3;
                }
                i9++;
            }
            arrayList.remove(arrayList.size() - 2);
            return iR;
        }
        int length2 = interfaceC2508eArr.length;
        while (i9 < length2) {
            i3 = interfaceC2508eArr[i9].r(vVar, charSequence, i3);
            if (i3 < 0) {
                return i3;
            }
            i9++;
        }
        return i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        InterfaceC2508e[] interfaceC2508eArr = this.f23691a;
        if (interfaceC2508eArr != null) {
            boolean z6 = this.f23692b;
            sb.append(z6 ? "[" : "(");
            for (InterfaceC2508e interfaceC2508e : interfaceC2508eArr) {
                sb.append(interfaceC2508e);
            }
            sb.append(z6 ? "]" : ")");
        }
        return sb.toString();
    }
}
