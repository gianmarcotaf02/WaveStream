package p137q0;

/* JADX INFO: loaded from: classes.dex */
public interface n extends p137q0.p {
    @Override // p137q0.p
    default boolean a(p194x6.j jVar) {
        return ((java.lang.Boolean) jVar.invoke(this)).booleanValue();
    }

    @Override // p137q0.p
    default java.lang.Object c(java.lang.Object obj, p194x6.m mVar) {
        return mVar.invoke(obj, this);
    }
}
