public class Classes {
    public static void main(String[] args) {
        System.out.print(FirstMessage.firstMessage());
        System.out.println(SecondMessage.secondMessage());

    }
}

class FirstMessage {
    static String firstMessage() {
        return "I am from Kenya";
    }
}

class SecondMessage {
    static String secondMessage() {
        return " and I do love coding!";
    }
}