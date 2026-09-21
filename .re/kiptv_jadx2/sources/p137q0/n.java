package p137q0;

import p194x6.j;
import p194x6.m;

public interface n extends p {
    @Override
    default boolean a(j jVar) {
        return ((Boolean) jVar.invoke(this)).booleanValue();
    }

    @Override
    default Object c(Object obj, m mVar) {
        return mVar.invoke(obj, this);
    }
}
