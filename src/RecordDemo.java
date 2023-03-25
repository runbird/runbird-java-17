import java.io.Serializable;

/**
 * @author: JimLock
 * @desc: RecordDemo
 * @version:1.0
 * @create:2023/3/25 19:36
 */
public class RecordDemo {

    public static void main(String[] args) {
        WebsiteRecord websiteRecord = new WebsiteRecord("a", "http");
        System.out.println(websiteRecord.name());
        System.out.println(websiteRecord.url());
        System.out.println(websiteRecord);
    }
//  record 上述相当于
//    public final class extends Record {
//        private final String name;
//        private final String url;
//        //getter setter toString equals hashcode
//    }

    /**
     * Record 都是 final 的，且成员变量也都是 final 的，但是可以支持实现接口，例如，Runnable 或 Serializable。
     * @params name
     * @return
     * @throws
     */
    public record WebsiteRecord(String name, String url) implements Serializable {
        public WebsiteRecord {
            if (!url.toLowerCase().startsWith("http")) {
             //   throw new IllegalAccessException("Invaild URL address:" + url);
            }
            System.out.println("New Website:" + name);
        }
    }
}

