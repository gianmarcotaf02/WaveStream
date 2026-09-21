package io.sentry.android.replay.util;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p188x0.C3098s;
import v5.L;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lio/sentry/android/replay/util/TextAttributes;", "", "Lx0/s;", TtmlNode.ATTR_TTS_COLOR, "", "hasFillModifier", "<init>", "(Lx0/s;ZLkotlin/jvm/internal/f;)V", "component1-QN2ZGVo", "()Lx0/s;", "component1", "component2", "()Z", "copy-fRWUv9g", "(Lx0/s;Z)Lio/sentry/android/replay/util/TextAttributes;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lx0/s;", "getColor-QN2ZGVo", "Z", "getHasFillModifier", "sentry-android-replay_release"}, k = 1, mv = {1, 6, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class TextAttributes {
    public static final int $stable = 0;
    private final C3098s color;
    private final boolean hasFillModifier;

    public TextAttributes(C3098s c3098s, boolean z6, AbstractC2541f abstractC2541f) {
        this(c3098s, z6);
    }

    public static TextAttributes m518copyfRWUv9g$default(TextAttributes textAttributes, C3098s c3098s, boolean z6, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            c3098s = textAttributes.color;
        }
        if ((i3 & 2) != 0) {
            z6 = textAttributes.hasFillModifier;
        }
        return textAttributes.m520copyfRWUv9g(c3098s, z6);
    }

    public final C3098s getColor() {
        return this.color;
    }

    public final boolean getHasFillModifier() {
        return this.hasFillModifier;
    }

    public final TextAttributes m520copyfRWUv9g(C3098s color, boolean hasFillModifier) {
        return new TextAttributes(color, hasFillModifier, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAttributes)) {
            return false;
        }
        TextAttributes textAttributes = (TextAttributes) other;
        return m.a(this.color, textAttributes.color) && this.hasFillModifier == textAttributes.hasFillModifier;
    }

    public final C3098s m521getColorQN2ZGVo() {
        return this.color;
    }

    public final boolean getHasFillModifier() {
        return this.hasFillModifier;
    }

    public int hashCode() {
        C3098s c3098s = this.color;
        return Boolean.hashCode(this.hasFillModifier) + ((c3098s == null ? 0 : Long.hashCode(c3098s.f31129a)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextAttributes(color=");
        sb.append(this.color);
        sb.append(", hasFillModifier=");
        return L.a(sb, this.hasFillModifier, ')');
    }

    private TextAttributes(C3098s c3098s, boolean z6) {
        this.color = c3098s;
        this.hasFillModifier = z6;
    }
}
