
public class InstanceofDemo {
   /**
    * @params [url]
    * @return void
    * @throws
    */
    private static void demo(Object url) {
        if (url instanceof String str && str.length() > 5 && str.equalsIgnoreCase("https://blog.abmcode.com")) {
            //...
        }
    }
}
