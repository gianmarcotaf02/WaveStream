package p110m7;

import java.io.Serializable;
import java.util.Collections;

public abstract class o extends AbstractC2629b implements Serializable {
    public static C2641n f(AbstractC2639l abstractC2639l, o oVar, int i3, K k9, Class cls) {
        return new C2641n(abstractC2639l, Collections.EMPTY_LIST, oVar, new C2640m(i3, k9, true), cls);
    }

    public static C2641n g(AbstractC2639l abstractC2639l, Serializable serializable, o oVar, int i3, M m8, Class cls) {
        return new C2641n(abstractC2639l, serializable, oVar, new C2640m(i3, m8, false), cls);
    }
}
