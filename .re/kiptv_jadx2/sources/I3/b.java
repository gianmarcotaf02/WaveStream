package I3;

import android.os.Parcel;

public final class b extends RuntimeException {
    public b(String str, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
        sb.append(str);
        sb.append(" Parcel: pos=");
        sb.append(iDataPosition);
        sb.append(" size=");
        sb.append(iDataSize);
        super(sb.toString());
    }

    public b(int i3) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        switch (i3) {
            case 12:
                break;
        }
    }
}
