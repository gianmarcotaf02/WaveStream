package com.kiptv.core.repository;

import U4.g;
import U4.h;
import V7.W;
import V7.n0;
import V7.r;
import Y6.f;
import android.content.Context;
import com.google.common.util.concurrent.AbstractC1903s;
import com.google.common.util.concurrent.P;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import com.kiptv.core.model.I0;
import com.kiptv.core.model.T;
import com.kiptv.core.model.WatchProgress;
import com.kiptv.core.model.z0;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.m;
import p005a5.E0;
import p005a5.F0;
import p005a5.J0;
import p005a5.K0;
import p005a5.L0;
import p028c8.d;
import p070h6.A;
import p078i6.C;
import p078i6.o;
import p078i6.p;
import p078i6.x;
import p078i6.y;
import p086j6.e;
import p117n6.c;
import p160s6.k;
import p162s8.q;

public final class a {
    public static final E0 Companion = new E0();

    public final Context f20957a;

    public final g f20958b;

    public final n0 f20959c;

    public final W f20960d;

    public final n0 f20961e;

    public final W f20962f;
    public final n0 g;

    public final W f20963h;

    public final q f20964i;
    public final d j;

    public int f20965k;

    public long f20966l;

    public a(Context context, g contentDiskCache) {
        m.e(context, "context");
        m.e(contentDiskCache, "contentDiskCache");
        this.f20957a = context;
        this.f20958b = contentDiskCache;
        y yVar = y.f23207h;
        n0 n0VarB = r.b(yVar);
        this.f20959c = n0VarB;
        this.f20960d = new W(n0VarB);
        n0 n0VarB2 = r.b(yVar);
        this.f20961e = n0VarB2;
        this.f20962f = new W(n0VarB2);
        n0 n0VarB3 = r.b(x.f23206h);
        this.g = n0VarB3;
        this.f20963h = new W(n0VarB3);
        this.f20964i = AbstractC1909d.e(new h(9));
        this.j = new d();
    }

