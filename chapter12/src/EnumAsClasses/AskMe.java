package EnumAsClasses;

public class AskMe {

    static void answer(Answers result){
        switch (result){
            case YES:
                System.out.println("Yes");
                break;
            case NO:
                System.out.println("No");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;
        }
    }
    public static void main(String[] args) {
        Question q = new Question();

        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
