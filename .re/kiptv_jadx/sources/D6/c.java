package D6;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends D6.a {
    static {
        new D6.c((char) 1, (char) 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof D6.c)) {
            return false;
        }
        if (isEmpty() && ((D6.c) obj).isEmpty()) {
            return true;
        }
        D6.c cVar = (D6.c) obj;
        return this.f2451h == cVar.f2451h && this.f2452i == cVar.f2452i;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2451h * 31) + this.f2452i;
    }

    public final boolean isEmpty() {
        return kotlin.jvm.internal.m.f(this.f2451h, this.f2452i) > 0;
    }

    public final java.lang.String toString() {
        return this.f2451h + ".." + this.f2452i;
    }
}
