package C7;

import java.io.IOException;
import java.util.Iterator;

public abstract class B extends a0 implements F7.f, F7.g {
    @Override
    public abstract B y0(boolean z6);

    @Override
    public abstract B A0(I i3);

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", p118n7.g.f25862e.w((O6.b) it.next(), null), "] "};
            for (int i3 = 0; i3 < 3; i3++) {
                sb.append(strArr[i3]);
            }
        }
        sb.append(u0());
        if (!s0().isEmpty()) {
            p078i6.o.n1(s0(), sb, ", ", "<", ">", null, 112);
        }
        if (v0()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
