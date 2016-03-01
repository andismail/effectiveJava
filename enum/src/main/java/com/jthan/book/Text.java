package com.jthan.book;

import java.util.EnumSet;
import java.util.Set;

/**
 * 此示例不太明白
 */
public class Text {
    public static final int STYLE_BOLD = 1 << 0;
    public static final int STYLE_ITALIC = 1 << 1;
    public static final int STYLE_UNDERLINE = 1 << 2;
    public static final int STYLE_STRIKETHROUGH = 1 << 3;

    public void applyStyles(int styles) {
        //...
    }

    public enum  Style{BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    public void applyStyles(Set<Style> styles) {
        //...
    }

    public static void main(String[] args) {
        Text t = new Text();
        t.applyStyles(Text.STYLE_BOLD | Text.STYLE_ITALIC);

        t.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }
}
