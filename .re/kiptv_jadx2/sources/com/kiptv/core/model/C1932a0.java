package com.kiptv.core.model;

public final class C1932a0 extends AbstractC1938d0 {

    public final String f20738h;

    public final String f20739i;

    public C1932a0(String str, String str2) {
        this.f20738h = str;
        this.f20739i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1932a0)) {
            return false;
        }
        C1932a0 c1932a0 = (C1932a0) obj;
        return kotlin.jvm.internal.m.a(this.f20738h, c1932a0.f20738h) && kotlin.jvm.internal.m.a(this.f20739i, c1932a0.f20739i);
    }

    @Override
    public final String getMessage() {
        return this.f20738h;
    }

    public final int hashCode() {
        int iHashCode = this.f20738h.hashCode() * 31;
        String str = this.f20739i;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder("QuotaExceeded(message=");
        sb.append(this.f20738h);
        sb.append(", resetTime=");
        return Y6.f.m(sb, this.f20739i, ")");
    }
}
