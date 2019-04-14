package mate.academy.hw09.task64;

public class MailMessage implements Sendable<String> {

    private String text1;
    private String text2;
    private String text3;

    public MailMessage(String text1, String text2, String text3) {
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
    }

    @Override
    public String getFrom() {
        return text1;
    }

    @Override
    public String getTo() {
        return text2;
    }

    @Override
    public String getContent() {
        return text3;
    }
}
