package p103m;

/* JADX INFO: renamed from: m.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2555b0 extends p103m.C2553a0 {
    @Override // p103m.C2553a0, p103m.AbstractC2557c0
    public void a(android.text.StaticLayout.Builder builder, android.widget.TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // p103m.AbstractC2557c0
    public boolean b(android.widget.TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
