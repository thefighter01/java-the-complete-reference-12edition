package version1;

public class TextBlockDemo {
    public static void main(String[] args) {
        String str = """
                Lorem ipsum dolor
                Lorem ipsum dolor
                Lorem ipsum dolor 
                """;

        System.out.println(str);

        String str1 = """
                A  
                          B
                C          
            """;

        String str2 = """
                A          
                          B
                C         
                          """;

        String str3 = """
                A             
                          B
                C          
             """;

        System.out.println(str1);
        System.out.println("////////////////////////////////////");
        System.out.println(str2);
        System.out.println("////////////////////////////////////");
        System.out.println(str3);
    }
}
