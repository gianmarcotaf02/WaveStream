package io.sentry.android.replay.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lio/sentry/android/replay/util/TextAttributes;", "", "Lx0/s;", androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_COLOR, "", "hasFillModifier", "<init>", "(Lx0/s;ZLkotlin/jvm/internal/f;)V", "component1-QN2ZGVo", "()Lx0/s;", "component1", "component2", "()Z", "copy-fRWUv9g", "(Lx0/s;Z)Lio/sentry/android/replay/util/TextAttributes;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lx0/s;", "getColor-QN2ZGVo", "Z", "getHasFillModifier", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class TextAttributes {
    public static final int $stable = 0;
    private final p188x0.C3098s color;
    private final boolean hasFillModifier;

    public /* synthetic */ TextAttributes(p188x0.C3098s c3098s, boolean z6, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(c3098s, z6);
    }

    /* JADX INFO: renamed from: copy-fRWUv9g$default, reason: not valid java name */
    public static /* synthetic */ io.sentry.android.replay.util.TextAttributes m518copyfRWUv9g$default(io.sentry.android.replay.util.TextAttributes textAttributes, p188x0.C3098s c3098s, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            c3098s = textAttributes.color;
        }
        if ((i3 & 2) != 0) {
            z6 = textAttributes.hasFillModifier;
        }
        return textAttributes.m520copyfRWUv9g(c3098s, z6);
    }

    /* JADX INFO: renamed from: component1-QN2ZGVo, reason: not valid java name and from getter */
    public final p188x0.C3098s getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasFillModifier() {
        return this.hasFillModifier;
    }

    /* JADX INFO: renamed from: copy-fRWUv9g, reason: not valid java name */
    public final io.sentry.android.replay.util.TextAttributes m520copyfRWUv9g(p188x0.C3098s color, boolean hasFillModifier) {
        return new io.sentry.android.replay.util.TextAttributes(color, hasFillModifier, null);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.sentry.android.replay.util.TextAttributes)) {
            return false;
        }
        io.sentry.android.replay.util.TextAttributes textAttributes = (io.sentry.android.replay.util.TextAttributes) other;
        return kotlin.jvm.internal.m.a(this.color, textAttributes.color) && this.hasFillModifier == textAttributes.hasFillModifier;
    }

    /* JADX INFO: renamed from: getColor-QN2ZGVo, reason: not valid java name */
    public final p188x0.C3098s m521getColorQN2ZGVo() {
        return this.color;
    }

    public final boolean getHasFillModifier() {
        return this.hasFillModifier;
    }

    public int hashCode() {
        p188x0.C3098s c3098s = this.color;
        return java.lang.Boolean.hashCode(this.hasFillModifier) + ((c3098s == null ? 0 : java.lang.Long.hashCode(c3098s.f31129a)) * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextAttributes(color=");
        sb.append(this.color);
        sb.append(", hasFillModifier=");
        return v5.L.a(sb, this.hasFillModifier, ')');
    }

    private TextAttributes(p188x0.C3098s c3098s, boolean z6) {
        this.color = c3098s;
        this.hasFillModifier = z6;
    }
}
