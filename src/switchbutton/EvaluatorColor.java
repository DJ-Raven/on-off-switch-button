package switchbutton;

import java.awt.Color;

/**
 * This code take from timingframework-classic source library in Evaluator class
 *
 * @author Raven
 */
public class EvaluatorColor {

    public static Color evaluate(Color color, Color colorTarget, float fraction) {
        int r = color.getRed()
                + (int) ((colorTarget.getRed() - color.getRed()) * fraction + 0.5f);
        int g = color.getGreen()
                + (int) ((colorTarget.getGreen() - color.getGreen()) * fraction + 0.5f);
        int b = color.getBlue()
                + (int) ((colorTarget.getBlue() - color.getBlue()) * fraction + 0.5f);
        int a = color.getAlpha()
                + (int) ((colorTarget.getAlpha() - color.getAlpha()) * fraction + 0.5f);
        Color value = new Color(r, g, b, a);
        return value;
    }
}
