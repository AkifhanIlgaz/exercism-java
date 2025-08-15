class SqueakyClean {
    static String clean(String identifier) {
        identifier = kebabToCamel(identifier);
        identifier = leetToNormal(identifier);
        return identifier;
    }

    static String kebabToCamel(String text) {
        StringBuilder sb = new StringBuilder();

        String[] fields = text.split("-");
        sb.append(fields[0]);
        for (int i = 1; i < fields.length; i++) {
            String s = fields[i];
            sb.append(s.substring(0, 1).toUpperCase()).append(s.substring(1).toLowerCase());
        }
        return sb.toString();
    }

    static String leetToNormal(String text) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            switch (ch) {
                case '4' -> sb.append('a');
                case '3' -> sb.append('e');
                case '0' -> sb.append('o');
                case '1' -> sb.append('l');
                case '7' -> sb.append('t');
                default -> {
                    if (Character.isWhitespace(ch)) {
                        sb.append('_');
                        continue;
                    }

                    if (Character.isLetter(ch) || ch == '-') {
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }

}
