public class ColorPalette {
    public static enum CustomColor {
        RED(255, 0, 0),
        GREEN(0, 255, 0),
        BLUE(0, 0, 255),
        YELLOW(255, 255, 0),
        CYAN(0, 255, 255),
        MAGENTA(255, 0, 255),
        BLACK(0, 0, 0),
        WHITE(255, 255, 255);

        private final int red;
        private final int green;
        private final int blue;

        CustomColor(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public int getRed() {
            return red;
        }

        public int getGreen() {
            return green;
        }

        public int getBlue() {
            return blue;
        }

        public void displayRGB() {
            System.out.println(name() + " (R: " + red + ", G: " + green + ", B: " + blue + ")");
        }

        public String toHex() {
            String redHex = Integer.toHexString(red);
            String greenHex = Integer.toHexString(green);
            String blueHex = Integer.toHexString(blue);

            if (redHex.length() < 2) {
                redHex = "0" + redHex;
            }
            if (greenHex.length() < 2) {
                greenHex = "0" + greenHex;
            }
            if (blueHex.length() < 2) {
                blueHex = "0" + blueHex;
            }

            return "#" + redHex + greenHex + blueHex;
        }
    }

    public static void main(String[] args) {
        for (CustomColor color : CustomColor.values()) {
            color.displayRGB();
            System.out.println(color.toHex());
        }
    }
              }
