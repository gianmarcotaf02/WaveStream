package h;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f22405a = {com.kiptv.tv.R.attr.background, com.kiptv.tv.R.attr.backgroundSplit, com.kiptv.tv.R.attr.backgroundStacked, com.kiptv.tv.R.attr.contentInsetEnd, com.kiptv.tv.R.attr.contentInsetEndWithActions, com.kiptv.tv.R.attr.contentInsetLeft, com.kiptv.tv.R.attr.contentInsetRight, com.kiptv.tv.R.attr.contentInsetStart, com.kiptv.tv.R.attr.contentInsetStartWithNavigation, com.kiptv.tv.R.attr.customNavigationLayout, com.kiptv.tv.R.attr.displayOptions, com.kiptv.tv.R.attr.divider, com.kiptv.tv.R.attr.elevation, com.kiptv.tv.R.attr.height, com.kiptv.tv.R.attr.hideOnContentScroll, com.kiptv.tv.R.attr.homeAsUpIndicator, com.kiptv.tv.R.attr.homeLayout, com.kiptv.tv.R.attr.icon, com.kiptv.tv.R.attr.indeterminateProgressStyle, com.kiptv.tv.R.attr.itemPadding, com.kiptv.tv.R.attr.logo, com.kiptv.tv.R.attr.navigationMode, com.kiptv.tv.R.attr.popupTheme, com.kiptv.tv.R.attr.progressBarPadding, com.kiptv.tv.R.attr.progressBarStyle, com.kiptv.tv.R.attr.subtitle, com.kiptv.tv.R.attr.subtitleTextStyle, com.kiptv.tv.R.attr.title, com.kiptv.tv.R.attr.titleTextStyle};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f22406b = {android.R.attr.layout_gravity};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f22407c = {android.R.attr.minWidth};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f22408d = {com.kiptv.tv.R.attr.background, com.kiptv.tv.R.attr.backgroundSplit, com.kiptv.tv.R.attr.closeItemLayout, com.kiptv.tv.R.attr.height, com.kiptv.tv.R.attr.subtitleTextStyle, com.kiptv.tv.R.attr.titleTextStyle};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f22409e = {android.R.attr.layout, com.kiptv.tv.R.attr.buttonIconDimen, com.kiptv.tv.R.attr.buttonPanelSideLayout, com.kiptv.tv.R.attr.listItemLayout, com.kiptv.tv.R.attr.listLayout, com.kiptv.tv.R.attr.multiChoiceItemLayout, com.kiptv.tv.R.attr.showTitle, com.kiptv.tv.R.attr.singleChoiceItemLayout};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f22410f = {android.R.attr.src, com.kiptv.tv.R.attr.srcCompat, com.kiptv.tv.R.attr.tint, com.kiptv.tv.R.attr.tintMode};
    public static final int[] g = {android.R.attr.thumb, com.kiptv.tv.R.attr.tickMark, com.kiptv.tv.R.attr.tickMarkTint, com.kiptv.tv.R.attr.tickMarkTintMode};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f22411h = {android.R.attr.textAppearance, android.R.attr.drawableTop, android.R.attr.drawableBottom, android.R.attr.drawableLeft, android.R.attr.drawableRight, android.R.attr.drawableStart, android.R.attr.drawableEnd};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f22412i = {android.R.attr.textAppearance, com.kiptv.tv.R.attr.autoSizeMaxTextSize, com.kiptv.tv.R.attr.autoSizeMinTextSize, com.kiptv.tv.R.attr.autoSizePresetSizes, com.kiptv.tv.R.attr.autoSizeStepGranularity, com.kiptv.tv.R.attr.autoSizeTextType, com.kiptv.tv.R.attr.drawableBottomCompat, com.kiptv.tv.R.attr.drawableEndCompat, com.kiptv.tv.R.attr.drawableLeftCompat, com.kiptv.tv.R.attr.drawableRightCompat, com.kiptv.tv.R.attr.drawableStartCompat, com.kiptv.tv.R.attr.drawableTint, com.kiptv.tv.R.attr.drawableTintMode, com.kiptv.tv.R.attr.drawableTopCompat, com.kiptv.tv.R.attr.emojiCompatEnabled, com.kiptv.tv.R.attr.firstBaselineToTopHeight, com.kiptv.tv.R.attr.fontFamily, com.kiptv.tv.R.attr.fontVariationSettings, com.kiptv.tv.R.attr.lastBaselineToBottomHeight, com.kiptv.tv.R.attr.lineHeight, com.kiptv.tv.R.attr.textAllCaps, com.kiptv.tv.R.attr.textLocale};
    public static final int[] j = {android.R.attr.windowIsFloating, android.R.attr.windowAnimationStyle, com.kiptv.tv.R.attr.actionBarDivider, com.kiptv.tv.R.attr.actionBarItemBackground, com.kiptv.tv.R.attr.actionBarPopupTheme, com.kiptv.tv.R.attr.actionBarSize, com.kiptv.tv.R.attr.actionBarSplitStyle, com.kiptv.tv.R.attr.actionBarStyle, com.kiptv.tv.R.attr.actionBarTabBarStyle, com.kiptv.tv.R.attr.actionBarTabStyle, com.kiptv.tv.R.attr.actionBarTabTextStyle, com.kiptv.tv.R.attr.actionBarTheme, com.kiptv.tv.R.attr.actionBarWidgetTheme, com.kiptv.tv.R.attr.actionButtonStyle, com.kiptv.tv.R.attr.actionDropDownStyle, com.kiptv.tv.R.attr.actionMenuTextAppearance, com.kiptv.tv.R.attr.actionMenuTextColor, com.kiptv.tv.R.attr.actionModeBackground, com.kiptv.tv.R.attr.actionModeCloseButtonStyle, com.kiptv.tv.R.attr.actionModeCloseContentDescription, com.kiptv.tv.R.attr.actionModeCloseDrawable, com.kiptv.tv.R.attr.actionModeCopyDrawable, com.kiptv.tv.R.attr.actionModeCutDrawable, com.kiptv.tv.R.attr.actionModeFindDrawable, com.kiptv.tv.R.attr.actionModePasteDrawable, com.kiptv.tv.R.attr.actionModePopupWindowStyle, com.kiptv.tv.R.attr.actionModeSelectAllDrawable, com.kiptv.tv.R.attr.actionModeShareDrawable, com.kiptv.tv.R.attr.actionModeSplitBackground, com.kiptv.tv.R.attr.actionModeStyle, com.kiptv.tv.R.attr.actionModeTheme, com.kiptv.tv.R.attr.actionModeWebSearchDrawable, com.kiptv.tv.R.attr.actionOverflowButtonStyle, com.kiptv.tv.R.attr.actionOverflowMenuStyle, com.kiptv.tv.R.attr.activityChooserViewStyle, com.kiptv.tv.R.attr.alertDialogButtonGroupStyle, com.kiptv.tv.R.attr.alertDialogCenterButtons, com.kiptv.tv.R.attr.alertDialogStyle, com.kiptv.tv.R.attr.alertDialogTheme, com.kiptv.tv.R.attr.autoCompleteTextViewStyle, com.kiptv.tv.R.attr.borderlessButtonStyle, com.kiptv.tv.R.attr.buttonBarButtonStyle, com.kiptv.tv.R.attr.buttonBarNegativeButtonStyle, com.kiptv.tv.R.attr.buttonBarNeutralButtonStyle, com.kiptv.tv.R.attr.buttonBarPositiveButtonStyle, com.kiptv.tv.R.attr.buttonBarStyle, com.kiptv.tv.R.attr.buttonStyle, com.kiptv.tv.R.attr.buttonStyleSmall, com.kiptv.tv.R.attr.checkboxStyle, com.kiptv.tv.R.attr.checkedTextViewStyle, com.kiptv.tv.R.attr.colorAccent, com.kiptv.tv.R.attr.colorBackgroundFloating, com.kiptv.tv.R.attr.colorButtonNormal, com.kiptv.tv.R.attr.colorControlActivated, com.kiptv.tv.R.attr.colorControlHighlight, com.kiptv.tv.R.attr.colorControlNormal, com.kiptv.tv.R.attr.colorError, com.kiptv.tv.R.attr.colorPrimary, com.kiptv.tv.R.attr.colorPrimaryDark, com.kiptv.tv.R.attr.colorSwitchThumbNormal, com.kiptv.tv.R.attr.controlBackground, com.kiptv.tv.R.attr.dialogCornerRadius, com.kiptv.tv.R.attr.dialogPreferredPadding, com.kiptv.tv.R.attr.dialogTheme, com.kiptv.tv.R.attr.dividerHorizontal, com.kiptv.tv.R.attr.dividerVertical, com.kiptv.tv.R.attr.dropDownListViewStyle, com.kiptv.tv.R.attr.dropdownListPreferredItemHeight, com.kiptv.tv.R.attr.editTextBackground, com.kiptv.tv.R.attr.editTextColor, com.kiptv.tv.R.attr.editTextStyle, com.kiptv.tv.R.attr.homeAsUpIndicator, com.kiptv.tv.R.attr.imageButtonStyle, com.kiptv.tv.R.attr.listChoiceBackgroundIndicator, com.kiptv.tv.R.attr.listChoiceIndicatorMultipleAnimated, com.kiptv.tv.R.attr.listChoiceIndicatorSingleAnimated, com.kiptv.tv.R.attr.listDividerAlertDialog, com.kiptv.tv.R.attr.listMenuViewStyle, com.kiptv.tv.R.attr.listPopupWindowStyle, com.kiptv.tv.R.attr.listPreferredItemHeight, com.kiptv.tv.R.attr.listPreferredItemHeightLarge, com.kiptv.tv.R.attr.listPreferredItemHeightSmall, com.kiptv.tv.R.attr.listPreferredItemPaddingEnd, com.kiptv.tv.R.attr.listPreferredItemPaddingLeft, com.kiptv.tv.R.attr.listPreferredItemPaddingRight, com.kiptv.tv.R.attr.listPreferredItemPaddingStart, com.kiptv.tv.R.attr.panelBackground, com.kiptv.tv.R.attr.panelMenuListTheme, com.kiptv.tv.R.attr.panelMenuListWidth, com.kiptv.tv.R.attr.popupMenuStyle, com.kiptv.tv.R.attr.popupWindowStyle, com.kiptv.tv.R.attr.radioButtonStyle, com.kiptv.tv.R.attr.ratingBarStyle, com.kiptv.tv.R.attr.ratingBarStyleIndicator, com.kiptv.tv.R.attr.ratingBarStyleSmall, com.kiptv.tv.R.attr.searchViewStyle, com.kiptv.tv.R.attr.seekBarStyle, com.kiptv.tv.R.attr.selectableItemBackground, com.kiptv.tv.R.attr.selectableItemBackgroundBorderless, com.kiptv.tv.R.attr.spinnerDropDownItemStyle, com.kiptv.tv.R.attr.spinnerStyle, com.kiptv.tv.R.attr.switchStyle, com.kiptv.tv.R.attr.textAppearanceLargePopupMenu, com.kiptv.tv.R.attr.textAppearanceListItem, com.kiptv.tv.R.attr.textAppearanceListItemSecondary, com.kiptv.tv.R.attr.textAppearanceListItemSmall, com.kiptv.tv.R.attr.textAppearancePopupMenuHeader, com.kiptv.tv.R.attr.textAppearanceSearchResultSubtitle, com.kiptv.tv.R.attr.textAppearanceSearchResultTitle, com.kiptv.tv.R.attr.textAppearanceSmallPopupMenu, com.kiptv.tv.R.attr.textColorAlertDialogListItem, com.kiptv.tv.R.attr.textColorSearchUrl, com.kiptv.tv.R.attr.toolbarNavigationButtonStyle, com.kiptv.tv.R.attr.toolbarStyle, com.kiptv.tv.R.attr.tooltipForegroundColor, com.kiptv.tv.R.attr.tooltipFrameBackground, com.kiptv.tv.R.attr.viewInflaterClass, com.kiptv.tv.R.attr.windowActionBar, com.kiptv.tv.R.attr.windowActionBarOverlay, com.kiptv.tv.R.attr.windowActionModeOverlay, com.kiptv.tv.R.attr.windowFixedHeightMajor, com.kiptv.tv.R.attr.windowFixedHeightMinor, com.kiptv.tv.R.attr.windowFixedWidthMajor, com.kiptv.tv.R.attr.windowFixedWidthMinor, com.kiptv.tv.R.attr.windowMinWidthMajor, com.kiptv.tv.R.attr.windowMinWidthMinor, com.kiptv.tv.R.attr.windowNoTitle};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f22413k = {com.kiptv.tv.R.attr.allowStacking};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f22414l = {android.R.attr.checkMark, com.kiptv.tv.R.attr.checkMarkCompat, com.kiptv.tv.R.attr.checkMarkTint, com.kiptv.tv.R.attr.checkMarkTintMode};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f22415m = {android.R.attr.button, com.kiptv.tv.R.attr.buttonCompat, com.kiptv.tv.R.attr.buttonTint, com.kiptv.tv.R.attr.buttonTintMode};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f22416n = {android.R.attr.gravity, android.R.attr.orientation, android.R.attr.baselineAligned, android.R.attr.baselineAlignedChildIndex, android.R.attr.weightSum, com.kiptv.tv.R.attr.divider, com.kiptv.tv.R.attr.dividerPadding, com.kiptv.tv.R.attr.measureWithLargestChild, com.kiptv.tv.R.attr.showDividers};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f22417o = {android.R.attr.dropDownHorizontalOffset, android.R.attr.dropDownVerticalOffset};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f22418p = {android.R.attr.enabled, android.R.attr.id, android.R.attr.visible, android.R.attr.menuCategory, android.R.attr.orderInCategory, android.R.attr.checkableBehavior};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f22419q = {android.R.attr.icon, android.R.attr.enabled, android.R.attr.id, android.R.attr.checked, android.R.attr.visible, android.R.attr.menuCategory, android.R.attr.orderInCategory, android.R.attr.title, android.R.attr.titleCondensed, android.R.attr.alphabeticShortcut, android.R.attr.numericShortcut, android.R.attr.checkable, android.R.attr.onClick, com.kiptv.tv.R.attr.actionLayout, com.kiptv.tv.R.attr.actionProviderClass, com.kiptv.tv.R.attr.actionViewClass, com.kiptv.tv.R.attr.alphabeticModifiers, com.kiptv.tv.R.attr.contentDescription, com.kiptv.tv.R.attr.iconTint, com.kiptv.tv.R.attr.iconTintMode, com.kiptv.tv.R.attr.numericModifiers, com.kiptv.tv.R.attr.showAsAction, com.kiptv.tv.R.attr.tooltipText};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f22420r = {android.R.attr.windowAnimationStyle, android.R.attr.itemTextAppearance, android.R.attr.horizontalDivider, android.R.attr.verticalDivider, android.R.attr.headerBackground, android.R.attr.itemBackground, android.R.attr.itemIconDisabledAlpha, com.kiptv.tv.R.attr.preserveIconSpacing, com.kiptv.tv.R.attr.subMenuArrow};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int[] f22421s = {android.R.attr.popupBackground, android.R.attr.popupAnimationStyle, com.kiptv.tv.R.attr.overlapAnchor};

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f22422t = {com.kiptv.tv.R.attr.paddingBottomNoButtons, com.kiptv.tv.R.attr.paddingTopNoTitle};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f22423u = {android.R.attr.entries, android.R.attr.popupBackground, android.R.attr.prompt, android.R.attr.dropDownWidth, com.kiptv.tv.R.attr.popupTheme};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int[] f22424v = {android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.textFontWeight, com.kiptv.tv.R.attr.fontFamily, com.kiptv.tv.R.attr.fontVariationSettings, com.kiptv.tv.R.attr.textAllCaps, com.kiptv.tv.R.attr.textLocale};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int[] f22425w = {android.R.attr.gravity, android.R.attr.minHeight, com.kiptv.tv.R.attr.buttonGravity, com.kiptv.tv.R.attr.collapseContentDescription, com.kiptv.tv.R.attr.collapseIcon, com.kiptv.tv.R.attr.contentInsetEnd, com.kiptv.tv.R.attr.contentInsetEndWithActions, com.kiptv.tv.R.attr.contentInsetLeft, com.kiptv.tv.R.attr.contentInsetRight, com.kiptv.tv.R.attr.contentInsetStart, com.kiptv.tv.R.attr.contentInsetStartWithNavigation, com.kiptv.tv.R.attr.logo, com.kiptv.tv.R.attr.logoDescription, com.kiptv.tv.R.attr.maxButtonHeight, com.kiptv.tv.R.attr.menu, com.kiptv.tv.R.attr.navigationContentDescription, com.kiptv.tv.R.attr.navigationIcon, com.kiptv.tv.R.attr.popupTheme, com.kiptv.tv.R.attr.subtitle, com.kiptv.tv.R.attr.subtitleTextAppearance, com.kiptv.tv.R.attr.subtitleTextColor, com.kiptv.tv.R.attr.title, com.kiptv.tv.R.attr.titleMargin, com.kiptv.tv.R.attr.titleMarginBottom, com.kiptv.tv.R.attr.titleMarginEnd, com.kiptv.tv.R.attr.titleMarginStart, com.kiptv.tv.R.attr.titleMarginTop, com.kiptv.tv.R.attr.titleMargins, com.kiptv.tv.R.attr.titleTextAppearance, com.kiptv.tv.R.attr.titleTextColor};

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f22426x = {android.R.attr.theme, android.R.attr.focusable, com.kiptv.tv.R.attr.paddingEnd, com.kiptv.tv.R.attr.paddingStart, com.kiptv.tv.R.attr.theme};
    public static final int[] y = {android.R.attr.background, com.kiptv.tv.R.attr.backgroundTint, com.kiptv.tv.R.attr.backgroundTintMode};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f22427z = {android.R.attr.id, android.R.attr.layout, android.R.attr.inflatedId};
}
