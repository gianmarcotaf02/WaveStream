package p068h4;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class k {

    public final String f22497a;

    public k(String str) {
        str.getClass();
        this.f22497a = str;
    }

    public static CharSequence c(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(c(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f22497a);
                    sb.append(c(it.next()));
                }
            }
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }

    public final String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }
}
