package M;

import android.view.textclassifier.TextClassification;

public final class h extends b {

    public final TextClassification f7118b;

    public final int f7119c;

    public h(Object obj, TextClassification textClassification, int i3) {
        super(obj);
        this.f7118b = textClassification;
        this.f7119c = i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuRemoteActionItem(key=");
        sb.append(this.f7106a);
        sb.append(", textClassification=");
        sb.append(this.f7118b);
        sb.append(", index=");
        return Y6.f.j(sb, this.f7119c, ')');
    }
}
