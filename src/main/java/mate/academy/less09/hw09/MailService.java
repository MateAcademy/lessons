package mate.academy.less09.hw09;


import java.util.*;
import java.util.function.*;

public class MailService<T>  implements Consumer<Sendable<T>> {

    private Map<String, List<T>> mailBox = new HashMap<String, List<T>>(){
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, new ArrayList<>());
        }
    };

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(Sendable<T> sendable) {
        List<T> toAndContentMap = mailBox.get(sendable.getTo());
        toAndContentMap.add(sendable.getContent());
        mailBox.put(sendable.getTo(), toAndContentMap);
    }
}
