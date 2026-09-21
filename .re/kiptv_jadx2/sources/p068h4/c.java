package p068h4;

import java.util.Arrays;

public class c extends i {

    public final int f22490h = 1;

    public final Object f22491i;

    public c(i iVar) {
        iVar.getClass();
        this.f22491i = iVar;
    }

    @Override
    public final boolean apply(Object obj) {
        switch (this.f22490h) {
            case 0:
                break;
        }
        return c(((Character) obj).charValue());
    }

    @Override
    public final boolean c(char c9) {
        switch (this.f22490h) {
            case 0:
                return Arrays.binarySearch((char[]) this.f22491i, c9) >= 0;
            default:
                return !((i) this.f22491i).c(c9);
        }
    }

    @Override
    public i d() {
        switch (this.f22490h) {
            case 1:
                return (i) this.f22491i;
            default:
                return super.d();
        }
    }

    public final String toString() {
        switch (this.f22490h) {
            case 0:
                StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
                for (char c9 : (char[]) this.f22491i) {
                    sb.append(i.a(c9));
                }
                sb.append("\")");
                return sb.toString();
            default:
                return ((i) this.f22491i) + ".negate()";
        }
    }

    public c(String str) {
        char[] charArray = str.toString().toCharArray();
        this.f22491i = charArray;
        Arrays.sort(charArray);
    }
}
