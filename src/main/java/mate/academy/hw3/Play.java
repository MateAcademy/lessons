package mate.academy.hw3;

public class Play {
    public static void main(String[] args) {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};
        StringBuilder result = printText(roles, textLines);
        System.out.println(result);
    }

    public static StringBuilder printText(String[] roles, String[] textLines) {
        StringBuilder result = new StringBuilder();

        for (String role : roles) {
            result.append(role)
                    .append(":\n")
                    .append(printActorReplics(role, textLines))
                    .append("\n");
        }
        return result;
    }

    public static StringBuilder printActorReplics(String role, String[] textLines) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < textLines.length; i++) {
            if (textLines[i].startsWith(role + ":")) {
                answer.append(i + 1)
                        .append(")")
                        .append(textLines[i].substring(role.length() + 1))
                        .append("\n");
            }
        }
        return answer;
    }
}