    public static T a(I0 info, List watchProgress) {
        int i3;
        ArrayList arrayList;
        Iterator it;
        Set setR1;
        Iterator it2;
        Comparable comparable;
        int iIntValue;
        Iterator it3;
        int i9;
        Iterator it4;
        Comparable comparable2;
        int i10;
        Integer num;
        double dDoubleValue;
        m.e(info, "info");
        m.e(watchProgress, "watchProgress");
        Map map = info.f19803c;
        if (map != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - 604800000;
            ArrayList arrayList2 = new ArrayList();
            Iterator it5 = map.entrySet().iterator();
            while (true) {
                i3 = 0;
                if (!it5.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it5.next();
                String str = (String) entry.getKey();
                List<com.kiptv.core.model.E0> list = (List) entry.getValue();
                Integer numZ0 = O7.x.z0(str);
                for (com.kiptv.core.model.E0 e6 : list) {
                    Integer num2 = e6.g;
                    int iIntValue2 = num2 != null ? num2.intValue() : numZ0 != null ? numZ0.intValue() : 0;
                    if (iIntValue2 > 0) {
                        int iA = e6.a();
                        Date dateD = AbstractC1903s.D(e6.f19736f);
                        arrayList2.add(new F0(iIntValue2, iA, dateD != null ? Long.valueOf(dateD.getTime()) : null));
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                ArrayList<F0> arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    Long l2 = ((F0) obj).f13385c;
                    if (l2 != null && l2.longValue() > jCurrentTimeMillis) {
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList = new ArrayList(p078i6.q.I0(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Integer.valueOf(((F0) it.next()).f13383a));
                    }
                    setR1 = o.R1(arrayList);
                    if (!arrayList3.isEmpty()) {
                        it2 = setR1.iterator();
                        if (it2.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        comparable = (Comparable) it2.next();
                        while (it2.hasNext()) {
                            comparable2 = (Comparable) it2.next();
                            if (comparable.compareTo(comparable2) < 0) {
                                comparable = comparable2;
                            }
                        }
                        iIntValue = ((Number) comparable).intValue();
                        if (iIntValue > 1) {
                            if (arrayList2.isEmpty()) {
                                i9 = 0;
                            } else {
                                it3 = arrayList2.iterator();
                                i9 = 0;
                                while (it3.hasNext()) {
                                    if (((F0) it3.next()).f13383a != iIntValue) {
                                    }
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                it4 = arrayList3.iterator();
                                while (it4.hasNext()) {
                                    if (((F0) it4.next()).f13383a != iIntValue) {
                                    }
                                }
                            }
                            if (i9 > 0) {
                                return T.NEW_SEASON;
                            }
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        if (arrayList3.size() >= 2) {
                        }
                    }
                } else {
                    HashSet hashSet = new HashSet();
                    Iterator it6 = watchProgress.iterator();
                    while (it6.hasNext()) {
                        WatchProgress watchProgress2 = (WatchProgress) it6.next();
                        if (watchProgress2.f20614e == z0.j && (num = watchProgress2.f20616h) != null) {
                            if (num.intValue() <= 0) {
                                num = null;
                            }
                            if (num != null) {
                                int iIntValue3 = num.intValue();
                                Integer num3 = watchProgress2.f20617i;
                                if (num3 != null) {
                                    if (num3.intValue() <= 0) {
                                        num3 = null;
                                    }
                                    if (num3 != null) {
                                        int iIntValue4 = num3.intValue();
                                        int i11 = watchProgress2.f20618k;
                                        if (i11 > 0) {
                                            dDoubleValue = ((double) watchProgress2.j) / ((double) i11);
                                        } else {
                                            Double d4 = watchProgress2.f20619l;
                                            dDoubleValue = d4 != null ? d4.doubleValue() : 0.0d;
                                        }
                                        if (watchProgress2.f20620m || dDoubleValue >= 0.9d) {
                                            hashSet.add(iIntValue3 + ":" + iIntValue4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                        for (F0 f9 : arrayList3) {
                            if (hashSet.contains(f9.f13383a + ":" + f9.f13384b) && (i10 = i10 + 1) < 0) {
                                p.G0();
                                throw null;
                            }
                        }
                    }
                    if (((double) i10) / ((double) arrayList3.size()) < 0.95d) {
                        arrayList = new ArrayList(p078i6.q.I0(arrayList2, 10));
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Integer.valueOf(((F0) it.next()).f13383a));
                        }
                        setR1 = o.R1(arrayList);
                        if (!arrayList3.isEmpty()) {
                            it2 = setR1.iterator();
                            if (it2.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            comparable = (Comparable) it2.next();
                            while (it2.hasNext()) {
                                comparable2 = (Comparable) it2.next();
                                if (comparable.compareTo(comparable2) < 0) {
                                    comparable = comparable2;
                                }
                            }
                            iIntValue = ((Number) comparable).intValue();
                            if (iIntValue > 1) {
                                if (arrayList2.isEmpty()) {
                                    i9 = 0;
                                } else {
                                    it3 = arrayList2.iterator();
                                    i9 = 0;
                                    while (it3.hasNext()) {
                                        if (((F0) it3.next()).f13383a != iIntValue && (i9 = i9 + 1) < 0) {
                                            p.G0();
                                            throw null;
                                        }
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    it4 = arrayList3.iterator();
                                    while (it4.hasNext()) {
                                        if (((F0) it4.next()).f13383a != iIntValue && (i3 = i3 + 1) < 0) {
                                            p.G0();
                                            throw null;
                                        }
                                    }
                                }
                                if (i9 > 0 && ((double) i3) / ((double) i9) >= 0.5d) {
                                    return T.NEW_SEASON;
                                }
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            return arrayList3.size() >= 2 ? T.NEW_EPISODES : T.NEW_EPISODE;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final Object b(c cVar) {
        J0 j9;
        a aVar;
        d dVar;
        if (cVar instanceof J0) {
            j9 = (J0) cVar;
            int i3 = j9.f13532l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                j9.f13532l = i3 - Integer.MIN_VALUE;
            } else {
                j9 = new J0(this, cVar);
            }
        } else {
            j9 = new J0(this, cVar);
        }
        Object obj = j9.j;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = j9.f13532l;
        boolean z6 = true;
        if (i9 == 0) {
            P.u0(obj);
            j9.f13529h = this;
            d dVar2 = this.j;
            j9.f13530i = dVar2;
            j9.f13532l = 1;
            if (dVar2.e(j9) == aVar2) {
                return aVar2;
            }
            aVar = this;
            dVar = dVar2;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = j9.f13530i;
            aVar = j9.f13529h;
            P.u0(obj);
        }
        try {
            if (aVar.f20966l == 0) {
                z6 = false;
            } else if (System.currentTimeMillis() >= aVar.f20966l) {
                aVar.f20966l = 0L;
                aVar.f20965k = 0;
                z6 = false;
            }
            return Boolean.valueOf(z6);
        } finally {
            dVar.g(null);
        }
    }

    public final e c(String str) {
        Object objT;
        Long lA = this.f20958b.a(str);
        if (lA == null) {
            return null;
        }
        long jLongValue = lA.longValue();
        File file = new File(this.f20957a.getCacheDir(), "new_content_badges");
        file.mkdirs();
        File file2 = new File(file, str.concat(".json"));
        if (!file2.exists()) {
            return null;
        }
        try {
            NewContentRepository$CachedBadges newContentRepository$CachedBadges = (NewContentRepository$CachedBadges) this.f20964i.b(k.R(file2), NewContentRepository$CachedBadges.INSTANCE.serializer());
            if (newContentRepository$CachedBadges.f20907a == 2 && m.a(newContentRepository$CachedBadges.f20908b, str) && newContentRepository$CachedBadges.f20909c == jLongValue) {
                e eVar = new e();
                for (Map.Entry entry : newContentRepository$CachedBadges.f20910d.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    Integer numZ0 = O7.x.z0(str2);
                    if (numZ0 != null) {
                        try {
                            objT = T.valueOf(str3);
                        } catch (Throwable th) {
                            objT = P.T(th);
                        }
                        if (objT instanceof p070h6.m) {
                            objT = null;
                        }
                        eVar.put(numZ0, objT);
                    }
                }
                return eVar.b();
            }
            return null;
        } catch (Exception e6) {
            f.u(e6, "loadCache failed: ", "NewContentRepo");
            return null;
        }
    }

    public final Object d(c cVar) {
        K0 k1;
        a aVar;
        d dVar;
        if (cVar instanceof K0) {
            k1 = (K0) cVar;
            int i3 = k1.f13570l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k1.f13570l = i3 - Integer.MIN_VALUE;
            } else {
                k1 = new K0(this, cVar);
            }
        } else {
            k1 = new K0(this, cVar);
        }
        Object obj = k1.j;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = k1.f13570l;
        boolean z6 = true;
        if (i9 == 0) {
            P.u0(obj);
            k1.f13567h = this;
            d dVar2 = this.j;
            k1.f13568i = dVar2;
            k1.f13570l = 1;
            if (dVar2.e(k1) == aVar2) {
                return aVar2;
            }
            aVar = this;
            dVar = dVar2;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = k1.f13568i;
            aVar = k1.f13567h;
            P.u0(obj);
        }
        try {
            int i10 = aVar.f20965k + 1;
            aVar.f20965k = i10;
            if (i10 >= 3) {
                aVar.f20966l = System.currentTimeMillis() + 1800000;
            } else {
                z6 = false;
            }
            return Boolean.valueOf(z6);
        } finally {
            dVar.g(null);
        }
    }

    public final Object e(c cVar) {
        L0 l2;
        a aVar;
        d dVar;
        if (cVar instanceof L0) {
            l2 = (L0) cVar;
            int i3 = l2.f13609l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l2.f13609l = i3 - Integer.MIN_VALUE;
            } else {
                l2 = new L0(this, cVar);
            }
        } else {
            l2 = new L0(this, cVar);
        }
        Object obj = l2.j;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = l2.f13609l;
        if (i9 == 0) {
            P.u0(obj);
            l2.f13606h = this;
            d dVar2 = this.j;
            l2.f13607i = dVar2;
            l2.f13609l = 1;
            if (dVar2.e(l2) == aVar2) {
                return aVar2;
            }
            aVar = this;
            dVar = dVar2;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = l2.f13607i;
            aVar = l2.f13606h;
            P.u0(obj);
        }
        try {
            aVar.f20965k = 0;
            return A.f22523a;
        } finally {
            dVar.g(null);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(java.util.List r19, java.lang.String r20, p194x6.m r21, p194x6.m r22, p117n6.c r23) {
        /*
            Method dump skipped, instruction units count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kiptv.core.repository.a.f(java.util.List, java.lang.String, x6.m, x6.m, n6.c):java.lang.Object");
    }

    public final void g(int i3, T t9) {
        n0 n0Var = this.g;
        LinkedHashMap linkedHashMapZ0 = C.Z0((Map) n0Var.getValue());
        Integer numValueOf = Integer.valueOf(i3);
        n0Var.getClass();
        n0Var.i(null, linkedHashMapZ0);
    }
}
