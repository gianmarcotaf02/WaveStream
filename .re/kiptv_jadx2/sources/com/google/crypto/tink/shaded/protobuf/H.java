package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class H extends J {

    public static final Class f19481c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    public static List d(int i3, long j, Object obj) {
        List listG;
        List list = (List) p0.f19569c.i(j, obj);
        if (list.isEmpty()) {
            if (list instanceof G) {
                listG = new F(i3);
            } else {
                listG = ((list instanceof Z) && (list instanceof A)) ? ((A) list).g(i3) : new ArrayList(i3);
            }
            p0.p(j, obj, listG);
            return listG;
        }
        if (f19481c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i3);
            arrayList.addAll(list);
            p0.p(j, obj, arrayList);
            return arrayList;
        }
        if (list instanceof k0) {
            F f9 = new F(list.size() + i3);
            f9.addAll((k0) list);
            p0.p(j, obj, f9);
            return f9;
        }
        if ((list instanceof Z) && (list instanceof A)) {
            A a2 = (A) list;
            if (!((AbstractC1907b) a2).f19514h) {
                A aG = a2.g(list.size() + i3);
                p0.p(j, obj, aG);
                return aG;
            }
        }
        return list;
    }

    @Override
    public final void a(long j, Object obj) {
        Object objUnmodifiableList;
        List list = (List) p0.f19569c.i(j, obj);
        if (list instanceof G) {
            objUnmodifiableList = ((G) list).c();
        } else {
            if (f19481c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof Z) && (list instanceof A)) {
                AbstractC1907b abstractC1907b = (AbstractC1907b) ((A) list);
                if (abstractC1907b.f19514h) {
                    abstractC1907b.f19514h = false;
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        p0.p(j, obj, objUnmodifiableList);
    }

    @Override
    public final void b(long j, Object obj, Object obj2) {
        List list = (List) p0.f19569c.i(j, obj2);
        List listD = d(list.size(), j, obj);
        int size = listD.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listD.addAll(list);
        }
        if (size > 0) {
            list = listD;
        }
        p0.p(j, obj, list);
    }

    @Override
    public final List c(long j, Object obj) {
        return d(10, j, obj);
    }
}
