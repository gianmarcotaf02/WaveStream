package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u000fJK\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\"\b\b\u0000\u0010\u0011*\u00020\u0010*\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0018\u00010\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\f\u0010\u0019J\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u00020\u001aH\u0002¢\u0006\u0004\b\f\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 ¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/utils/PaywallComponentsImagePreDownloader;", "", "", "shouldPredownloadImages", "Lcom/revenuecat/purchases/utils/CoilImageDownloader;", "coilImageDownloader", "<init>", "(ZLcom/revenuecat/purchases/utils/CoilImageDownloader;)V", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;", "paywallComponentsConfig", "", "Landroid/net/Uri;", "findImageUrisToDownload", "(Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;)Ljava/util/Set;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;)Ljava/util/Set;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "T", "", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentOverride;", "Lkotlin/Function1;", "extract", "imageUrisToDownload", "(Ljava/util/List;Lx6/j;)Ljava/util/Set;", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "(Lcom/revenuecat/purchases/paywalls/components/common/Background;)Ljava/util/Set;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)Ljava/util/Set;", "Lh6/A;", "preDownloadImages", "(Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;)V", "Z", "Lcom/revenuecat/purchases/utils/CoilImageDownloader;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PaywallComponentsImagePreDownloader {
    private final com.revenuecat.purchases.utils.CoilImageDownloader coilImageDownloader;
    private final boolean shouldPredownloadImages;

    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.PaywallComponentsImagePreDownloader$findImageUrisToDownload$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "invoke", "(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        public static final com.revenuecat.purchases.utils.PaywallComponentsImagePreDownloader.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.utils.PaywallComponentsImagePreDownloader.AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // p194x6.j
        public final java.lang.Boolean invoke(com.revenuecat.purchases.paywalls.components.PaywallComponent it) {
            kotlin.jvm.internal.m.e(it, "it");
            return java.lang.Boolean.TRUE;
        }
    }

    public PaywallComponentsImagePreDownloader(boolean z6, com.revenuecat.purchases.utils.CoilImageDownloader coilImageDownloader) {
        kotlin.jvm.internal.m.e(coilImageDownloader, "coilImageDownloader");
        this.shouldPredownloadImages = z6;
        this.coilImageDownloader = coilImageDownloader;
    }

    private final java.util.Set<android.net.Uri> findImageUrisToDownload(com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig paywallComponentsConfig) {
        com.revenuecat.purchases.paywalls.components.StackComponent stack;
        com.revenuecat.purchases.paywalls.components.StackComponent stack2;
        java.util.Set<android.net.Uri> setFindImageUrisToDownload = findImageUrisToDownload(paywallComponentsConfig.getStack());
        com.revenuecat.purchases.paywalls.components.HeaderComponent header = paywallComponentsConfig.getHeader();
        java.util.Set<android.net.Uri> setFindImageUrisToDownload2 = null;
        java.util.Set<android.net.Uri> setFindImageUrisToDownload3 = (header == null || (stack2 = header.getStack()) == null) ? null : findImageUrisToDownload(stack2);
        java.util.Set<android.net.Uri> set = p078i6.y.f23207h;
        if (setFindImageUrisToDownload3 == null) {
            setFindImageUrisToDownload3 = set;
        }
        java.util.LinkedHashSet linkedHashSetO0 = p078i6.I.o0(setFindImageUrisToDownload, setFindImageUrisToDownload3);
        com.revenuecat.purchases.paywalls.components.StickyFooterComponent stickyFooter = paywallComponentsConfig.getStickyFooter();
        if (stickyFooter != null && (stack = stickyFooter.getStack()) != null) {
            setFindImageUrisToDownload2 = findImageUrisToDownload(stack);
        }
        if (setFindImageUrisToDownload2 != null) {
            set = setFindImageUrisToDownload2;
        }
        return p078i6.I.o0(p078i6.I.o0(linkedHashSetO0, set), findImageUrisToDownload(paywallComponentsConfig.getBackground()));
    }

    private final <T extends com.revenuecat.purchases.paywalls.components.PartialComponent> java.util.Set<android.net.Uri> imageUrisToDownload(java.util.List<com.revenuecat.purchases.paywalls.components.common.ComponentOverride<T>> list, p194x6.j jVar) {
        if (list == null) {
            return p078i6.y.f23207h;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            p078i6.u.M0(linkedHashSet, (java.util.Set) jVar.invoke(((com.revenuecat.purchases.paywalls.components.common.ComponentOverride) it.next()).getProperties()));
        }
        return linkedHashSet;
    }

    public final void preDownloadImages(com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig paywallComponentsConfig) {
        kotlin.jvm.internal.m.e(paywallComponentsConfig, "paywallComponentsConfig");
        if (!this.shouldPredownloadImages) {
            com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
            com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.v("[Purchases] - " + logLevel.name(), "PaywallComponentsImagePreDownloader won't pre-download images");
                return;
            }
            return;
        }
        for (android.net.Uri uri : findImageUrisToDownload(paywallComponentsConfig)) {
            com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.DEBUG;
            com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
            if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                currentLogHandler2.d(com.google.android.gms.internal.play_billing.M0.m(logLevel2, new java.lang.StringBuilder("[Purchases] - ")), "Pre-downloading Paywall V2 image: " + uri);
            }
            this.coilImageDownloader.downloadImage(uri);
        }
    }

    public /* synthetic */ PaywallComponentsImagePreDownloader(boolean z6, com.revenuecat.purchases.utils.CoilImageDownloader coilImageDownloader, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? com.revenuecat.purchases.common.UtilsKt.getCanUsePaywallUI() : z6, coilImageDownloader);
    }

    private final java.util.Set<android.net.Uri> findImageUrisToDownload(com.revenuecat.purchases.paywalls.components.StackComponent stackComponent) {
        java.util.Set<android.net.Uri> setO0;
        java.util.List<com.revenuecat.purchases.paywalls.components.PaywallComponent> listFilter = com.revenuecat.purchases.utils.PaywallComponentFilterExtensionKt.filter(stackComponent, com.revenuecat.purchases.utils.PaywallComponentsImagePreDownloader.AnonymousClass1.INSTANCE);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (com.revenuecat.purchases.paywalls.components.PaywallComponent paywallComponent : listFilter) {
            if (paywallComponent instanceof com.revenuecat.purchases.paywalls.components.StackComponent) {
                com.revenuecat.purchases.paywalls.components.StackComponent stackComponent2 = (com.revenuecat.purchases.paywalls.components.StackComponent) paywallComponent;
                setO0 = p078i6.I.o0(findImageUrisToDownload(stackComponent2.getBackground()), imageUrisToDownload(stackComponent2.getOverrides(), new com.revenuecat.purchases.utils.PaywallComponentsImagePreDownloader$findImageUrisToDownload$2$1(this)));
            } else if (paywallComponent instanceof com.revenuecat.purchases.paywalls.components.IconComponent) {
                com.revenuecat.purchases.paywalls.components.IconComponent iconComponent = (com.revenuecat.purchases.paywalls.components.IconComponent) paywallComponent;
                setO0 = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.h0(android.net.Uri.parse(iconComponent.getBaseUrl()).buildUpon().appendEncodedPath(iconComponent.getFormats().getWebp()).build());
            } else if (paywallComponent instanceof com.revenuecat.purchases.paywalls.components.CarouselComponent) {
                com.revenuecat.purchases.paywalls.components.CarouselComponent carouselComponent = (com.revenuecat.purchases.paywalls.components.CarouselComponent) paywallComponent;
                setO0 = p078i6.I.o0(findImageUrisToDownload(carouselComponent.getBackground()), imageUrisToDownload(carouselComponent.getOverrides(), new com.revenuecat.purchases.utils.PaywallComponentsImagePreDownloader$findImageUrisToDownload$2$2(this)));
            } else if (paywallComponent instanceof com.revenuecat.purchases.paywalls.components.TabsComponent) {
                com.revenuecat.purchases.paywalls.components.TabsComponent tabsComponent = (com.revenuecat.purchases.paywalls.components.TabsComponent) paywallComponent;
                setO0 = p078i6.I.o0(findImageUrisToDownload(tabsComponent.getBackground()), imageUrisToDownload(tabsComponent.getOverrides(), new com.revenuecat.purchases.utils.PaywallComponentsImagePreDownloader$findImageUrisToDownload$2$3(this)));
            } else if (paywallComponent instanceof com.revenuecat.purchases.paywalls.components.ImageComponent) {
                com.revenuecat.purchases.paywalls.components.ImageComponent imageComponent = (com.revenuecat.purchases.paywalls.components.ImageComponent) paywallComponent;
                setO0 = p078i6.I.o0(findImageUrisToDownload(imageComponent.getSource()), imageUrisToDownload(imageComponent.getOverrides(), new com.revenuecat.purchases.utils.PaywallComponentsImagePreDownloader$findImageUrisToDownload$2$4(this)));
            } else {
                boolean z6 = paywallComponent instanceof com.revenuecat.purchases.paywalls.components.VideoComponent;
                java.util.Set<android.net.Uri> set = p078i6.y.f23207h;
                if (z6) {
                    com.revenuecat.purchases.paywalls.components.VideoComponent videoComponent = (com.revenuecat.purchases.paywalls.components.VideoComponent) paywallComponent;
                    com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls fallbackSource = videoComponent.getFallbackSource();
                    java.util.Set<android.net.Uri> setFindImageUrisToDownload = fallbackSource != null ? findImageUrisToDownload(fallbackSource) : null;
                    if (setFindImageUrisToDownload != null) {
                        set = setFindImageUrisToDownload;
                    }
                    setO0 = p078i6.I.o0(set, imageUrisToDownload(videoComponent.getOverrides(), new com.revenuecat.purchases.utils.PaywallComponentsImagePreDownloader$findImageUrisToDownload$2$5(this)));
                } else {
                    if (!(paywallComponent instanceof com.revenuecat.purchases.paywalls.components.ButtonComponent ? true : paywallComponent instanceof com.revenuecat.purchases.paywalls.components.CountdownComponent ? true : paywallComponent instanceof com.revenuecat.purchases.paywalls.components.FallbackHeaderComponent ? true : paywallComponent instanceof com.revenuecat.purchases.paywalls.components.HeaderComponent ? true : paywallComponent instanceof com.revenuecat.purchases.paywalls.components.PackageComponent ? true : paywallComponent instanceof com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent ? true : paywallComponent instanceof com.revenuecat.purchases.paywalls.components.StickyFooterComponent ? true : paywallComponent instanceof com.revenuecat.purchases.paywalls.components.TabControlButtonComponent ? true : paywallComponent instanceof com.revenuecat.purchases.paywalls.components.TabControlComponent ? true : paywallComponent instanceof com.revenuecat.purchases.paywalls.components.TabControlToggleComponent ? true : paywallComponent instanceof com.revenuecat.purchases.paywalls.components.TextComponent ? true : paywallComponent instanceof com.revenuecat.purchases.paywalls.components.TimelineComponent ? true : paywallComponent instanceof com.revenuecat.purchases.paywalls.components.WebViewComponent)) {
                        throw new I3.b();
                    }
                    setO0 = set;
                }
            }
            p078i6.u.M0(linkedHashSet, setO0);
        }
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Set<android.net.Uri> findImageUrisToDownload(com.revenuecat.purchases.paywalls.components.common.Background background) {
        java.net.URL webpLowRes;
        java.lang.String string;
        java.net.URL webpLowRes2;
        java.lang.String string2;
        android.net.Uri uri = null;
        if (background instanceof com.revenuecat.purchases.paywalls.components.common.Background.Image) {
            com.revenuecat.purchases.paywalls.components.common.Background.Image image = (com.revenuecat.purchases.paywalls.components.common.Background.Image) background;
            android.net.Uri uri2 = android.net.Uri.parse(image.getValue().getLight().getWebpLowRes().toString());
            com.revenuecat.purchases.paywalls.components.properties.ImageUrls dark = image.getValue().getDark();
            if (dark != null && (webpLowRes2 = dark.getWebpLowRes()) != null && (string2 = webpLowRes2.toString()) != null) {
                uri = android.net.Uri.parse(string2);
            }
            return p078i6.I.q0(uri2, uri);
        }
        if (background instanceof com.revenuecat.purchases.paywalls.components.common.Background.Video) {
            com.revenuecat.purchases.paywalls.components.common.Background.Video video = (com.revenuecat.purchases.paywalls.components.common.Background.Video) background;
            android.net.Uri uri3 = android.net.Uri.parse(video.getFallbackImage().getLight().getWebpLowRes().toString());
            com.revenuecat.purchases.paywalls.components.properties.ImageUrls dark2 = video.getFallbackImage().getDark();
            if (dark2 != null && (webpLowRes = dark2.getWebpLowRes()) != null && (string = webpLowRes.toString()) != null) {
                uri = android.net.Uri.parse(string);
            }
            return p078i6.I.q0(uri3, uri);
        }
        boolean z6 = true;
        if (!(background instanceof com.revenuecat.purchases.paywalls.components.common.Background.Color ? true : background instanceof com.revenuecat.purchases.paywalls.components.common.Background.Unknown) && background != null) {
            z6 = false;
        }
        if (z6) {
            return p078i6.y.f23207h;
        }
        throw new I3.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Set<android.net.Uri> findImageUrisToDownload(com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls themeImageUrls) {
        java.net.URL webpLowRes;
        java.lang.String string;
        android.net.Uri uri = android.net.Uri.parse(themeImageUrls.getLight().getWebpLowRes().toString());
        com.revenuecat.purchases.paywalls.components.properties.ImageUrls dark = themeImageUrls.getDark();
        return p078i6.I.q0(uri, (dark == null || (webpLowRes = dark.getWebpLowRes()) == null || (string = webpLowRes.toString()) == null) ? null : android.net.Uri.parse(string));
    }
}
