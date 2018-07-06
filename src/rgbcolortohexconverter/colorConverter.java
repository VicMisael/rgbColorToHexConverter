/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rgbcolortohexconverter;

import java.awt.Color;

/**
 *
 * @author Misael
 */
public class colorConverter {

    public static int toHexColor(int r, int g, int b) {
        int color = 0x000000;
        color = color | r << 16;
        color = color | g << 8;
        color = color | b;
        System.out.println("Red:" + ((color & 0xff0000) >> 16));
        System.out.println("Green:" + ((color & 0x00ff00) >> 8));
        System.out.println("Blue:" + (color & 0x0000ff));
        return color;
    }

    public static String getHexColorString(int color) {
        String hexColor = "0x" + Integer.toHexString(color).toUpperCase();
        return hexColor;
    }

    public static String getHexColorString(int r, int g, int b) {
        String hexColor = "0x" + Integer.toHexString(toHexColor(r, g, b)).toUpperCase();
        return hexColor;
    }

    public static String getHexColorString(Color c) {
        return getHexColorString(c.getRed(), c.getGreen(), c.getBlue());
    }

    public static String getWebHexColorString(int color) {
        String hexColorFinal = "#";
        String hexColor = "";
        int splitColor = ((color & 0xff0000) >> 16);//first with Red
        System.out.println(Integer.toHexString(splitColor));
        if ((splitColor & 0xf0) > 0x00) {
            hexColor += Integer.toHexString((splitColor & 0xf0) >> 4);
        } else {
            hexColor += "0";
        }
        if ((splitColor & 0x0f) > 0x00) {
            hexColor += Integer.toHexString((splitColor & 0x0f));

        } else {
            hexColor += "0";
        }
        splitColor = ((color & 0x00ff00) >> 8);
        System.out.println(Integer.toHexString(splitColor));
        if ((splitColor & 0xf0) > 0x00) {
            hexColor += Integer.toHexString((splitColor & 0xf0) >> 4);
        } else {
            hexColor += "0";
        }
        if ((splitColor & 0x0f) > 0x00) {
            hexColor += Integer.toHexString((splitColor & 0x0f));

        } else {
            hexColor += "0";
        }
        splitColor = (color & 0x0000ff);
        System.out.println(Integer.toHexString(splitColor));
        if ((splitColor & 0xf0) > 0x00) {
            hexColor += Integer.toHexString((splitColor & 0xf0) >> 4);
        } else {
            hexColor += "0";
        }
        if ((splitColor & 0x0f) > 0x00) {
            hexColor += Integer.toHexString((splitColor & 0x0f));

        } else {
            hexColor += "0";
        }

        return hexColorFinal + hexColor.toUpperCase();
    }

}
