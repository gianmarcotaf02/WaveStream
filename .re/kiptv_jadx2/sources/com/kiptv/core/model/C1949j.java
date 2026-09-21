package com.kiptv.core.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class C1949j {
    public static final C1947i Companion = new C1947i();

    public final List f20780a;

    public final String f20781b;

    public final String f20782c;

    public C1949j(String str, String str2, List programs) {
        kotlin.jvm.internal.m.e(programs, "programs");
        this.f20780a = programs;
        this.f20781b = str;
        this.f20782c = str2;
    }

    public final EPGProgram a() {
        Object next;
        Iterator it = this.f20780a.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((EPGProgram) next).f()) {
                return (EPGProgram) next;
            }
        }
        next = null;
        return (EPGProgram) next;
    }

    public final EPGProgram b() {
        Object next;
        Iterator it = this.f20780a.iterator();
        while (it.hasNext()) {
            next = it.next();
            EPGProgram ePGProgram = (EPGProgram) next;
            ePGProgram.getClass();
            if (System.currentTimeMillis() < ePGProgram.f19741d) {
                return (EPGProgram) next;
            }
        }
        next = null;
        return (EPGProgram) next;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f20780a) {
            if (((EPGProgram) obj).g()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f20780a) {
            EPGProgram ePGProgram = (EPGProgram) obj;
            ePGProgram.getClass();
            if (System.currentTimeMillis() < ePGProgram.f19741d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1949j)) {
            return false;
        }
        C1949j c1949j = (C1949j) obj;
        return kotlin.jvm.internal.m.a(this.f20780a, c1949j.f20780a) && kotlin.jvm.internal.m.a(this.f20781b, c1949j.f20781b) && kotlin.jvm.internal.m.a(this.f20782c, c1949j.f20782c);
    }

    public final int hashCode() {
        int iHashCode = this.f20780a.hashCode() * 31;
        String str = this.f20781b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20782c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EPGChannelData(programs=");
        sb.append(this.f20780a);
        sb.append(", noEpgMessage=");
        sb.append(this.f20781b);
        sb.append(", noEpgSubtitle=");
        return Y6.f.m(sb, this.f20782c, ")");
    }

    public C1949j(ArrayList arrayList, String str, int i3) {
        this((i3 & 2) != 0 ? null : str, (String) null, (i3 & 1) != 0 ? p078i6.w.f23205h : arrayList);
    }
}
