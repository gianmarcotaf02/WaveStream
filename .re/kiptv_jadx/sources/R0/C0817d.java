package R0;

/* JADX INFO: renamed from: R0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0817d extends R0.AbstractC0815c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static R0.C0817d f8888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static R0.C0817d f8889f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.text.BreakIterator f8891d;

    @Override // R0.AbstractC0815c
    public final int[] g(int i3) {
        switch (this.f8890c) {
            case 0:
                int length = k().length();
                if (length <= 0 || i3 >= length) {
                    return null;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                do {
                    java.text.BreakIterator breakIterator = this.f8891d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i3)) {
                        java.text.BreakIterator breakIterator2 = this.f8891d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.m.k("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i3);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return j(i3, iFollowing);
                    }
                    java.text.BreakIterator breakIterator3 = this.f8891d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    i3 = breakIterator3.following(i3);
                } while (i3 != -1);
                return null;
            default:
                if (k().length() <= 0 || i3 >= k().length()) {
                    return null;
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                while (!s(i3) && (!s(i3) || (i3 != 0 && s(i3 - 1)))) {
                    java.text.BreakIterator breakIterator4 = this.f8891d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    i3 = breakIterator4.following(i3);
                    if (i3 == -1) {
                        return null;
                    }
                }
                java.text.BreakIterator breakIterator5 = this.f8891d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.m.k("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i3);
                if (iFollowing2 == -1 || !r(iFollowing2)) {
                    return null;
                }
                return j(i3, iFollowing2);
        }
    }

    @Override // R0.AbstractC0815c
    public final int[] o(int i3) {
        switch (this.f8890c) {
            case 0:
                int length = k().length();
                if (length <= 0 || i3 <= 0) {
                    return null;
                }
                if (i3 > length) {
                    i3 = length;
                }
                do {
                    java.text.BreakIterator breakIterator = this.f8891d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i3)) {
                        java.text.BreakIterator breakIterator2 = this.f8891d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.m.k("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i3);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return j(iPreceding, i3);
                    }
                    java.text.BreakIterator breakIterator3 = this.f8891d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    i3 = breakIterator3.preceding(i3);
                } while (i3 != -1);
                return null;
            default:
                int length2 = k().length();
                if (length2 <= 0 || i3 <= 0) {
                    return null;
                }
                if (i3 > length2) {
                    i3 = length2;
                }
                while (i3 > 0 && !s(i3 - 1) && !r(i3)) {
                    java.text.BreakIterator breakIterator4 = this.f8891d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    i3 = breakIterator4.preceding(i3);
                    if (i3 == -1) {
                        return null;
                    }
                }
                java.text.BreakIterator breakIterator5 = this.f8891d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.m.k("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i3);
                if (iPreceding2 == -1 || !s(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !s(iPreceding2 - 1)) {
                    return j(iPreceding2, i3);
                }
                return null;
        }
    }

    public final void q(java.lang.String str) {
        switch (this.f8890c) {
            case 0:
                this.f8882a = str;
                java.text.BreakIterator breakIterator = this.f8891d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.m.k("impl");
                    throw null;
                }
            default:
                this.f8882a = str;
                java.text.BreakIterator breakIterator2 = this.f8891d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.m.k("impl");
                    throw null;
                }
        }
    }

    public boolean r(int i3) {
        if (i3 <= 0 || !s(i3 - 1)) {
            return false;
        }
        return i3 == k().length() || !s(i3);
    }

    public boolean s(int i3) {
        if (i3 < 0 || i3 >= k().length()) {
            return false;
        }
        return java.lang.Character.isLetterOrDigit(k().codePointAt(i3));
    }
}
