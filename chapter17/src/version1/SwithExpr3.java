package version1;

public class SwithExpr3 {
    public static void main(String[] args) {

        Constants cs = Constants.KILL;
        int priorityLevel = switch (cs){
            case LOL:
                yield 1;
            case KILL:
                yield 2;
//            case LETSGO:
//                yield 3;
                default:
                    yield 3;

        };

        System.out.println("priorityleven and eventCode is " + priorityLevel + " " + cs.value);
    }
}
