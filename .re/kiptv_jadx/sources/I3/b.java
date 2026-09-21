package I3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends java.lang.RuntimeException {
    public b(java.lang.String str, android.os.Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        int length = java.lang.String.valueOf(str).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 13 + java.lang.String.valueOf(iDataPosition).length() + 6 + java.lang.String.valueOf(iDataSize).length());
        sb.append(str);
        sb.append(" Parcel: pos=");
        sb.append(iDataPosition);
        sb.append(" size=");
        sb.append(iDataSize);
        super(sb.toString());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i3) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        switch (i3) {
            case 12:
                break;
        }
    }
}
