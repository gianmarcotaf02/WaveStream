package R0;

import java.text.BreakIterator;

public final class C0817d extends AbstractC0815c {

    public static C0817d f8888e;

    public static C0817d f8889f;

    public final int f8890c;

    public BreakIterator f8891d;

    @Override
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
                    BreakIterator breakIterator = this.f8891d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i3)) {
                        BreakIterator breakIterator2 = this.f8891d;
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
                    BreakIterator breakIterator3 = this.f8891d;
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
                    BreakIterator breakIterator4 = this.f8891d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    i3 = breakIterator4.following(i3);
                    if (i3 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f8891d;
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

    @Override
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
                    BreakIterator breakIterator = this.f8891d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i3)) {
                        BreakIterator breakIterator2 = this.f8891d;
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
                    BreakIterator breakIterator3 = this.f8891d;
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
                    BreakIterator breakIterator4 = this.f8891d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    i3 = breakIterator4.preceding(i3);
                    if (i3 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f8891d;
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

    public final void q(String str) {
        switch (this.f8890c) {
            case 0:
                this.f8882a = str;
                BreakIterator breakIterator = this.f8891d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.m.k("impl");
                    throw null;
                }
            default:
                this.f8882a = str;
                BreakIterator breakIterator2 = this.f8891d;
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
        return Character.isLetterOrDigit(k().codePointAt(i3));
    }
}
