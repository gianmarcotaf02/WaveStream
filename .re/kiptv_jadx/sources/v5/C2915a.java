package v5;

/* JADX INFO: renamed from: v5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2915a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f29389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f29390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlin.jvm.functions.Function0 f29391c;

    public C2915a(java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0) {
        this.f29389a = str;
        this.f29390b = str2;
        this.f29391c = function0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5.C2915a)) {
            return false;
        }
        v5.C2915a c2915a = (v5.C2915a) obj;
        return kotlin.jvm.internal.m.a(this.f29389a, c2915a.f29389a) && kotlin.jvm.internal.m.a(this.f29390b, c2915a.f29390b) && kotlin.jvm.internal.m.a(this.f29391c, c2915a.f29391c);
    }

    public final int hashCode() {
        return this.f29391c.hashCode() + B2.a.a(this.f29389a.hashCode() * 31, 31, this.f29390b);
    }

    public final java.lang.String toString() {
        return "EpgGroupConfirmation(title=" + this.f29389a + ", message=" + this.f29390b + ", action=" + this.f29391c + ")";
    }
}
