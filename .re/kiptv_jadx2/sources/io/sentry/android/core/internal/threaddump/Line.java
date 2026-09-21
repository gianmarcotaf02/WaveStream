package io.sentry.android.core.internal.threaddump;

public final class Line {
    public int lineno;
    public String text;

    public Line(int i3, String str) {
        this.lineno = i3;
        this.text = str;
    }
}
