class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        // Напишите свое решение ниже
        StringBuilder sb = new StringBuilder(QUERY);
        PARAMS = PARAMS.trim();
        PARAMS = PARAMS.substring(1, PARAMS.length() - 1);

        String[] keyVal = PARAMS.split(",");
        for (int i = 0; i < keyVal.length; i++) {
            var pair = keyVal[i].split(":");
            if (!pair[1].equals("\"null\"")) {
                sb.append(i != 0 ? " and" : "");
                sb.append(pair[0].replace("\"", ""));
                sb.append('=');
                sb.append(pair[1].replace("\"", "'"));
            }
        }

        return sb;
    }
}