package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final class CommandButton {
    private static final java.lang.String CUSTOM_COMMAND_PARAMETER_EXTRAS_KEY = "androidx.media3.session.CUSTOM_COMMAND_PARAMETER";
    private static final java.lang.String CUSTOM_COMMAND_PLAYER_COMMAND_PREFIX = "androidx.media3.session.PLAYER_COMMAND_";
    private static final java.lang.String CUSTOM_COMMAND_SESSION_COMMAND_PREFIX = "androidx.media3.session.SESSION_COMMAND_";
    public static final int ICON_ALBUM = 57369;
    public static final int ICON_ARTIST = 57370;
    public static final int ICON_BLOCK = 57675;
    public static final int ICON_BOOKMARK_FILLED = 1042534;
    public static final int ICON_BOOKMARK_UNFILLED = 59494;
    public static final int ICON_CHECK_CIRCLE_FILLED = 1042540;
    public static final int ICON_CHECK_CIRCLE_UNFILLED = 59500;
    public static final int ICON_CLOSED_CAPTIONS = 57372;
    public static final int ICON_CLOSED_CAPTIONS_OFF = 61916;
    public static final int ICON_FAST_FORWARD = 57375;
    public static final int ICON_FEED = 57573;
    public static final int ICON_FLAG_FILLED = 1040723;
    public static final int ICON_FLAG_UNFILLED = 57683;
    public static final int ICON_HEART_FILLED = 1042557;
    public static final int ICON_HEART_UNFILLED = 59517;
    public static final int ICON_MINUS = 57691;
    public static final int ICON_MINUS_CIRCLE_FILLED = 1040712;
    public static final int ICON_MINUS_CIRCLE_UNFILLED = 1040713;
    public static final int ICON_NEXT = 57412;
    public static final int ICON_PAUSE = 57396;
    public static final int ICON_PLAY = 57399;
    public static final int ICON_PLAYBACK_SPEED = 57448;
    public static final int ICON_PLAYBACK_SPEED_0_5 = 62690;
    public static final int ICON_PLAYBACK_SPEED_0_8 = 1045730;
    public static final int ICON_PLAYBACK_SPEED_1_0 = 61389;
    public static final int ICON_PLAYBACK_SPEED_1_2 = 62689;
    public static final int ICON_PLAYBACK_SPEED_1_5 = 62688;
    public static final int ICON_PLAYBACK_SPEED_1_8 = 1045728;
    public static final int ICON_PLAYBACK_SPEED_2_0 = 62699;
    public static final int ICON_PLAYLIST_ADD = 57403;
    public static final int ICON_PLAYLIST_REMOVE = 60288;
    public static final int ICON_PLUS = 57669;
    public static final int ICON_PLUS_CIRCLE_FILLED = 1040711;
    public static final int ICON_PLUS_CIRCLE_UNFILLED = 57671;
    public static final int ICON_PREVIOUS = 57413;
    public static final int ICON_QUALITY = 58409;
    public static final int ICON_QUEUE_ADD = 57436;
    public static final int ICON_QUEUE_NEXT = 57446;
    public static final int ICON_QUEUE_REMOVE = 57447;
    public static final int ICON_RADIO = 58654;
    public static final int ICON_REPEAT_ALL = 57408;
    public static final int ICON_REPEAT_OFF = 1040448;
    public static final int ICON_REPEAT_ONE = 57409;
    public static final int ICON_REWIND = 57376;
    public static final int ICON_SETTINGS = 59576;
    public static final int ICON_SHARE = 59405;
    public static final int ICON_SHUFFLE_OFF = 1040452;
    public static final int ICON_SHUFFLE_ON = 57411;
    public static final int ICON_SHUFFLE_STAR = 1040451;
    public static final int ICON_SIGNAL = 61512;
    public static final int ICON_SKIP_BACK = 57410;
    public static final int ICON_SKIP_BACK_10 = 57433;
    public static final int ICON_SKIP_BACK_15 = 1040473;
    public static final int ICON_SKIP_BACK_30 = 57434;
    public static final int ICON_SKIP_BACK_5 = 57435;
    public static final int ICON_SKIP_FORWARD = 63220;
    public static final int ICON_SKIP_FORWARD_10 = 57430;
    public static final int ICON_SKIP_FORWARD_15 = 1040470;
    public static final int ICON_SKIP_FORWARD_30 = 57431;
    public static final int ICON_SKIP_FORWARD_5 = 57432;
    public static final int ICON_STAR_FILLED = 1042488;
    public static final int ICON_STAR_UNFILLED = 59448;
    public static final int ICON_STOP = 57415;
    public static final int ICON_SUBTITLES = 57416;
    public static final int ICON_SUBTITLES_OFF = 61298;
    public static final int ICON_SYNC = 58919;
    public static final int ICON_THUMB_DOWN_FILLED = 1042651;
    public static final int ICON_THUMB_DOWN_UNFILLED = 59611;
    public static final int ICON_THUMB_UP_FILLED = 1042652;
    public static final int ICON_THUMB_UP_UNFILLED = 59612;
    public static final int ICON_UNDEFINED = 0;
    public static final int ICON_VOLUME_DOWN = 57421;
    public static final int ICON_VOLUME_OFF = 57423;
    public static final int ICON_VOLUME_UP = 57424;
    private static final java.lang.String INCORRECT_PARAMETER_TYPE_MESSAGE = "Parameter has incorrect type.";
    private static final int PARAMETER_TYPE_BOOLEAN = 3;
    private static final int PARAMETER_TYPE_FLOAT = 4;
    private static final int PARAMETER_TYPE_INT = 2;
    private static final int PARAMETER_TYPE_LONG = 1;
    private static final int PARAMETER_TYPE_MEDIA_ITEM = 6;
    private static final int PARAMETER_TYPE_MEDIA_METADATA = 7;
    private static final int PARAMETER_TYPE_NULL = 0;
    private static final int PARAMETER_TYPE_RATING = 5;
    private static final int PARAMETER_TYPE_TRACK_SELECTION_PARAMETERS = 8;
    public static final int SLOT_BACK = 2;
    public static final int SLOT_BACK_SECONDARY = 4;
    public static final int SLOT_CENTRAL = 1;
    public static final int SLOT_FORWARD = 3;
    public static final int SLOT_FORWARD_SECONDARY = 5;
    public static final int SLOT_OVERFLOW = 6;
    public final java.lang.CharSequence displayName;
    public final android.os.Bundle extras;
    public final int icon;
    public final int iconResId;
    public final android.net.Uri iconUri;
    public final boolean isEnabled;
    public final java.lang.Object parameter;
    public final int playerCommand;
    public final androidx.media3.session.SessionCommand sessionCommand;
    public final p107m4.a slots;
    private static final java.lang.String FIELD_SESSION_COMMAND = androidx.media3.common.util.Util.intToStringMaxRadix(0);
    private static final java.lang.String FIELD_PLAYER_COMMAND = androidx.media3.common.util.Util.intToStringMaxRadix(1);
    private static final java.lang.String FIELD_ICON_RES_ID = androidx.media3.common.util.Util.intToStringMaxRadix(2);
    private static final java.lang.String FIELD_DISPLAY_NAME = androidx.media3.common.util.Util.intToStringMaxRadix(3);
    private static final java.lang.String FIELD_EXTRAS = androidx.media3.common.util.Util.intToStringMaxRadix(4);
    private static final java.lang.String FIELD_ENABLED = androidx.media3.common.util.Util.intToStringMaxRadix(5);
    private static final java.lang.String FIELD_ICON_URI = androidx.media3.common.util.Util.intToStringMaxRadix(6);
    private static final java.lang.String FIELD_ICON = androidx.media3.common.util.Util.intToStringMaxRadix(7);
    private static final java.lang.String FIELD_SLOTS = androidx.media3.common.util.Util.intToStringMaxRadix(8);
    private static final java.lang.String FIELD_PARAMETER = androidx.media3.common.util.Util.intToStringMaxRadix(9);

    public static final class Builder {
        private java.lang.CharSequence displayName;
        private boolean enabled;
        private android.os.Bundle extras;
        private final int icon;
        private int iconResId;
        private android.net.Uri iconUri;
        private java.lang.Object parameter;
        private int playerCommand;
        private androidx.media3.session.SessionCommand sessionCommand;
        private p107m4.a slots;

        @java.lang.Deprecated
        public Builder() {
            this(0);
        }

        public androidx.media3.session.CommandButton build() {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.Z((this.sessionCommand == null) != (this.playerCommand == -1), "Exactly one of sessionCommand and playerCommand should be set");
            if (this.slots == null) {
                this.slots = new p107m4.a(new int[]{androidx.media3.session.CommandButton.getDefaultSlot(this.playerCommand, this.icon)});
            }
            return new androidx.media3.session.CommandButton(this.sessionCommand, this.playerCommand, this.icon, this.iconResId, this.iconUri, this.displayName, this.extras, this.enabled, this.slots, this.parameter);
        }

        public androidx.media3.session.CommandButton.Builder setCustomIconResId(int i3) {
            this.iconResId = i3;
            return this;
        }

        public androidx.media3.session.CommandButton.Builder setDisplayName(java.lang.CharSequence charSequence) {
            this.displayName = charSequence;
            return this;
        }

        public androidx.media3.session.CommandButton.Builder setEnabled(boolean z6) {
            this.enabled = z6;
            return this;
        }

        public androidx.media3.session.CommandButton.Builder setExtras(android.os.Bundle bundle) {
            this.extras = new android.os.Bundle(bundle);
            return this;
        }

        @java.lang.Deprecated
        public androidx.media3.session.CommandButton.Builder setIconResId(int i3) {
            return setCustomIconResId(i3);
        }

        public androidx.media3.session.CommandButton.Builder setIconUri(android.net.Uri uri) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.M(java.util.Objects.equals(uri.getScheme(), "content") || java.util.Objects.equals(uri.getScheme(), "android.resource"), "Only content or resource Uris are supported for CommandButton");
            this.iconUri = uri;
            return this;
        }

        public androidx.media3.session.CommandButton.Builder setPlayerCommand(int i3) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.M(this.sessionCommand == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
            this.playerCommand = i3;
            this.parameter = null;
            return this;
        }

        public androidx.media3.session.CommandButton.Builder setSessionCommand(androidx.media3.session.SessionCommand sessionCommand) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.U(sessionCommand, "sessionCommand should not be null.");
            com.google.android.gms.internal.play_billing.AbstractC1864o0.M(this.playerCommand == -1, "playerCommands is already set. Only one of sessionCommand and playerCommand should be set.");
            this.sessionCommand = sessionCommand;
            this.parameter = null;
            return this;
        }

        public androidx.media3.session.CommandButton.Builder setSlots(int... iArr) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.L(iArr.length != 0);
            p107m4.a aVar = p107m4.a.j;
            this.slots = iArr.length == 0 ? p107m4.a.j : new p107m4.a(java.util.Arrays.copyOf(iArr, iArr.length));
            return this;
        }

        public Builder(int i3) {
            this(i3, androidx.media3.session.CommandButton.getIconResIdForIconConstant(i3));
        }

        public Builder(int i3, int i9) {
            this.icon = i3;
            this.iconResId = i9;
            this.displayName = "";
            this.extras = android.os.Bundle.EMPTY;
            this.playerCommand = -1;
            this.enabled = true;
        }

        public androidx.media3.session.CommandButton.Builder setPlayerCommand(int i3, java.lang.Object obj) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.M(this.sessionCommand == null, "sessionCommand is already set. Only one of sessionCommand and playerCommand should be set.");
            this.playerCommand = i3;
            this.parameter = androidx.media3.session.CommandButton.verifyParameterType(obj, androidx.media3.session.CommandButton.getParameterTypeForPlayerCommand(i3));
            return this;
        }

        public androidx.media3.session.CommandButton.Builder setSessionCommand(androidx.media3.session.SessionCommand sessionCommand, java.lang.Object obj) {
            com.google.android.gms.internal.play_billing.AbstractC1864o0.U(sessionCommand, "sessionCommand should not be null.");
            com.google.android.gms.internal.play_billing.AbstractC1864o0.M(this.playerCommand == -1, "playerCommands is already set. Only one of sessionCommand and playerCommand should be set.");
            this.sessionCommand = sessionCommand;
            this.parameter = androidx.media3.session.CommandButton.verifyParameterType(obj, androidx.media3.session.CommandButton.getParameterTypeForSessionCommand(sessionCommand.commandCode));
            return this;
        }
    }

    public static final class DisplayConstraints {
        private final android.util.SparseArray<androidx.media3.common.Player.Commands> allowedPlayerCommandsPerSlot;
        private final android.util.SparseArray<androidx.media3.session.SessionCommands> allowedSessionCommandsPerSlot;
        private final android.util.SparseBooleanArray areCustomCommandsAllowedPerSlot;
        private final android.util.SparseIntArray maxButtonsPerSlot;

        public static final class Builder {
            private final android.util.SparseArray<androidx.media3.common.Player.Commands> allowedPlayerCommandsPerSlot;
            private final android.util.SparseArray<androidx.media3.session.SessionCommands> allowedSessionCommandsPerSlot;
            private final android.util.SparseBooleanArray areCustomCommandsAllowedPerSlot;
            private boolean buildCalled;
            private final android.util.SparseIntArray maxButtonsPerSlot;

            public Builder() {
                android.util.SparseIntArray sparseIntArray = new android.util.SparseIntArray();
                this.maxButtonsPerSlot = sparseIntArray;
                sparseIntArray.put(1, 1);
                sparseIntArray.put(2, 1);
                sparseIntArray.put(3, 1);
                sparseIntArray.put(6, androidx.media3.common.util.Log.LOG_LEVEL_OFF);
                this.allowedPlayerCommandsPerSlot = new android.util.SparseArray<>();
                this.allowedSessionCommandsPerSlot = new android.util.SparseArray<>();
                this.areCustomCommandsAllowedPerSlot = new android.util.SparseBooleanArray();
            }

            public androidx.media3.session.CommandButton.DisplayConstraints build() {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.Y(!this.buildCalled);
                this.buildCalled = true;
                return new androidx.media3.session.CommandButton.DisplayConstraints(this);
            }

            public androidx.media3.session.CommandButton.DisplayConstraints.Builder setAllowCustomCommandsForSlot(int i3, boolean z6) {
                this.areCustomCommandsAllowedPerSlot.put(i3, z6);
                return this;
            }

            public androidx.media3.session.CommandButton.DisplayConstraints.Builder setAllowedPlayerCommandsForSlot(int i3, androidx.media3.common.Player.Commands commands) {
                this.allowedPlayerCommandsPerSlot.put(i3, commands);
                return this;
            }

            public androidx.media3.session.CommandButton.DisplayConstraints.Builder setAllowedSessionCommandsForSlot(int i3, androidx.media3.session.SessionCommands sessionCommands) {
                this.allowedSessionCommandsPerSlot.put(i3, sessionCommands);
                return this;
            }

            public androidx.media3.session.CommandButton.DisplayConstraints.Builder setMaxButtonsForSlot(int i3, int i9) {
                com.google.android.gms.internal.play_billing.AbstractC1864o0.L(i9 >= 0);
                this.maxButtonsPerSlot.put(i3, i9);
                return this;
            }
        }

        private static androidx.media3.session.CommandButton createButton(int i3, int i9, androidx.media3.common.Player.Commands commands) {
            return new androidx.media3.session.CommandButton.Builder(i3).setPlayerCommand(i9).setEnabled(commands.contains(i9)).build();
        }

        private static androidx.media3.session.CommandButton createOppositeButton(androidx.media3.session.CommandButton commandButton, int i3, androidx.media3.common.Player player) {
            androidx.media3.common.Player.Commands availableCommands = player.getAvailableCommands();
            int oppositePlayerCommand = getOppositePlayerCommand(commandButton, i3, availableCommands);
            int oppositeIcon = getOppositeIcon(commandButton);
            if (oppositeIcon == 0) {
                oppositeIcon = getIconForPlayerCommand(oppositePlayerCommand, player);
            }
            return createButton(oppositeIcon, oppositePlayerCommand, availableCommands);
        }

        private static int getFirstAvailableOrFirstCommand(androidx.media3.common.Player.Commands commands, int... iArr) {
            for (int i3 : iArr) {
                if (commands.contains(i3)) {
                    return i3;
                }
            }
            return iArr[0];
        }

        private static int getIconForPlayerCommand(int i3, androidx.media3.common.Player player) {
            switch (i3) {
                case 6:
                case 7:
                    return androidx.media3.session.CommandButton.ICON_PREVIOUS;
                case 8:
                case 9:
                    return androidx.media3.session.CommandButton.ICON_NEXT;
                case 10:
                default:
                    throw new java.lang.UnsupportedOperationException();
                case 11:
                    long seekBackIncrement = player.getSeekBackIncrement();
                    if (seekBackIncrement >= 2500 && seekBackIncrement < 7500) {
                        return androidx.media3.session.CommandButton.ICON_SKIP_BACK_5;
                    }
                    if (seekBackIncrement >= 7500 && seekBackIncrement < 12500) {
                        return androidx.media3.session.CommandButton.ICON_SKIP_BACK_10;
                    }
                    if (seekBackIncrement < 12500 || seekBackIncrement >= 20000) {
                        return (seekBackIncrement < 20000 || seekBackIncrement >= 40000) ? androidx.media3.session.CommandButton.ICON_SKIP_BACK : androidx.media3.session.CommandButton.ICON_SKIP_BACK_30;
                    }
                    return androidx.media3.session.CommandButton.ICON_SKIP_BACK_15;
                case 12:
                    long seekForwardIncrement = player.getSeekForwardIncrement();
                    if (seekForwardIncrement >= 2500 && seekForwardIncrement < 7500) {
                        return androidx.media3.session.CommandButton.ICON_SKIP_FORWARD_5;
                    }
                    if (seekForwardIncrement >= 7500 && seekForwardIncrement < 12500) {
                        return androidx.media3.session.CommandButton.ICON_SKIP_FORWARD_10;
                    }
                    if (seekForwardIncrement < 12500 || seekForwardIncrement >= 20000) {
                        return (seekForwardIncrement < 20000 || seekForwardIncrement >= 40000) ? androidx.media3.session.CommandButton.ICON_SKIP_FORWARD : androidx.media3.session.CommandButton.ICON_SKIP_FORWARD_30;
                    }
                    return androidx.media3.session.CommandButton.ICON_SKIP_FORWARD_15;
            }
        }

        private static int getOppositeIcon(androidx.media3.session.CommandButton commandButton) {
            if (commandButton == null) {
                return 0;
            }
            switch (commandButton.icon) {
                case androidx.media3.session.CommandButton.ICON_FAST_FORWARD /* 57375 */:
                    return androidx.media3.session.CommandButton.ICON_REWIND;
                case androidx.media3.session.CommandButton.ICON_REWIND /* 57376 */:
                    return androidx.media3.session.CommandButton.ICON_FAST_FORWARD;
                case androidx.media3.session.CommandButton.ICON_SKIP_BACK /* 57410 */:
                    return androidx.media3.session.CommandButton.ICON_SKIP_FORWARD;
                case androidx.media3.session.CommandButton.ICON_NEXT /* 57412 */:
                    return androidx.media3.session.CommandButton.ICON_PREVIOUS;
                case androidx.media3.session.CommandButton.ICON_PREVIOUS /* 57413 */:
                    return androidx.media3.session.CommandButton.ICON_NEXT;
                case androidx.media3.session.CommandButton.ICON_SKIP_FORWARD /* 63220 */:
                    return androidx.media3.session.CommandButton.ICON_SKIP_BACK;
                default:
                    return 0;
            }
        }

        private static int getOppositePlayerCommand(androidx.media3.session.CommandButton commandButton, int i3, androidx.media3.common.Player.Commands commands) {
            if (commandButton != null) {
                switch (commandButton.playerCommand) {
                    case 6:
                        return 8;
                    case 7:
                        return 9;
                    case 8:
                        return 6;
                    case 9:
                        return 7;
                    case 11:
                        return 12;
                    case 12:
                        return 11;
                }
            }
            return i3 == 2 ? getFirstAvailableOrFirstCommand(commands, 7, 6, 11) : getFirstAvailableOrFirstCommand(commands, 9, 8, 12);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0020  */
        private boolean reserveSlotForButton(androidx.media3.session.CommandButton commandButton, int i3, android.util.SparseIntArray sparseIntArray) {
            boolean z6 = false;
            if (sparseIntArray.get(i3) == 0) {
                return false;
            }
            if (commandButton.playerCommand != -1) {
                androidx.media3.common.Player.Commands commands = this.allowedPlayerCommandsPerSlot.get(i3);
                if (commands == null || commands.contains(commandButton.playerCommand)) {
                    z6 = true;
                }
            } else {
                androidx.media3.session.SessionCommand sessionCommand = commandButton.sessionCommand;
                sessionCommand.getClass();
                if (sessionCommand.commandCode == 0) {
                    z6 = this.areCustomCommandsAllowedPerSlot.get(i3, true);
                } else {
                    androidx.media3.session.SessionCommands sessionCommands = this.allowedSessionCommandsPerSlot.get(i3);
                    if (sessionCommands == null || sessionCommands.contains(commandButton.sessionCommand)) {
                        z6 = true;
                    }
                }
            }
            if (z6) {
                sparseIntArray.put(i3, sparseIntArray.get(i3) - 1);
            }
            return z6;
        }

        public p076i4.AbstractC2186b0 resolve(java.util.List<androidx.media3.session.CommandButton> list, androidx.media3.common.Player player) {
            android.util.SparseIntArray sparseIntArrayClone = this.maxButtonsPerSlot.clone();
            p076i4.Y yS = p076i4.AbstractC2186b0.s();
            androidx.media3.session.CommandButton commandButton = null;
            androidx.media3.session.CommandButton commandButton2 = null;
            int i3 = 0;
            while (true) {
                if (i3 >= list.size()) {
                    break;
                }
                androidx.media3.session.CommandButton commandButton3 = list.get(i3);
                int i9 = 0;
                while (true) {
                    p107m4.a aVar = commandButton3.slots;
                    if (i9 >= aVar.f25392i) {
                        break;
                    }
                    int iB = aVar.b(i9);
                    if (reserveSlotForButton(commandButton3, iB, sparseIntArrayClone)) {
                        yS.c(commandButton3.copyWithSlots(new p107m4.a(new int[]{iB})));
                        if (commandButton != null || iB != 3) {
                            if (commandButton2 != null || iB != 2) {
                                break;
                            }
                            commandButton2 = commandButton3;
                            break;
                        }
                        commandButton = commandButton3;
                        break;
                    }
                    i9++;
                }
                i3++;
            }
            androidx.media3.common.Player.Commands availableCommands = player.getAvailableCommands();
            if (this.maxButtonsPerSlot.get(1) == sparseIntArrayClone.get(1)) {
                androidx.media3.session.CommandButton commandButtonCreateButton = createButton(androidx.media3.common.util.Util.shouldShowPlayButton(player) ? androidx.media3.session.CommandButton.ICON_PLAY : androidx.media3.session.CommandButton.ICON_PAUSE, 1, availableCommands);
                if (reserveSlotForButton(commandButtonCreateButton, 1, sparseIntArrayClone)) {
                    yS.c(commandButtonCreateButton);
                }
            }
            boolean z6 = commandButton2 == null && this.maxButtonsPerSlot.get(2) > 0;
            boolean z9 = commandButton == null && this.maxButtonsPerSlot.get(3) > 0;
            if (z6 && z9) {
                int firstAvailableOrFirstCommand = getFirstAvailableOrFirstCommand(availableCommands, 7, 9, 6, 8, 11, 12);
                androidx.media3.session.CommandButton commandButtonCreateButton2 = createButton(getIconForPlayerCommand(firstAvailableOrFirstCommand, player), firstAvailableOrFirstCommand, availableCommands);
                int iB2 = commandButtonCreateButton2.slots.b(0);
                if (reserveSlotForButton(commandButtonCreateButton2, iB2, sparseIntArrayClone)) {
                    yS.c(commandButtonCreateButton2);
                }
                int i10 = iB2 != 2 ? 2 : 3;
                androidx.media3.session.CommandButton commandButtonCreateOppositeButton = createOppositeButton(commandButtonCreateButton2, i10, player);
                if (reserveSlotForButton(commandButtonCreateOppositeButton, i10, sparseIntArrayClone)) {
                    yS.c(commandButtonCreateOppositeButton);
                }
            } else if (z6) {
                androidx.media3.session.CommandButton commandButtonCreateOppositeButton2 = createOppositeButton(commandButton, 2, player);
                if (reserveSlotForButton(commandButtonCreateOppositeButton2, 2, sparseIntArrayClone)) {
                    yS.c(commandButtonCreateOppositeButton2);
                }
            } else if (z9) {
                androidx.media3.session.CommandButton commandButtonCreateOppositeButton3 = createOppositeButton(commandButton2, 3, player);
                if (reserveSlotForButton(commandButtonCreateOppositeButton3, 3, sparseIntArrayClone)) {
                    yS.c(commandButtonCreateOppositeButton3);
                }
            }
            return yS.f();
        }

        private DisplayConstraints(androidx.media3.session.CommandButton.DisplayConstraints.Builder builder) {
            this.maxButtonsPerSlot = builder.maxButtonsPerSlot;
            this.allowedPlayerCommandsPerSlot = builder.allowedPlayerCommandsPerSlot;
            this.allowedSessionCommandsPerSlot = builder.allowedSessionCommandsPerSlot;
            this.areCustomCommandsAllowedPerSlot = builder.areCustomCommandsAllowedPerSlot;
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Icon {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Slot {
    }

    public static boolean containsButtonForSlot(java.util.List<androidx.media3.session.CommandButton> list, int i3) {
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (list.get(i9).slots.b(0) == i3) {
                return true;
            }
        }
        return false;
    }

    public static androidx.media3.session.CommandButton convertFromPredefinedCustomCommand(androidx.media3.session.SessionCommand sessionCommand) {
        if (isPredefinedPlayerCustomCommandButtonCode(sessionCommand.customAction)) {
            int predefinedCustomCommandCode = getPredefinedCustomCommandCode(sessionCommand.customAction, CUSTOM_COMMAND_PLAYER_COMMAND_PREFIX);
            return new androidx.media3.session.CommandButton.Builder(0).setPlayerCommand(predefinedCustomCommandCode, getParameterFromBundle(sessionCommand.customExtras, CUSTOM_COMMAND_PARAMETER_EXTRAS_KEY, getParameterTypeForPlayerCommand(predefinedCustomCommandCode), 9)).build();
        }
        int predefinedCustomCommandCode2 = getPredefinedCustomCommandCode(sessionCommand.customAction, CUSTOM_COMMAND_SESSION_COMMAND_PREFIX);
        return new androidx.media3.session.CommandButton.Builder(0).setSessionCommand(new androidx.media3.session.SessionCommand(predefinedCustomCommandCode2), getParameterFromBundle(sessionCommand.customExtras, CUSTOM_COMMAND_PARAMETER_EXTRAS_KEY, getParameterTypeForSessionCommand(predefinedCustomCommandCode2), 9)).build();
    }

    private androidx.media3.session.CommandButton convertToPredefinedCustomCommandButton(int i3, int i9) {
        java.lang.String str;
        androidx.media3.session.SessionCommand sessionCommand = this.sessionCommand;
        if (sessionCommand != null && sessionCommand.commandCode == 0) {
            return copyWithSlots(new p107m4.a(new int[]{i3}));
        }
        android.os.Bundle bundle = android.os.Bundle.EMPTY;
        if (this.parameter != null) {
            bundle = new android.os.Bundle();
            writeParameterToBundle(bundle, CUSTOM_COMMAND_PARAMETER_EXTRAS_KEY, i9);
        }
        if (this.sessionCommand != null) {
            str = CUSTOM_COMMAND_SESSION_COMMAND_PREFIX + this.sessionCommand.commandCode;
        } else {
            str = CUSTOM_COMMAND_PLAYER_COMMAND_PREFIX + this.playerCommand;
        }
        return new androidx.media3.session.CommandButton(new androidx.media3.session.SessionCommand(str, bundle), -1, this.icon, this.iconResId, this.iconUri, this.displayName, this.extras, this.isEnabled, new p107m4.a(new int[]{i3}), null);
    }

    public static p076i4.AbstractC2186b0 copyWithUnavailableButtonsDisabled(java.util.List<androidx.media3.session.CommandButton> list, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        p076i4.Y y = new p076i4.Y(4);
        for (int i3 = 0; i3 < list.size(); i3++) {
            androidx.media3.session.CommandButton commandButton = list.get(i3);
            if (isButtonCommandAvailable(commandButton, sessionCommands, commands)) {
                y.c(commandButton);
            } else {
                y.c(commandButton.copyWithIsEnabled(false));
            }
        }
        return y.f();
    }

    @java.lang.Deprecated
    public static androidx.media3.session.CommandButton fromBundle(android.os.Bundle bundle) {
        return fromBundle(bundle, 9);
    }

    public static p076i4.AbstractC2186b0 getCustomLayoutFromMediaButtonPreferences(java.util.List<androidx.media3.session.CommandButton> list, boolean z6, boolean z9, int i3) {
        int iB;
        if (list.isEmpty()) {
            p076i4.Z z10 = p076i4.AbstractC2186b0.f22868i;
            return p076i4.S0.f22832l;
        }
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < list.size(); i11++) {
            androidx.media3.session.CommandButton commandButton = list.get(i11);
            if (commandButton.isEnabled && commandButton.canExecuteAction()) {
                int i12 = 0;
                while (true) {
                    p107m4.a aVar = commandButton.slots;
                    if (i12 >= aVar.f25392i || (iB = aVar.b(i12)) == 6) {
                        break;
                    }
                    if (z6 && i9 == -1 && iB == 2) {
                        i9 = i11;
                        break;
                    }
                    if (z9 && i10 == -1 && iB == 3) {
                        i10 = i11;
                        break;
                    }
                    i12++;
                }
            }
        }
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        if (i9 != -1) {
            yS.c(list.get(i9).convertToPredefinedCustomCommandButton(2, i3));
        }
        if (i10 != -1) {
            yS.c(list.get(i10).convertToPredefinedCustomCommandButton(3, i3));
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            androidx.media3.session.CommandButton commandButton2 = list.get(i13);
            if (commandButton2.isEnabled && commandButton2.canExecuteAction() && i13 != i9 && i13 != i10 && commandButton2.slots.a(6)) {
                yS.c(commandButton2.convertToPredefinedCustomCommandButton(6, i3));
            }
        }
        return yS.f();
    }

    public static int getDefaultSlot(int i3, int i9) {
        if (i3 == 1 || i9 == 57399 || i9 == 57396) {
            return 1;
        }
        if (i3 == 11 || i3 == 7 || i3 == 6 || i9 == 57413 || i9 == 57376 || i9 == 57410 || i9 == 57435 || i9 == 57433 || i9 == 1040473 || i9 == 57434) {
            return 2;
        }
        return (i3 == 12 || i3 == 9 || i3 == 8 || i9 == 57412 || i9 == 57375 || i9 == 63220 || i9 == 57432 || i9 == 57430 || i9 == 1040470 || i9 == 57431) ? 3 : 6;
    }

    public static int getIconResIdForIconConstant(int i3) {
        switch (i3) {
            case ICON_ALBUM /* 57369 */:
                return androidx.media3.session.R.drawable.media3_icon_album;
            case ICON_ARTIST /* 57370 */:
                return androidx.media3.session.R.drawable.media3_icon_artist;
            case ICON_CLOSED_CAPTIONS /* 57372 */:
                return androidx.media3.session.R.drawable.media3_icon_closed_captions;
            case ICON_FAST_FORWARD /* 57375 */:
                return androidx.media3.session.R.drawable.media3_icon_fast_forward;
            case ICON_REWIND /* 57376 */:
                return androidx.media3.session.R.drawable.media3_icon_rewind;
            case ICON_PAUSE /* 57396 */:
                return androidx.media3.session.R.drawable.media3_icon_pause;
            case ICON_PLAY /* 57399 */:
                return androidx.media3.session.R.drawable.media3_icon_play;
            case ICON_PLAYLIST_ADD /* 57403 */:
                return androidx.media3.session.R.drawable.media3_icon_playlist_add;
            case ICON_REPEAT_ALL /* 57408 */:
                return androidx.media3.session.R.drawable.media3_icon_repeat_all;
            case ICON_REPEAT_ONE /* 57409 */:
                return androidx.media3.session.R.drawable.media3_icon_repeat_one;
            case ICON_SKIP_BACK /* 57410 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_back;
            case ICON_SHUFFLE_ON /* 57411 */:
                return androidx.media3.session.R.drawable.media3_icon_shuffle_on;
            case ICON_NEXT /* 57412 */:
                return androidx.media3.session.R.drawable.media3_icon_next;
            case ICON_PREVIOUS /* 57413 */:
                return androidx.media3.session.R.drawable.media3_icon_previous;
            case ICON_STOP /* 57415 */:
                return androidx.media3.session.R.drawable.media3_icon_stop;
            case ICON_SUBTITLES /* 57416 */:
                return androidx.media3.session.R.drawable.media3_icon_subtitles;
            case ICON_VOLUME_DOWN /* 57421 */:
                return androidx.media3.session.R.drawable.media3_icon_volume_down;
            case ICON_VOLUME_OFF /* 57423 */:
                return androidx.media3.session.R.drawable.media3_icon_volume_off;
            case ICON_VOLUME_UP /* 57424 */:
                return androidx.media3.session.R.drawable.media3_icon_volume_up;
            case ICON_SKIP_FORWARD_10 /* 57430 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_forward_10;
            case ICON_SKIP_FORWARD_30 /* 57431 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_forward_30;
            case ICON_SKIP_FORWARD_5 /* 57432 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_forward_5;
            case ICON_SKIP_BACK_10 /* 57433 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_back_10;
            case ICON_SKIP_BACK_30 /* 57434 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_back_30;
            case ICON_SKIP_BACK_5 /* 57435 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_back_5;
            case ICON_QUEUE_ADD /* 57436 */:
                return androidx.media3.session.R.drawable.media3_icon_queue_add;
            case ICON_QUEUE_NEXT /* 57446 */:
                return androidx.media3.session.R.drawable.media3_icon_queue_next;
            case ICON_QUEUE_REMOVE /* 57447 */:
                return androidx.media3.session.R.drawable.media3_icon_queue_remove;
            case ICON_PLAYBACK_SPEED /* 57448 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed;
            case ICON_FEED /* 57573 */:
                return androidx.media3.session.R.drawable.media3_icon_feed;
            case ICON_PLUS /* 57669 */:
                return androidx.media3.session.R.drawable.media3_icon_plus;
            case ICON_PLUS_CIRCLE_UNFILLED /* 57671 */:
                return androidx.media3.session.R.drawable.media3_icon_plus_circle_unfilled;
            case ICON_BLOCK /* 57675 */:
                return androidx.media3.session.R.drawable.media3_icon_block;
            case ICON_FLAG_UNFILLED /* 57683 */:
                return androidx.media3.session.R.drawable.media3_icon_flag_unfilled;
            case ICON_MINUS /* 57691 */:
                return androidx.media3.session.R.drawable.media3_icon_minus;
            case ICON_QUALITY /* 58409 */:
                return androidx.media3.session.R.drawable.media3_icon_quality;
            case ICON_RADIO /* 58654 */:
                return androidx.media3.session.R.drawable.media3_icon_radio;
            case ICON_SYNC /* 58919 */:
                return androidx.media3.session.R.drawable.media3_icon_sync;
            case ICON_SHARE /* 59405 */:
                return androidx.media3.session.R.drawable.media3_icon_share;
            case ICON_STAR_UNFILLED /* 59448 */:
                return androidx.media3.session.R.drawable.media3_icon_star_unfilled;
            case ICON_BOOKMARK_UNFILLED /* 59494 */:
                return androidx.media3.session.R.drawable.media3_icon_bookmark_unfilled;
            case ICON_CHECK_CIRCLE_UNFILLED /* 59500 */:
                return androidx.media3.session.R.drawable.media3_icon_check_circle_unfilled;
            case ICON_HEART_UNFILLED /* 59517 */:
                return androidx.media3.session.R.drawable.media3_icon_heart_unfilled;
            case ICON_SETTINGS /* 59576 */:
                return androidx.media3.session.R.drawable.media3_icon_settings;
            case ICON_THUMB_DOWN_UNFILLED /* 59611 */:
                return androidx.media3.session.R.drawable.media3_icon_thumb_down_unfilled;
            case ICON_THUMB_UP_UNFILLED /* 59612 */:
                return androidx.media3.session.R.drawable.media3_icon_thumb_up_unfilled;
            case ICON_PLAYLIST_REMOVE /* 60288 */:
                return androidx.media3.session.R.drawable.media3_icon_playlist_remove;
            case ICON_SUBTITLES_OFF /* 61298 */:
                return androidx.media3.session.R.drawable.media3_icon_subtitles_off;
            case ICON_PLAYBACK_SPEED_1_0 /* 61389 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed_1_0;
            case ICON_SIGNAL /* 61512 */:
                return androidx.media3.session.R.drawable.media3_icon_signal;
            case ICON_CLOSED_CAPTIONS_OFF /* 61916 */:
                return androidx.media3.session.R.drawable.media3_icon_closed_captions_off;
            case ICON_PLAYBACK_SPEED_1_5 /* 62688 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed_1_5;
            case ICON_PLAYBACK_SPEED_1_2 /* 62689 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed_1_2;
            case ICON_PLAYBACK_SPEED_0_5 /* 62690 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed_0_5;
            case ICON_PLAYBACK_SPEED_2_0 /* 62699 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed_2_0;
            case ICON_SKIP_FORWARD /* 63220 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_forward;
            case ICON_REPEAT_OFF /* 1040448 */:
                return androidx.media3.session.R.drawable.media3_icon_repeat_off;
            case ICON_SHUFFLE_STAR /* 1040451 */:
                return androidx.media3.session.R.drawable.media3_icon_shuffle_star;
            case ICON_SHUFFLE_OFF /* 1040452 */:
                return androidx.media3.session.R.drawable.media3_icon_shuffle_off;
            case ICON_SKIP_FORWARD_15 /* 1040470 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_forward_15;
            case ICON_SKIP_BACK_15 /* 1040473 */:
                return androidx.media3.session.R.drawable.media3_icon_skip_back_15;
            case ICON_PLUS_CIRCLE_FILLED /* 1040711 */:
                return androidx.media3.session.R.drawable.media3_icon_plus_circle_filled;
            case ICON_MINUS_CIRCLE_FILLED /* 1040712 */:
                return androidx.media3.session.R.drawable.media3_icon_minus_circle_filled;
            case ICON_MINUS_CIRCLE_UNFILLED /* 1040713 */:
                return androidx.media3.session.R.drawable.media3_icon_minus_circle_unfilled;
            case ICON_FLAG_FILLED /* 1040723 */:
                return androidx.media3.session.R.drawable.media3_icon_flag_filled;
            case ICON_STAR_FILLED /* 1042488 */:
                return androidx.media3.session.R.drawable.media3_icon_star_filled;
            case ICON_BOOKMARK_FILLED /* 1042534 */:
                return androidx.media3.session.R.drawable.media3_icon_bookmark_filled;
            case ICON_CHECK_CIRCLE_FILLED /* 1042540 */:
                return androidx.media3.session.R.drawable.media3_icon_check_circle_filled;
            case ICON_HEART_FILLED /* 1042557 */:
                return androidx.media3.session.R.drawable.media3_icon_heart_filled;
            case ICON_THUMB_DOWN_FILLED /* 1042651 */:
                return androidx.media3.session.R.drawable.media3_icon_thumb_down_filled;
            case ICON_THUMB_UP_FILLED /* 1042652 */:
                return androidx.media3.session.R.drawable.media3_icon_thumb_up_filled;
            case ICON_PLAYBACK_SPEED_1_8 /* 1045728 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed_1_8;
            case ICON_PLAYBACK_SPEED_0_8 /* 1045730 */:
                return androidx.media3.session.R.drawable.media3_icon_playback_speed_0_8;
            default:
                return 0;
        }
    }

    public static p076i4.AbstractC2186b0 getMediaButtonPreferencesFromCustomLayout(java.util.List<androidx.media3.session.CommandButton> list, androidx.media3.common.Player.Commands commands, android.os.Bundle bundle) {
        if (list.isEmpty()) {
            p076i4.Z z6 = p076i4.AbstractC2186b0.f22868i;
            return p076i4.S0.f22832l;
        }
        boolean zContainsAny = commands.containsAny(7, 6);
        boolean zContainsAny2 = commands.containsAny(9, 8);
        boolean z9 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", false);
        boolean z10 = bundle.getBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", false);
        int i3 = (zContainsAny || z9) ? -1 : 0;
        int i9 = (zContainsAny2 || z10) ? -1 : i3 == 0 ? 1 : 0;
        p076i4.Y yS = p076i4.AbstractC2186b0.s();
        for (int i10 = 0; i10 < list.size(); i10++) {
            androidx.media3.session.CommandButton commandButton = list.get(i10);
            if (i10 == i3) {
                if (i9 == -1) {
                    yS.c(commandButton.copyWithSlots(new p107m4.a(new int[]{2, 6})));
                } else {
                    yS.c(commandButton.copyWithSlots(new p107m4.a(new int[]{2, 3, 6})));
                }
            } else if (i10 == i9) {
                yS.c(commandButton.copyWithSlots(new p107m4.a(new int[]{3, 6})));
            } else {
                yS.c(commandButton.copyWithSlots(new p107m4.a(new int[]{6})));
            }
        }
        return yS.f();
    }

    private static java.lang.Object getParameterFromBundle(android.os.Bundle bundle, java.lang.String str, int i3, int i9) {
        if (!bundle.containsKey(str)) {
            return null;
        }
        switch (i3) {
            case 1:
                return java.lang.Long.valueOf(bundle.getLong(str));
            case 2:
                return java.lang.Integer.valueOf(bundle.getInt(str));
            case 3:
                return java.lang.Boolean.valueOf(bundle.getBoolean(str));
            case 4:
                return java.lang.Float.valueOf(bundle.getFloat(str));
            case 5:
                android.os.Bundle bundle2 = bundle.getBundle(str);
                bundle2.getClass();
                return androidx.media3.common.Rating.fromBundle(bundle2);
            case 6:
                android.os.Bundle bundle3 = bundle.getBundle(str);
                bundle3.getClass();
                return androidx.media3.common.MediaItem.fromBundle(bundle3, i9);
            case 7:
                android.os.Bundle bundle4 = bundle.getBundle(str);
                bundle4.getClass();
                return androidx.media3.common.MediaMetadata.fromBundle(bundle4, i9);
            case 8:
                android.os.Bundle bundle5 = bundle.getBundle(str);
                bundle5.getClass();
                return androidx.media3.common.TrackSelectionParameters.fromBundle(bundle5);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getParameterTypeForPlayerCommand(int i3) {
        if (i3 == 1) {
            return 3;
        }
        if (i3 == 5) {
            return 1;
        }
        if (i3 == 10) {
            return 2;
        }
        if (i3 == 19) {
            return 7;
        }
        if (i3 == 24) {
            return 4;
        }
        if (i3 == 29) {
            return 8;
        }
        if (i3 == 31) {
            return 6;
        }
        switch (i3) {
            case 13:
                return 4;
            case 14:
                return 3;
            case 15:
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getParameterTypeForSessionCommand(int i3) {
        return i3 == 40010 ? 5 : 0;
    }

    private static int getPredefinedCustomCommandCode(java.lang.String str, java.lang.String str2) {
        return java.lang.Integer.parseInt(str.substring(str2.length()));
    }

    public static boolean isButtonCommandAvailable(androidx.media3.session.CommandButton commandButton, androidx.media3.session.SessionCommands sessionCommands, androidx.media3.common.Player.Commands commands) {
        androidx.media3.session.SessionCommand sessionCommand = commandButton.sessionCommand;
        if (sessionCommand != null && sessionCommands.contains(sessionCommand)) {
            return true;
        }
        int i3 = commandButton.playerCommand;
        return i3 != -1 && commands.contains(i3);
    }

    public static boolean isPredefinedCustomCommandButtonCode(java.lang.String str) {
        return isPredefinedPlayerCustomCommandButtonCode(str) || isPredefinedSessionCustomCommandButtonCode(str);
    }

    private static boolean isPredefinedPlayerCustomCommandButtonCode(java.lang.String str) {
        return str.startsWith(CUSTOM_COMMAND_PLAYER_COMMAND_PREFIX);
    }

    private static boolean isPredefinedSessionCustomCommandButtonCode(java.lang.String str) {
        return str.startsWith(CUSTOM_COMMAND_SESSION_COMMAND_PREFIX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.Object verifyParameterType(java.lang.Object obj, int i3) {
        if (obj == null) {
            return null;
        }
        switch (i3) {
            case 1:
                if (obj instanceof java.lang.Integer) {
                    obj = java.lang.Long.valueOf(((java.lang.Integer) obj).longValue());
                }
                com.google.android.gms.internal.play_billing.AbstractC1864o0.M(obj instanceof java.lang.Long, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            case 2:
                com.google.android.gms.internal.play_billing.AbstractC1864o0.M(obj instanceof java.lang.Integer, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            case 3:
                com.google.android.gms.internal.play_billing.AbstractC1864o0.M(obj instanceof java.lang.Boolean, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            case 4:
                if (obj instanceof java.lang.Double) {
                    obj = java.lang.Float.valueOf(((java.lang.Double) obj).floatValue());
                }
                com.google.android.gms.internal.play_billing.AbstractC1864o0.M(obj instanceof java.lang.Float, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            case 5:
                com.google.android.gms.internal.play_billing.AbstractC1864o0.M(obj instanceof androidx.media3.common.Rating, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            case 6:
                com.google.android.gms.internal.play_billing.AbstractC1864o0.M(obj instanceof androidx.media3.common.MediaItem, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            case 7:
                com.google.android.gms.internal.play_billing.AbstractC1864o0.M(obj instanceof androidx.media3.common.MediaMetadata, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            case 8:
                com.google.android.gms.internal.play_billing.AbstractC1864o0.M(obj instanceof androidx.media3.common.TrackSelectionParameters, INCORRECT_PARAMETER_TYPE_MESSAGE);
                return obj;
            default:
                return null;
        }
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"parameter"})
    private void writeParameterToBundle(android.os.Bundle bundle, java.lang.String str, int i3) {
        androidx.media3.session.SessionCommand sessionCommand = this.sessionCommand;
        switch (sessionCommand != null ? getParameterTypeForSessionCommand(sessionCommand.commandCode) : getParameterTypeForPlayerCommand(this.playerCommand)) {
            case 1:
                bundle.putLong(str, ((java.lang.Long) this.parameter).longValue());
                break;
            case 2:
                bundle.putInt(str, ((java.lang.Integer) this.parameter).intValue());
                break;
            case 3:
                bundle.putBoolean(str, ((java.lang.Boolean) this.parameter).booleanValue());
                break;
            case 4:
                bundle.putFloat(str, ((java.lang.Float) this.parameter).floatValue());
                break;
            case 5:
                bundle.putBundle(str, ((androidx.media3.common.Rating) this.parameter).toBundle());
                break;
            case 6:
                bundle.putBundle(str, ((androidx.media3.common.MediaItem) this.parameter).toBundle(i3));
                break;
            case 7:
                bundle.putBundle(str, ((androidx.media3.common.MediaMetadata) this.parameter).toBundle(i3));
                break;
            case 8:
                bundle.putBundle(str, ((androidx.media3.common.TrackSelectionParameters) this.parameter).toBundle());
                break;
        }
    }

    public boolean canExecuteAction() {
        androidx.media3.session.SessionCommand sessionCommand = this.sessionCommand;
        if (sessionCommand != null) {
            int i3 = sessionCommand.commandCode;
            if (i3 != 0) {
                return i3 == 40010 && this.parameter != null;
            }
            return true;
        }
        int i9 = this.playerCommand;
        if (i9 != 19) {
            if (i9 != 24) {
                if (i9 != 29 && i9 != 31) {
                    switch (i9) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 11:
                        case 12:
                        case 14:
                            break;
                        case 5:
                        case 10:
                        case 13:
                        case 15:
                            break;
                        default:
                            return false;
                    }
                }
            }
            return true;
        }
        return this.parameter != null;
    }

    @com.google.errorprone.annotations.CheckReturnValue
    public androidx.media3.session.CommandButton copyWithIsEnabled(boolean z6) {
        return this.isEnabled == z6 ? this : new androidx.media3.session.CommandButton(this.sessionCommand, this.playerCommand, this.icon, this.iconResId, this.iconUri, this.displayName, new android.os.Bundle(this.extras), z6, this.slots, this.parameter);
    }

    @com.google.errorprone.annotations.CheckReturnValue
    public androidx.media3.session.CommandButton copyWithSlots(p107m4.a aVar) {
        return this.slots.equals(aVar) ? this : new androidx.media3.session.CommandButton(this.sessionCommand, this.playerCommand, this.icon, this.iconResId, this.iconUri, this.displayName, new android.os.Bundle(this.extras), this.isEnabled, aVar, this.parameter);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.media3.session.CommandButton)) {
            return false;
        }
        androidx.media3.session.CommandButton commandButton = (androidx.media3.session.CommandButton) obj;
        return java.util.Objects.equals(this.sessionCommand, commandButton.sessionCommand) && this.playerCommand == commandButton.playerCommand && this.icon == commandButton.icon && this.iconResId == commandButton.iconResId && java.util.Objects.equals(this.iconUri, commandButton.iconUri) && android.text.TextUtils.equals(this.displayName, commandButton.displayName) && this.isEnabled == commandButton.isEnabled && this.slots.equals(commandButton.slots) && java.util.Objects.equals(this.parameter, commandButton.parameter);
    }

    public void executeAction(androidx.media3.session.MediaController mediaController) {
        java.lang.Object obj;
        if (this.isEnabled) {
            androidx.media3.session.SessionCommand sessionCommand = this.sessionCommand;
            if (sessionCommand == null) {
                executePlayerAction(mediaController);
                return;
            }
            int i3 = sessionCommand.commandCode;
            if (i3 == 0) {
                sessionCommand.getClass();
                mediaController.sendCustomCommand(sessionCommand, this.extras);
            } else if (i3 == 40010 && (obj = this.parameter) != null) {
                mediaController.setRating((androidx.media3.common.Rating) obj);
            }
        }
    }

    public void executePlayerAction(androidx.media3.common.Player player) {
        if (this.isEnabled) {
            int i3 = this.playerCommand;
            if (i3 == 19) {
                java.lang.Object obj = this.parameter;
                if (obj != null) {
                    player.setPlaylistMetadata((androidx.media3.common.MediaMetadata) obj);
                    return;
                }
                return;
            }
            if (i3 == 24) {
                java.lang.Object obj2 = this.parameter;
                if (obj2 != null) {
                    player.setVolume(((java.lang.Float) obj2).floatValue());
                    return;
                } else if (player.getVolume() == 0.0f) {
                    player.unmute();
                    return;
                } else {
                    player.mute();
                    return;
                }
            }
            if (i3 == 29) {
                java.lang.Object obj3 = this.parameter;
                if (obj3 != null) {
                    player.setTrackSelectionParameters((androidx.media3.common.TrackSelectionParameters) obj3);
                    return;
                }
                return;
            }
            if (i3 == 31) {
                java.lang.Object obj4 = this.parameter;
                if (obj4 != null) {
                    player.setMediaItem((androidx.media3.common.MediaItem) obj4);
                    return;
                }
                return;
            }
            switch (i3) {
                case 1:
                    java.lang.Object obj5 = this.parameter;
                    if (obj5 == null) {
                        player.setPlayWhenReady(!player.getPlayWhenReady());
                    } else {
                        player.setPlayWhenReady(((java.lang.Boolean) obj5).booleanValue());
                    }
                    break;
                case 2:
                    player.prepare();
                    break;
                case 3:
                    player.stop();
                    break;
                case 4:
                    player.seekToDefaultPosition();
                    break;
                case 5:
                    java.lang.Object obj6 = this.parameter;
                    if (obj6 != null) {
                        player.seekTo(((java.lang.Long) obj6).longValue());
                    }
                    break;
                case 6:
                    player.seekToPreviousMediaItem();
                    break;
                case 7:
                    player.seekToPrevious();
                    break;
                case 8:
                    player.seekToNextMediaItem();
                    break;
                case 9:
                    player.seekToNext();
                    break;
                case 10:
                    java.lang.Object obj7 = this.parameter;
                    if (obj7 != null) {
                        player.seekToDefaultPosition(((java.lang.Integer) obj7).intValue());
                    }
                    break;
                case 11:
                    player.seekBack();
                    break;
                case 12:
                    player.seekForward();
                    break;
                case 13:
                    java.lang.Object obj8 = this.parameter;
                    if (obj8 != null) {
                        player.setPlaybackSpeed(((java.lang.Float) obj8).floatValue());
                    }
                    break;
                case 14:
                    java.lang.Object obj9 = this.parameter;
                    if (obj9 == null) {
                        player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                    } else {
                        player.setShuffleModeEnabled(((java.lang.Boolean) obj9).booleanValue());
                    }
                    break;
                case 15:
                    java.lang.Object obj10 = this.parameter;
                    if (obj10 != null) {
                        player.setRepeatMode(((java.lang.Integer) obj10).intValue());
                    }
                    break;
            }
        }
    }

    public int hashCode() {
        return java.util.Objects.hash(this.sessionCommand, java.lang.Integer.valueOf(this.playerCommand), java.lang.Integer.valueOf(this.icon), java.lang.Integer.valueOf(this.iconResId), this.displayName, java.lang.Boolean.valueOf(this.isEnabled), this.iconUri, this.slots, this.parameter);
    }

    public boolean isPlayRequestPlayerAction(androidx.media3.common.Player player) {
        if (this.playerCommand != 1) {
            return false;
        }
        java.lang.Object obj = this.parameter;
        if (obj == null) {
            return !player.getPlayWhenReady();
        }
        return ((java.lang.Boolean) obj).booleanValue();
    }

    @java.lang.Deprecated
    public android.os.Bundle toBundle() {
        return toBundle(9);
    }

    private CommandButton(androidx.media3.session.SessionCommand sessionCommand, int i3, int i9, int i10, android.net.Uri uri, java.lang.CharSequence charSequence, android.os.Bundle bundle, boolean z6, p107m4.a aVar, java.lang.Object obj) {
        this.sessionCommand = sessionCommand;
        this.playerCommand = i3;
        this.icon = i9;
        this.iconResId = i10;
        this.iconUri = uri;
        this.displayName = charSequence;
        this.extras = new android.os.Bundle(bundle);
        this.isEnabled = z6;
        this.slots = aVar;
        this.parameter = obj;
    }

    public static androidx.media3.session.CommandButton fromBundle(android.os.Bundle bundle, int i3) {
        android.os.Bundle bundle2 = bundle.getBundle(FIELD_SESSION_COMMAND);
        androidx.media3.session.SessionCommand sessionCommandFromBundle = bundle2 == null ? null : androidx.media3.session.SessionCommand.fromBundle(bundle2);
        int i9 = bundle.getInt(FIELD_PLAYER_COMMAND, -1);
        int i10 = bundle.getInt(FIELD_ICON_RES_ID, 0);
        java.lang.CharSequence charSequence = bundle.getCharSequence(FIELD_DISPLAY_NAME, "");
        android.os.Bundle bundleConvertToNullIfInvalid = androidx.media3.common.util.Util.convertToNullIfInvalid(bundle.getBundle(FIELD_EXTRAS));
        boolean z6 = i3 < 3 || bundle.getBoolean(FIELD_ENABLED, true);
        android.net.Uri uri = (android.net.Uri) bundle.getParcelable(FIELD_ICON_URI);
        int i11 = bundle.getInt(FIELD_ICON, 0);
        int[] intArray = bundle.getIntArray(FIELD_SLOTS);
        androidx.media3.session.CommandButton.Builder builder = new androidx.media3.session.CommandButton.Builder(i11, i10);
        if (sessionCommandFromBundle != null) {
            builder.setSessionCommand(sessionCommandFromBundle, getParameterFromBundle(bundle, FIELD_PARAMETER, getParameterTypeForSessionCommand(sessionCommandFromBundle.commandCode), i3));
        }
        if (i9 != -1) {
            builder.setPlayerCommand(i9, getParameterFromBundle(bundle, FIELD_PARAMETER, getParameterTypeForPlayerCommand(i9), i3));
        }
        if (uri != null && (java.util.Objects.equals(uri.getScheme(), "content") || java.util.Objects.equals(uri.getScheme(), "android.resource"))) {
            builder.setIconUri(uri);
        }
        androidx.media3.session.CommandButton.Builder displayName = builder.setDisplayName(charSequence);
        if (bundleConvertToNullIfInvalid == null) {
            bundleConvertToNullIfInvalid = android.os.Bundle.EMPTY;
        }
        androidx.media3.session.CommandButton.Builder enabled = displayName.setExtras(bundleConvertToNullIfInvalid).setEnabled(z6);
        if (intArray == null) {
            intArray = new int[]{6};
        }
        return enabled.setSlots(intArray).build();
    }

    public android.os.Bundle toBundle(int i3) {
        android.os.Bundle bundle = new android.os.Bundle();
        androidx.media3.session.SessionCommand sessionCommand = this.sessionCommand;
        if (sessionCommand != null) {
            bundle.putBundle(FIELD_SESSION_COMMAND, sessionCommand.toBundle());
        }
        int i9 = this.playerCommand;
        if (i9 != -1) {
            bundle.putInt(FIELD_PLAYER_COMMAND, i9);
        }
        int i10 = this.icon;
        if (i10 != 0) {
            bundle.putInt(FIELD_ICON, i10);
        }
        int i11 = this.iconResId;
        if (i11 != 0) {
            bundle.putInt(FIELD_ICON_RES_ID, i11);
        }
        java.lang.CharSequence charSequence = this.displayName;
        if (charSequence != "") {
            bundle.putCharSequence(FIELD_DISPLAY_NAME, charSequence);
        }
        if (!this.extras.isEmpty()) {
            bundle.putBundle(FIELD_EXTRAS, this.extras);
        }
        android.net.Uri uri = this.iconUri;
        if (uri != null) {
            bundle.putParcelable(FIELD_ICON_URI, uri);
        }
        boolean z6 = this.isEnabled;
        if (!z6) {
            bundle.putBoolean(FIELD_ENABLED, z6);
        }
        p107m4.a aVar = this.slots;
        if (aVar.f25392i != 1 || aVar.b(0) != 6) {
            java.lang.String str = FIELD_SLOTS;
            p107m4.a aVar2 = this.slots;
            aVar2.getClass();
            bundle.putIntArray(str, java.util.Arrays.copyOfRange(aVar2.f25391h, 0, aVar2.f25392i));
        }
        if (this.parameter != null) {
            writeParameterToBundle(bundle, FIELD_PARAMETER, i3);
        }
        return bundle;
    }
}
