public class SwitchDemo {


    public static int getValueViaArrow(String mode) {
        int result = switch (mode){
            case "a","b" -> 1;
            case "c" -> 2;
            case "d","e","f" -> {
                System.out.println("Supports multi line block!");
                yield 3;
            }
            default -> -1;
        };
        return result;
    }
}
