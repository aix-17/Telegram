    private static final int SIDE_MENU_WIDTH = dp(64);
    private static final int SIDE_MENU_TRANSLATE_OFFSET = dp(32);
    private static final int PULL_DOWN_THRESHOLD = dp(110);

    private int lastPullingDownWidth = -1;
                boolean invalidateAfter = false;
                        } else {
                            invalidateAfter = true;
                    final boolean sideMenu = isSideMenued();
                    int width = getMeasuredWidth() - (sideMenu ? SIDE_MENU_WIDTH : 0);
                    if (width != lastPullingDownWidth) {
                        pullingDownDrawable.setWidth(width);
                        lastPullingDownWidth = width;
                    }
                    float progress = Math.min(1f, pullingDownOffset / (float) PULL_DOWN_THRESHOLD);
                    c.translate(sideMenu ? lerp(SIDE_MENU_TRANSLATE_OFFSET, SIDE_MENU_WIDTH, getSideMenuAlpha()) : 0, 0);
                    lastPullingDownWidth = -1;
                }
                if (invalidateAfter) {
                    invalidate();
