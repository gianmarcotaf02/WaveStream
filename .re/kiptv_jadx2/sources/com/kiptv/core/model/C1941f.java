package com.kiptv.core.model;

import java.util.ArrayList;
import java.util.Set;

public final class C1941f {
    public static final C1939e Companion = new C1939e();

    public static final Set f20750b = p078i6.m.F0(new String[]{"Screenplay", "Writer", "Teleplay"});

    public static final Set f20751c = p078i6.m.F0(new String[]{"Original Music Composer", "Music", "Main Title Theme Composer"});

    public final ArrayList f20752a;

    public C1941f(ArrayList arrayList) {
        this.f20752a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1941f) && this.f20752a.equals(((C1941f) obj).f20752a);
    }

    public final int hashCode() {
        return this.f20752a.hashCode();
    }

    public final String toString() {
        return "DetailInfoData(rows=" + this.f20752a + ")";
    }
}
