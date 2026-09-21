package p112n0;

import R8.i;
import j1.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import p078i6.p;
import p078i6.x;
import p136q.H;
import p136q.P;
import p194x6.j;

public final class h implements g {

    public final j f25541h;

    public final H f25542i;
    public H j;

    public h(Map map, j jVar) {
        H h9;
        this.f25541h = jVar;
        if (map == null || map.isEmpty()) {
            h9 = null;
        } else {
            h9 = new H(map.size());
            for (Map.Entry entry : map.entrySet()) {
                h9.m(entry.getKey(), entry.getValue());
            }
        }
        this.f25542i = h9;
    }

    @Override
    public final boolean b(Object obj) {
        return ((Boolean) this.f25541h.invoke(obj)).booleanValue();
    }

    @Override
    public final Map c() {
        char c9;
        long j;
        long j9;
        long j10;
        long[] jArr;
        int i3;
        long[] jArr2;
        int i9;
        H h9 = this.f25542i;
        if (h9 == null && this.j == null) {
            return x.f23206h;
        }
        int i10 = 0;
        int i11 = h9 != null ? h9.f26326e : 0;
        H h10 = this.j;
        HashMap map = new HashMap(i11 + (h10 != null ? h10.f26326e : 0));
        char c10 = 7;
        long j11 = -9187201950435737472L;
        int i12 = 8;
        if (h9 != null) {
            Object[] objArr = h9.f26323b;
            Object[] objArr2 = h9.f26324c;
            long[] jArr3 = h9.f26322a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i13 = 0;
                j9 = 128;
                while (true) {
                    long j12 = jArr3[i13];
                    j10 = 255;
                    if ((((~j12) << c10) & j12 & j11) != j11) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j12 & 255) < 128) {
                                int i16 = (i13 << 3) + i15;
                                map.put((String) objArr[i16], (List) objArr2[i16]);
                            }
                            j12 >>= 8;
                            i15++;
                            c10 = c10;
                            j11 = j11;
                        }
                        c9 = c10;
                        j = j11;
                        if (i14 != 8) {
                            break;
                        }
                    } else {
                        c9 = c10;
                        j = j11;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    c10 = c9;
                    j11 = j;
                }
            } else {
                c9 = 7;
                j = -9187201950435737472L;
                j9 = 128;
                j10 = 255;
            }
        } else {
            c9 = 7;
            j = -9187201950435737472L;
            j9 = 128;
            j10 = 255;
        }
        H h11 = this.j;
        if (h11 != null) {
            Object[] objArr3 = h11.f26323b;
            Object[] objArr4 = h11.f26324c;
            long[] jArr4 = h11.f26322a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i17 = 0;
                while (true) {
                    long j13 = jArr4[i17];
                    if ((((~j13) << c9) & j13 & j) != j) {
                        int i18 = 8 - ((~(i17 - length2)) >>> 31);
                        int i19 = i10;
                        while (i19 < i18) {
                            if ((j13 & j10) < j9) {
                                int i20 = (i17 << 3) + i19;
                                Object obj = objArr3[i20];
                                List list = (List) objArr4[i20];
                                String str = (String) obj;
                                i9 = i12;
                                if (list.size() == 1) {
                                    Object objInvoke = ((Function0) list.get(i10)).invoke();
                                    if (objInvoke != null) {
                                        if (!b(objInvoke)) {
                                            throw new IllegalStateException(l.a(objInvoke).toString());
                                        }
                                        map.put(str, p.x0(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i10 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((Function0) list.get(i10)).invoke();
                                        if (objInvoke2 != null && !b(objInvoke2)) {
                                            throw new IllegalStateException(l.a(objInvoke2).toString());
                                        }
                                        arrayList.add(objInvoke2);
                                        i10++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i9 = i12;
                            }
                            j13 >>= i9;
                            i19++;
                            i12 = i9;
                            jArr4 = jArr2;
                            i10 = 0;
                        }
                        jArr = jArr4;
                        i3 = i12;
                        if (i18 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i3 = i12;
                    }
                    if (i17 == length2) {
                        break;
                    }
                    i17++;
                    i12 = i3;
                    jArr4 = jArr;
                    i10 = 0;
                }
            }
        }
        return map;
    }

    @Override
    public final Object d(String str) {
        H h9 = this.f25542i;
        List list = h9 != null ? (List) h9.k(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && h9 != null) {
            List listSubList = list.subList(1, list.size());
            int iF = h9.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = h9.f26324c;
            Object obj = objArr[iF];
            h9.f26323b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    @Override
    public final f e(String str, Function0 function0) {
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (!i.w(str.charAt(i3))) {
                H h9 = this.j;
                if (h9 == null) {
                    long[] jArr = P.f26351a;
                    h9 = new H();
                    this.j = h9;
                }
                Object objG = h9.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    h9.m(str, objG);
                }
                ((List) objG).add(function0);
                return new l(h9, str, function0, 5);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
