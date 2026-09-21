package androidx.media3.session.legacy;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements android.os.Parcelable {
    public static final long ACTION_FAST_FORWARD = 64;
    public static final long ACTION_PAUSE = 2;
    public static final long ACTION_PLAY = 4;
    public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024;
    public static final long ACTION_PLAY_FROM_SEARCH = 2048;
    public static final long ACTION_PLAY_FROM_URI = 8192;
    public static final long ACTION_PLAY_PAUSE = 512;
    public static final long ACTION_PREPARE = 16384;
    public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768;
    public static final long ACTION_PREPARE_FROM_SEARCH = 65536;
    public static final long ACTION_PREPARE_FROM_URI = 131072;
    public static final long ACTION_REWIND = 8;
    public static final long ACTION_SEEK_TO = 256;
    public static final long ACTION_SET_CAPTIONING_ENABLED = 1048576;
    public static final long ACTION_SET_PLAYBACK_SPEED = 4194304;
    public static final long ACTION_SET_RATING = 128;
    public static final long ACTION_SET_REPEAT_MODE = 262144;
    public static final long ACTION_SET_SHUFFLE_MODE = 2097152;

    @java.lang.Deprecated
    public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 524288;
    public static final long ACTION_SKIP_TO_NEXT = 32;
    public static final long ACTION_SKIP_TO_PREVIOUS = 16;
    public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096;
    public static final long ACTION_STOP = 1;
    public static final android.os.Parcelable.Creator<androidx.media3.session.legacy.PlaybackStateCompat> CREATOR = new android.os.Parcelable.Creator<androidx.media3.session.legacy.PlaybackStateCompat>() { // from class: androidx.media3.session.legacy.PlaybackStateCompat.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.session.legacy.PlaybackStateCompat createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.session.legacy.PlaybackStateCompat(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.session.legacy.PlaybackStateCompat[] newArray(int i3) {
            return new androidx.media3.session.legacy.PlaybackStateCompat[i3];
        }
    };
    public static final int ERROR_CODE_ACTION_ABORTED = 10;
    public static final int ERROR_CODE_APP_ERROR = 1;
    public static final int ERROR_CODE_AUTHENTICATION_EXPIRED = 3;
    public static final int ERROR_CODE_CONCURRENT_STREAM_LIMIT = 5;
    public static final int ERROR_CODE_CONTENT_ALREADY_PLAYING = 8;
    public static final int ERROR_CODE_END_OF_QUEUE = 11;
    public static final int ERROR_CODE_NOT_AVAILABLE_IN_REGION = 7;
    public static final int ERROR_CODE_NOT_SUPPORTED = 2;
    public static final int ERROR_CODE_PARENTAL_CONTROL_RESTRICTED = 6;
    public static final int ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED = 4;
    public static final int ERROR_CODE_SKIP_LIMIT_REACHED = 9;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 0;
    public static final long PLAYBACK_POSITION_UNKNOWN = -1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_GROUP = 3;
    public static final int REPEAT_MODE_INVALID = -1;
    public static final int REPEAT_MODE_NONE = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int SHUFFLE_MODE_ALL = 1;
    public static final int SHUFFLE_MODE_GROUP = 2;
    public static final int SHUFFLE_MODE_INVALID = -1;
    public static final int SHUFFLE_MODE_NONE = 0;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_CONNECTING = 8;
    public static final int STATE_ERROR = 7;
    public static final int STATE_FAST_FORWARDING = 4;
    public static final int STATE_NONE = 0;
    public static final int STATE_PAUSED = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_REWINDING = 5;
    public static final int STATE_SKIPPING_TO_NEXT = 10;
    public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
    public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
    public static final int STATE_STOPPED = 1;
    final long actions;
    final long activeItemId;
    final long bufferedPosition;
    java.util.List<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> customActions;
    final int errorCode;
    final java.lang.CharSequence errorMessage;
    final android.os.Bundle extras;
    final long position;
    final float speed;
    final int state;
    private android.media.session.PlaybackState stateFwk;
    final long updateTime;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Actions {
    }

    public static final class Builder {
        private long actions;
        private long activeItemId;
        private long bufferedPosition;
        private final java.util.List<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> customActions;
        private int errorCode;
        private java.lang.CharSequence errorMessage;
        private android.os.Bundle extras;
        private long position;
        private float rate;
        private int state;
        private long updateTime;

        public Builder() {
            this.customActions = new java.util.ArrayList();
            this.activeItemId = -1L;
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder addCustomAction(java.lang.String str, java.lang.String str2, int i3) {
            return addCustomAction(new androidx.media3.session.legacy.PlaybackStateCompat.CustomAction(str, str2, i3, null));
        }

        public androidx.media3.session.legacy.PlaybackStateCompat build() {
            return new androidx.media3.session.legacy.PlaybackStateCompat(this.state, this.position, this.bufferedPosition, this.rate, this.actions, this.errorCode, this.errorMessage, this.updateTime, this.customActions, this.activeItemId, this.extras);
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setActions(long j) {
            this.actions = j;
            return this;
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setActiveQueueItemId(long j) {
            this.activeItemId = j;
            return this;
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setBufferedPosition(long j) {
            this.bufferedPosition = j;
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setErrorMessage(java.lang.CharSequence charSequence) {
            this.errorMessage = charSequence;
            return this;
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setExtras(android.os.Bundle bundle) {
            this.extras = bundle;
            return this;
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setState(int i3, long j, float f9) {
            return setState(i3, j, f9, android.os.SystemClock.elapsedRealtime());
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder addCustomAction(androidx.media3.session.legacy.PlaybackStateCompat.CustomAction customAction) {
            this.customActions.add(customAction);
            return this;
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setErrorMessage(int i3, java.lang.CharSequence charSequence) {
            this.errorCode = i3;
            this.errorMessage = charSequence;
            return this;
        }

        public androidx.media3.session.legacy.PlaybackStateCompat.Builder setState(int i3, long j, float f9, long j9) {
            this.state = i3;
            this.position = j;
            this.updateTime = j9;
            this.rate = f9;
            return this;
        }

        public Builder(androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.customActions = arrayList;
            this.activeItemId = -1L;
            this.state = playbackStateCompat.state;
            this.position = playbackStateCompat.position;
            this.rate = playbackStateCompat.speed;
            this.updateTime = playbackStateCompat.updateTime;
            this.bufferedPosition = playbackStateCompat.bufferedPosition;
            this.actions = playbackStateCompat.actions;
            this.errorCode = playbackStateCompat.errorCode;
            this.errorMessage = playbackStateCompat.errorMessage;
            java.util.List<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> list = playbackStateCompat.customActions;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.activeItemId = playbackStateCompat.activeItemId;
            this.extras = playbackStateCompat.extras;
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MediaKeyAction {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ShuffleMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    public PlaybackStateCompat(int i3, long j, long j9, float f9, long j10, int i9, java.lang.CharSequence charSequence, long j11, java.util.List<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> list, long j12, android.os.Bundle bundle) {
        java.util.List<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> arrayList;
        this.state = i3;
        this.position = j;
        this.bufferedPosition = j9;
        this.speed = f9;
        this.actions = j10;
        this.errorCode = i9;
        this.errorMessage = charSequence;
        this.updateTime = j11;
        if (list == null) {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            arrayList = p076i4.S0.f22832l;
        } else {
            arrayList = new java.util.ArrayList<>(list);
        }
        this.customActions = arrayList;
        this.activeItemId = j12;
        this.extras = bundle;
    }

    public static androidx.media3.session.legacy.PlaybackStateCompat fromPlaybackState(android.media.session.PlaybackState playbackState) {
        java.util.ArrayList arrayList = null;
        if (playbackState == null) {
            return null;
        }
        java.util.List<android.media.session.PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new java.util.ArrayList(customActions.size());
            for (android.media.session.PlaybackState.CustomAction customAction : customActions) {
                if (customAction != null) {
                    arrayList.add(androidx.media3.session.legacy.PlaybackStateCompat.CustomAction.fromCustomAction(customAction));
                }
            }
        }
        androidx.media3.session.legacy.PlaybackStateCompat playbackStateCompat = new androidx.media3.session.legacy.PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), androidx.media3.common.util.Util.convertToNullIfInvalid(playbackState.getExtras()));
        playbackStateCompat.stateFwk = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getActions() {
        return this.actions;
    }

    public long getActiveQueueItemId() {
        return this.activeItemId;
    }

    public long getBufferedPosition() {
        return this.bufferedPosition;
    }

    public long getCurrentPosition(java.lang.Long l2) {
        return java.lang.Math.max(0L, this.position + ((long) (this.speed * (l2 != null ? l2.longValue() : android.os.SystemClock.elapsedRealtime() - this.updateTime))));
    }

    public java.util.List<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> getCustomActions() {
        return this.customActions;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public java.lang.CharSequence getErrorMessage() {
        return this.errorMessage;
    }

    public android.os.Bundle getExtras() {
        return this.extras;
    }

    public long getLastPositionUpdateTime() {
        return this.updateTime;
    }

    public float getPlaybackSpeed() {
        return this.speed;
    }

    public android.media.session.PlaybackState getPlaybackState() {
        if (this.stateFwk == null) {
            android.media.session.PlaybackState.Builder builder = new android.media.session.PlaybackState.Builder();
            builder.setState(this.state, this.position, this.speed, this.updateTime);
            builder.setBufferedPosition(this.bufferedPosition);
            builder.setActions(this.actions);
            builder.setErrorMessage(this.errorMessage);
            java.util.Iterator<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> it = this.customActions.iterator();
            while (it.hasNext()) {
                android.media.session.PlaybackState.CustomAction customAction = (android.media.session.PlaybackState.CustomAction) it.next().getCustomAction();
                if (customAction != null) {
                    builder.addCustomAction(customAction);
                }
            }
            builder.setActiveQueueItemId(this.activeItemId);
            builder.setExtras(this.extras);
            this.stateFwk = builder.build();
        }
        return this.stateFwk;
    }

    public long getPosition() {
        return this.position;
    }

    public int getState() {
        return this.state;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlaybackState {state=");
        sb.append(this.state);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", buffered position=");
        sb.append(this.bufferedPosition);
        sb.append(", speed=");
        sb.append(this.speed);
        sb.append(", updated=");
        sb.append(this.updateTime);
        sb.append(", actions=");
        sb.append(this.actions);
        sb.append(", error code=");
        sb.append(this.errorCode);
        sb.append(", error message=");
        sb.append(this.errorMessage);
        sb.append(", custom actions=");
        sb.append(this.customActions);
        sb.append(", active item id=");
        return Y6.f.g(this.activeItemId, "}", sb);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i3) {
        parcel.writeInt(this.state);
        parcel.writeLong(this.position);
        parcel.writeFloat(this.speed);
        parcel.writeLong(this.updateTime);
        parcel.writeLong(this.bufferedPosition);
        parcel.writeLong(this.actions);
        android.text.TextUtils.writeToParcel(this.errorMessage, parcel, i3);
        parcel.writeTypedList(this.customActions);
        parcel.writeLong(this.activeItemId);
        parcel.writeBundle(this.extras);
        parcel.writeInt(this.errorCode);
    }

    public static final class CustomAction implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> CREATOR = new android.os.Parcelable.Creator<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction>() { // from class: androidx.media3.session.legacy.PlaybackStateCompat.CustomAction.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.PlaybackStateCompat.CustomAction createFromParcel(android.os.Parcel parcel) {
                return new androidx.media3.session.legacy.PlaybackStateCompat.CustomAction(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public androidx.media3.session.legacy.PlaybackStateCompat.CustomAction[] newArray(int i3) {
                return new androidx.media3.session.legacy.PlaybackStateCompat.CustomAction[i3];
            }
        };
        private final java.lang.String action;
        private android.media.session.PlaybackState.CustomAction customActionFwk;
        private final android.os.Bundle extras;
        private final int icon;
        private final java.lang.CharSequence name;

        public static final class Builder {
            private final java.lang.String action;
            private android.os.Bundle extras;
            private final int icon;
            private final java.lang.CharSequence name;

            public Builder(java.lang.String str, java.lang.CharSequence charSequence, int i3) {
                if (android.text.TextUtils.isEmpty(str)) {
                    throw new java.lang.IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (android.text.TextUtils.isEmpty(charSequence)) {
                    throw new java.lang.IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i3 == 0) {
                    throw new java.lang.IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.action = str;
                this.name = charSequence;
                this.icon = i3;
            }

            public androidx.media3.session.legacy.PlaybackStateCompat.CustomAction build() {
                return new androidx.media3.session.legacy.PlaybackStateCompat.CustomAction(this.action, this.name, this.icon, this.extras);
            }

            public androidx.media3.session.legacy.PlaybackStateCompat.CustomAction.Builder setExtras(android.os.Bundle bundle) {
                this.extras = bundle;
                return this;
            }
        }

        public CustomAction(java.lang.String str, java.lang.CharSequence charSequence, int i3, android.os.Bundle bundle) {
            this.action = str;
            this.name = charSequence;
            this.icon = i3;
            this.extras = bundle;
        }

        public static androidx.media3.session.legacy.PlaybackStateCompat.CustomAction fromCustomAction(java.lang.Object obj) {
            android.media.session.PlaybackState.CustomAction customAction = (android.media.session.PlaybackState.CustomAction) obj;
            androidx.media3.session.legacy.PlaybackStateCompat.CustomAction customAction2 = new androidx.media3.session.legacy.PlaybackStateCompat.CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), androidx.media3.common.util.Util.convertToNullIfInvalid(customAction.getExtras()));
            customAction2.customActionFwk = customAction;
            return customAction2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public java.lang.String getAction() {
            return this.action;
        }

        public java.lang.Object getCustomAction() {
            android.media.session.PlaybackState.CustomAction customAction = this.customActionFwk;
            if (customAction != null) {
                return customAction;
            }
            android.media.session.PlaybackState.CustomAction.Builder builder = new android.media.session.PlaybackState.CustomAction.Builder(this.action, this.name, this.icon);
            builder.setExtras(this.extras);
            return builder.build();
        }

        public android.os.Bundle getExtras() {
            return this.extras;
        }

        public int getIcon() {
            return this.icon;
        }

        public java.lang.CharSequence getName() {
            return this.name;
        }

        public java.lang.String toString() {
            return "Action:mName='" + ((java.lang.Object) this.name) + ", mIcon=" + this.icon + ", mExtras=" + this.extras;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i3) {
            parcel.writeString(this.action);
            android.text.TextUtils.writeToParcel(this.name, parcel, i3);
            parcel.writeInt(this.icon);
            parcel.writeBundle(this.extras);
        }

        public CustomAction(android.os.Parcel parcel) {
            java.lang.String string = parcel.readString();
            string.getClass();
            this.action = string;
            java.lang.CharSequence charSequence = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            charSequence.getClass();
            this.name = charSequence;
            this.icon = parcel.readInt();
            this.extras = parcel.readBundle(androidx.media3.session.legacy.MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(android.os.Parcel parcel) {
        this.state = parcel.readInt();
        this.position = parcel.readLong();
        this.speed = parcel.readFloat();
        this.updateTime = parcel.readLong();
        this.bufferedPosition = parcel.readLong();
        this.actions = parcel.readLong();
        this.errorMessage = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        java.util.List<androidx.media3.session.legacy.PlaybackStateCompat.CustomAction> listCreateTypedArrayList = parcel.createTypedArrayList(androidx.media3.session.legacy.PlaybackStateCompat.CustomAction.CREATOR);
        if (listCreateTypedArrayList == null) {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            listCreateTypedArrayList = p076i4.S0.f22832l;
        }
        this.customActions = listCreateTypedArrayList;
        this.activeItemId = parcel.readLong();
        this.extras = parcel.readBundle(androidx.media3.session.legacy.MediaSessionCompat.class.getClassLoader());
        this.errorCode = parcel.readInt();
    }
}
