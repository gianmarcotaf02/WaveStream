package p036d8;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends java.lang.IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String msg, int i3) {
        super(msg);
        switch (i3) {
            case 1:
                kotlin.jvm.internal.m.e(msg, "msg");
                super(msg);
                break;
            default:
                kotlin.jvm.internal.m.e(msg, "message");
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String message, java.lang.Exception exc) {
        super(message, exc);
        kotlin.jvm.internal.m.e(message, "message");
    }
}
