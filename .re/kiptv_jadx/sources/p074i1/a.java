package p074i1;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Locale f22746a;

    public a(java.util.Locale locale) {
        this.f22746a = locale;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof p074i1.a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return kotlin.jvm.internal.m.a(this.f22746a.toLanguageTag(), ((p074i1.a) obj).f22746a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f22746a.toLanguageTag().hashCode();
    }

    public final java.lang.String toString() {
        return this.f22746a.toLanguageTag();
    }
}
