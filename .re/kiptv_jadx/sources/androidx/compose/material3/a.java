package androidx.compose.material3;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p188x0.InterfaceC3099t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.material3.DelegatingThemeAwareRippleNode f15816a;

    public a(androidx.compose.material3.DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.f15816a = delegatingThemeAwareRippleNode;
    }

    @Override // p188x0.InterfaceC3099t
    public final long a() {
        androidx.compose.material3.DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.f15816a;
        long jA = delegatingThemeAwareRippleNode.color.a();
        if (jA != 16) {
            return jA;
        }
        Z.C1135a0 c1135a0 = (Z.C1135a0) Q0.AbstractC0777k.h(delegatingThemeAwareRippleNode, Z.AbstractC1139c0.f12371b);
        if (c1135a0 != null) {
            long j = c1135a0.f12361a;
            if (j != 16) {
                return j;
            }
        }
        return ((p188x0.C3098s) Q0.AbstractC0777k.h(delegatingThemeAwareRippleNode, Z.AbstractC1177z.f12593a)).f31129a;
    }
}
