package p063g8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m implements p063g8.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p063g8.u f22383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f22384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f22385c;

    public m(p063g8.u field, java.util.List list, java.lang.String str) {
        kotlin.jvm.internal.m.e(field, "field");
        this.f22383a = field;
        this.f22384b = list;
        this.f22385c = str;
        int size = list.size();
        int i3 = (field.f22397c - field.f22396b) + 1;
        if (size == i3) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The number of values (");
        sb.append(list.size());
        sb.append(") in ");
        sb.append(list);
        sb.append(" does not match the range of the field (");
        throw new java.lang.IllegalArgumentException(Y6.f.j(sb, i3, ')').toString());
    }

    @Override // p063g8.j
    public final h8.a a() {
        return new h8.a();
    }

    @Override // p063g8.j
    public final p080i8.p b() {
        p020c0.C1704s0 c1704s0 = new p020c0.C1704s0(6, this);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("one of ");
        java.util.List list = this.f22384b;
        sb.append(list);
        sb.append(" for ");
        sb.append(this.f22385c);
        return new p080i8.p(com.google.common.util.concurrent.P.i0(new p080i8.v(list, c1704s0, sb.toString())), p078i6.w.f23205h);
    }

    @Override // p063g8.j
    public final /* bridge */ /* synthetic */ p063g8.a c() {
        return this.f22383a;
    }
}
