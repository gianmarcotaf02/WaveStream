package p068h4;

/* JADX INFO: loaded from: classes.dex */
public class c extends p068h4.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f22490h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f22491i;

    public c(p068h4.i iVar) {
        iVar.getClass();
        this.f22491i = iVar;
    }

    @Override // p068h4.l
    public final boolean apply(java.lang.Object obj) {
        switch (this.f22490h) {
            case 0:
                break;
        }
        return c(((java.lang.Character) obj).charValue());
    }

    @Override // p068h4.i
    public final boolean c(char c9) {
        switch (this.f22490h) {
            case 0:
                return java.util.Arrays.binarySearch((char[]) this.f22491i, c9) >= 0;
            default:
                return !((p068h4.i) this.f22491i).c(c9);
        }
    }

    @Override // p068h4.i
    public p068h4.i d() {
        switch (this.f22490h) {
            case 1:
                return (p068h4.i) this.f22491i;
            default:
                return super.d();
        }
    }

    public final java.lang.String toString() {
        switch (this.f22490h) {
            case 0:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("CharMatcher.anyOf(\"");
                for (char c9 : (char[]) this.f22491i) {
                    sb.append(p068h4.i.a(c9));
                }
                sb.append("\")");
                return sb.toString();
            default:
                return ((p068h4.i) this.f22491i) + ".negate()";
        }
    }

    public c(java.lang.String str) {
        char[] charArray = str.toString().toCharArray();
        this.f22491i = charArray;
        java.util.Arrays.sort(charArray);
    }
}
