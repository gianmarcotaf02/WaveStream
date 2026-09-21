package p015b5;

/* JADX INFO: loaded from: classes.dex */
public final class B extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.kiptv.core.local.datastore.LocalProgressEntry f17921h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f17922i;
    public final /* synthetic */ p015b5.D j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17923k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(p015b5.D d4, p117n6.c cVar) {
        super(cVar);
        this.j = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f17922i = obj;
        this.f17923k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}
