package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.ReplacementMode;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p078i6.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/models/StoreReplacementMode;", "Lcom/revenuecat/purchases/ReplacementMode;", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lh6/A;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class StoreReplacementMode implements ReplacementMode {
    public static final StoreReplacementMode CHARGE_FULL_PRICE;
    public static final StoreReplacementMode CHARGE_PRORATED_PRICE;
    public static final StoreReplacementMode DEFERRED;
    public static final StoreReplacementMode WITHOUT_PRORATION;
    public static final StoreReplacementMode WITH_TIME_PRORATION;
    private static final List<StoreReplacementMode> allModes;
    private final String name;

    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<StoreReplacementMode> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/models/StoreReplacementMode$Companion;", "", "()V", "CHARGE_FULL_PRICE", "Lcom/revenuecat/purchases/models/StoreReplacementMode;", "CHARGE_PRORATED_PRICE", "DEFERRED", "WITHOUT_PRORATION", "WITH_TIME_PRORATION", "allModes", "", "fromName", "name", "", "fromName$purchases_defaultsRelease", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final StoreReplacementMode fromName$purchases_defaultsRelease(String name) {
            Object next;
            m.e(name, "name");
            Iterator it = StoreReplacementMode.allModes.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (m.a(((StoreReplacementMode) next).getName(), name)) {
                    return (StoreReplacementMode) next;
                }
            }
            next = null;
            return (StoreReplacementMode) next;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Creator implements Parcelable.Creator<StoreReplacementMode> {
        @Override
        public final StoreReplacementMode createFromParcel(Parcel parcel) {
            m.e(parcel, "parcel");
            return new StoreReplacementMode(parcel.readString());
        }

        @Override
        public final StoreReplacementMode[] newArray(int i3) {
            return new StoreReplacementMode[i3];
        }
    }

    static {
        StoreReplacementMode storeReplacementMode = new StoreReplacementMode("WITHOUT_PRORATION");
        WITHOUT_PRORATION = storeReplacementMode;
        StoreReplacementMode storeReplacementMode2 = new StoreReplacementMode("WITH_TIME_PRORATION");
        WITH_TIME_PRORATION = storeReplacementMode2;
        StoreReplacementMode storeReplacementMode3 = new StoreReplacementMode("CHARGE_FULL_PRICE");
        CHARGE_FULL_PRICE = storeReplacementMode3;
        StoreReplacementMode storeReplacementMode4 = new StoreReplacementMode("CHARGE_PRORATED_PRICE");
        CHARGE_PRORATED_PRICE = storeReplacementMode4;
        StoreReplacementMode storeReplacementMode5 = new StoreReplacementMode("DEFERRED");
        DEFERRED = storeReplacementMode5;
        allModes = p.B0(storeReplacementMode, storeReplacementMode2, storeReplacementMode3, storeReplacementMode4, storeReplacementMode5);
    }

    public StoreReplacementMode(String name) {
        m.e(name, "name");
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StoreReplacementMode) && m.a(this.name, ((StoreReplacementMode) obj).name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return getName();
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        m.e(parcel, "out");
        parcel.writeString(this.name);
    }
}
